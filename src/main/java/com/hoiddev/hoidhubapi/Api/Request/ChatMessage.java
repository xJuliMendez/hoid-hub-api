package com.hoiddev.hoidhubapi.Api.Request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChatMessage {
    String username;
    String email;
    String password;
}
