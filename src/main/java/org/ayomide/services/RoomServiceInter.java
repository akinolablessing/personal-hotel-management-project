package org.ayomide.services;

import com.mongodb.internal.bulk.DeleteRequest;
import com.mongodb.internal.bulk.UpdateRequest;
import org.ayomide.dto.request.CreateRequest;
import org.ayomide.dto.request.DeleteRoomRequest;
import org.ayomide.dto.request.PostRequest;
import org.ayomide.dto.request.UpdateRoomRequest;
import org.ayomide.dto.response.CreateResponse;
import org.ayomide.dto.response.DeleteResponse;
import org.ayomide.dto.response.PostResponse;
import org.ayomide.dto.response.UpdateResponse;

public interface RoomServiceInter {
    CreateResponse createRoom(CreateRequest createRequest);
    PostResponse postRoom(PostRequest postRequest);
    UpdateResponse updateRoom(UpdateRoomRequest updateRequest);
    DeleteResponse deleteRoom(DeleteRoomRequest deleteRequest);
}
