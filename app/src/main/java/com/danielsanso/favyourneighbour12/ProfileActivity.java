package com.danielsanso.favyourneighbour12;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class ProfileActivity extends AppCompatActivity {
    ImageView imagen;
    FloatingActionButton buttonFloating;

    ListView listaDatos;
    ArrayList<DatosPerfil> Lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        EditText back=null;

      //  back=(EditText) findViewById(R.id.backid);
        imagen=(ImageView)findViewById(R.id.idimagen);

        buttonFloating=(FloatingActionButton) findViewById(R.id.floatingActionButton);

        listaDatos=(ListView) findViewById(R.id.lstDatosComentario);

        Lista= new ArrayList<DatosPerfil>();

        Lista.add(new DatosPerfil(1,"Conejo","Animal en peligro de extincion",R.drawable.profile_img));
        Lista.add(new DatosPerfil(2,"Rana","Animal en peligro de extincion",R.drawable.profile_img));
        Lista.add(new DatosPerfil(3,"Pez","Animal en peligro de extincion",R.drawable.profile_img));
        Lista.add(new DatosPerfil(5,"Pinguino","Animal en peligro de extincion",R.drawable.profile_img));
        Lista.add(new DatosPerfil(6,"Pez Payaso","Animal en peligro de extincion",R.drawable.profile_img));
        Lista.add(new DatosPerfil(7,"Koala","Animal en peligro de extincion",R.drawable.profile_img));

        Lista.add(new DatosPerfil(8,"Conejo","Animal en peligro de extincion",R.drawable.profile_img));
        Lista.add(new DatosPerfil(9,"Rana","Animal en peligro de extincion",R.drawable.profile_img));
        Lista.add(new DatosPerfil(10,"Pez","Animal en peligro de extincion",R.drawable.profile_img));
        Lista.add(new DatosPerfil(11,"Pinguino","Animal en peligro de extincion",R.drawable.profile_img));
        Lista.add(new DatosPerfil(12,"Pez Payaso","Animal en peligro de extincion",R.drawable.profile_img));
        Lista.add(new DatosPerfil(13,"Koala","Animal en peligro de extincion",R.drawable.profile_img));


        Lista.add(new DatosPerfil(14,"Conejo","Animal en peligro de extincion",R.drawable.profile_img));
        Lista.add(new DatosPerfil(15,"Rana","Animal en peligro de extincion",R.drawable.profile_img));
        Lista.add(new DatosPerfil(16,"Pez","Animal en peligro de extincion",R.drawable.profile_img));
        Lista.add(new DatosPerfil(17,"Pinguino","Animal en peligro de extincion",R.drawable.profile_img));
        Lista.add(new DatosPerfil(18,"Pez Payaso","Animal en peligro de extincion",R.drawable.profile_img));
        Lista.add(new DatosPerfil(19,"Koala","Animal en peligro de extincion",R.drawable.profile_img));

        Adaptador miadaptador= new Adaptador(getApplicationContext(),Lista);
        listaDatos.setAdapter(miadaptador);

       /* listaDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {//new O + enter en el parentesis
            @Override                                                           //obtener el onjeto seleccionado
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Datos obj =(Datos) parent.getItemAtPosition(position);//retorna el onbj de la posicion indicada

                Intent paso = new Intent(getApplicationContext(),DetalleActivity.class);
                paso.putExtra("objeto",(Serializable) obj); //guardamos el obj con la clave objeto
                //cuando trabajamos con clases, para pasar datos lo mejopr es
                //serializar el obj complerto, cargarlo dentro de la intencion y pasarlo a la segunda pantala
                startActivity(paso);
            }
        });*/

      /* imagen.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

           }
       });*/
      buttonFloating.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent= new Intent(getApplicationContext(),Main.class);
              startActivity(intent);
          }
      });
    }
}