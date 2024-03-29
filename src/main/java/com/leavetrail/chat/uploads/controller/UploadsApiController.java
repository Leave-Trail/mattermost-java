package com.leavetrail.chat.uploads.controller;

import com.leavetrail.chat.core.dto.AppError;
import com.leavetrail.chat.uploads.dto.CreateUploadRequest;
import com.leavetrail.chat.uploads.dto.FileInfo;
import com.leavetrail.chat.uploads.dto.UploadSession;


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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:29:10.272103+02:00[Europe/Warsaw]")
@Controller
@RequestMapping("${openapi.mattermostAPIReference.base-path:}")
public class UploadsApiController implements UploadsApi {

    private final NativeWebRequest request;

    @Autowired
    public UploadsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
