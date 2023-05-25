package com.leavetrail.chat.channel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.leavetrail.chat.channel.controller.dto.CreateGroupRequest;
import com.leavetrail.chat.channel.controller.dto.CreateRoomRequest;
import com.leavetrail.chat.channel.model.group.GroupChatRoom;
import com.leavetrail.chat.channel.model.group.UserGroup;
import com.leavetrail.chat.channel.service.GroupService;

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
    public ResponseEntity<UserGroup> createGroup(@RequestBody CreateGroupRequest request) {
        UserGroup group = groupService.createGroup(request.getName(), request.getDescription(), UUID.fromString(request.getCreatorId()));
        return new ResponseEntity<>(group, HttpStatus.CREATED);
    }

    @DeleteMapping("/{groupId}")
    public ResponseEntity<Void> deleteGroup(@PathVariable UUID groupId) {
        groupService.deleteGroup(groupId);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{groupId}/rooms")
    public ResponseEntity<GroupChatRoom> createRoom(@PathVariable UUID groupId, @RequestBody CreateRoomRequest request) {
        GroupChatRoom room = groupService.createChatRoom(groupId, request.getName());
        return new ResponseEntity<>(room, HttpStatus.CREATED);
    }

    @DeleteMapping("/{groupId}/rooms/{roomId}")
    public ResponseEntity<Void> deleteRoom(@PathVariable UUID groupId, @PathVariable UUID roomId) {
        groupService.deleteChatRoom(groupId, roomId);
        return ResponseEntity.noContent().build();
    }
}
