package com.aln.applst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lstv;
    String [] country={"Laos","Cambodia","Thailand","Vietnam","Singapor",
            "Malaysia","Myanmar","Indonesia","Philippines","Brunei"};
    String [] cap={"Laos","Cambodia","Thailand","Vietnam","Singapor",
            "Malaysia","Myanmar","Indonesia","Philippines","Brunei"};
    int [] pic ={R.drawable.lao,
            R.drawable.cambodia,
            R.drawable.thailand_flag,
            R.drawable.vietnam,
            R.drawable.singapore_flag,
            R.drawable.malaysia,
            R.drawable.mynmar,
            R.drawable.indonesian_flags,
            R.drawable.philipphine,
            R.drawable.bn};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstv =findViewById(R.id.lstv);
        myArrayAdapter myadapter =new myArrayAdapter(MainActivity.this,pic,country,cap);
        lstv.setAdapter(myadapter);
        lstv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String str=country[position];
                Toast.makeText(MainActivity.this,str,Toast.LENGTH_LONG).show();
            }
        });



    }
}
