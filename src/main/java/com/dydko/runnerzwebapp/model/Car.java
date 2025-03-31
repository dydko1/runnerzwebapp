package com.dydko.runnerzwebapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "car")
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Getter
    private String model;
    @Getter
    @OneToOne(mappedBy = "car")
    private Owner owner;

    public Car(String model) {
        this.model = model;
    }
}
