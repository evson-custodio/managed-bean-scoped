package controllers;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author evsoncustodio
 */
@SessionScoped
@Named("beanSession")
public class BeanSession implements Serializable {
    private String nome;
    
    public BeanSession() {
        System.out.println("SESSION!");
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
