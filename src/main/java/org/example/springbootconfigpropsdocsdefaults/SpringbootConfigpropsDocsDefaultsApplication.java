package org.example.springbootconfigpropsdocsdefaults;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringbootConfigpropsDocsDefaultsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootConfigpropsDocsDefaultsApplication.class, args);
    }

}
