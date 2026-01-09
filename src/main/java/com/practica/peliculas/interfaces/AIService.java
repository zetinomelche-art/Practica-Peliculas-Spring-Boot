package com.practica.peliculas.interfaces;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface AIService {
    @UserMessage("""
            Genera un saludo de bienvenida a la paltaforma de gestion de peliculas.
            Usa al menos 120 caracteres y hazlo con estilo profesional.
            """)
    String generateGreeting();
}
