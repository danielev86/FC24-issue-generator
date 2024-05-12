package com.redcatdev86.fc24issuegenerator.controller.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode
public class PlayerIssueDTO implements Serializable {

    private int issueCode;

    private String issueType;

    private String issueDescription;

    private Integer playerNumber;

}
