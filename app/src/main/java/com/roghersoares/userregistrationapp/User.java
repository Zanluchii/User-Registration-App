package com.roghersoares.userregistrationapp;

//Importa anotações do Room necessário para mapear esta classe como uma entidade do banco de dados
import androidx.room.Entity;
import androidx.room.PrimaryKey;

//Define a classe como uma entidade do banco de dados
@Entity
public class User {

    //Define o campo 'id' como chave primária da tabela e configura para ser gerado automaticamente
    @PrimaryKey(autoGenerate = true)
    private int id;

    //Campos que representam as colunas da tabela para armazenar os dados do usuário
    private String name; //Nome do usuário
    private String cpf; //CPF do usuário
    private String email; //Endereço de e-mail do usuário
    private String phone; //Número de telefone do usuário

    //Construtor de classe que será usado para criar novo objeto User
    public User(String name, String cpf, String email, String phone) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.phone = phone;
    }

    //Métodos de acessar e modificar (getters e setters) os campos da entidade

    //Rerona o ID do Usuáro
    public  int getId() {return id;}
    //Define o ID do usuário (usado pelo Room para preencher automaticamente)
    public void setId(int id) {this.id = id;}

    //Retorna o nome do usuário
    public String getName() {return name;}
    //Define o nome do usuário
    public void setName(String name) {this.name = name;}

    //Retorna o CPF do usuário
    public String getCpf() {return cpf;}
    //Define o CPF do usuário
    public void setCpf(String cpf) {this.cpf = cpf;}

    //Retorna o e-mail do usuário
    public String getEmail() {return email;}
    //Define o e-mail do usuário
    public void setEmail(String email) {this.email = email;}

    //Retorna o Telefone do Usuário
    public String getPhone() {return phone;}
    //Define o Telefone do Usuário
    public void setPhone(String phone) {this.phone = phone;}

}
