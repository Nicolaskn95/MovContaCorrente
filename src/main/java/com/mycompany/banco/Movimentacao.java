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
public class Movimentacao {
    private String num_conta;
    private String num_agencia;
    private String documento; // codigo identificador
    private String data_mov;
    private String credito_debito;
    private String compl_hist;
    private double valor;
    private double saldo;

    public Movimentacao(String credito_debito, String compl_hist, double valor, double saldo) {
        this.credito_debito = credito_debito;
        this.compl_hist = compl_hist;
        this.valor = valor;
        this.saldo = saldo;
    }
    public Movimentacao() {
        
    }

    public String getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(String num_conta) {
        this.num_conta = num_conta;
    }

    public String getNum_agencia() {
        return num_agencia;
    }

    public void setNum_agencia(String num_agencia) {
        this.num_agencia = num_agencia;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getData_mov() {
        return data_mov;
    }

    public void setData_mov(String data_mov) {
        this.data_mov = data_mov;
    }
    
    public String getCredito_debito() {
        return credito_debito;
    }

    public void setCredito_debito(String credito_debito) {
        if(credito_debito.isEmpty()){
            JOptionPane.showMessageDialog(null, "Credito_Debito não pode ser nulo");
        } else {
            this.credito_debito = credito_debito;
        }
    }

    public String getCompl_hist() {
        return compl_hist;
    }

    public void setCompl_hist(String compl_hist) {
        this.compl_hist = compl_hist;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(valor == 0){
            JOptionPane.showMessageDialog(null, "Valor não pode ser 0");
        } else {
            this.valor = valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
