/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author rudan
 */
@Embeddable
public class CPF implements Serializable {
    private String valor;

    public CPF() {
    }

    public CPF(String valor) {
        this.valor = valor;
    }
    
    
}
