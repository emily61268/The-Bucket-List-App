package com.emilypyhuang.thebucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PlacesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);
        setupList();
    }

    private void setupList() {
        BucketListEntry[] list = {
                new BucketListEntry("Paris, France", "The Eiffel Tower, Gothic Notre-Dame cathedral, Louvre museum!", R.drawable.paris, 5),
                new BucketListEntry("London, UK", "Big Ben, visit St Paul's Cathedral, London Metropolitan Archives, walk in the city", R.drawable.london, 5),
                new BucketListEntry("Japan", "Hot springs, sushi, bamboo forest, bullet train through mountains.", R.drawable.japan, 4.5f),
                new BucketListEntry("Iceland", "Dynjandi Waterfall, nature reserves, maybe the Northern Lights too!", R.drawable.iceland, 4),
                new BucketListEntry("Vietnam", "Con Dao Islands, Hanoi, Halong Bay, Hoi An, Lang Co.", R.drawable.vietnam, 3.5f)
        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view_places_to_go);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(list);
        recyclerView.setAdapter(adapter);
    }
}