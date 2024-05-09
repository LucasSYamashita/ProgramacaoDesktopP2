/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author User
 */
@Entity
public class Estoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int estoqueAtual;
    private int estoqueAnterior;

}
    public int getEstoqueAtual() {
        return estoqueAtual;
    }

    public void setEstoqueAtual(int estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }

    public int getEstoqueAnterior() {
        return estoqueAnterior;
    }

    public void setEstoqueAnterior(int estoqueAnterior) {
        this.estoqueAnterior = estoqueAnterior;
    }


}
