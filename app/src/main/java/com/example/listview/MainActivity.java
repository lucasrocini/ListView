package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listLocais;
    private String[] itens = {
            "Angra dos Reis", "Caldas Novas",
            "Araras", "Sao Paulo", "Cancun",
            "asdasdsa", "qwewqewqe", "zxczxcxzcxz",
            "rtyrtyrty", "fghfghgfhgfh", "vbnvbnvbnb",
            "iopiopoipo", "jkljkljk", "bnmbnmbnmbn"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listLocais = findViewById( R.id.listLocais );

        //cria adaptador para a lista
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );

        //adicionar adaptador na lista
        listLocais.setAdapter( adaptador );

        //adicionar clique na lista
        listLocais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String valorSelecionado = listLocais.getItemAtPosition(position).toString();
                //String posicaoSelecionado = Long.toString(listLocais.getItemIdAtPosition(position));

                //Toast.makeText(getApplicationContext(), posicaoSelecionado , Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), valorSelecionado, Toast.LENGTH_LONG).show();
            }
        });
    }
}