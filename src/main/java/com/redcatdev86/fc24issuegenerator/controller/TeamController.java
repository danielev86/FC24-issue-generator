package com.redcatdev86.fc24issuegenerator.controller;

import com.redcatdev86.fc24issuegenerator.controller.dto.TeamIssueDTO;
import com.redcatdev86.fc24issuegenerator.controller.dto.TransfermarketIssueDTO;
import com.redcatdev86.fc24issuegenerator.service.IFootballService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TeamController {

    @Autowired
    private IFootballService footballService;

    @GetMapping("/teams/teamissue")
    public String getTeamIssues(Model model){
        TeamIssueDTO teamData = footballService.generateTeamIssue();
        model.addAttribute("teamData", teamData);
        return "teams";
    }

    @GetMapping("/teams/marketissue")
    public String getMarketIssue(Model model){
        TransfermarketIssueDTO teamData = footballService.generateTransferIssue();
        model.addAttribute("teamData", teamData);
        return "transfermarket";
    }

}
