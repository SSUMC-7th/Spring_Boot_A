package project.ssumc7thspringboota.common.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

  @Bean
  public OpenAPI customOpenAPI() {
    return new OpenAPI().info(new Info().title("API Documentation")
                                        .version("1.0.0")
                                        .description("API for SSUMC-7th Spring Boot"))
                        .addServersItem(new Server().url("/"));
  }
}
