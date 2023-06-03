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
public class Monitor extends Items {

    @SequenceGenerator(name = "monitorSeq", sequenceName = "monitor_pub_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "monitorSeq")
    private Long public_id;

    @Column
    private short size;
}
