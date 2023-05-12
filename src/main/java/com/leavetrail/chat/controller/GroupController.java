package com.leavetrail.chat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.leavetrail.chat.controller.dto.CreateGroupRequest;
import com.leavetrail.chat.controller.dto.CreateRoomRequest;
import com.leavetrail.chat.service.GroupService;

import java.util.UUID;


//*  This controller handles the following endpoints:

//     POST /groups: Create a new group with the specified name and description.
//     DELETE /groups/{groupId}: Delete the group with the specified ID.
//     POST /groups/{groupId}/rooms: Create a new room with the specified name in the group with the specified ID.
//     DELETE /groups/{groupId}/rooms/{roomId}: Delete the room with the specified ID from the group with the specified ID.
//

@RestController
@RequestMapping("/groups")
public class GroupController {

    private final GroupService groupService;

    @Autowired
    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @PostMapping
    public ResponseEntity<Group> createGroup(@RequestBody CreateGroupRequest request) {
        Group group = groupService.createGroup(request.getName(), request.getDescription());
        return new ResponseEntity<>(group, HttpStatus.CREATED);
    }

    @DeleteMapping("/{groupId}")
    public ResponseEntity<Void> deleteGroup(@PathVariable UUID groupId) {
        groupService.deleteGroup(groupId);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{groupId}/rooms")
    public ResponseEntity<Room> createRoom(@PathVariable UUID groupId, @RequestBody CreateRoomRequest request) {
        Room room = groupService.createRoom(groupId, request.getName());
        return new ResponseEntity<>(room, HttpStatus.CREATED);
    }

    @DeleteMapping("/{groupId}/rooms/{roomId}")
    public ResponseEntity<Void> deleteRoom(@PathVariable UUID groupId, @PathVariable UUID roomId) {
        groupService.deleteRoom(groupId, roomId);
        return ResponseEntity.noContent().build();
    }
}
