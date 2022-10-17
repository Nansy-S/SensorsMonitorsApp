package com.prokopovich.smapp.domain.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class User {

    private int id;

    private String login;

    private String password;

    private String role;
}
