package com.redcatdev86.fc24issuegenerator.controller;

import com.redcatdev86.fc24issuegenerator.controller.dto.PlayerIssueDTO;
import com.redcatdev86.fc24issuegenerator.service.IFootballService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private IFootballService footballService;

    @GetMapping("/playersissue")
    public String getPlayerIssue(Model model){
        PlayerIssueDTO playerResult = footballService.generatePlayerIssue();
        model.addAttribute("playerResult", playerResult);
        return "players";
    }

}
