package com.example.springboot_example.controllers;

import com.example.springboot_example.models.Empleados;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EjemploController {

  @GetMapping("/detalles_info")
  public String info(Model model) {
    Empleados empleado1 = new Empleados(
      "Miguel",
      "Gonzalez",
      "Calle Falsa 123",
      "Desarrollador",
      30,
      5551234,
      1
    );

    model.addAttribute("Empleado", empleado1);
    return "detalles_info";
  }
}
