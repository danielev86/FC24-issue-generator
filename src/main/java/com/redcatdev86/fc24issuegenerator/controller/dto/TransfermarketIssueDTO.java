package com.redcatdev86.fc24issuegenerator.controller.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode
public class TransfermarketIssueDTO implements Serializable {

    private int issueCode;

    private String issueType;

    private String issueDescription;

}
