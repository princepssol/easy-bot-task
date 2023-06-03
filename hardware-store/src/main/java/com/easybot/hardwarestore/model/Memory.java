package com.easybot.hardwarestore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Generated;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "mem")
@PrimaryKeyJoinColumn(name = "item_id")
public class Memory extends Items {

    @Column
    @Generated
    private Long public_id;

    @Column
    private short size;
}
