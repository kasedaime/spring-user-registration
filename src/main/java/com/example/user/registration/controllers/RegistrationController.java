package com.example.user.registration.controllers;

import com.example.user.registration.registration.RegistrationRequest;
import com.example.user.registration.services.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;

    @PostMapping()
    public String register(@RequestBody RegistrationRequest request) {

        return registrationService.register(request);
    }

    @GetMapping(path = "confirm")
    public String confirm(@RequestParam("token") String token) {

        return registrationService.confirmToken(token);
    }
}
