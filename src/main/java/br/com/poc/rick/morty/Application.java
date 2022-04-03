package br.com.poc.rick.morty;

import br.com.poc.rick.morty.service.EpisodeManagerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args).getBean(EpisodeManagerService.class).consumir();
    }

}
