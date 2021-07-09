package com.eftomi.h2demo.model;


import lombok.Getter;

import javax.persistence.*;
@Getter
@Entity
public class Box {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String boxName;
    private String boxType;
    private int boxesInRow;
    private int rowsOnPallet;
    private double boxWeight;

    public Box(Integer id, String boxName, String boxType, int boxesInRow, int rowsOnPallet,
               double boxWeight) {
        this.id = id;
        this.boxName = boxName;
        this.boxType = boxType;
        this.boxesInRow = boxesInRow;
        this.rowsOnPallet = rowsOnPallet;
        this.boxWeight = boxWeight;
    }

    public Box() {}


}
