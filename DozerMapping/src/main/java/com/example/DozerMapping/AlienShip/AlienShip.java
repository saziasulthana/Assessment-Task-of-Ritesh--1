package com.example.DozerMapping.AlienShip;

import org.dozer.Mapping;

public class AlienShip {
 private int id;
 @Mapping("crew")
 private double crew;
 @Mapping("name")
 private String nameOfShip;
 @Mapping("size")
 private String shipsize;
}
