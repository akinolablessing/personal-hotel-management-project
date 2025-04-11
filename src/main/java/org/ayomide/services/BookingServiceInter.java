package org.ayomide.services;

import org.ayomide.dto.request.CreateBookingRequest;
import org.ayomide.dto.request.DeleteBookingRequest;
import org.ayomide.dto.request.PostBookingRequest;
import org.ayomide.dto.request.UpdateBookingRequest;
import org.ayomide.dto.response.CreateBookingResponse;
import org.ayomide.dto.response.DeleteBookingResponse;
import org.ayomide.dto.response.PostBookingResponse;
import org.ayomide.dto.response.UpdateBookingResponse;

public interface BookingServiceInter {
    CreateBookingResponse createBookingResponse(CreateBookingRequest createBookingRequest);
    UpdateBookingResponse updateBookingResponse(UpdateBookingRequest updateBookingRequest);
    PostBookingResponse postBookingResponse(PostBookingRequest postBookingRequest);
    DeleteBookingResponse deleteBookingResponse(DeleteBookingRequest deleteBookingResponse);

}
