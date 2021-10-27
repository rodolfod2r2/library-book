package org.framework.rodolfo.freire.git.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;
import java.util.List;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ShopCarDetail {

    private long shopCarDetailId;
    private long shopCarDetailCode;
    private Date shopCarDetailDate;
    private TypeOperation shopCarType;
    private Customer shopCarCustomer;
    private Employee shopCarEmployee;
    private List<ShopCarDetail> shopCarDetailList;
    private boolean shopCarStatus;

}
