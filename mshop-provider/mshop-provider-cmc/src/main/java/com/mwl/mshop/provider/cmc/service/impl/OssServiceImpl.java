package com.mwl.mshop.provider.cmc.service.impl;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.common.utils.BinaryUtil;
import com.aliyun.oss.model.MatchMode;
import com.aliyun.oss.model.PolicyConditions;
import com.mwl.mshop.provider.cmc.model.request.OssCallbackResult;
import com.mwl.mshop.provider.cmc.model.request.OssPolicyResult;
import com.mwl.mshop.provider.cmc.service.OssService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author mawenlong
 * @date 2019-03-24 22:19
 */
@Slf4j
@Service
public class OssServiceImpl implements OssService {


    private int ALIYUN_OSS_EXPIRE = 300;
    private int ALIYUN_OSS_MAX_SIZE = 10;
    private String ALIYUN_OSS_CALLBACK = "http://localhost:7072/aliyun/oss/callback";
    private String ALIYUN_OSS_BUCKET_NAME = "mwl-mshop";
    private String ALIYUN_OSS_ENDPOINT = "oss-cn-beijing.aliyuncs.com";
    private String ALIYUN_OSS_DIR_PREFIX = "mall/images/";
    private String accessKeyId = "test";
    private String accessKeySecret = "test";

    /**
     * 签名生成
     */
    @Override
    public OssPolicyResult policy() {
        OSSClient ossClient = new OSSClient(ALIYUN_OSS_ENDPOINT, accessKeyId, accessKeySecret);

        OssPolicyResult result = new OssPolicyResult();
        // 存储目录
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String dir = ALIYUN_OSS_DIR_PREFIX + sdf.format(new Date());
        // 签名有效期
        long expireEndTime = System.currentTimeMillis() + ALIYUN_OSS_EXPIRE * 1000;
        Date expiration = new Date(expireEndTime);
        // 文件大小
        long maxSize = ALIYUN_OSS_MAX_SIZE * 1024 * 1024;
        // 回调
//		OssCallbackParam callback = new OssCallbackParam();
//		callback.setCallbackUrl(ALIYUN_OSS_CALLBACK);
//		callback.setCallbackBody("filename=${object}&size=${size}&mimeType=${mimeType}&height=${imageInfo.height}&width=${imageInfo.width}");
//		callback.setCallbackBodyType("application/x-www-form-urlencoded");
        // 提交节点
        String action = "http://" + ALIYUN_OSS_BUCKET_NAME + "." + ALIYUN_OSS_ENDPOINT;
        try {
            PolicyConditions policyConds = new PolicyConditions();
            policyConds.addConditionItem(PolicyConditions.COND_CONTENT_LENGTH_RANGE, 0, maxSize);
            policyConds.addConditionItem(MatchMode.StartWith, PolicyConditions.COND_KEY, dir);
            String postPolicy = ossClient.generatePostPolicy(expiration, policyConds);
            byte[] binaryData = postPolicy.getBytes("utf-8");
            String policy = BinaryUtil.toBase64String(binaryData);
            String signature = ossClient.calculatePostSignature(postPolicy);
//			String callbackData = BinaryUtil.toBase64String(JsonUtil.objectToJson(callback).getBytes("utf-8"));
            // 返回结果
            result.setAccessKeyId(ossClient.getCredentialsProvider().getCredentials().getAccessKeyId());
            result.setPolicy(policy);
            result.setSignature(signature);
            result.setDir(dir);
//			result.setCallback(callbackData);
            result.setHost(action);
        } catch (Exception e) {
            log.error("签名生成失败", e);
        }
        return result;
    }

    @Override
    public OssCallbackResult callback(HttpServletRequest request) {
        OssCallbackResult result = new OssCallbackResult();
        String filename = request.getParameter("filename");
        filename = "http://".concat(ALIYUN_OSS_BUCKET_NAME).concat(".").concat(ALIYUN_OSS_ENDPOINT).concat("/")
                            .concat(filename);
        result.setFilename(filename);
        result.setSize(request.getParameter("size"));
        result.setMimeType(request.getParameter("mimeType"));
        result.setWidth(request.getParameter("width"));
        result.setHeight(request.getParameter("height"));
        return result;
    }


}
