package com.example.Test.Requests;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CreateSSORequests {

    String ssoType;
    String systemId;
    String systemName;
    String systemTransactions;
    String systemPrivileges;
    String systemUserGroup;
    String systemLocationGroup;
    String userid;
    String userFullName;
    String userRdOfficeCode;
    String userOfficeCode;
    String clientLocation;
    String locationMachineNumber;
    String tokenId;

}