/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;


import app.PessoaPK;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.AttributeOverride;
import javax.persistence.Basic;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author rudan
 */
@Entity
@IdClass(PessoaPK.class)
public class Pessoa implements Serializable {
//    @Id
//    @GeneratedValue
//    private int id;
    @Id
    private String nome;
    
    @Id
    private int idade;
    
    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    
    @Temporal(value = TemporalType.DATE)
    private LocalDate dataNascimento;
    
    @ElementCollection
    @CollectionTable(name = "MyPhones")
    private List<String> telefones;
    
    @Embedded
    @AttributeOverride(name="valor", column = @Column(name = "CPF_Pessoa"))
    private CPF cpf;
    
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private String biografia;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, Sexo sexo, LocalDate dataNascimento, List<String> telefones, CPF cpf, String biografia) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.telefones = telefones;
        this.cpf = cpf;
        this.biografia = biografia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public Sexo getSexo(){
        return this.sexo;
    }
    
    public void setSexo(Sexo sexo){
        this.sexo = sexo;
    }
    
    public LocalDate getDataNascimento(){
        return this.dataNascimento;
    }
    
    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public List<String> getTelefones(){
        return this.telefones;
    }
    
    public void setTelefones(List<String> telefones){
        this.telefones = telefones;
    }
    
    public void addTelefone(String telefone){
        this.telefones.add(telefone);
    }
    
    public void removeTelefone(String telefone){
        this.telefones.remove(telefone);
    }

    public CPF getCpf() {
        return cpf;
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
    
    
    
        
}
