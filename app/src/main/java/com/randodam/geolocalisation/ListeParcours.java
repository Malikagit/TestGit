package com.randodam.geolocalisation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ListeParcours extends AppCompatActivity {

    public void titreApp() {
        //Ici on déclare le nom de l'app car c'est la première page qui s'affiche
        String titre = "Liste des Randonnées";
        // On fait le lien avec la ressource et on la modifiee
        setTitle(titre);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_parcours);
    }
}