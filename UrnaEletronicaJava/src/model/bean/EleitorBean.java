/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Philipe
 */
public class EleitorBean {
    private int id;
    private String nome;
    private String cpf;
    private String cep;
    private String rua;
    private String bairro;
    private String numero;

    public EleitorBean() {
    }

    public EleitorBean(int id, String nome, String cpf, String cep, String rua, String bairro, String numero) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.cep = cep;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
    }

    public EleitorBean(String nome, String cpf, String cep, String bairro, String rua, String numero) {
        this.nome = nome;
        this.cpf = cpf;
        this.cep = cep;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
}
