package org.ayomide.repository;

import org.ayomide.model.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BookingRepository extends MongoRepository<Booking,String> {
}
