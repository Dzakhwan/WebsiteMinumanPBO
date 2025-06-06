package com.example.websiteminuman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homepageController {

    @GetMapping("/")
    public String showHome() {
        return "homepage";
    }
    @GetMapping("/about")
    public String showAbout() {
        return "about";
    }
    @GetMapping("/menu")
    public String showMenu() {
        return "menu";
    }
    @GetMapping("/contact")
    public String showContact() {
        return "contact";
    }
    @GetMapping("/collaboration")
    public String showCollaboration() {
        return "collaboration";
    }
    @GetMapping("/download")
    public String showDownload() {
        return "download";
    }
    
    @GetMapping("/admin/dashboard")
    public String showDashboard() {
        return "dashboardAdmin";
    }

    @GetMapping("/loginTest")
    public String showLoginAdmin() {
        return "loginTest";
    }
}
