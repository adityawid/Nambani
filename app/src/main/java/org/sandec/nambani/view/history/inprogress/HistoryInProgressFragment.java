package org.sandec.nambani.view.history.inprogress;


import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import org.sandec.nambani.helper.Config;
import org.sandec.nambani.rest.ApiService;
import org.sandec.nambani.rest.Client;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoryInProgressFragment extends Fragment {


    private RecyclerView recyclerView;
    private ArrayList<PesananModel> listData;
    private static final String TAG = "HistoryInProgressFragme";
    public HistoryInProgressFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(org.sandec.nambani.R.layout.fragment_history_completed, container, false);

        // Inflate the layout for this fragment
//        getSupportActionBar().setTitle("Pilih Obat");
        recyclerView = (RecyclerView) view.findViewById(org.sandec.nambani.R.id.recyler_view);

        //Data
        listData = new ArrayList<>();

        ambilData();

//        for (int i = 0; i < 10; i++) {
//            listData.add(new ArrayList<ObatModel>("1", "Obat1 ", "2121", "dsddsdas", "1wAsZYdIONZECBIYnw2QHtRl9x1owfJly", "ewew"));
//        }
        //adapter
        PesananAdapter adapter = new PesananAdapter(listData, getActivity());
        recyclerView.setAdapter(adapter);

        // layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }

    private void ambilData() {
        final ProgressDialog progress = new ProgressDialog(getActivity());
        progress.setTitle("Loading");
        progress.setMessage("Mohon Bersabar");
        progress.show();

        ApiService api = Client.getApiService(Config.BASE_URL_SHEET);
        Call<ListPesananModel> call = api.ambilDataPesanan();
        call.enqueue(new Callback<ListPesananModel>() {
            @Override
            public void onResponse(Call<ListPesananModel> call, Response<ListPesananModel> response) {
                if (response.isSuccessful()){
                    progress.dismiss();
                    listData = response.body().getPesanan();

                    for (int i = 0; i < listData.size(); i++) {
                        PesananAdapter adapter = new PesananAdapter(listData, getActivity());
                        recyclerView.setAdapter(adapter);
                        Log.d(TAG, "onResponse: " + listData.get(i).getNamaObat());
                    }
                } else {
                    Toast.makeText(getActivity(), "Respones is Not Succesfull", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ListPesananModel> call, Throwable t) {

            }
        });
    }

}
