/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author lab5
 */
public class CebolaCrispy extends LancheDecorator{
    public CebolaCrispy(double preco, String nome, Lanche prox){
        super(preco, nome, prox);
    }
}
