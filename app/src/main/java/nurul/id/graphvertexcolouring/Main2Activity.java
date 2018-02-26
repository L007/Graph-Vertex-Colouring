package nurul.id.graphvertexcolouring;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    private GridView gridView;
    private TambahGridAdapter adapter;
    private List<Model> mlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        gridView = (GridView) findViewById(R.id.grid1);
        mlist = new ArrayList<>();

        mlist.add(new Model(1, R.drawable.rectangle_red, "1"));
        mlist.add(new Model(2, R.drawable.rectangle_grey, "2"));
        mlist.add(new Model(1, R.drawable.rectangle_red, "1"));
        mlist.add(new Model(2, R.drawable.rectangle_grey, "2"));
        mlist.add(new Model(1, R.drawable.rectangle_red, "1"));
        mlist.add(new Model(2, R.drawable.rectangle_grey, "2"));
        adapter = new TambahGridAdapter(getApplicationContext(), mlist);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                if (id == 1) {
                    Intent i = new Intent(Main2Activity.this, Level1.class);
                    startActivity(i);
                } else if (id == 2) {
                    Intent i = new Intent(Main2Activity.this, Level2.class);
                    startActivity(i);
                }
            }
        });
    }
}
