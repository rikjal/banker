package com.zoro.banker.model.party;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "t_pty_party")
public class Party {
    @Id
    private int id;
    private String custNo;
    private String firstName;
    private String lastName;
    private Date recStartDate;
    private Date recEndDate;

    public Party() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

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

    public Date getRecStartDate() {
        return recStartDate;
    }

    public void setRecStartDate(Date recStartDate) {
        this.recStartDate = recStartDate;
    }

    public Date getRecEndDate() {
        return recEndDate;
    }

    public void setRecEndDate(Date recEndDate) {
        this.recEndDate = recEndDate;
    }
}