package com.example.Test.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Test.Model.SSOModel;
import com.example.Test.Requests.CreateSSORequests;
import com.example.Test.Service.SSOService;
import com.example.Test.response.ApiResponse;
import com.example.Test.response.ResponseData;

import io.swagger.v3.oas.annotations.parameters.RequestBody;


@RestController
@RequestMapping("/service")
public class SSOController {
    

    private final SSOService ssoService;

    @Autowired
    public SSOController(SSOService ssoService) {
        this.ssoService = ssoService;
    }
        @GetMapping("/Hello")
    public String hello() {
        return "Hello Test";
    }

    @PostMapping(value = "/Gentoken")
    public ResponseEntity<ApiResponse> create(@RequestBody CreateSSORequests SSORequests) {
        ApiResponse response = new ApiResponse();
        ResponseData data = new ResponseData();
        System.out.println(SSORequests);
        try {
           // SSOModel ssoModel = ssoService.createSSOModel(SSORequests);
         // data.setUserId(ssoModel.getUserId());
         //   data.setTokenId(ssoModel.getTokenid());
           // response.setResponseCode(HttpStatus.OK.value());
            response.setResponseMessage("ทำรายการเรียบร้อย");
            response.setResponseData(data);
            return ResponseEntity.ok().body(response);
        } catch (Exception e) {
          //  response.setResponseCode(HttpStatus.BAD_REQUEST.value());
            response.setResponseMessage("ไม่สามารถบันทึกข้อมูลลงฐานข้อมูลได้");
          //  data.setUserId(SSORequests.getUserId());
        //    data.setTokenId(" ");
            response.setResponseData(data);
            return ResponseEntity.internalServerError().body(response);
        }
    }

    // @PostMapping(value = "/genToken")
    // public ResponseEntity<ApiResponse> createSSO(@RequestBody CreateSSORequests createSSORequests) {
    //     ApiResponse response = new ApiResponse();
    //     ResponseData data = new ResponseData();
    //     System.out.println(createSSORequests);
    //     try {
    //         System.out.println("ssoType: " + createSSORequests.getSsoType());
    //         System.out.println("systemId: " + createSSORequests.getSystemId());
    //         System.out.println("systemName: " + createSSORequests.getSystemName());
    //         System.out.println("systemTransactions: " + createSSORequests.getSystemTransactions());
    //         System.out.println("systemPrivileges: " + createSSORequests.getSystemPrivileges());
    //         System.out.println("systemUserGroup: " + createSSORequests.getSystemUserGroup());
    //         System.out.println("systemLocationGroup: " + createSSORequests.getSystemLocationGroup());
    //         System.out.println("userid: " + createSSORequests.getUserid());
    //         System.out.println("userFullName: " + createSSORequests.getUserFullName());
    //         System.out.println("userRdOfficeCode: " + createSSORequests.getUserRdOfficeCode());
    //         System.out.println("userOfficeCode: " + createSSORequests.getUserOfficeCode());
    //         System.out.println("clientLocation: " + createSSORequests.getClientLocation());
    //         System.out.println("locationMachineNumber: " + createSSORequests.getLocationMachineNumber());
    //         System.out.println("tokenId: " + createSSORequests.getTokenId());
    //         SSOModel ssoModel = ssoService.createSSOModel(createSSORequests);
    //         data.setResult(ssoModel);
    //         response.setResponseMessage("กรอกข้อมูลเรียบร้อย");
    //         response.setResponseData(data);
    //         return ResponseEntity.ok().body(response);
    //     } catch (Exception e) {
    //         // response.setResponseCode("E000001");
    //         response.setResponseMessage("ไม่สามารถบันทึกข้อมูลลงฐานข้อมูลได้");
    //         // สร้างข้อมูล responseData ที่เกี่ยวข้องกับข้อผิดพลาด
    //         ResponseData errorData = new ResponseData();
    //         // errorData.setUserId(ssoRequest.getUserId());
    //         // errorData.setTokenId(ssoRequest.getTokenId());
    //         response.setResponseData(errorData);
    //         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
    //     }
    // }
    
    
}


