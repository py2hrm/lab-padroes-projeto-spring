package one.digitalinnovation.gof;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.boot.SpringApplication;

/**
 *  Projeto Spring Boot gerado via Sring Initializer
 *  Os seguintes módulos foram selecinoados:
 *  - Spring Data JPA
 *  - Spring Web
 *  - H2 Database
 *  - OpenFeign
 *
 * @author hiramatm
 */
@EnableFeignClients
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
