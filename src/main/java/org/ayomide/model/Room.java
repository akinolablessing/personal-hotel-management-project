package org.ayomide.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Getter
@Setter
@Document
public class Room {
   @Id
    private String id;
     private String roomNumber;
     private RoomType roomType;
     private Float price;
     private boolean isAvailable;
     private String image;

}
