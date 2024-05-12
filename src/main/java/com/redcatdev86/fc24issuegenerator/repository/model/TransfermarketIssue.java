package com.redcatdev86.fc24issuegenerator.repository.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "TRANSFERMARKET_ISSUE")
@Getter
@Setter
@NoArgsConstructor
public class TransfermarketIssue implements Serializable {

    @Id
    private Long id;

    private String issueType;

    private String issueDescription;

}
