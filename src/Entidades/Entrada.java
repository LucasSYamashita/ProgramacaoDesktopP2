/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author User
 */
import java.util.Date;

public class Entrada {
    private Date dataEntrada;
    private String nf;
    private String secao;
    
    // Construtor, getters e setters

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getNf() {
        return nf;
    }

    public void setNf(String nf) {
        this.nf = nf;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }
    
}

