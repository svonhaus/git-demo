package be.henallux.gitdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/add")
public class AdditionController {

    public Long addition(@RequestParam Long param1, @RequestParam Long param2) {
        return param1 + param2;
    }
}
