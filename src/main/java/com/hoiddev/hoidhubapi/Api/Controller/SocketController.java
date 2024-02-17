package com.hoiddev.hoidhubapi.Api.Controller;

import com.hoiddev.hoidhubapi.Api.Request.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class SocketController {
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public String greeting(ChatMessage message) throws Exception {
        System.out.println("Mensaje recibido: " + message.getUsername());
        Thread.sleep(1000); // simulated delay
        return "Mensaje recibido por el servidor: " + message.getUsername();
    }

}