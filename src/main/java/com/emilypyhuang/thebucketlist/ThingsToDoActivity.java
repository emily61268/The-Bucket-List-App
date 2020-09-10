package com.emilypyhuang.thebucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);
        setupList();
    }

    private void setupList() {
        BucketListEntry[] list = {
                new BucketListEntry("Play Piano", "Learn to play Clair de Lune!", R.drawable.piano, 5),
                new BucketListEntry("Experience the Northern Lights", "Somewhere in the arctic circle, probably Norway.", R.drawable.northern_lights, 5),
                new BucketListEntry("Road Trip across USA", "Rent a car from the west coast, and travel to the east coast.", R.drawable.road_trip, 3.5f),
                new BucketListEntry("Scuba Dive", "In Koh Tao, Thailand.", R.drawable.scubadive, 4.5f),
                new BucketListEntry("Skydive", "Preferable over somewhere with an amazing view.", R.drawable.skydive, 4)
        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view_things_to_do);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(list);
        recyclerView.setAdapter(adapter);
    }
}