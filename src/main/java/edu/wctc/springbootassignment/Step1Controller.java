package edu.wctc.springbootassignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Step1Controller {
    @RequestMapping("/step1")
    public String showStep1Page() {
        return "pages/step1";
    }
}
