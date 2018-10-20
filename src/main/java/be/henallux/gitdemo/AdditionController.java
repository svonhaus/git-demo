package be.henallux.gitdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {

    @RequestMapping("/addition")
    public Long add(@RequestParam Long x, @RequestParam Long y) {
        if(x == null || y == null) {
            throw new IllegalArgumentException("The parameter x and y should not be null");
        }
        return x + y;
    }
}
