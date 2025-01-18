package org.keviin.funkytools.controller;

import org.keviin.funkytools.model.entity.Repository;
import org.keviin.funkytools.service.RepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FunkyToolsController {
    @Autowired
    private RepositoryService repositoryService;

    /**
     * 首页
     */
    @GetMapping("/")
    public String index(Model model) {
        List<Repository> repositories = repositoryService.list();
        model.addAttribute("repositories", repositories);
        return "index";
    }

    /**
     * 登陆页面
     */
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    /**
     * 上传页面
     */
    @GetMapping("/uploadPage")
    public String uploadPage() {
        return "uploadPage";
    }
}
