package com.redcatdev86.fc24issuegenerator.controller.dto;

import java.io.Serializable;
import java.math.BigDecimal;


public class PlayerDTO implements Serializable {

    private String firstName;

    private String lastName;

    private int numPosition;

    private BigDecimal avg = BigDecimal.ZERO;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumPosition() {
        return numPosition;
    }

    public void setNumPosition(int numPosition) {
        this.numPosition = numPosition;
    }

    public BigDecimal getAvg() {
        return avg;
    }

    public void setAvg(BigDecimal avg) {
        this.avg = avg;
    }
}
