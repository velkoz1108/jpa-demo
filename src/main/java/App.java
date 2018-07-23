import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/23 14:34
 */
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = "com")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
