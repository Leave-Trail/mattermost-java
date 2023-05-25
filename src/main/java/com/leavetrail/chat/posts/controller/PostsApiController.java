package com.leavetrail.chat.posts.controller;

import com.leavetrail.chat.posts.dto.AppError;
import com.leavetrail.chat.posts.dto.ChannelUnreadAt;
import com.leavetrail.chat.posts.dto.CreatePostEphemeralRequest;
import com.leavetrail.chat.posts.dto.CreatePostRequest;
import com.leavetrail.chat.posts.dto.FileInfo;
import java.util.List;
import com.leavetrail.chat.posts.dto.PatchPostRequest;
import com.leavetrail.chat.posts.dto.Post;
import com.leavetrail.chat.posts.dto.PostAcknowledgement;
import com.leavetrail.chat.posts.dto.PostList;
import com.leavetrail.chat.posts.dto.PostListWithSearchMatches;
import com.leavetrail.chat.posts.dto.SearchPostsRequest;
import com.leavetrail.chat.posts.dto.SetPostReminderRequest;
import com.leavetrail.chat.posts.dto.StatusOK;
import com.leavetrail.chat.posts.dto.UpdatePostRequest;


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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T18:55:42.623670+02:00[Europe/Warsaw]")
@Controller
@RequestMapping("${openapi.mattermostAPIReference.base-path:}")
public class PostsApiController implements PostsApi {

    private final NativeWebRequest request;

    @Autowired
    public PostsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
