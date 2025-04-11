package org.ayomide.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterRequest {
    private String userName;
    private String eMail;
    private int password;
    private String userId;
    private int age;
}
