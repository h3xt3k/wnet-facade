package boot;

/**
 * Created by test1 on 29.10.16.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
@RestController
public class WNet {

    public static void main(String[] args) {
        SpringApplication.run(WNet.class, args);
    }


//    @RequestMapping("/login")
//    public Principal user(Principal user) {
//        return user;
//    }
}
