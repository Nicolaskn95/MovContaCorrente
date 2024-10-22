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
public class Cliente {
    private int id_cliente;
    private String nome;
    private String cpf;
    private String email;
    
    private String cep;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    
    private boolean status;
    private boolean sexo;
    private String fone;
    private String cnpj;


    public Cliente(int id_cliente, String nome, String cpf, String endereco, String numero, String complemento, String bairro, String cidade, String uf, String cep, String email, boolean status, String fone, String cnpj, boolean sexo) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.email = email;
        this.status = status;
        this.fone = fone;
        this.cnpj = cnpj;
        this.sexo = sexo; 
    }
    
    public Cliente() {
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nome não pode ser nulo");
        } else {
        this.nome = nome;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.isEmpty()){
            JOptionPane.showMessageDialog(null, "CPF não pode ser nulo");
        } else {
            if(validaCPF(cpf) == true){
                JOptionPane.showMessageDialog(null, "CPF Válido");
                this.cpf = cpf;
            } else {
                JOptionPane.showMessageDialog(null, "CPF Inválido");
            }   
       }
        
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if(cep.isEmpty()){
            JOptionPane.showMessageDialog(null, "CEP não pode ser nulo");
        } else {            
            this.cep = cep;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "E-Mail não pode ser nulo");
        } else {
            this.email = email;
        }
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
       if(validaCNPJ(cnpj) == true){
            JOptionPane.showMessageDialog(null, "CNPJ Válido");
            this.cnpj = cnpj;
       } else {
            JOptionPane.showMessageDialog(null, "CNPJ Inválido");
       }   
    }

    public boolean getSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
    
    public boolean validaCPF(String cpf) {
        String arrayCpf = cpf.replaceAll("[^\\d]", "");
        int primeiroDigito = Integer.parseInt(String.valueOf(arrayCpf.charAt(9)));
        int segundoDigito = Integer.parseInt(String.valueOf(arrayCpf.charAt(10)));
        int soma_1 = 0;
        int soma_2 = 0;
        for(int i = 0, peso = 10; i < 9; i++, peso--){
            soma_1 += Integer.parseInt(String.valueOf(arrayCpf.charAt(i))) * peso;
        }
        for(int i = 0, peso = 11; i < 10; i++, peso--){
            soma_2 += Integer.parseInt(String.valueOf(arrayCpf.charAt(i))) * peso;
        }
        int resto_1 = soma_1 % 11;        
        int resto_2 = soma_2 % 11;

        int digito1Calculado = (resto_1 < 2) ? 0 : 11 - resto_1;
        int digito2Calculado = (resto_2 < 2) ? 0 : 11 - resto_2;
        
        return (primeiroDigito == digito1Calculado && segundoDigito == digito2Calculado);
    }
    
    public boolean validaCNPJ(String cnpj) {
    String arrayCnpj = cnpj.replaceAll("[^\\d]", "");
    
    if (arrayCnpj.length() != 14) {
        return false;
    }
    
    int primeiroDigito = Integer.parseInt(String.valueOf(arrayCnpj.charAt(12)));
    int segundoDigito = Integer.parseInt(String.valueOf(arrayCnpj.charAt(13)));
    
    int[] pesos1 = {5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
    
    int[] pesos2 = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
    
    int soma_1 = 0;
    int soma_2 = 0;
    
    for (int i = 0; i < 12; i++) {
        soma_1 += Integer.parseInt(String.valueOf(arrayCnpj.charAt(i))) * pesos1[i];
    }
    
    for (int i = 0; i < 13; i++) {
        soma_2 += Integer.parseInt(String.valueOf(arrayCnpj.charAt(i))) * pesos2[i];
    }
    
    int resto_1 = soma_1 % 11;
    int resto_2 = soma_2 % 11;
    
    int digito1Calculado = (resto_1 < 2) ? 0 : 11 - resto_1;
    int digito2Calculado = (resto_2 < 2) ? 0 : 11 - resto_2;
        
    return (primeiroDigito == digito1Calculado && segundoDigito == digito2Calculado);
    }
}
