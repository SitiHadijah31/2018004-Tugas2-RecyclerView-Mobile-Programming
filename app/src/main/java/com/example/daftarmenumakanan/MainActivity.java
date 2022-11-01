package com.example.daftarmenumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rMakanan;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Makanan> listMakanan;

    void dataDummy(){
        listMakanan = new ArrayList<>();
        listMakanan.add(new Makanan( "Burger", "Burger adalah sejenis roti berbentuk bundar yang diiris dua, dan di tengahnya diisi dengan patty yang biasanya diambil dari daging, kemudian sayur-sayuran berupa selada, tomat dan bawang bombai.", 60000 , R.drawable.burger));
        listMakanan.add(new Makanan( "Pizza", "Pizza adalah roti berbentuk bulat pipih dengan diameter 30 cm yang dipanggang dalam oven dan biasanya disiram saus tomat serta keju dan dengan makanan tambahan lainnya (topping) yang sesuai selera penikmatnya.", 150000 , R.drawable.pizza));
        listMakanan.add(new Makanan( "Salad", "Salad adalah campuran dari sayuran hijau segar, buah, daging, unggas dan ikan yang dihidangkan bersama dressing atau hanya terdiri dari buah segar dan juice.", 30000 , R.drawable.salad));
    }

    void data(){
        rMakanan = findViewById(R.id.reMenu);
        Context context;
        adapter = new Adapter(  this,listMakanan);
        layoutManager = new LinearLayoutManager( this);
        rMakanan.setLayoutManager(layoutManager);
        rMakanan.setAdapter(adapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataDummy();data();
    }
}