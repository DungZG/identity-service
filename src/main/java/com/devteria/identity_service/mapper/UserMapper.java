package com.devteria.identity_service.mapper;

import com.devteria.identity_service.dto.Request.UserCreationRequest;
import com.devteria.identity_service.dto.Request.UserUpdateRequest;
import com.devteria.identity_service.dto.response.UserResponse;
import com.devteria.identity_service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

//    @Mapping(target="lastName", ignore = true)
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user , UserUpdateRequest request);
}
