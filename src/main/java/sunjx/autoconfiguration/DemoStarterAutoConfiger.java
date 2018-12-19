package sunjx.autoconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: sunjx
 * @Date: 2018/12/19 0019 15:14
 * @Description:
 */
@Configuration
@ConditionalOnClass(DemoStarterService.class)
@EnableConfigurationProperties(DemoStarterProperties.class)
public class DemoStarterAutoConfiger {

    @Autowired
    private DemoStarterProperties properties;

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "demo.config", value = "enable", havingValue = "true")
    DemoStarterService demoStarterService(){
        return new DemoStarterService(properties.getName());
    }
}
