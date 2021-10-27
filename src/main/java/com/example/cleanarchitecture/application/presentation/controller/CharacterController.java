package com.example.cleanarchitecture.application.presentation.controller;

import com.example.cleanarchitecture.application.presentation.body.DetailsBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/api")
@RestController
public interface CharacterController {


    @PostMapping(value = "/character", consumes = "application/json", produces = "application/json")
    ResponseEntity<?> getDetails(@Valid @RequestBody DetailsBody detailsBody);

}
