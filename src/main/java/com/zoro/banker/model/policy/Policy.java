package com.zoro.banker.model.policy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "t_poa_policy")
public class Policy {
    @Id
    private int policyId;
    private String policyNoo;
    private String legPolNo;
    private Date recStartDate;
    private Date recEndDate;

    public int getPolicyId() {
        return policyId;
    }

    public void setPolicyId(int policyId) {
        this.policyId = policyId;
    }

    public String getLegPolNo() {
        return legPolNo;
    }

    public void setLegPolNo(String legPolNo) {
        this.legPolNo = legPolNo;
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

    public String getPolicyNoo() {
        return policyNoo;
    }

    public void setPolicyNoo(String policyNo) {
        this.policyNoo = policyNo;
    }
}