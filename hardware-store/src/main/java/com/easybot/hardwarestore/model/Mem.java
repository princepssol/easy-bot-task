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
@Entity
@PrimaryKeyJoinColumn(name = "item_id")
public class Mem extends Items {

    @Column
    @Generated
    private Long publicId;

    @Column
    private short size;
}
