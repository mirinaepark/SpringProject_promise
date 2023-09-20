package com.mrnstudio.promise;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class hello {

    @RequestMapping(value = "/index")
    public String hello(){
        return "index";
    }
}
