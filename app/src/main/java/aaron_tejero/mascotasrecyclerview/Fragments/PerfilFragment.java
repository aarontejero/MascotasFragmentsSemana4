package aaron_tejero.mascotasrecyclerview.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import aaron_tejero.mascotasrecyclerview.Adapter.MascotaAdaptador;
import aaron_tejero.mascotasrecyclerview.Adapter.MascotaPerfilAdaptador;
import aaron_tejero.mascotasrecyclerview.Mascota;
import aaron_tejero.mascotasrecyclerview.R;

/**
 * Created by AaronTejero on 22/05/2016.
 */
public class PerfilFragment extends Fragment {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private GridLayoutManager glm;
    public PerfilFragment() {
        // Required empty public constructor
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_perfil, container, false);

        List items=new ArrayList();
        items.add(new Mascota(R.drawable.perro1,"", 8));
        items.add(new Mascota(R.drawable.perro1,"", 7));
        items.add(new Mascota(R.drawable.perro1, "", 5));
        items.add(new Mascota(R.drawable.perro1, "", 4));
        items.add(new Mascota(R.drawable.perro1, "", 3));
        items.add(new Mascota(R.drawable.perro1, "", 2));

        recycler=(RecyclerView) v.findViewById(R.id.rvfotosperfil);
        recycler.setHasFixedSize(true);

        glm= new GridLayoutManager(getActivity(),2, GridLayoutManager.VERTICAL,false);
        recycler.setLayoutManager(glm);
        adapter=new MascotaPerfilAdaptador(items,getActivity());
        recycler.setAdapter(adapter);


        return v;
    }
}
