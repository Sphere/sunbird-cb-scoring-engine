

package org.sunbird.scoringengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"org.sunbird.scoringengine.comments.*", "org.sunbird.scoringengine.*"})
public class ScoringEngineApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScoringEngineApplication.class, args);
        
    }

}
