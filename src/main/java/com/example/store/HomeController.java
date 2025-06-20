package com.example.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// this decorator @Controller is defined in `org.springframework.stereotype.Controller` package above
@Controller
public class HomeController {
    // @value can help us get the value of the properties we defined in application.properties file
    @Value("${spring.application.name}") // this take the value of the key in application.properties into the variable below
    private String appName;

    // when a request goes to root of our website, this method got called, i.e. user access the landing page, display index.html
    @RequestMapping("/")
    public String index() {
        System.out.println("appName: " + appName);
        return "index.html";
    }
}
