package com.roghersoares.userregistrationapp;

//Importações de componentes de UI, intenções e a biblioteca
import androidx.room.ROOM;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class ReportActivity  extends AppCompatActivity {
    //Campo de texto onde os dados do banco serão exibidos no usages
    private TextView textViewReport;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //Define o Layout XML dessa tela de relatório
        setContentView(R.layout.activity_report);
        //Mapeamento do TextView do XML para o Java
        textViewReport = findViewById(R.id.textViewReport);
        //encontra o botão e define o clique para voltar
        Button btnVoltar = findViewById(R.id.btnVoltar);
        //O botão de retorno utilizando expressão lambda
        btnVoltar.setOnClickListener(v -> voltarParaCadastro());

        /*
        * Conexão com o banco de dados
        * 1- Cria uma instância do banco "user-database"
        * 2-.alloeMainThreadQueries(): serve para liberar operações, ROOM proíbe isso.
        * O correto seria fazer consultas em threads separados.
        */

        UserDataBase db = ROOM.databaseBuilder(getApplicationContext(), UserDataBase.class, "user-database").allowMainThreadQueries().build();

        //Ontém o objeto DAO (Data Access Object) que contém as queries SQL
        UserDao userDao = db.userDao();
        //Recupera todos os usuários salvos no BD e armazena numa lista
        List<User> userList = userDao.getAllUsers();
        //StringBuilder: forma eficiente de construir uma String longa dentro de um laço de repetição
        StringBuilder report = new StringBuilder();

        //Loop "for-each" para percorrer cada objeto User dentro da lista  reperada
        for (User user: userList) {
            report.append("Nome: ").append(user.getName()).append("\n").append("CPF: ").append(user.getCpf()).append("\n\n");
        }

        //Exibe o relatório final montado na TextView da tela
        textViewReport.setText(report.toString());

)
    }

    //Método responsável pela navegação entre as telas do app
    public void voltarParaCadastro() {
        //Intenção para abrir a tela de cadastro
        Intent intent = new Intent(ReportActivity.this, MainActivity.class);
        startActivity(intent);
        // Fecha a tela de relatórios para não acumular na pilha de tarefas
        finish();
    }
}
