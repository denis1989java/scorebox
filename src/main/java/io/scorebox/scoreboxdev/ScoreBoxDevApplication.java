package io.scorebox.scoreboxdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

// CHECKSTYLE:OFF
@SpringBootApplication
@EnableJpaAuditing
public class ScoreBoxDevApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScoreBoxDevApplication.class, args);
    }
}
// CHECKSTYLE:ON
