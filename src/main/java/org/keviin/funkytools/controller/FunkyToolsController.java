package org.keviin.funkytools.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FunkyToolsController {
    /**
     * 跳转到首页
     */
    @GetMapping("/")
    public String index() {
        return "redirect:/index.html";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello, World!";
    }
}
