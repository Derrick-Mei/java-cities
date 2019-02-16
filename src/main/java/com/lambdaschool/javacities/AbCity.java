// 2

package com.lambdaschool.javacities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// @Data is from lombok that gets us getters and setters...
@Data
// @Entity : makes object ready for jpa storage
@Entity
class AbCity
{
    private @Id @GeneratedValue Long id;
    private String name;
    private double medianHomePrice;
    private int affordabilityIndex;

    // Default Constructor for JPA
    public AbCity()
    {
    }

    public AbCity(String name, double medianHomePrice, int affordabilityIndex)
    {
        this.name = name;
        this.medianHomePrice = medianHomePrice;
        this.affordabilityIndex = affordabilityIndex;
    }

}
