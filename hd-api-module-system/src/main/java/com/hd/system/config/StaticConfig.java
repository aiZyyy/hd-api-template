package com.hd.system.config;

import com.hd.base.modules.message.handle.impl.EmailSendMsgHandle;
import com.hd.common.util.DySmsHelper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 设置静态参数初始化
 */
@Configuration
public class StaticConfig {

    @Value("${hd.sms.accessKeyId}")
    private String accessKeyId;

    @Value("${hd.sms.accessKeySecret}")
    private String accessKeySecret;

    @Value(value = "${spring.mail.username}")
    private String emailFrom;


    @Bean
    public void initStatic() {
        DySmsHelper.setAccessKeyId(accessKeyId);
        DySmsHelper.setAccessKeySecret(accessKeySecret);
        EmailSendMsgHandle.setEmailFrom(emailFrom);
    }
}
