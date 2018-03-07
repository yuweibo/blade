package com.xy.config.processor;


/**
 BeanProcessor

 在一个 Web 开发中我们经常会使用到项目启动的时候加载一些 配置 或者干一些其他的事情，
 在Blade中设计了一个接口 BeanProcessor，你只需要创建一个自己的类实现这个接口即可完成初始化加载的动作。
 比如我要在项目启动的时候设置模板引擎：

 @Order(1)
 @Bean
 public class TemplateConfig implements BeanProcessor {

 @Override
 public void processor(Blade blade) {
 JetbrickTemplateEngine templateEngine = new JetbrickTemplateEngine();
 blade.templateEngine(templateEngine);
 }

 }
 那么这样的几行代码就帮助我们实现这样的功能，我们可以注意到这里实现了 processor 方法，
 并且在该组件上面有 2 个注解，我们使用 @Bean 注解告诉框架这是一个组件，你将它帮我托管在
 IOC 容器里吧。但是我有多个组件，我希望他们是按顺序执行的，所以又添加了一个 @Order 注解，
 同时指定了这个组件的顺序是 1，那么框架在启动的时候会按照顺序执行所有组件的 processor 方法。

 */