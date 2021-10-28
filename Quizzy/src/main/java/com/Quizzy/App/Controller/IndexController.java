package com.Quizzy.App.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class IndexController {

    @RequestMapping("/")
    public String index3() {
        return "index";
    }
    
    @RequestMapping("/index")
    public String index1() {
        return "index";
    }
    
    
    @RequestMapping("/home")
    public String index2() {
        return "index";
    }
}
