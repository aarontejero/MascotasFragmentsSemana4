package aaron_tejero.mascotasrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import aaron_tejero.mascotasrecyclerview.Adapter.MascotaAdaptador;

public class favoritos extends AppCompatActivity {
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);

        Toolbar miActionBar= (Toolbar)findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        ((TextView) findViewById(R.id.tbTitulo)).setText("Favoritos");
        ((ImageView)findViewById(R.id.iconoDer)).setVisibility(View.INVISIBLE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        List items=new ArrayList();
        items.add(new Mascota(R.drawable.perro4, "Alana", 10));
        items.add(new Mascota(R.drawable.perro7, "Sanson", 8));
        items.add(new Mascota(R.drawable.perro1, "Aquiles", 7));
        items.add(new Mascota(R.drawable.perro5, "Kiara", 4));
        items.add(new Mascota(R.drawable.perro3, "Atena", 3));



        recycler=(RecyclerView) findViewById(R.id.recicladorFav);
        recycler.setHasFixedSize(true);

        lManager=new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);

        adapter=new MascotaAdaptador(items,this);
        recycler.setAdapter(adapter);
    }
}
