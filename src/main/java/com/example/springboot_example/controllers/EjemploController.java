package com.example.springboot_example.controllers;

import com.example.springboot_example.models.Empleados;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class EjemploController {

  @GetMapping("/detalles_info")
  public String info(Model model) {
    Empleados empleado1 = new Empleados(
      "Miguel",
      "Gonzalez",
      null,
      "Desarrollador",
      30,
      5551234,
      1
    );

    model.addAttribute("Empleado", empleado1);
    return "detalles_info";
  }

  @ModelAttribute("Empleados")
  public List<Empleados> ListaEmpleados() {
    return Arrays.asList(
      new Empleados(
        "Miguel",
        "Gonzalez",
        null,
        "Desarrollador",
        30,
        5551234,
        1
      )
    );
  }
}
