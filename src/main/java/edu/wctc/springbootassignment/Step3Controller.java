package edu.wctc.springbootassignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Step3Controller {
    @RequestMapping("/step3")
    public String showStep3Page() {
        return "pages/step3";
    }
}
