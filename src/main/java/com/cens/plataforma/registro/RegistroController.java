package com.cens.plataforma.registro;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/registration")
public class RegistroController {
    private RegistroService RegistroService;
    public String registro(@RequestBody RegistroRequest request){
        return RegistroService.registro(request);
    }
}
