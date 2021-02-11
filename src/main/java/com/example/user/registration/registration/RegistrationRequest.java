package com.example.user.registration.registration;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {

    private String firstname;
    private String lastname;
    private String email;
    private String password;
}
