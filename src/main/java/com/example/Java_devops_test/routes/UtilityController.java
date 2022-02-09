package com.example.Java_devops_test.routes;

import com.example.Java_devops_test.controller.UserService;
import com.example.Java_devops_test.models.User;
import com.example.Java_devops_test.requestobjects.UserRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/")
public class UtilityController {

    private final UserService userController;
//    private final UserResponse userResponse;

    public UtilityController(UserService userController) {
        this.userController = userController;
    }


    @GetMapping("/health")
    public String getAllUsers(){
        return "healthy";
    }

}
