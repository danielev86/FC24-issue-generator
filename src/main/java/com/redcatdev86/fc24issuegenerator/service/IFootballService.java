package com.redcatdev86.fc24issuegenerator.service;

import com.redcatdev86.fc24issuegenerator.controller.dto.PlayerIssueDTO;
import com.redcatdev86.fc24issuegenerator.controller.dto.TeamIssueDTO;
import com.redcatdev86.fc24issuegenerator.controller.dto.TransfermarketIssueDTO;

public interface IFootballService {

    PlayerIssueDTO generatePlayerIssue();

    TeamIssueDTO generateTeamIssue();

    TransfermarketIssueDTO generateTransferIssue();

}
