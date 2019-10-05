package com.task.developerofall.controller;

import com.task.developerofall.ejb.CategoryFacadeLocal;
import com.task.developerofall.models.Category;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.swing.JOptionPane;
import lombok.Data;

/**
 *
 * @author christian
 */
@Named
@ViewScoped
@Data
public class CategoryController implements Serializable {
    
    @EJB
    private CategoryFacadeLocal categoryEJB;
    private Category category;
    
    public CategoryController(){
        
    }
    @PostConstruct
    public void init(){
        category = new Category();
    }
    
    public void signUp(){
        try {
            categoryEJB.create(category); 
        } catch (Exception e) {
            
        }
    }
}
