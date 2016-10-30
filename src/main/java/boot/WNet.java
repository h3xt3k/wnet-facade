package boot;

/**
 * Created by test1 on 29.10.16.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WNet {

    public static void main(String[] args) {
        System.out.println("test123");
        SpringApplication.run(WNet.class, args);
    }

}
