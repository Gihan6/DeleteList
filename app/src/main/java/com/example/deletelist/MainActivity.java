package com.example.deletelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView list;
    List<DataModel> arrayList;
    recyclerAdapter customAdapter;
    LinearLayoutManager layoutManager;
    Button btn_delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
        initadapter();
        setAdapter();


    }


    private void initView() {
        list = findViewById(R.id.rv_allData);
        btn_delete=findViewById(R.id.btn_delete);
        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDelete();
                setAdapter();
            }
        });

    }

    private void initadapter() {
        layoutManager = new LinearLayoutManager(this);
        list.setLayoutManager(layoutManager);


    }

    private void setAdapter() {
        customAdapter = new recyclerAdapter(this, arrayList);
        list.setAdapter(customAdapter);

    }

    private void initData() {
        arrayList = new ArrayList<DataModel>();
        arrayList.add(new DataModel("JAVA", false));
        arrayList.add(new DataModel("JAVA", false));
        arrayList.add(new DataModel("JAVA", false));
        arrayList.add(new DataModel("JAVA", false));

    }

    private void showDelete() {
        arrayList = new ArrayList<DataModel>();
        arrayList.add(new DataModel("JAVA", true));
        arrayList.add(new DataModel("JAVA", true));
        arrayList.add(new DataModel("JAVA", true));
        arrayList.add(new DataModel("JAVA", true));


    }
}
