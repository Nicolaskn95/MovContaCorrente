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
public class Agencia {
    private String num_agencia;
    private String nome;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String cnpj;
    private String gerente;

    public Agencia(String num_agencia, String nome, String endereco, String numero, String complemento, String bairro, String cidade, String uf, String cep, String cnpj, String gerente) {
        this.num_agencia = num_agencia;
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.cnpj = cnpj;
        this.gerente = gerente;
    }
    
    public Agencia(){
        
    }
    
    public String getNum_agencia() {
        return num_agencia;
    }

    
    public void setNum_agencia(String num_agencia) {
        if(num_agencia.isEmpty()){
            JOptionPane.showMessageDialog(null, "Numero da agencia não pode ser nulo");
        } else {
            this.num_agencia = num_agencia;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nome da Agencia não pode ser nulo");
        }else {            
        this.nome = nome;
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if(endereco.isBlank()){
            JOptionPane.showMessageDialog(null, "Endereco da Agencia não pode ser nulo");
        }else{            
        this.endereco = endereco;
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if(numero.isEmpty()){
            JOptionPane.showMessageDialog(null, "Numero da Agencia não pode ser nulo");
        } else {
            this.numero = numero;
        }
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        if(complemento.isEmpty()){
            JOptionPane.showMessageDialog(null, "Complemento da agencia não pode ser nulo");
        }else{            
            this.complemento = complemento;
        }
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        if(bairro.isEmpty()){
            JOptionPane.showMessageDialog(null, "Bairro da agencia não pode ser nulo");
        }else {            
            this.bairro = bairro;
        }
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        if(cidade.isEmpty()){
            JOptionPane.showMessageDialog(null, "Cidade da agencia não pode ser nulo");
        }else{
            this.cidade = cidade;
        }
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        if(uf.isEmpty()){
            JOptionPane.showMessageDialog(null, "UF da agencia não pode ser nulo");
        }else {
            this.uf = uf;
        }
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if(cep.isEmpty()){
            JOptionPane.showMessageDialog(null, "CEP da agencia não pode ser nulo");
        } else {   
            this.cep = cep;
        }
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if(cnpj.isEmpty()){
            JOptionPane.showMessageDialog(null, "CNPJ da agencia não pode ser nulo");
        } else {
            this.cnpj = cnpj;
        }
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        if(gerente.isEmpty()){
            JOptionPane.showMessageDialog(null, "numero da agencia não pode ser nulo");
        } else {  
            this.gerente = gerente;
        }
    }
    
}