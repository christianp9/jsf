/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.task.developerofall.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author christian
 */
@Data
@Entity
@Table(name = "category")
public class Category implements Serializable {

    @Id
    @Column(name="code_category")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String codeCategory;
    @Column(name="name_category")
    private String nameCategory;
    @Column(name="state_category")
    private String stateCategory;
    
    public Category() {
    }
}
