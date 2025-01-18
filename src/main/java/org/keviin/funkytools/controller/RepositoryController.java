package org.keviin.funkytools.controller;

import org.keviin.funkytools.model.entity.Repository;
import org.keviin.funkytools.service.RepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.URI;
import java.security.Principal;

@Controller
public class RepositoryController {
    @Autowired
    private RepositoryService repositoryService;

    /**
     * 给仓库点赞
     */
    @PostMapping("/like")
    public String like(@RequestParam Long repoId, Principal principal) {
        // 用户已登录，更新点赞数
        Repository repository = repositoryService.getById(repoId);
        repository.setLikes(repository.getLikes() + 1);
        repositoryService.updateById(repository);

        // 重定向到主页面
        return "redirect:/";
    }

    /**
     * 上传新仓库
     */
    @PostMapping("/upload")
    public String upload(@RequestParam String name, @RequestParam String description, @RequestParam String url) {
        Repository repository = new Repository();
        repository.setName(name);
        repository.setDescription(description);
        repository.setUrl(url);
        repository.setLikes(0);
        repositoryService.save(repository);

        // 重定向到主页面
        return "redirect:/";
    }
}
