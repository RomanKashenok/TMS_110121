package com.tms.opt;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Prize {

    private String name;
    private double amount;

}
