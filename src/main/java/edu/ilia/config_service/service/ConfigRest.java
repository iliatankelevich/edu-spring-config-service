package edu.ilia.config_service.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ilia
 * @date 21/11/2018
 */
@RefreshScope
@RestController
public class ConfigRest {
    @Value("${message:message not loaded}")
    private String msg;

    @RefreshScope
    @RequestMapping(value = "/message")
    public String getMessage(){
        return msg;
    }
}
