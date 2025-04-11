package org.ayomide.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document
public class Customer {

    @Id
    private String id;
    private String userName;
    private String eMail;
    private int password;
    private String userId;
    private int age;
}
