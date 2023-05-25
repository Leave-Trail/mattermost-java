package com.leavetrail.chat.users.controller;

import com.leavetrail.chat.core.dto.AppError;
import com.leavetrail.chat.core.dto.StatusOK;
import com.leavetrail.chat.users.dto.AttachDeviceIdRequest;
import com.leavetrail.chat.users.dto.Audit;
import java.math.BigDecimal;
import com.leavetrail.chat.users.dto.ChannelMemberWithTeamData;
import com.leavetrail.chat.users.dto.CheckUserMfa200Response;
import com.leavetrail.chat.users.dto.CheckUserMfaRequest;
import com.leavetrail.chat.users.dto.CreateUserAccessTokenRequest;
import com.leavetrail.chat.users.dto.CreateUserRequest;
import com.leavetrail.chat.users.dto.DisableUserAccessTokenRequest;
import com.leavetrail.chat.users.dto.EnableUserAccessTokenRequest;
import com.leavetrail.chat.users.dto.GenerateMfaSecret200Response;
import com.leavetrail.chat.users.dto.GetUsersByGroupChannelIds200Response;
import java.util.List;
import com.leavetrail.chat.users.dto.LoginByCwsTokenRequest;
import com.leavetrail.chat.users.dto.LoginRequest;
import com.leavetrail.chat.users.dto.MigrateAuthToLdapRequest;
import com.leavetrail.chat.users.dto.MigrateAuthToSamlRequest;
import com.leavetrail.chat.users.dto.PatchUserRequest;
import com.leavetrail.chat.users.dto.PublishUserTypingRequest;
import com.leavetrail.chat.users.dto.RegisterTermsOfServiceActionRequest;
import com.leavetrail.chat.users.dto.ResetPasswordRequest;
import com.leavetrail.chat.users.dto.RevokeSessionRequest;
import com.leavetrail.chat.users.dto.RevokeUserAccessTokenRequest;
import com.leavetrail.chat.users.dto.SearchUserAccessTokensRequest;
import com.leavetrail.chat.users.dto.SearchUsersRequest;
import com.leavetrail.chat.users.dto.SendPasswordResetEmailRequest;
import com.leavetrail.chat.users.dto.SendVerificationEmailRequest;
import com.leavetrail.chat.users.dto.Session;
import com.leavetrail.chat.users.dto.SwitchAccountType200Response;
import com.leavetrail.chat.users.dto.SwitchAccountTypeRequest;
import com.leavetrail.chat.users.dto.UpdateUserActiveRequest;
import com.leavetrail.chat.users.dto.UpdateUserMfaRequest;
import com.leavetrail.chat.users.dto.UpdateUserPasswordRequest;
import com.leavetrail.chat.users.dto.UpdateUserRequest;
import com.leavetrail.chat.users.dto.UpdateUserRolesRequest;
import com.leavetrail.chat.users.dto.UploadSession;
import com.leavetrail.chat.users.dto.User;
import com.leavetrail.chat.users.dto.UserAccessToken;
import com.leavetrail.chat.users.dto.UserAccessTokenSanitized;
import com.leavetrail.chat.users.dto.UserAuthData;
import com.leavetrail.chat.users.dto.UserAutocomplete;
import com.leavetrail.chat.users.dto.UserTermsOfService;
import com.leavetrail.chat.users.dto.UserThreads;
import com.leavetrail.chat.users.dto.UsersStats;
import com.leavetrail.chat.users.dto.VerifyUserEmailRequest;


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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T11:38:02.062529+02:00[Europe/Warsaw]")
@Controller
@RequestMapping("${openapi.mattermostAPIReference.base-path:}")
public class UsersApiController implements UsersApi {

    private final NativeWebRequest request;

    @Autowired
    public UsersApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
