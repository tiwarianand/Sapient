package com.test.user.dto;

import com.test.user.dto.Status;

import lombok.Data;

@Data
public class UserUpdateRequest {
    private Status status;
}
