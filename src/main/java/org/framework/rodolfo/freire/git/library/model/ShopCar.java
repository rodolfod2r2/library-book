package org.framework.rodolfo.freire.git.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.framework.rodolfo.freire.git.library.model.product.Product;

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
@DiscriminatorValue("Book")
public class ShopCar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "shop_car_code")
    private long shopCarCode;
    @Column(name = "shop_car_date")
    @Temporal(TemporalType.DATE)
    private Date shopCarDate;
    @Column(name = "shop_car_type")
    @Enumerated(EnumType.STRING)
    private TypeOperation shopCarType;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "shop_car_customer_fk")
    private Customer saleCustomer;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "shop_car_employee_fk")
    private Employee saleEmployee;
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "shop_car_detail_list_fk")
    private List<Product> saleDetailList;
    @Column(name = "shop_car_status")
    private boolean saleStatus;
}
