package com.androideity.pestanas;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
                
        TabHost tabHost = getTabHost(); // Creamos el tabhost de la actividad
               
        TabHost.TabSpec spec; // Creamos un recurso para las propiedades de la pestana
        Intent intent; // Intent que se utilizara para abrir cada pestana
        Resources res = getResources(); //Obtenemos los recursos
        
        //Se crea el intent para abrir la actividad que en realidad es una clase
        intent = new Intent().setClass(this, Pestana1.class);
        //Se configura la pestana con sus propiedades
        spec = tabHost.newTabSpec("Pestaña1").setContent(intent).setIndicator("    Mapas     ");        
        //Se carga la pestana en el contenedor TabHost 
        tabHost.addTab(spec);
        tabHost.getTabWidget().getChildAt(0).setBackgroundColor(Color.BLUE);
        
        //Se hace exactamente lo mismo con las demas pestanas
        
        intent = new Intent().setClass(this, Pestana2.class);
        spec = tabHost.newTabSpec("Pestaña2").setContent(intent).setIndicator("  Explorador  ");  
        tabHost.addTab(spec);
        tabHost.getTabWidget().getChildAt(1).setBackgroundColor(Color.CYAN);
        
        intent = new Intent().setClass(this, Pestana3.class);
        spec = tabHost.newTabSpec("Pestaña3").setContent(intent).setIndicator(" Lista Tareas ");
        tabHost.addTab(spec);
        tabHost.getTabWidget().getChildAt(2).setBackgroundColor(Color.GREEN);
    
        intent = new Intent().setClass(this, Pestana4.class);
        spec = tabHost.newTabSpec("Pestaña4").setContent(intent).setIndicator("   Imagenes   ");
        tabHost.addTab(spec);
        tabHost.getTabWidget().getChildAt(3).setBackgroundColor(Color.RED);
        
        intent = new Intent().setClass(this, Pestana5.class);
        spec = tabHost.newTabSpec("Pestaña5").setContent(intent).setIndicator("    Videos    ");
        tabHost.addTab(spec);
        tabHost.getTabWidget().getChildAt(4).setBackgroundColor(Color.YELLOW);
        
        
    }
}