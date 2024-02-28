package com.example.Test.Model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "sso_user_test")
public class SSOModel {

    @Id
    private Date requestDate;
    private String ssotype;
    private String systemid;
    private String systemname;
    private String systemtransactions;
    private String systemprivileges;
    private String systemusergroup;
    private String systemlocationgroup;
    private String userid;
    private String userfullname;
    private String userrdofficecode;
    private String userofficecode;
    private String clientlocation;
    private String locationmachinenumber;
    private String tokenid;

    public Date getRequestDate() {
        return this.requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getSsotype() {
        return this.ssotype;
    }

    public void setSsotype(String ssotype) {
        this.ssotype = ssotype;
    }

    public String getSystemid() {
        return this.systemid;
    }

    public void setSystemid(String systemid) {
        this.systemid = systemid;
    }

    public String getSystemname() {
        return this.systemname;
    }

    public void setSystemname(String systemname) {
        this.systemname = systemname;
    }

    public String getSystemtransactions() {
        return this.systemtransactions;
    }

    public void setSystemtransactions(String systemtransactions) {
        this.systemtransactions = systemtransactions;
    }

    public String getSystemprivileges() {
        return this.systemprivileges;
    }

    public void setSystemprivileges(String systemprivileges) {
        this.systemprivileges = systemprivileges;
    }

    public String getSystemusergroup() {
        return this.systemusergroup;
    }

    public void setSystemusergroup(String systemusergroup) {
        this.systemusergroup = systemusergroup;
    }

    public String getSystemlocationgroup() {
        return this.systemlocationgroup;
    }

    public void setSystemlocationgroup(String systemlocationgroup) {
        this.systemlocationgroup = systemlocationgroup;
    }

    public String getUserId() {
        return this.userid;
    }

    public void setUserId(String userid) {
        this.userid = userid;
    }

    public String getUserfullname() {
        return this.userfullname;
    }

    public void setUserfullname(String userfullname) {
        this.userfullname = userfullname;
    }

    public String getUserrdofficecode() {
        return this.userrdofficecode;
    }

    public void setUserrdofficecode(String userrdofficecode) {
        this.userrdofficecode = userrdofficecode;
    }

    public String getUserofficecode() {
        return this.userofficecode;
    }

    public void setUserofficecode(String userofficecode) {
        this.userofficecode = userofficecode;
    }

    public String getClientlocation() {
        return this.clientlocation;
    }

    public void setClientlocation(String clientlocation) {
        this.clientlocation = clientlocation;
    }

    public String getLocationmachinenumber() {
        return this.locationmachinenumber;
    }

    public void setLocationmachinenumber(String locationmachinenumber) {
        this.locationmachinenumber = locationmachinenumber;
    }

    public String getTokenid() {
        return this.tokenid;
    }

    public void setTokenid(String tokenid) {
        this.tokenid = tokenid;
    }

}
