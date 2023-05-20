package com.example.wsdlsample;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TokenRequest {

    private String nationalityCode;
    private String birthData;
    private String mobileNo;
}
