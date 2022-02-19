package com.example.Java_devops_test.routes;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/")
public class UtilityController {


    public UtilityController() {
    }


    @GetMapping("/health")
    public ResponseEntity<?> healthCheck(){
        Runtime runtime = Runtime.getRuntime();
        long freeMemory = runtime.freeMemory();
        long maxMemory = runtime.maxMemory();
        long totalMemory = runtime.totalMemory();

        return ResponseEntity.ok("free mem: " + freeMemory/1048576.0 + "\n"
                + "max mem: " + maxMemory/1048576.0 + "\n"
                + "total mem: " + totalMemory/1048576.0 );
    }

}
