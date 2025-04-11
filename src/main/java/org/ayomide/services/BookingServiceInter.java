package org.ayomide.services;

import org.ayomide.dto.request.UpdateBookingRequest;
import org.ayomide.dto.response.UpdateBookingResponse;

public interface BookingServiceInter {
    UpdateBookingResponse updateBookingResponse(UpdateBookingRequest updateBookingRequest);
    
}
