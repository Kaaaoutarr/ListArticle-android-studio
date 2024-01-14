package com.example.listearticle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import android.content.Intent;

import java.io.Serializable;
import android.widget.TextView;

public class AjouterArticleActivity extends AppCompatActivity {
    private List<Article> articlesList = new ArrayList<>();
    private TextView messageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouter_article);

        final EditText nomEditText = findViewById(R.id.nomEditText);
        final EditText puEditText = findViewById(R.id.puEditText);
        Button addButton = findViewById(R.id.addButton);
        Button displayButton = findViewById(R.id.displayButton);
        messageTextView = findViewById(R.id.messageTextView);

        addButton.setOnClickListener(view -> {
            String nom = nomEditText.getText().toString();
            double pu = Double.parseDouble(puEditText.getText().toString());

            Article nouvelArticle = new Article(articlesList.size() + 1, nom, pu);
            articlesList.add(nouvelArticle);

            Toast.makeText(AjouterArticleActivity.this, "Article ajouté", Toast.LENGTH_SHORT).show();

            nomEditText.getText().clear();
            puEditText.getText().clear();

            // Show success message
            messageTextView.setText("Your article is successfully added");
        });

        displayButton.setOnClickListener(view -> {
            Intent intent = new Intent(AjouterArticleActivity.this, AfficherArticlesActivity.class);
            intent.putExtra("articlesList", new ArrayList<>(articlesList));
            startActivity(intent);
        });

    }
}
