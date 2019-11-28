package top.heitiantian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lty
 * @Date 2019/11/17 19:50
 */
@SpringBootApplication
@RestController
public class BootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }

    @GetMapping("/cookbook/hello")
    public String helloWord(){
        return "hello cookbook!";
    }
}
