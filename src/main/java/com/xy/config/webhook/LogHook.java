package com.xy.config.webhook;

import com.blade.ioc.annotation.Bean;
import com.blade.mvc.hook.Signature;
import com.blade.mvc.hook.WebHook;
import com.blade.mvc.http.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Bean
public class LogHook implements WebHook {

    private static Logger logger = LoggerFactory.getLogger(LogHook.class);

    @Override
    public boolean before(Signature signature) {
        Request request = signature.request();
        String uri = request.uri();
        logger.info("controller before method:{} uri: {}", request.method(), uri);
        return true;
    }

    @Override
    public boolean after(Signature signature) {
        Request request = signature.request();
        String uri = request.uri();
        logger.info("controller after method:{} uri: {}", request.method(), uri);
        return true;
    }
}
