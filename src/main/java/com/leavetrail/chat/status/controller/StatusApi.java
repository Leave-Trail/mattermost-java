/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.leavetrail.chat.status.controller;

import com.leavetrail.chat.core.dto.AppError;
import java.util.List;
import com.leavetrail.chat.status.dto.RemoveRecentCustomStatusRequest;
import com.leavetrail.chat.status.dto.Status;
import com.leavetrail.chat.status.dto.UpdateUserCustomStatusRequest;
import com.leavetrail.chat.status.dto.UpdateUserStatusRequest;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import com.leavetrail.chat.core.util.ApiUtil;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T12:02:29.136457+02:00[Europe/Warsaw]")
@Validated
@Tag(name = "status", description = "Endpoints for getting and updating user statuses.")
public interface StatusApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /api/v4/users/{user_id}/status : Get user status
     * Get user status by id from the server. ##### Permissions Must be authenticated. 
     *
     * @param userId User ID (required)
     * @return User status retrieval successful (status code 200)
     *         or Invalid or missing parameters in URL or request body (status code 400)
     *         or No access token provided (status code 401)
     */
    @Operation(
        operationId = "getUserStatus",
        summary = "Get user status",
        description = "Get user status by id from the server. ##### Permissions Must be authenticated. ",
        tags = { "status" },
        responses = {
            @ApiResponse(responseCode = "200", description = "User status retrieval successful", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Status.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid or missing parameters in URL or request body", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AppError.class))
            }),
            @ApiResponse(responseCode = "401", description = "No access token provided", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AppError.class))
            })
        },
        security = {
            @SecurityRequirement(name = "bearerAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v4/users/{user_id}/status",
        produces = { "application/json" }
    )
    default ResponseEntity<Status> getUserStatus(
        @Parameter(name = "user_id", description = "User ID", required = true, in = ParameterIn.PATH) @PathVariable("user_id") String userId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"user_id\" : \"user_id\", \"last_activity_at\" : 0, \"manual\" : true, \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /api/v4/users/status/ids : Get user statuses by id
     * Get a list of user statuses by id from the server. ##### Permissions Must be authenticated. 
     *
     * @param requestBody List of user ids to fetch (required)
     * @return User statuses retrieval successful (status code 200)
     *         or Invalid or missing parameters in URL or request body (status code 400)
     *         or No access token provided (status code 401)
     */
    @Operation(
        operationId = "getUsersStatusesByIds",
        summary = "Get user statuses by id",
        description = "Get a list of user statuses by id from the server. ##### Permissions Must be authenticated. ",
        tags = { "status" },
        responses = {
            @ApiResponse(responseCode = "200", description = "User statuses retrieval successful", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Status.class)))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid or missing parameters in URL or request body", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AppError.class))
            }),
            @ApiResponse(responseCode = "401", description = "No access token provided", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AppError.class))
            })
        },
        security = {
            @SecurityRequirement(name = "bearerAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/v4/users/status/ids",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<List<Status>> getUsersStatusesByIds(
        @Parameter(name = "request_body", description = "List of user ids to fetch", required = true) @Valid @RequestBody List<String> requestBody
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"user_id\" : \"user_id\", \"last_activity_at\" : 0, \"manual\" : true, \"status\" : \"status\" }, { \"user_id\" : \"user_id\", \"last_activity_at\" : 0, \"manual\" : true, \"status\" : \"status\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /api/v4/users/{user_id}/status/custom/recent/delete : Delete user&#39;s recent custom status
     * Deletes a user&#39;s recent custom status by removing the specific status from the recentCustomStatuses in the user&#39;s props and updates the user. ##### Permissions Must be logged in as the user whose recent custom status is being deleted. 
     *
     * @param userId User ID (required)
     * @param removeRecentCustomStatusRequest Custom Status object that is to be removed from the recent custom statuses. (required)
     * @return User recent custom status delete successful (status code 200)
     *         or Invalid or missing parameters in URL or request body (status code 400)
     *         or No access token provided (status code 401)
     */
    @Operation(
        operationId = "postUserRecentCustomStatusDelete",
        summary = "Delete user's recent custom status",
        description = "Deletes a user's recent custom status by removing the specific status from the recentCustomStatuses in the user's props and updates the user. ##### Permissions Must be logged in as the user whose recent custom status is being deleted. ",
        tags = { "status" },
        responses = {
            @ApiResponse(responseCode = "200", description = "User recent custom status delete successful"),
            @ApiResponse(responseCode = "400", description = "Invalid or missing parameters in URL or request body", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AppError.class))
            }),
            @ApiResponse(responseCode = "401", description = "No access token provided", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AppError.class))
            })
        },
        security = {
            @SecurityRequirement(name = "bearerAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/v4/users/{user_id}/status/custom/recent/delete",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> postUserRecentCustomStatusDelete(
        @Parameter(name = "user_id", description = "User ID", required = true, in = ParameterIn.PATH) @PathVariable("user_id") String userId,
        @Parameter(name = "RemoveRecentCustomStatusRequest", description = "Custom Status object that is to be removed from the recent custom statuses.", required = true) @Valid @RequestBody RemoveRecentCustomStatusRequest removeRecentCustomStatusRequest
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /api/v4/users/{user_id}/status/custom/recent : Delete user&#39;s recent custom status
     * Deletes a user&#39;s recent custom status by removing the specific status from the recentCustomStatuses in the user&#39;s props and updates the user. ##### Permissions Must be logged in as the user whose recent custom status is being deleted. 
     *
     * @param userId User ID (required)
     * @param removeRecentCustomStatusRequest Custom Status object that is to be removed from the recent custom statuses. (required)
     * @return User recent custom status delete successful (status code 200)
     *         or Invalid or missing parameters in URL or request body (status code 400)
     *         or No access token provided (status code 401)
     */
    @Operation(
        operationId = "removeRecentCustomStatus",
        summary = "Delete user's recent custom status",
        description = "Deletes a user's recent custom status by removing the specific status from the recentCustomStatuses in the user's props and updates the user. ##### Permissions Must be logged in as the user whose recent custom status is being deleted. ",
        tags = { "status" },
        responses = {
            @ApiResponse(responseCode = "200", description = "User recent custom status delete successful"),
            @ApiResponse(responseCode = "400", description = "Invalid or missing parameters in URL or request body", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AppError.class))
            }),
            @ApiResponse(responseCode = "401", description = "No access token provided", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AppError.class))
            })
        },
        security = {
            @SecurityRequirement(name = "bearerAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/v4/users/{user_id}/status/custom/recent",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> removeRecentCustomStatus(
        @Parameter(name = "user_id", description = "User ID", required = true, in = ParameterIn.PATH) @PathVariable("user_id") String userId,
        @Parameter(name = "RemoveRecentCustomStatusRequest", description = "Custom Status object that is to be removed from the recent custom statuses.", required = true) @Valid @RequestBody RemoveRecentCustomStatusRequest removeRecentCustomStatusRequest
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /api/v4/users/{user_id}/status/custom : Unsets user custom status
     * Unsets a user&#39;s custom status by updating the user&#39;s props and updates the user ##### Permissions Must be logged in as the user whose custom status is being removed. 
     *
     * @param userId User ID (required)
     * @return User custom status delete successful (status code 200)
     *         or Invalid or missing parameters in URL or request body (status code 400)
     *         or No access token provided (status code 401)
     */
    @Operation(
        operationId = "unsetUserCustomStatus",
        summary = "Unsets user custom status",
        description = "Unsets a user's custom status by updating the user's props and updates the user ##### Permissions Must be logged in as the user whose custom status is being removed. ",
        tags = { "status" },
        responses = {
            @ApiResponse(responseCode = "200", description = "User custom status delete successful"),
            @ApiResponse(responseCode = "400", description = "Invalid or missing parameters in URL or request body", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AppError.class))
            }),
            @ApiResponse(responseCode = "401", description = "No access token provided", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AppError.class))
            })
        },
        security = {
            @SecurityRequirement(name = "bearerAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/v4/users/{user_id}/status/custom",
        produces = { "application/json" }
    )
    default ResponseEntity<Void> unsetUserCustomStatus(
        @Parameter(name = "user_id", description = "User ID", required = true, in = ParameterIn.PATH) @PathVariable("user_id") String userId
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /api/v4/users/{user_id}/status/custom : Update user custom status
     * Updates a user&#39;s custom status by setting the value in the user&#39;s props and updates the user. Also save the given custom status to the recent custom statuses in the user&#39;s props ##### Permissions Must be logged in as the user whose custom status is being updated. 
     *
     * @param userId User ID (required)
     * @param updateUserCustomStatusRequest Custom status object that is to be updated (required)
     * @return User custom status update successful (status code 200)
     *         or Invalid or missing parameters in URL or request body (status code 400)
     *         or No access token provided (status code 401)
     */
    @Operation(
        operationId = "updateUserCustomStatus",
        summary = "Update user custom status",
        description = "Updates a user's custom status by setting the value in the user's props and updates the user. Also save the given custom status to the recent custom statuses in the user's props ##### Permissions Must be logged in as the user whose custom status is being updated. ",
        tags = { "status" },
        responses = {
            @ApiResponse(responseCode = "200", description = "User custom status update successful"),
            @ApiResponse(responseCode = "400", description = "Invalid or missing parameters in URL or request body", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AppError.class))
            }),
            @ApiResponse(responseCode = "401", description = "No access token provided", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AppError.class))
            })
        },
        security = {
            @SecurityRequirement(name = "bearerAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/api/v4/users/{user_id}/status/custom",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> updateUserCustomStatus(
        @Parameter(name = "user_id", description = "User ID", required = true, in = ParameterIn.PATH) @PathVariable("user_id") String userId,
        @Parameter(name = "UpdateUserCustomStatusRequest", description = "Custom status object that is to be updated", required = true) @Valid @RequestBody UpdateUserCustomStatusRequest updateUserCustomStatusRequest
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /api/v4/users/{user_id}/status : Update user status
     * Manually set a user&#39;s status. When setting a user&#39;s status, the status will remain that value until set \&quot;online\&quot; again, which will return the status to being automatically updated based on user activity. ##### Permissions Must have &#x60;edit_other_users&#x60; permission for the team. 
     *
     * @param userId User ID (required)
     * @param updateUserStatusRequest Status object that is to be updated (required)
     * @return User status update successful (status code 200)
     *         or Invalid or missing parameters in URL or request body (status code 400)
     *         or No access token provided (status code 401)
     */
    @Operation(
        operationId = "updateUserStatus",
        summary = "Update user status",
        description = "Manually set a user's status. When setting a user's status, the status will remain that value until set \"online\" again, which will return the status to being automatically updated based on user activity. ##### Permissions Must have `edit_other_users` permission for the team. ",
        tags = { "status" },
        responses = {
            @ApiResponse(responseCode = "200", description = "User status update successful", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Status.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid or missing parameters in URL or request body", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AppError.class))
            }),
            @ApiResponse(responseCode = "401", description = "No access token provided", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AppError.class))
            })
        },
        security = {
            @SecurityRequirement(name = "bearerAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/api/v4/users/{user_id}/status",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Status> updateUserStatus(
        @Parameter(name = "user_id", description = "User ID", required = true, in = ParameterIn.PATH) @PathVariable("user_id") String userId,
        @Parameter(name = "UpdateUserStatusRequest", description = "Status object that is to be updated", required = true) @Valid @RequestBody UpdateUserStatusRequest updateUserStatusRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"user_id\" : \"user_id\", \"last_activity_at\" : 0, \"manual\" : true, \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
