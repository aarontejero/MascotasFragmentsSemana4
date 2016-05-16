package aaron_tejero.mascotasrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar= (Toolbar)findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        ((TextView) findViewById(R.id.tbTitulo)).setText("Pentagram");



        List items=new ArrayList();
        items.add(new Mascota(R.drawable.perro1,"Aquiles",0));
        items.add(new Mascota(R.drawable.perro2,"Hercules",0));
        items.add(new Mascota(R.drawable.perro3, "Atena", 0));
        items.add(new Mascota(R.drawable.perro4, "Alana", 0));
        items.add(new Mascota(R.drawable.perro5, "Kiara", 0));
        items.add(new Mascota(R.drawable.perro6, "Zeus", 0));
        items.add(new Mascota(R.drawable.perro7,"Sanson",0));
        items.add(new Mascota(R.drawable.perro8,"Bruno",0));

        recycler=(RecyclerView) findViewById(R.id.reciclador);
        recycler.setHasFixedSize(true);

        lManager=new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);
        adapter=new MascotaAdaptador(items,this);
        recycler.setAdapter(adapter);

    }

    public void irFav(View v){
        Intent intent= new Intent(this,favoritos.class);
        startActivity(intent);

    }
}
