package org.ayomide.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Document
@Getter
@Setter
public class Booking {
    @Id
     private String bookID;
     private LocalDate date;
     private Customer customer;
     private List<Room> room;

   public Booking(){
      this.room = new ArrayList<>();
   }
}
