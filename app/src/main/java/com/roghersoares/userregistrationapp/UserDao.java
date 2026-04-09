package com.roghersoares.userregistrationapp;


// O Data Access Object é o compnete que serve para a persitência de dados. Serve para definir as operações que podem ser feitas no banco de dados com relação à entidade User

//Importa as notações do Room necessárias para definir o DAO
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

//Importa a classe List do Java para retornar a lista de usuários
import java.util.List;

//Define a classe como um Data Access Object
@Dao
public interface UserDao {
    //Método para inserir um usuário na tabela do BD
    //A anotação @Insert informa à Room que este método deve ser usado para inserir dado
    @Insert
    void insert(User user);

    //Método para buscar todos os usuários da tabela do BD
    //A anotação @Query permite definir uma consulta SQL personalizada
    @Query("SELECT * FROM User")
    List<User> getAllUsers();
}
