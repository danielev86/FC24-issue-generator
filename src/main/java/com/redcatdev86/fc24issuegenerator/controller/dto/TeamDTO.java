package com.redcatdev86.fc24issuegenerator.controller.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class TeamDTO implements Serializable {

    private String teamName;

    private List<PlayerDTO> players;

    public TeamDTO(){
        this.players = new ArrayList<>();
        for (int i = 1; i<=11;i++){
            PlayerDTO player = new PlayerDTO();
            player.setNumPosition(i);
            players.add(player);
        }
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<PlayerDTO> getPlayers() {
        return players;
    }

    public void setPlayers(List<PlayerDTO> players) {
        this.players = players;
    }
}
