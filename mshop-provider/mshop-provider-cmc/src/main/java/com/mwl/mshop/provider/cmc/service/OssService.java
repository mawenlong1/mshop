package com.mwl.mshop.provider.cmc.service;

import com.mwl.mshop.provider.cmc.model.request.OssCallbackResult;
import com.mwl.mshop.provider.cmc.model.request.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * @author mawenlong
 * @date 2019-03-24 22:19
 */
public interface OssService {

    OssPolicyResult policy();

    OssCallbackResult callback(HttpServletRequest request);

}
