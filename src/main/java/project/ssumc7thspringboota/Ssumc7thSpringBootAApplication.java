package project.ssumc7thspringboota;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Ssumc7thSpringBootAApplication {

  public static void main(String[] args) {
    SpringApplication.run(Ssumc7thSpringBootAApplication.class, args);
  }
}
