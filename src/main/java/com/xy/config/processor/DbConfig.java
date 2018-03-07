package com.xy.config.processor;

import com.alibaba.druid.pool.DruidDataSource;
import com.blade.Blade;
import com.blade.event.BeanProcessor;
import com.blade.ioc.annotation.Bean;
import com.blade.jdbc.Base;

import javax.sql.DataSource;

@Bean
public class DbConfig implements BeanProcessor {

    @Override
    public void processor(Blade blade) {
        Base.open((DataSource) blade.getBean(DruidDataSource.class));
    }

    @Override
    public void preHandle(Blade blade) {

    }
}
