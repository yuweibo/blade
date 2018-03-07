package com.xy.config.processor;

import com.blade.Blade;
import com.blade.event.BeanProcessor;
import com.blade.ioc.annotation.Bean;
import com.blade.ioc.annotation.Order;

@Order(1)
@Bean
public class TemplateConfig implements BeanProcessor {
    @Override
    public void processor(Blade blade) {
//        JetbrickTemplateEngine templateEngine = new JetbrickTemplateEngine();
//        blade.templateEngine(templateEngine);
    }

    @Override
    public void preHandle(Blade blade) {

    }
}
