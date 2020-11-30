package Utilidades.Adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.selection.ItemKeyProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.example.registro.R;

import java.util.ArrayList;

import Utilidades.Entidad.Actor;

    public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.Holder> implements View.OnClickListener{

    private Context context;
    private ArrayList<Actor> listaActors; // los usuarios que tenemos
    private ItemKeyProvider seleccion; // para la seleccion de elementos del recyclerview
    private View.OnClickListener listener; // lo utilizamos para poder escuchar si clicamos alguna lista de nuestro recyvlerview

    public RecyclerViewAdapter(Context context, ArrayList<Actor> listaActors) {
        this.context = context;
        this.listaActors = listaActors;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //aqui creamos la vista de cada lista
        View contentView = LayoutInflater.from(context).inflate(R.layout.filas_recycler,null);
        contentView.setOnClickListener(this); //ponemos a escuchar nuestro listener por si clicamos en él
        return new Holder(contentView);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        //asignamos los datos a cada elemento de la vista, se hace con cada elemento de usuario
        Actor unActor = listaActors.get(position); //saca de la lista el usuario en la posicion position
        holder.imgLista.setImageResource(unActor.getImg());
        holder.textoLista.setText(unActor.getNombre());
    }

    @Override
    public int getItemCount() {
        return listaActors.size();
    }

    //metodo que creamos para que nos asigne a nuestro listener el recibido al cliclear en él
    public void setOnClickListener(View.OnClickListener listener){
        this.listener = listener;
    }

    @Override
    //creamos nuestro propio onClick al implementar onClickListener
     public void onClick(View v) {
        if (listener != null){
            listener.onClick(v);
        }
    }


    public class Holder extends RecyclerView.ViewHolder{

        //campos que va a tener nuestra linea, es decir, una imagen y un texto
        ImageView imgLista;
        TextView textoLista;

        public Holder(@NonNull View itemView) {
            super(itemView);
            //inicializamos en el constructor
            imgLista = (ImageView) itemView.findViewById(R.id.imgLista);
            textoLista = (TextView) itemView.findViewById(R.id.txtNombre);

        }



    }
}
