package com.mwl.mshop.provider.cmc.model.request;

import lombok.Data;

/**
 * @author mawenlong
 * @date 2019-03-24 22:17
 */
@Data
public class OssPolicyResult {

    private String accessKeyId;
    private String policy;
    private String signature;
    private String dir;
    private String host;

}
