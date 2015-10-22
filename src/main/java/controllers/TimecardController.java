package controllers;

import model.Result;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration

public class TimecardController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Result index() {
        return new Result("Name", "A1", "A", "1.5", "10.00");
    }

    public static void main(String[] args) {
        SpringApplication.run(TimecardController.class, args);

    }
}
