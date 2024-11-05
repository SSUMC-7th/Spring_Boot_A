package project.ssumc7thspringboota;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import project.ssumc7thspringboota.application.store.StoreQueryService;

@SpringBootApplication
@EnableJpaAuditing
public class Ssumc7thSpringBootAApplication {

  public static void main(String[] args) {
    SpringApplication.run(Ssumc7thSpringBootAApplication.class, args);
  }

  @Bean
  public CommandLineRunner run(ApplicationContext context) {
    return args -> {
      StoreQueryService storeService = context.getBean(StoreQueryService.class);

      // 파라미터 값 설정
      String name = "Store 1";
      Double overallRating = 4.0;

      // 쿼리 메서드 호출 및 쿼리 문자열과 파라미터 출력
      System.out.println("Executing findStoresByNameAndRating with parameters:");
      System.out.println("Name: " + name);
      System.out.println("Overall Rating: " + overallRating);

      // StoreQueryService의 메서드 호출하여 결과 출력
      storeService.findStoresByNameAndRating(name, overallRating)
                  .forEach(System.out::println);
    };
  }
}
