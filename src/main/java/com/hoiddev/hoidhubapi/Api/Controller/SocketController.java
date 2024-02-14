package com.hoiddev.hoidhubapi.Api.Controller;

import com.hoiddev.hoidhubapi.Api.Request.ChatMessage;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class SocketController {
    @MessageMapping("/chat/{roomId}")
    @SendTo("/topic/chat/{roomId}")
    public ChatMessage helloWorld(@DestinationVariable String roomId, ChatMessage chatRequest) {
        return new ChatMessage(chatRequest.getMessage(), chatRequest.getUser());
    }
}