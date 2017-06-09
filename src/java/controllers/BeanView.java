package controllers;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author evsoncustodio
 */
@ViewScoped
@Named("beanView")
public class BeanView implements Serializable {
    private String nome;
    
    public BeanView() {
        System.out.println("VIEW!");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public void ajax() {
        
    }
}
