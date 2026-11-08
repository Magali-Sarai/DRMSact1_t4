package com.informatingconfig.spring.app1.springboot_applications.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProyectoController {

    @GetMapping("/identificador")
    public String obtenerIdentificador() {
        return "Proyecto: DRMSact1_t4 (Diego Revilla Magali Sarai";
    }

    // Endpoint c) 
    @GetMapping("/estado-servidor")
    public Map<String, Object> obtenerEstado() {
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("codigoHttp", 200);
        respuesta.put("servidorActivo", true);
        respuesta.put("javaVersion", 21);
        respuesta.put("tema", 4);
        respuesta.put("actividad", 1);
        respuesta.put("mensaje", "corriendo sin errores:D");
        return respuesta;
    }
}