package com.leavetrail.chat.channel.controller;

import com.leavetrail.chat.channel.dto.AddChannelMemberRequest;
import com.leavetrail.chat.channel.dto.Channel;
import com.leavetrail.chat.channel.dto.ChannelMember;
import com.leavetrail.chat.channel.dto.ChannelModeration;
import com.leavetrail.chat.channel.dto.ChannelModerationPatch;
import com.leavetrail.chat.channel.dto.ChannelNotifyProps;
import com.leavetrail.chat.channel.dto.ChannelStats;
import com.leavetrail.chat.channel.dto.ChannelUnread;
import com.leavetrail.chat.channel.dto.ChannelWithTeamData;
import com.leavetrail.chat.channel.dto.CreateChannelRequest;
import java.util.List;
import com.leavetrail.chat.channel.dto.MoveChannelRequest;
import com.leavetrail.chat.channel.dto.OrderedSidebarCategories;
import com.leavetrail.chat.channel.dto.PatchChannelRequest;
import com.leavetrail.chat.channel.dto.PostList;
import com.leavetrail.chat.channel.dto.SearchAllChannels200Response;
import com.leavetrail.chat.channel.dto.SearchAllChannelsRequest;
import com.leavetrail.chat.channel.dto.SearchArchivedChannelsRequest;
import com.leavetrail.chat.channel.dto.SearchChannelsRequest;
import com.leavetrail.chat.channel.dto.SearchGroupChannelsRequest;
import com.leavetrail.chat.channel.dto.SidebarCategory;
import com.leavetrail.chat.channel.dto.StatusOK;
import com.leavetrail.chat.channel.dto.UpdateChannelMemberSchemeRolesRequest;
import com.leavetrail.chat.channel.dto.UpdateChannelPrivacyRequest;
import com.leavetrail.chat.channel.dto.UpdateChannelRequest;
import com.leavetrail.chat.channel.dto.UpdateChannelRolesRequest;
import com.leavetrail.chat.channel.dto.UpdateChannelSchemeRequest;
import com.leavetrail.chat.channel.dto.ViewChannel200Response;
import com.leavetrail.chat.channel.dto.ViewChannelRequest;
import com.leavetrail.chat.core.dto.AppError;

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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T18:55:32.965983+02:00[Europe/Warsaw]")
@Controller
@RequestMapping("${openapi.mattermostAPIReference.base-path:}")
public class ChannelApiController implements ChannelApi {

    private final NativeWebRequest request;

    @Autowired
    public ChannelApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
