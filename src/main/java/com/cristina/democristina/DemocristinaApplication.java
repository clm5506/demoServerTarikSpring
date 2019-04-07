package com.cristina.democristina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin("http://localhost:4200")
public class DemocristinaApplication {

    @GetMapping("/api/hello")
    public ResponseEntity<Response> hello(){
        return new ResponseEntity<>(new Response("sup"), HttpStatus.OK);
    }

    public static void main(String[] args) {
        SpringApplication.run(DemocristinaApplication.class, args);
    }


    class Response{


        String response;

        public Response(String message){
            this.response = message;
        }

        public String getResponse() {
            return response;
        }

        public void setResponse(String response) {
            this.response = response;
        }
    }
}
