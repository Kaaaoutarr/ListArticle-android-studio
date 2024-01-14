package com.example.listearticle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class AfficherArticlesActivity extends AppCompatActivity {
    private ListView articlesListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afficher_articles);

        articlesListView = findViewById(R.id.articlesListView);

        List<Article> articlesList = (List<Article>) getIntent().getSerializableExtra("articlesList");

        ArrayAdapter<Article> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_2,
                android.R.id.text1,
                articlesList
        );

        articlesListView.setAdapter(adapter);
    }

    // Method to handle the click event of the "Retour à Ajouter" button
    public void returnToAjouter(View view) {
        Intent intent = new Intent(this, AjouterArticleActivity.class);
        startActivity(intent);
    }
}
