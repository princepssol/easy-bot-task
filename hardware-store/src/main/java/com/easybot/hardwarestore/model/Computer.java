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
public class Computer extends Items {

    @SequenceGenerator(name = "computerSeq", sequenceName = "computer_pub_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "computerSeq")
    private Long public_id;

    @Enumerated(EnumType.STRING)
    private ComputerType type;

}
