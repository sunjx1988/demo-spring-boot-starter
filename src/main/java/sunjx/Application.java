package sunjx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sunjx.autoconfiguration.DemoStarterService;

/**
 * @Auther: sunjx
 * @Date: 2018/12/19 0019 15:00
 * @Description:
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private DemoStarterService demoStarterService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        demoStarterService.printServiceName();
    }
}
