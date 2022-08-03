package com.test.user.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import com.test.user.dto.Status;

@Getter
@Setter
@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String authId;

    private String identification;

    @Enumerated(EnumType.STRING)
    private Status status;

}
