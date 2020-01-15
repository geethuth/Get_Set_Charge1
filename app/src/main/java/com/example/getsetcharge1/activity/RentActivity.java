package com.example.getsetcharge1.activity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.getsetcharge1.R;
import com.example.getsetcharge1.adapter.RentAdapter;
import com.example.getsetcharge1.helper.DataModel;

import java.util.ArrayList;

public class RentActivity extends AppCompatActivity implements RentAdapter.ItemListener {
    RecyclerView recyclerView;
    ArrayList<DataModel> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent);
        recyclerView = findViewById(R.id.recyclerView);

        View view = getLayoutInflater().inflate(R.layout.abs_layout, null);
        ActionBar.LayoutParams params = new ActionBar.LayoutParams(
                ActionBar.LayoutParams.WRAP_CONTENT,
                ActionBar.LayoutParams.MATCH_PARENT,
                Gravity.CENTER);

        TextView Title = (TextView) view.findViewById(R.id.actionbar_title);
        Title.setText("Get Set Charge");

        getSupportActionBar().setCustomView(view, params);
        getSupportActionBar().setDisplayShowCustomEnabled(true); //show custom title
        getSupportActionBar().setDisplayShowTitleEnabled(false); //hide the default title


        arrayList = new ArrayList<>();
        arrayList.add(new DataModel("Rent", "$3/day", R.drawable.rent));
        arrayList.add(new DataModel("Buy", "$499", R.drawable.money));
        RentAdapter adapter = new RentAdapter(this, arrayList, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
    }

    @Override
    public void onItemClick(DataModel item) {

    }
}
