package org.ayomide.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterResponse {
    private String message;
    private String id;
    private String userName;
    private String eMail;
    private int password;
    private String userId;
    private int age;
}
