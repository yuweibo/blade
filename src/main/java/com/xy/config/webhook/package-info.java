package com.xy.config.webhook;

/**
 *
 * WebHook

 WebHook 是Blade中拦截一个路由的前、后可以做一些自定义的动作的接口，用户可以使用该接口完成一些登录拦截、日志记录、权限验证等操作。
 在这个接口中有2个方法 before 和 after，并且 after 方法是一个 默认方法 （这个概念在Java8中出现的），因为我们
 发现绝大部分情况下使用不到 after 方法，那么使用者在实现该接口的时候只需要实现 before 即可。
 下面我们写一个简单的例子可以体验一下：

 @Bean
 public class MyHook implements WebHook {

 @Override
 public boolean before(Signature signature) {
 Request request = signature.request();
 String  uri     = request.uri();
 log.info("{}\t{}", request.method(), uri);
 return true;
 }

 }
 这里只是简单的记录了一下日志，我们可以看到一个 WebHook（钩子）方法中有一个 Signature。我们在这个类中打包了当前路由的上下文参数，
 这些上下文参数包括: Request、Response、Action 以便于用户使用。
 */