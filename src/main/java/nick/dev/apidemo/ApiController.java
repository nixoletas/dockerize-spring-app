package nick.dev.apidemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/")
    public ResponseEntity<ApiResponse>hello(){
        return ResponseEntity.ok(new ApiResponse(
                1,
                "Hello World",
                "This is a dockerized spring app",
                "Nicholas"));
    }
}
