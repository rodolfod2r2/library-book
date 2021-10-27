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
public class ShopCar {

    private long shopCarId;
    private long shopCarCode;
    private Date shopCarDate;
    private TypeOperation shopCarType;
    private Customer saleCustomer;
    private Employee saleEmployee;
    private List<ShopCarDetail> saleDetailList;
    private boolean saleStatus;
}
