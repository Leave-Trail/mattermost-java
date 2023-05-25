package com.leavetrail.chat.bots.controller;

import com.leavetrail.chat.bots.dto.Bot;
import com.leavetrail.chat.bots.dto.ConvertBotToUserRequest;
import com.leavetrail.chat.bots.dto.CreateBotRequest;
import com.leavetrail.chat.bots.dto.ProductLimits;
import com.leavetrail.chat.bots.dto.StatusOK;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T18:55:29.180415+02:00[Europe/Warsaw]")
@Controller
@RequestMapping("${openapi.mattermostAPIReference.base-path:}")
public class BotsApiController implements BotsApi {

    private final NativeWebRequest request;

    @Autowired
    public BotsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
