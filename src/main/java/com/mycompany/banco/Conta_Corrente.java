/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Conta_Corrente {
    private int id_cliente;
    private String num_conta;
    private String num_agencia;
    private double saldo;

    public Conta_Corrente(String num_conta, String num_agencia, double Saldo) {
        this.num_conta = num_conta;
        this.num_agencia = num_agencia;
        this.saldo = Saldo;
    }
    
    public Conta_Corrente() {
        
    }
    
    public String getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(String num_conta) {
        if(num_conta.isEmpty()){
            JOptionPane.showMessageDialog(null, "Numero da conta não pode ser nulo");
        } else {
            this.num_conta = num_conta;
        }
    }

    public String getNum_agencia() {
        return num_agencia;
    }

    public void setNum_agencia(String num_agencia) {
        if(num_agencia.isEmpty()){
            JOptionPane.showMessageDialog(null, "Numero da Agencia não pode ser nulo");
        } else {
            this.num_agencia = num_agencia;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
            this.saldo = saldo;
    }
    
    
}
