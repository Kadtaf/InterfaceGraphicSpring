package com.kadtaf.interfacegraphic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;


@SpringBootApplication
@EnableSwagger2WebMvc
public class InterfaceGraphicApplication {

    public static void main(String[] args) {

        SpringApplication.run(InterfaceGraphicApplication.class, args);

    }

}
