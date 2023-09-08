package com.example.apresentacao2;

import com.example.apresentacao2.domain.response.CreateItemResponse;
import com.example.apresentacao2.domain.response.VendasResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class ApresentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApresentApplication.class, args);

        VendasResponse vendasResponse = new VendasResponse(new ArrayList<>());

        System.out.println(vendasResponse);
    }



}