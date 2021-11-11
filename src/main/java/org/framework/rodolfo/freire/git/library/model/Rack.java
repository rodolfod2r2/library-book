package org.framework.rodolfo.freire.git.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "rack")
public class Rack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rack_id")
    private long rackId;
    @Column(name = "rack_number")
    private int numberRack;
    @Column(name = "rack_shelf")
    private int numberShelf;
    @Column(name = "rack_book")
    @OneToOne
    @JoinColumn(name = "rack_book_fk")
    private Book book;

}
