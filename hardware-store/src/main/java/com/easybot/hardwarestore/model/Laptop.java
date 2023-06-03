package com.easybot.hardwarestore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@PrimaryKeyJoinColumn(name = "item_id")
public class Laptop extends Items {

    @Column
    @GeneratedValue(generator = "laptopGenerator", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "laptopGenerator", sequenceName = "laptop_seq")
    private Long public_id;

    @Enumerated(EnumType.STRING)
    private LaptopSize size;
}
