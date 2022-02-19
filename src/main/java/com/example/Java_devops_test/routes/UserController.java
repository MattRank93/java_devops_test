package com.example.Java_devops_test.routes;

import com.example.Java_devops_test.Services.UserService;
import com.example.Java_devops_test.models.User;
import com.example.Java_devops_test.requestobjects.UserRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userController;
//    private final UserResponse userResponse;

    public UserController(UserService userController) {
        this.userController = userController;
    }


    @GetMapping("/get-all-users")
    public ResponseEntity<?> getAllUsers(){
        return userController.getAllUsers();
    }

    @GetMapping("/by-id")
    public ResponseEntity<?> getOneUserById(@RequestBody UserRequest userRequest){
        try{
            User oneUser = userController.getOneUserById(userRequest);
            System.out.println(oneUser);
            return ResponseEntity.ok(oneUser);
        } catch(Exception e){
            return ResponseEntity.badRequest().body("Something donked up");
        }
    }

    @GetMapping("/by-name")
    public ResponseEntity<?> getOneUserByName(@RequestBody UserRequest userRequest){
        try{
            User oneUser = userController.getOneUserByName(userRequest);
            System.out.println(oneUser);
            return ResponseEntity.ok(oneUser);
        } catch(Exception e){
            return ResponseEntity.badRequest().body("Something donked up");
        }
    }

    @GetMapping("/test-sani")
    public Object testSanitation(@RequestBody UserRequest userRequest){
        try{
//            if()
            return userController.testSanitation(userRequest);
        } catch(Exception e){
            return "Failed";
        }
    }

    @GetMapping("/enter-sani")
    public Object enterSanitation(@RequestBody UserRequest userRequest){
        try{
            return userController.enterSanitation(userRequest);
        } catch(Exception e){
            return "Failed";
        }
    }


    @PostMapping("/register")
    public ResponseEntity<?> registeruser(@RequestBody UserRequest userRequest) {
         return userController.register(userRequest);
    }

//    @PostMapping("/test-publish")
//    public void testPublisher(@RequestBody UserRequest userRequest) {
////        rabbitPublisher.send();
//    }

}
