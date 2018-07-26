package com.zzp.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

public class MagicBeanConfig {
    @Bean
    @Conditional(MagicExistsContion.class)
    public MagicBean magicBean() {
        return new MagicBean();
    }
}
