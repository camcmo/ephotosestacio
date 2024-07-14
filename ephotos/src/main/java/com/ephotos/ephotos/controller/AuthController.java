package com.ephotos.ephotos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestParam String username, @RequestParam String password) {
        // Verifica se o login é válido
        if (authService.authenticate(username, password)) {
            // Se autenticado com sucesso, redireciona para a página principal
            return ResponseEntity.status(HttpStatus.FOUND)
                    .header("Location", "/principal") // Redirecionamento usando header
                    .build();
        } else {
            // Se falhar, retorna 401 Unauthorized
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }
}
