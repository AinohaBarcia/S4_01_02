package cat.itacademy.barcelonactiva.Barcia.Ainoha.s04.t01.n02.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class HelloWorldController {
    @GetMapping("/HelloWorld")
    @ResponseBody

    public String getSaludo(@RequestParam Optional<String> name){
        return "Hola,  " + name.orElseGet(() -> "Unknown")+  "Estàs executant un projecte Gradle." ;
    }

    @RequestMapping(value = {"/HelloWorld2", "/HelloWorld2/{name}"})
    public String getSaludo2(@PathVariable(required = false) String name) {
        if (name != null) {
            return "Hola, " + name + "Estàs executant un projecte Gradle.";
        }
        return "Hola, estàs executant un projecte Gradle.";
    }
}
