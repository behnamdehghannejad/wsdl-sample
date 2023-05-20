package com.example.wsdlsample;


import org.datacontract.schemas._2004._07.rad.ResultClassWithErrorMessageOfstring;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tempuri.IJudOutServices;
import org.tempuri.JudOutServices;

@RestController
public class a {


    @PostMapping("/token")
    private String a(TokenRequest tokenRequest) {
        JudOutServices judOutServices = new JudOutServices();
        IJudOutServices basicHttpBindingIJudOutServices = judOutServices.getBasicHttpBindingIJudOutServices();
        ResultClassWithErrorMessageOfstring createPersonTokenU_id_test_callercode = basicHttpBindingIJudOutServices.createAbsenceAuthenticateTempToken(
                "CreatePersonTokenU_ID_TEST_CALLERCODE",
                tokenRequest.getNationalityCode(),
                tokenRequest.getBirthData(),
                tokenRequest.getMobileNo()
        );

        return createPersonTokenU_id_test_callercode.getResultValue().getValue();
    }
}
