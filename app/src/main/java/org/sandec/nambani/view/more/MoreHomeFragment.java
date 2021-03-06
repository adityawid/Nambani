package org.sandec.nambani.view.more;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.sandec.nambani.view.more.adapter.MoreRecyclerAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MoreHomeFragment extends Fragment {



    public MoreHomeFragment() {
        // Required empty public constructor
    }
    public static MoreHomeFragment newInstance(){
        MoreHomeFragment fragment = new MoreHomeFragment();
        return  fragment;
    }

    RecyclerView rvMore;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(org.sandec.nambani.R.layout.fragment_more_home, container, false);

        ArrayList<String> dataText;
        dataText = new ArrayList<>();
        dataText.add("Dompet kita");
        dataText.add("Pertanyaan");
        dataText.add("Syarat");
        dataText.add("Akun");
        dataText.add("Pengaturan");
        dataText.add("Keluar");

        ArrayList<Integer> dataImage;
        dataImage = new ArrayList<>();
        dataImage.add(org.sandec.nambani.R.drawable.ic_more_dompetkita);
        dataImage.add(org.sandec.nambani.R.drawable.ic_more_help);
        dataImage.add(org.sandec.nambani.R.drawable.ic_more_syaratketentuan);
        dataImage.add(org.sandec.nambani.R.drawable.ic_more_profil);
        dataImage.add(org.sandec.nambani.R.drawable.ic_more_pengaturan);
        dataImage.add(org.sandec.nambani.R.drawable.ic_more_logout);



        ((AppCompatActivity)getActivity()).getSupportActionBar().show();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("More");

        rvMore = (RecyclerView) view.findViewById(org.sandec.nambani.R.id.rv_more);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        rvMore.setLayoutManager(linearLayoutManager);

        MoreRecyclerAdapter moreRecyclerAdapter = new MoreRecyclerAdapter(getActivity(),dataText,dataImage);

        rvMore.setAdapter(moreRecyclerAdapter);

        return view;
    }

}
