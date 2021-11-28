package org.framework.rodolfo.freire.git.library.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.framework.rodolfo.freire.git.library.model.ShopCarDetail;
import org.framework.rodolfo.freire.git.library.model.TypeOperation;

import java.util.Date;
import java.util.List;

@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ShopCarDto {

    private long id;
    private long shopCarCode;
    private Date shopCarDate;
    private TypeOperation shopCarType;
    private CustomerDto saleCustomer;
    private EmployeeDto saleEmployee;
    private List<ShopCarDetail> saleDetailList;
    private boolean saleStatus;

}
