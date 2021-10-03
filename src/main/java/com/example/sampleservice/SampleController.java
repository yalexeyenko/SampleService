package com.example.sampleservice;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

    @GetMapping("/goodbye")
    public ResponseEntity<String> getGoodBye() {
        return ResponseEntity.ok("Good Bye!");
    }

    @GetMapping("/seeya")
    public ResponseEntity<String> getSeeYa() {
        return ResponseEntity.ok("See ya!");
    }
}
