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
@Entity(name = "mem")
@PrimaryKeyJoinColumn(name = "item_id")
public class Memory extends Items {

    @Column
    @GeneratedValue(generator = "memGenerator", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "memGenerator", sequenceName = "mem_seq")
    private Long public_id;

    @Column
    private short size;
}
