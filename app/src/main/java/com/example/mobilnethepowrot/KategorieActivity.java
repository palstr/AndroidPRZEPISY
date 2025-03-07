package com.example.mobilnethepowrot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class KategorieActivity extends AppCompatActivity {
public static final String KATEGORIA = "kategoria";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategorie);

        ListView listView = findViewById(R.id.listViewKategorie);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        //Intencja jawna: wiemy skąd i gdzie chcemy uruchomić

                        Intent intent = new Intent(KategorieActivity.this, ListaPrzepisowActivity.class);
                        // W INTENCJACH: (Skąd.this, Dokąd.class)

                        String kategoria = listView.getItemAtPosition(i).toString();
                        intent.putExtra(KATEGORIA, kategoria);
                        // ^ (Gdzie wkładasz, co wkładasz)

                        startActivity(intent);
                    }
                }
        );
    }
}