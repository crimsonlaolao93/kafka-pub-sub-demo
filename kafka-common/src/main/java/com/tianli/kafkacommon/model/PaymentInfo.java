package com.tianli.kafkacommon.model;

import lombok.Data;
import lombok.Getter;

@Data
public class PaymentInfo {

    private String username;
    private String email;
    private String bankAccount;

}
