package com.example.recylerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recylerview;
    LinearLayoutManager layoutManager;
    List<ModelClass>userlist;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initRecylerVIew();
    }

    private void initData() {

        userlist = new ArrayList<>();

        userlist.add(new ModelClass(R.drawable.guest,R.drawable.notif1,"anjali","sep 1",
                "love you",
                "-----------------------------------------------------------------"));

        userlist.add(new ModelClass(R.drawable.guest,R.drawable.notif1,"Bawang","sep 17",
                "bau",
                "-----------------------------------------------------------------"));

        userlist.add(new ModelClass(R.drawable.guest,R.drawable.notif1,"hu tao","sep 21",
                "Aishiteru",
                "-----------------------------------------------------------------"));

        userlist.add(new ModelClass(R.drawable.guest,R.drawable.notif1,"zhongli","sep 30",
                "primogems",
                "-----------------------------------------------------------------"));

        userlist.add(new ModelClass(R.drawable.guest,R.drawable.notif1,"okayu","sep 6",
                "mogu mogu",
                "-----------------------------------------------------------------"));

        userlist.add(new ModelClass(R.drawable.guest,R.drawable.notif1,"korone","sep 9",
                "yubi yubi ",
                "-----------------------------------------------------------------"));

        userlist.add(new ModelClass(R.drawable.guest,R.drawable.notif1,"ishigami","sep 29",
                "lets go play!",
                "-----------------------------------------------------------------"));

        userlist.add(new ModelClass(R.drawable.guest,R.drawable.notif1,"Anz","sep 20",
                "im the bone of my sword",
                "-----------------------------------------------------------------"));

        userlist.add(new ModelClass(R.drawable.guest,R.drawable.notif1,"Ayaka","sep 22",
                "i Am Motivation",
                "-----------------------------------------------------------------"));


    }

    private void initRecylerVIew() {

        recylerview=findViewById(R.id.reclerview);
        layoutManager= new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        adapter=new Adapter(userlist);
        recylerview.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
