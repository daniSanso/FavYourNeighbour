package com.danielsanso.favyourneighbour12;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by danielsanso on 23/1/18.
 */

public class AdaptadorMain extends BaseAdapter {

    Context contexto;
    List<DatosPerfil> ListaObjestos;//el adaptador recive el cpntexto y la lista de objetos

    public AdaptadorMain(Context contexto, List<DatosPerfil> listaObjestos) {
        this.contexto = contexto;
        ListaObjestos = listaObjestos;
    }

    @Override
    public int getCount() {//vuelve cantidad de objetos
        return ListaObjestos.size();
    }

    @Override
    public Object getItem(int position) {//devuelve objeto de la posicion
        return ListaObjestos.get(position);
    }

    @Override
    public long getItemId(int position) {//devuelve id de la posicion indicada
        return ListaObjestos.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {//metodo q se ejecuta en cada secuencia en la cual se quiera cargar el contenido de cada hito del list view

        View vista =convertView;

        LayoutInflater inflate = LayoutInflater.from(contexto);//obtenemos el contexto del item sobre el q trabajamos del listView

        vista= inflate.inflate(R.layout.itemlistview,null);//obtenemos la referencia a lo q seria el poder inflar  al obj inflate q va a permitir inyectar el layout q defini en itemlistview colocarlo en listview

        ImageView imagen= (ImageView)vista.findViewById(R.id.imageView);
        TextView titulo= (TextView) vista.findViewById(R.id.txtcomunidad);
        TextView detalle= (TextView) vista.findViewById(R.id.txtnombrecompleto);

        titulo.setText(ListaObjestos.get(position).getTitulo().toString());// Referenciamos el objeto
        detalle.setText(ListaObjestos.get(position).getDetalle().toString());
        imagen.setImageResource(ListaObjestos.get(position).getImagen());

        return vista;
    }
}
