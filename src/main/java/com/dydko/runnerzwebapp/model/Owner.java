package com.dydko.runnerzwebapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "owner")
@NoArgsConstructor
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter
    private String name;
    @Getter
    @Setter
    @OneToOne
    @JoinColumn(name = "car_id",referencedColumnName = "id")
    private Car car;

    public Owner(String name) {
        this.name = name;
    }
}
