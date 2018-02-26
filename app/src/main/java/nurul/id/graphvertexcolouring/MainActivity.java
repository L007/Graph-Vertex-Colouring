package nurul.id.graphvertexcolouring;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private Button lv1, lv2, lv3, lv4, lv5, lv6, lv7, lv8, lv9, lv10, lv11, lv12, lv13, lv14, lv15, lv16, lv17, lv18, lv19, lv20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.appBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Graph Vertex Colouring");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onBackPressed();
                }
            });
        }
        lv1 = (Button) findViewById(R.id.level1);
        lv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Level1.class);
                startActivity(i);
            }
        });
        lv2 = (Button) findViewById(R.id.level2);
        lv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Level2.class);
                startActivity(i);
            }
        });
        lv3 = (Button) findViewById(R.id.level3);
        lv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Level3.class);
                startActivity(i);
            }
        });
        lv4 = (Button) findViewById(R.id.level4);
        lv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Level4.class);
                startActivity(i);
            }
        });
        lv5 = (Button) findViewById(R.id.level5);
        lv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Level5.class);
                startActivity(i);
            }
        });
        lv6 = (Button) findViewById(R.id.level6);
        lv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Level6.class);
                startActivity(i);
            }
        });
        lv7 = (Button) findViewById(R.id.level7);
        lv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Level7.class);
                startActivity(i);
            }
        });
        lv8 = (Button) findViewById(R.id.level8);
        lv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Level8.class);
                startActivity(i);
            }
        });
        lv9 = (Button) findViewById(R.id.level9);
        lv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Level9.class);
                startActivity(i);
            }
        });
        lv10 = (Button) findViewById(R.id.level10);
        lv11 = (Button) findViewById(R.id.level11);
        lv12 = (Button) findViewById(R.id.level12);
        lv13 = (Button) findViewById(R.id.level13);
        lv14 = (Button) findViewById(R.id.level14);
        lv15 = (Button) findViewById(R.id.level15);
        lv16 = (Button) findViewById(R.id.level16);
        lv17 = (Button) findViewById(R.id.level17);
        lv18 = (Button) findViewById(R.id.level18);
        lv19 = (Button) findViewById(R.id.level19);
        lv20 = (Button) findViewById(R.id.level20);
    }
}
