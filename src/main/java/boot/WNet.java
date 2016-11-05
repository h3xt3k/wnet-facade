package boot;

/**
 * Created by test1 on 29.10.16.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
public class WNet {

    public static void main(String[] args) {
        SpringApplication.run(WNet.class, args);
    }

}
