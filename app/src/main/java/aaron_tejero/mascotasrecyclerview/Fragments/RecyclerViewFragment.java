package aaron_tejero.mascotasrecyclerview.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import aaron_tejero.mascotasrecyclerview.Mascota;
import aaron_tejero.mascotasrecyclerview.Adapter.MascotaAdaptador;
import aaron_tejero.mascotasrecyclerview.R;

/**
 * Created by AaronTejero on 22/05/2016.
 */
public class RecyclerViewFragment extends Fragment {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_recyclerview,container, false);

        List items=new ArrayList();
        items.add(new Mascota(R.drawable.perro1,"Aquiles",0));
        items.add(new Mascota(R.drawable.perro2,"Hercules",0));
        items.add(new Mascota(R.drawable.perro3, "Atena", 0));
        items.add(new Mascota(R.drawable.perro4, "Alana", 0));
        items.add(new Mascota(R.drawable.perro5, "Kiara", 0));
        items.add(new Mascota(R.drawable.perro6, "Zeus", 0));
        items.add(new Mascota(R.drawable.perro7,"Sanson",0));
        items.add(new Mascota(R.drawable.perro8,"Bruno",0));

        recycler=(RecyclerView) v.findViewById(R.id.reciclador);
        recycler.setHasFixedSize(true);

        lManager=new LinearLayoutManager(getActivity());
        recycler.setLayoutManager(lManager);
        adapter=new MascotaAdaptador(items,getActivity());
        recycler.setAdapter(adapter);
        return v;
    }
}
