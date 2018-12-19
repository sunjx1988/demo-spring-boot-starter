package sunjx.autoconfiguration;

import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: sunjx
 * @Date: 2018/12/19 0019 15:14
 * @Description:
 */
@Slf4j
public class DemoStarterService {
    private String serviceName;

    public DemoStarterService(String serviceName) {
        this.serviceName = serviceName;
    }

    public void printServiceName(){
        log.info("serviceName =>{}", serviceName);
    }
}
