package nurul.id.graphvertexcolouring;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Level16 extends AppCompatActivity {
    private Toolbar toolbar;
    final int KUNING = 1, BIRU = 2, MERAH = 3;
    ImageButton vertex1, vertex2, vertex3, vertex4, vertex5, vertex6, vertex7,vertex8,vertex9,vertex10;
    int warnaVertex1 = 1, warnaVertex2 = 1,
            warnaVertex3 = 1, warnaVertex4 = 1,
            warnaVertex5 = 1, warnaVertex6 = 1, warnaVertex7=1,warnaVertex8=1,warnaVertex9=1,warnaVertex10=1,counter = 20000;
    TextView txtClick, txtStatus, txtClickLeft, txtTimer;
    int click = 4, jumlahClickV1 = 1, jumlahClickV2 = 1, jumlahClickV3 = 1, jumlahClickV4 = 1,
            jumlahClickV5 = 1, jumlahClickV6 = 1, jumlahClickV7 = 1,jumlahClickV8=1,jumlahClickV9=1,jumlahClickV10=1;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level16);
        toolbar = (Toolbar) findViewById(R.id.appBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Level 16");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
//                    onBackPressed();
                    Intent i = new Intent(Level16.this, MainActivity.class);
                    startActivity(i);
                    finish();
                }
            });
        }
        vertex1 = (ImageButton) findViewById(R.id.Vertex1);
        vertex2 = (ImageButton) findViewById(R.id.Vertex2);
        vertex3 = (ImageButton) findViewById(R.id.Vertex3);
        vertex4 = (ImageButton) findViewById(R.id.Vertex4);
        vertex5 = (ImageButton) findViewById(R.id.Vertex5);
        vertex6 = (ImageButton) findViewById(R.id.Vertex6);
        vertex7 = (ImageButton) findViewById(R.id.Vertex7);
        vertex8 = (ImageButton) findViewById(R.id.Vertex8);
        vertex9 = (ImageButton) findViewById(R.id.Vertex9);
        vertex10 = (ImageButton) findViewById(R.id.Vertex10);


        txtClick = (TextView) findViewById(R.id.max_click);
        txtClickLeft = (TextView) findViewById(R.id.click_left);
        txtTimer = (TextView) findViewById(R.id.timer);

        waktu();


        txtStatus = (TextView) findViewById(R.id.judul);
        vertex1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClick(vertex1, jumlahClickV1);
                warnaVertex1++;
                jumlahClickV1++;
                cekGraf();
            }
        });

        vertex2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClick(vertex2, jumlahClickV2);
                warnaVertex2++;
                jumlahClickV2++;
                cekGraf();
            }
        });

        vertex3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClick(vertex3, jumlahClickV3);
                warnaVertex3++;
                jumlahClickV3++;
                cekGraf();
            }
        });
        vertex4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClick(vertex4, jumlahClickV4);
                warnaVertex4++;
                jumlahClickV4++;
                cekGraf();
            }
        });
        vertex5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClick(vertex5, jumlahClickV5);
                warnaVertex5++;
                jumlahClickV5++;
                cekGraf();
            }
        });
        vertex6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClick(vertex6, jumlahClickV6);
                warnaVertex6++;
                jumlahClickV6++;
                cekGraf();
            }
        });
        vertex7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClick(vertex7, jumlahClickV7);
                warnaVertex7++;
                jumlahClickV7++;
                cekGraf();
            }
        });
        vertex8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClick(vertex8, jumlahClickV8);
                warnaVertex8++;
                jumlahClickV8++;
                cekGraf();
            }
        });
        vertex9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClick(vertex9, jumlahClickV9);
                warnaVertex9++;
                jumlahClickV9++;
                cekGraf();
            }
        });
        vertex10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClick(vertex10, jumlahClickV10);
                warnaVertex10++;
                jumlahClickV10++;
                cekGraf();
            }
        });


        txtClickLeft.setText(String.valueOf(click).toString());

    }

    public void btnClick(ImageButton b, int jumlah) {
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
            if (
                    (  warnaVertex1 == KUNING &&
                            warnaVertex2 == KUNING &&
                            warnaVertex3 == KUNING &&
                            warnaVertex4 == BIRU &&
                            warnaVertex5 == KUNING &&
                            warnaVertex6 == KUNING &&
                            warnaVertex7 == BIRU&&
                            warnaVertex8 == KUNING&&
                            warnaVertex9 == KUNING&&
                            warnaVertex10 == MERAH

                    )
                    ||
                            (  warnaVertex1 == KUNING &&
                                    warnaVertex2 == KUNING &&
                                    warnaVertex3 == KUNING &&
                                    warnaVertex4 == BIRU &&
                                    warnaVertex5 == KUNING &&
                                    warnaVertex6 == KUNING &&
                                    warnaVertex7 == BIRU&&
                                    warnaVertex8 == KUNING&&
                                    warnaVertex9 == MERAH&&
                                    warnaVertex10 == KUNING

                            )
                            ||
                            (  warnaVertex1 == KUNING &&
                                    warnaVertex2 == KUNING &&
                                    warnaVertex3 == KUNING &&
                                    warnaVertex4 == BIRU &&
                                    warnaVertex5 == KUNING &&
                                    warnaVertex6 == KUNING &&
                                    warnaVertex7 == MERAH&&
                                    warnaVertex8 == KUNING&&
                                    warnaVertex9 == KUNING&&
                                    warnaVertex10 == BIRU

                            )
                            ||
                            (  warnaVertex1 == KUNING &&
                                    warnaVertex2 == KUNING &&
                                    warnaVertex3 == KUNING &&
                                    warnaVertex4 == MERAH &&
                                    warnaVertex5 == KUNING &&
                                    warnaVertex6 == KUNING &&
                                    warnaVertex7 == BIRU&&
                                    warnaVertex8 == KUNING&&
                                    warnaVertex9 == BIRU&&
                                    warnaVertex10 == KUNING

                            )
                    )

            {
                ubahStatus();
                txtStatus.setText("KEREN !!");
                nextDialog();
            } else {
                txtStatus.setText("Terlalu Banyak Klik !!");
                retryDialog();
            }


        } /*else {
            txtStatus.setText("Terlalu Banyak Klik !!");
        }*/
    }

    private void nextDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Level16.this);
        View view = getLayoutInflater().inflate(R.layout.dialog_next, null);
        Button dialogButton = (Button) view.findViewById(R.id.nextButton);
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Level16.this,Level17.class);
                startActivity(i);
            }
        });
        builder.setView(view);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void retryDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Level16.this);
        View view = getLayoutInflater().inflate(R.layout.dialog_retry, null);
        Button dialogButton = (Button) view.findViewById(R.id.retryButton);
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Level16.this, Level16.class);
                startActivity(i);
            }
        });
        builder.setView(view);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void timeoutDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Level16.this);
        View view = getLayoutInflater().inflate(R.layout.dialog_time_out, null);
        Button dialogButton = (Button) view.findViewById(R.id.retryButton);
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Level16.this, Level16.class);
                startActivity(i);
            }
        });
        builder.setView(view);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void ubahStatus() {
        sharedPreferences = getApplicationContext().getSharedPreferences("level", 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean("status_" + 16, true);
        editor.putBoolean("level_" + 17, true);


        editor.commit();
    }

    private void waktu() {
        new CountDownTimer(counter, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                txtTimer.setText(String.valueOf(millisUntilFinished / 1000));
                //count--;
                if (txtStatus.getText().equals("KEREN !!")) {
                    cancel();
                } else if (txtStatus.getText().equals("Terlalu Banyak Klik !!")) {
                    cancel();
                }
            }

            @Override
            public void onFinish() {
                txtTimer.setText("Waktu Habis !!");
                timeoutDialog();
                cancel();
            }

        }.start();
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(Level16.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
