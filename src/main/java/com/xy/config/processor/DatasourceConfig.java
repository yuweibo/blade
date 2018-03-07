package com.xy.config.processor;

import com.alibaba.druid.pool.DruidDataSource;
import com.blade.Blade;
import com.blade.event.BeanProcessor;
import com.blade.ioc.annotation.Bean;
import com.blade.ioc.annotation.Order;

@Bean
@Order(1)
public class DatasourceConfig implements BeanProcessor {

    @Override
    public void processor(Blade blade) {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/user?useCursorFetch=true&rewriteBatchedStatements=true&allowMultiQueries=true");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setInitialSize(4);
        dataSource.setMaxActive(20);
        dataSource.setMinIdle(8);
        dataSource.setPoolPreparedStatements(true);
        dataSource.setMaxOpenPreparedStatements(10);
        dataSource.setTestWhileIdle(true);
        blade.register(dataSource);
    }
}
