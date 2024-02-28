package com.example.Test.Service;



import java.time.LocalDateTime;
import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Test.Model.SSOModel;
import com.example.Test.Repository.SSORepository;
import com.example.Test.Requests.CreateSSORequests;



@Service
public class SSOService {
    
    private final SSORepository ssoRepository;

    @Autowired
    public SSOService(SSORepository ssoRepository) {
        this.ssoRepository = ssoRepository;
    }



    // public SSOModel createSSOModel(CreateSSORequests createSSORequests) {
    //     Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());

    //     SSOModel ssoModel = SSOModel.builder()
    //             .requestDate(currentTimestamp)
    //             .ssotype(createSSORequests.getSsoType())
    //             .systemid(createSSORequests.getSystemId())
    //             .systemname(createSSORequests.getSystemName())
    //             .systemtransactions(createSSORequests.getSystemTransactions())
    //             .systemprivileges(createSSORequests.getSystemPrivileges())
    //             .systemusergroup(createSSORequests.getSystemUserGroup())
    //             .systemlocationgroup(createSSORequests.getSystemLocationGroup())
    //             .userid(createSSORequests.getUserId())
    //             .userfullname(createSSORequests.getUserFullName())
    //             .userrdofficecode(createSSORequests.getUserRdOfficeCode())
    //             .userofficecode(createSSORequests.getUserOfficeCode())
    //             .clientlocation(createSSORequests.getClientLocation())
    //             .locationmachinenumber(createSSORequests.getLocationMachineNumber())
    //             .tokenid(createSSORequests.getTokenId())
    //             .build();

    //     return ssoRepository.save(ssoModel);
    // }

    public SSOModel createSSOModel(CreateSSORequests createSSORequests) {

        SSOModel ssoModel = SSOModel
                .builder()
                .requestDate(new Date())
                .ssotype(createSSORequests.getSsoType())
                .systemid(createSSORequests.getSystemId())
                .systemname(createSSORequests.getSystemName())
                .systemtransactions(createSSORequests.getSystemTransactions())
                .systemprivileges(createSSORequests.getSystemPrivileges())
                .systemusergroup(createSSORequests.getSystemUserGroup())
                .systemlocationgroup(createSSORequests.getSystemLocationGroup())
                .userid(createSSORequests.getUserid())
                .userfullname(createSSORequests.getUserFullName())
                .userrdofficecode(createSSORequests.getUserRdOfficeCode())
                .userofficecode(createSSORequests.getUserOfficeCode())
                .clientlocation(createSSORequests.getClientLocation())
                .locationmachinenumber(createSSORequests.getLocationMachineNumber())
                .tokenid(createSSORequests.getTokenId())
                .build();

                System.out.println("ssoType: " + createSSORequests.getSsoType());
                    System.out.println("systemId: " + createSSORequests.getSystemId());
                    System.out.println("systemName: " + createSSORequests.getSystemName());
                    System.out.println("systemTransactions: " + createSSORequests.getSystemTransactions());
                    System.out.println("systemPrivileges: " + createSSORequests.getSystemPrivileges());
                    System.out.println("systemUserGroup: " + createSSORequests.getSystemUserGroup());
                    System.out.println("systemLocationGroup: " + createSSORequests.getSystemLocationGroup());
                    System.out.println("userid: " + createSSORequests.getUserid());
                    System.out.println("userFullName: " + createSSORequests.getUserFullName());
                    System.out.println("userRdOfficeCode: " + createSSORequests.getUserRdOfficeCode());
                    System.out.println("userOfficeCode: " + createSSORequests.getUserOfficeCode());
                    System.out.println("clientLocation: " + createSSORequests.getClientLocation());
                    System.out.println("locationMachineNumber: " + createSSORequests.getLocationMachineNumber());
                    System.out.println("tokenId: " + createSSORequests.getTokenId());
        return ssoRepository.save(ssoModel);
    }


    // public SSOModel createSSOModel(CreateSSORequests createSSORequests) {
    //     // สร้าง Timestamp จากวันที่และเวลาปัจจุบัน
    //     Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
    
    //     // สร้าง SSOModel โดยกำหนด requestDate เป็นวันที่และเวลาปัจจุบัน
    //     SSOModel ssoModel = SSOModel.builder()
    //             .requestDate(currentTimestamp) // กำหนด requestDate เป็นวันที่และเวลาปัจจุบัน
    //             .ssoType(createSSORequests.getSsoType())
    //             .systemId(createSSORequests.getSystemId())
    //             .systemName(createSSORequests.getSystemName())
    //             .systemTransactions(createSSORequests.getSystemTransactions())
    //             .systemPrivileges(createSSORequests.getSystemPrivileges())
    //             .systemUserGroup(createSSORequests.getSystemUserGroup())
    //             .systemLocationGroup(createSSORequests.getSystemLocationGroup())
    //             .userid(createSSORequests.getUserid())
    //             .userFullName(createSSORequests.getUserFullName())
    //             .userRdOfficeCode(createSSORequests.getUserRdOfficeCode())
    //             .userOfficeCode(createSSORequests.getUserOfficeCode())
    //             .clientLocation(createSSORequests.getClientLocation())
    //             .locationMachineNumber(createSSORequests.getLocationMachineNumber())
    //             .tokenId(createSSORequests.getTokenId())
    //             .build();
    
    //     // ปริ้นค่าทั้งหมดออกมา
    //     System.out.println("ssoType: " + createSSORequests.getSsoType());
    //     System.out.println("systemId: " + createSSORequests.getSystemId());
    //     System.out.println("systemName: " + createSSORequests.getSystemName());
    //     System.out.println("systemTransactions: " + createSSORequests.getSystemTransactions());
    //     System.out.println("systemPrivileges: " + createSSORequests.getSystemPrivileges());
    //     System.out.println("systemUserGroup: " + createSSORequests.getSystemUserGroup());
    //     System.out.println("systemLocationGroup: " + createSSORequests.getSystemLocationGroup());
    //     System.out.println("userid: " + createSSORequests.getUserid());
    //     System.out.println("userFullName: " + createSSORequests.getUserFullName());
    //     System.out.println("userRdOfficeCode: " + createSSORequests.getUserRdOfficeCode());
    //     System.out.println("userOfficeCode: " + createSSORequests.getUserOfficeCode());
    //     System.out.println("clientLocation: " + createSSORequests.getClientLocation());
    //     System.out.println("locationMachineNumber: " + createSSORequests.getLocationMachineNumber());
    //     System.out.println("tokenId: " + createSSORequests.getTokenId());
    
    //     // Save the SSOModel in the database
    //     ssoModel = ssoRepository.save(ssoModel);
    
    //     return ssoModel;
    // }
    
    
    
    
    
    
}

