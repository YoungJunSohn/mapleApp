package org.yj.maple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MapleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapleApplication.class, args);
    }

}
