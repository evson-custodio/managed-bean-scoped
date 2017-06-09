package controllers;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author evsoncustodio
 */
@RequestScoped
@Named("beanRequest")
public class BeanRequest {
    private String nome;
    
    public BeanRequest() {
        System.out.println("REQUEST!");
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
