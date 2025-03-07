package com.example.mobilnethepowrot;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    private ArrayList<String> produktyLista;
    private ArrayAdapter<String> arrayAdapter;
    //ARRAYLIST I ARRAYADAPTER TEGO SAMEGO TYPU

    private Button buttonDodaj;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewProdukty);
        buttonDodaj = findViewById(R.id.button);
        editText = findViewById(R.id.editTextProdukt);

        produktyLista = new ArrayList<>();
        produktyLista.add("jabłka");
        produktyLista.add("gruszki");
        produktyLista.add("ser");

        //ARRAY ADAPTER ŁĄCZY WIDOK (LISTVIEW) Z DANYMI Z LISTY (PRODUKTYLISTA)

        arrayAdapter = new ArrayAdapter<>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                produktyLista
        );
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Toast.makeText(MainActivity.this,
                                "kliknięto " + produktyLista.get(i),
                                Toast.LENGTH_SHORT).show();
                        // view.setBackgroundColor(Color.RED);

                        //USUWA Z WIDOKU LSITY
                        produktyLista.remove(i);
                        arrayAdapter.notifyDataSetChanged();
                    }
                }
        );

        buttonDodaj.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String produkt = editText.getText().toString();
                        editText.setText("");
                        produktyLista.add(produkt);

                        arrayAdapter.notifyDataSetChanged();
                        //"Powiadom, że zmienił się set danych"
                    }
                }
        );
    }
}