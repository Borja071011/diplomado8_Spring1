/*
Se encarga de realizar el control de las acciones a ejecutar 
*/
package com.mycompany;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ControladorInicio {

    @GetMapping("/")
    public String inicio() {
        log.info("ejecutando el controlador rest");
        return "Hola mundo con Spring boot";
    }
}
