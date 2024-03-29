package com.leavetrail.chat.groups.controller;

import com.leavetrail.chat.groups.dto.AddGroupMembersRequest;
import com.leavetrail.chat.groups.dto.AppError;
import com.leavetrail.chat.groups.dto.CreateGroupRequest;
import com.leavetrail.chat.groups.dto.DeleteGroupMembersRequest;
import com.leavetrail.chat.groups.dto.GetGroupStats200Response;
import com.leavetrail.chat.groups.dto.GetGroupUsers200Response;
import com.leavetrail.chat.groups.dto.Group;
import com.leavetrail.chat.groups.dto.GroupSyncableChannel;
import com.leavetrail.chat.groups.dto.GroupSyncableChannels;
import com.leavetrail.chat.groups.dto.GroupSyncableTeam;
import com.leavetrail.chat.groups.dto.GroupSyncableTeams;
import com.leavetrail.chat.groups.dto.GroupWithSchemeAdmin;
import com.leavetrail.chat.groups.dto.PatchGroupRequest;
import com.leavetrail.chat.groups.dto.PatchGroupSyncableForTeamRequest;
import com.leavetrail.chat.groups.dto.StatusOK;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T18:55:36.322086+02:00[Europe/Warsaw]")
@Controller
@RequestMapping("${openapi.mattermostAPIReference.base-path:}")
public class GroupsApiController implements GroupsApi {

    private final NativeWebRequest request;

    @Autowired
    public GroupsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
