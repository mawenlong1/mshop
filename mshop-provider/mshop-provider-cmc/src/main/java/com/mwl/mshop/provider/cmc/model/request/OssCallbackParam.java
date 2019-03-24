package com.mwl.mshop.provider.cmc.model.request;

import lombok.Data;

/**
 * @author mawenlong
 * @date 2019-03-24 22:17
 */
@Data
public class OssCallbackParam {
    private String callbackUrl;
    private String callbackBody;
    private String callbackBodyType;

}
