package com.mwl.mshop.provider.cmc.model.request;

import lombok.Data;

/**
 * @author mawenlong
 * @date 2019-03-24 22:17
 */
@Data
public class OssCallbackResult {
    private String filename;
    private String size;
    private String mimeType;
    private String width;
    private String height;

}
