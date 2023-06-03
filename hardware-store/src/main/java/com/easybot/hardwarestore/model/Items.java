package com.easybot.hardwarestore.model;

import com.easybot.hardwarestore.api.mapper.marker.EntityMarker;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Items implements EntityMarker {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "itemGenerator")
    @SequenceGenerator(name = "itemGenerator", sequenceName = "item_seq", allocationSize = 1)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String serialNum;

    @Column(nullable = false)
    private String manufacturer;

    @Column(nullable = false)
    private BigDecimal price;

    @Column
    private int count;
}
