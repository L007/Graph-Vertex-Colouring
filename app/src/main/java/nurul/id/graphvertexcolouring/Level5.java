package nurul.id.graphvertexcolouring;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Level5 extends AppCompatActivity {
    private Toolbar toolbar;
    private ImageButton vertex1, vertex2, vertex3, vertex4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level5);
        toolbar = (Toolbar) findViewById(R.id.appBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Level 5");
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
        vertex1 = (ImageButton) findViewById(R.id.Vertex1);
        vertex2 = (ImageButton) findViewById(R.id.Vertex2);
        vertex3 = (ImageButton) findViewById(R.id.Vertex3);
        vertex4 = (ImageButton) findViewById(R.id.Vertex4);
    }
}
