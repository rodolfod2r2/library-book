package org.framework.rodolfo.freire.git.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.List;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "shop_car_detail")
public class ShopCarDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shop_detail_id")
    private long shopCarDetailId;
    @Column(name = "shop_detail_code")
    private long shopCarDetailCode;
    @ManyToMany
    @JoinColumn(name = "shop_car_books_fk")
    private List<Book> books;
    @Column(name = "shop_detail_status")
    private boolean shopCarStatus;

}
