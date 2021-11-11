package org.framework.rodolfo.freire.git.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "shop_car")
public class ShopCar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shop_car_id")
    private long shopCarId;
    @Column(name = "shop_car_code")
    private long shopCarCode;
    @Column(name = "shop_car_date")
    private Date shopCarDate;
    @Column(name = "shop_car_type")
    private TypeOperation shopCarType;
    @OneToOne
    @JoinColumn(name = "shop_car_customer_fk")
    private Customer saleCustomer;
    @OneToOne
    @JoinColumn(name = "shop_car_employee_fk")
    private Employee saleEmployee;
    @ManyToMany
    @JoinColumn(name = "shop_car_detail_list_fk")
    private List<ShopCarDetail> saleDetailList;
    @Column(name = "shop_car_status")
    private boolean saleStatus;
}
