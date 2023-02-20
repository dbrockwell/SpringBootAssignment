package edu.wctc.springbootassignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Step2Controller {
    @RequestMapping("/step2")
    public String showStep2Page() {
        return "pages/step2";
    }
}
