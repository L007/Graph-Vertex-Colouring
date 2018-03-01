package nurul.id.graphvertexcolouring;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Level3 extends AppCompatActivity {
    private Toolbar toolbar;
    final int KUNING=1,BIRU=2,MERAH=3;
    ImageButton vertex1, vertex2, vertex3, vertex4, vertex5;
    int warnaVertex1 = 1, warnaVertex2 = 1,
            warnaVertex3 = 1, warnaVertex4 = 1,
            warnaVertex5 = 1;
    TextView txtClick, txtStatus, txtClickLeft;
    int click = 4, jumlahClickV1=1, jumlahClickV2=1, jumlahClickV3=1, jumlahClickV4=1, jumlahClickV5=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);
        toolbar = (Toolbar) findViewById(R.id.appBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Level 3");
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
        vertex5 = (ImageButton) findViewById(R.id.Vertex5);

        txtClick = (TextView) findViewById(R.id.max_click);
        txtClickLeft = (TextView) findViewById(R.id.click_left);
        txtStatus = (TextView) findViewById(R.id.judul);


        vertex1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClick(vertex1,jumlahClickV1);
                warnaVertex1++;
                jumlahClickV1++;
                cekGraf();
            }
        });

        vertex2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClick(vertex2,jumlahClickV2);
                warnaVertex2++;
                jumlahClickV2++;
                cekGraf();
            }
        });

        vertex3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClick(vertex3,jumlahClickV3);
                warnaVertex3++;
                jumlahClickV3++;
                cekGraf();
            }
        });
        vertex4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClick(vertex4,jumlahClickV4);
                warnaVertex4++;
                jumlahClickV4++;
                cekGraf();
            }
        });
        vertex5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClick(vertex5,jumlahClickV5);
                warnaVertex5++;
                jumlahClickV5++;
                cekGraf();

            }
        });
        txtClickLeft.setText(String.valueOf(click).toString());
    }
    public void btnClick(ImageButton b,int jumlah) {
        if (click > 0) {
            //jumlah++;
            if (jumlah % 2 == 1) {
                if (jumlah % 3 == 0) {
                    b.setBackgroundResource(R.drawable.yellow);

                } else {
                    b.setBackgroundResource(R.drawable.blue);

                }

            } else if (jumlah % 2 == 0) {
                if (jumlah % 3 == 0) {
                    b.setBackgroundResource(R.drawable.yellow);

                } else {
                    b.setBackgroundResource(R.drawable.red);

                }

            }


            click--;
            txtClickLeft.setText(String.valueOf(click).toString());
            //cekGraf();


        }
    }

    public void cekGraf() {
        if (click == 0) {

            if ((
                    warnaVertex1==KUNING &&
                            warnaVertex2==BIRU &&
                            warnaVertex3==KUNING &&
                            warnaVertex4==BIRU &&
                            warnaVertex5==MERAH
            ) ||
                    (
                            warnaVertex1==BIRU &&
                                    warnaVertex2==KUNING &&
                                    warnaVertex3==BIRU &&
                                    warnaVertex4==KUNING &&
                                    warnaVertex5==MERAH
                    )
                    ||
                    (
                            warnaVertex1==MERAH &&
                                    warnaVertex2==BIRU &&
                                    warnaVertex3==KUNING &&
                                    warnaVertex4==BIRU &&
                                    warnaVertex5==KUNING
                    )
                    ||
                    (
                            warnaVertex1==MERAH &&
                                    warnaVertex2==KUNING &&
                                    warnaVertex3==BIRU &&
                                    warnaVertex4==KUNING &&
                                    warnaVertex5==BIRU
                    )
                    ||
                    (
                            warnaVertex1==BIRU &&
                                    warnaVertex2==MERAH &&
                                    warnaVertex3==KUNING &&
                                    warnaVertex4==BIRU &&
                                    warnaVertex5==KUNING
                    )
                    ||
                    (
                            warnaVertex1==KUNING &&
                                    warnaVertex2==MERAH &&
                                    warnaVertex3==BIRU &&
                                    warnaVertex4==KUNING &&
                                    warnaVertex5==BIRU
                    )
                    ||
                    (
                            warnaVertex1==KUNING &&
                                    warnaVertex2==BIRU &&
                                    warnaVertex3==MERAH &&
                                    warnaVertex4==KUNING &&
                                    warnaVertex5==BIRU
                    )
                    ||
                    (
                            warnaVertex1==BIRU &&
                                    warnaVertex2==KUNING &&
                                    warnaVertex3==MERAH &&
                                    warnaVertex4==BIRU &&
                                    warnaVertex5==KUNING
                    )
                    ||
                    (
                            warnaVertex1==BIRU &&
                                    warnaVertex2==KUNING &&
                                    warnaVertex3==BIRU &&
                                    warnaVertex4==MERAH &&
                                    warnaVertex5==KUNING
                    )
                    ||
                    (
                            warnaVertex1==KUNING &&
                                    warnaVertex2==BIRU &&
                                    warnaVertex3==KUNING &&
                                    warnaVertex4==MERAH &&
                                    warnaVertex5==BIRU
                    )
                    ) {
//                txtStatus.setText("Awesome");
                nextDialog();
            } else {
//                txtStatus.setText("Too much click");
                retryDialog();
            }


        } /*else {
            txtStatus.setText("Too much click");
        }*/
    }
    private void nextDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Level3.this);
        View view = getLayoutInflater().inflate(R.layout.dialog_next, null);
        Button dialogButton = (Button) findViewById(R.id.nextButton);
        builder.setView(view);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void retryDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Level3.this);
        View view = getLayoutInflater().inflate(R.layout.dialog_retry, null);
        Button dialogButton = (Button) findViewById(R.id.retryButton);
        builder.setView(view);
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
