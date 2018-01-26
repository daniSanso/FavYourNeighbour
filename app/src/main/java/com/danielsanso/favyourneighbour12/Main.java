package com.danielsanso.favyourneighbour12;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main extends AppCompatActivity {
    ListView listaDatos;
    ArrayList<DatosPerfil> Lista;
    LinearLayout linear;

    FloatingActionButton fab,fab1,fab2,fab3;
    Animation fabOpen,fabClose, rotateForward,rotateBackward;
    boolean isOpen=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listaDatos=(ListView) findViewById(R.id.lstDatosFavores);
        linear=(LinearLayout) findViewById(R.id.idlinearlayout) ;

        fab = (FloatingActionButton) findViewById(R.id.floatingActionButtton) ;
        fab1 = (FloatingActionButton) findViewById(R.id.floatingActionButtton1) ;
        fab2 = (FloatingActionButton) findViewById(R.id.floatingActionButtton2) ;
        fab3 = (FloatingActionButton) findViewById(R.id.floatingActionButtton3) ;

        fabOpen= AnimationUtils.loadAnimation(this,R.anim.fab_open);
        fabClose= AnimationUtils.loadAnimation(this,R.anim.fab_close);

        rotateForward=AnimationUtils.loadAnimation(this,R.anim.rotate_forward);
        rotateBackward=AnimationUtils.loadAnimation(this,R.anim.rotate_backward);

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

       linear.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent= new Intent(getApplicationContext(),ProfileActivity.class);
               startActivity(intent);
           }
       });



        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateFab();
            }
        });
        //segundos botones del menufloatingbutton desde aqui
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //codigo floatboton1
                Toast.makeText(Main.this,"Primer boton presionado",Toast.LENGTH_SHORT).show();
            }
        });
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //codigo floatboton2
                Toast.makeText(Main.this,"Segundo boton presionado",Toast.LENGTH_SHORT).show();

            }
        });
        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //codigo floatboton3
                Toast.makeText(Main.this,"Tercer boton presionado",Toast.LENGTH_SHORT).show();

            }
        });
    }//fin on create

    private  void animateFab(){
        if(isOpen){
            fab.startAnimation(rotateForward);

            fab1.startAnimation(fabClose);
            fab2.startAnimation(fabClose);
            fab3.startAnimation(fabClose);

            fab1.setClickable(false);
            fab2.setClickable(false);
            fab3.setClickable(false);
            isOpen=false;

        }
        else{
            fab.startAnimation(rotateBackward);

            fab1.startAnimation(fabOpen);
            fab2.startAnimation(fabOpen);
            fab3.startAnimation(fabOpen);

            fab1.setClickable(true);
            fab2.setClickable(true);
            fab3.setClickable(true);
            isOpen=true;
        }

    }
}
