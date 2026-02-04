package com.example.springboot_example.controllers;

import com.example.springboot_example.models.Empleados;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EjemploRestController {

  @RequestMapping(path = "/detalles_info2", method = RequestMethod.GET)
  public Map<String, Object> detalles_info2() {
    Empleados empleado1 = new Empleados(
      "Miguel",
      "Gonzalez",
      "Calle Falsa 123",
      "Desarrollador",
      30,
      5551234,
      1
    );
    Map<String, Object> respuesta = new HashMap<>();
    respuesta.put("Empleado", "Datos del empleado");
    respuesta.put("Información", empleado1);

    // Map<String, Object> respuesta = new HashMap<>();
    // respuesta.put("Titulo", "Servidor en linea");
    // respuesta.put("Servidor", "Informaticonfig");
    // respuesta.put("Ip", "192.168.1.88");
    return respuesta;
  }
}
