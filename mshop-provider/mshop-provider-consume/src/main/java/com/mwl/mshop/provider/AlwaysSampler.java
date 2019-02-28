package com.mwl.mshop.provider;

import brave.sampler.Sampler;
import org.springframework.stereotype.Component;

/**
 * @author mawenlong
 * @date 2019/02/28
 */
@Component
public class AlwaysSampler extends Sampler {

    @Override
    public boolean isSampled(long l) {
        return true;
    }
}
