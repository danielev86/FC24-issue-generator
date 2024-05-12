package com.redcatdev86.fc24issuegenerator.service;

import com.redcatdev86.fc24issuegenerator.controller.dto.PlayerIssueDTO;
import com.redcatdev86.fc24issuegenerator.controller.dto.TeamIssueDTO;
import com.redcatdev86.fc24issuegenerator.controller.dto.TransfermarketIssueDTO;
import com.redcatdev86.fc24issuegenerator.repository.PlayerRepository;
import com.redcatdev86.fc24issuegenerator.repository.TeamIssueRepository;
import com.redcatdev86.fc24issuegenerator.repository.TransfermarketRepository;
import com.redcatdev86.fc24issuegenerator.repository.model.PlayerIssue;
import com.redcatdev86.fc24issuegenerator.repository.model.TeamIssue;
import com.redcatdev86.fc24issuegenerator.repository.model.TransfermarketIssue;
import com.redcatdev86.fc24issuegenerator.utility.Fifa23Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

import static com.redcatdev86.fc24issuegenerator.utility.Fifa23Utility.generateRandomNumber;

@Service("footballService")
public class FootballServiceImpl implements IFootballService {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private TeamIssueRepository teamRepository;

    @Autowired
    private TransfermarketRepository marketRepository;

    public PlayerIssueDTO generatePlayerIssue(){
        int randomNum = generateRandomNumber(1,34+1);
        Optional<PlayerIssue> optPlayer = playerRepository.findById(Long.valueOf(randomNum));
        PlayerIssueDTO playerDTO = new PlayerIssueDTO();
        if (optPlayer.isPresent()){
            PlayerIssue player = optPlayer.get();
            playerDTO.setIssueCode(player.getId().intValue());
            playerDTO.setIssueType(player.getIssueType());
            playerDTO.setIssueDescription(player.getIssueDescription());
            playerDTO.setPlayerNumber(ThreadLocalRandom.current().nextInt(1,18));
        }else{
            playerDTO.setIssueType("Nessun Imprevisto Generato".toUpperCase());
        }
        return playerDTO;
    }

    public TeamIssueDTO generateTeamIssue(){
       int randomNum = generateRandomNumber(1,16+1);
       Optional<TeamIssue> optTeamIssue = teamRepository.findById(Long.valueOf(randomNum));
       TeamIssueDTO teamDTO = new TeamIssueDTO();
       if (optTeamIssue.isPresent()) {
           TeamIssue team = optTeamIssue.get();
           teamDTO.setIssueCode(team.getId().intValue());
           teamDTO.setIssueType(team.getIssueType());
           teamDTO.setIssueDescription(team.getIssueDescription());
       }else{
           teamDTO.setIssueType("Nessun Imprevisto Generato".toUpperCase());
       }
       return teamDTO;

    }

    public TransfermarketIssueDTO generateTransferIssue(){
        int randomNum = generateRandomNumber(1,39+1);
        Optional<TransfermarketIssue> optTransfer = marketRepository.findById(Long.valueOf(randomNum));
        TransfermarketIssueDTO marketDTO = new TransfermarketIssueDTO();
        if (optTransfer.isPresent()){
            TransfermarketIssue market = optTransfer.get();
            marketDTO.setIssueCode(market.getId().intValue());
            marketDTO.setIssueType(market.getIssueType());
            marketDTO.setIssueDescription(market.getIssueDescription());
            if (randomNum == 26){
                String desc = marketDTO.getIssueDescription() + " " + Fifa23Utility.generateModule();
                marketDTO.setIssueDescription(desc);
            }
        }else{
            marketDTO.setIssueType("Nessun Imprevisto Generato".toUpperCase());
        }
        return marketDTO;
    }

}
