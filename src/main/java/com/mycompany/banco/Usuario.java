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
public class Usuario {
    private String login;
    private String senha;
    private String id_cliente;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if(login.isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo de Login não pode ser nulo");
        } else {
            this.login = login;
        }
    }

    public String getSenha() {
            return senha;
    }

    public void setSenha(String senha) {
        if(senha.isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo de Senha não pode ser nulo");
        } else {
            this.senha = senha;
        }
    }
    
    
}
