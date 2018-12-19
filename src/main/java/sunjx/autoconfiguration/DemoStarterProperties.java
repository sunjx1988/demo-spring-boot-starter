package sunjx.autoconfiguration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Auther: sunjx
 * @Date: 2018/12/19 0019 15:11
 * @Description:
 */
@Data
@ConfigurationProperties("demo.config")
public class DemoStarterProperties {
    private String name;
}
