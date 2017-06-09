package controllers;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author evsoncustodio
 */
@ApplicationScoped
@Named("beanApplication")
public class BeanApplication {
    private String nome;
    
    public BeanApplication() {
        System.out.println("APPLICATION!");
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
