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

public class Level9 extends AppCompatActivity {
    private Toolbar toolbar;
    final int KUNING = 1, BIRU = 2, MERAH = 3;
    ImageButton vertex1, vertex2, vertex3, vertex4, vertex5, vertex6, vertex7,vertex8,vertex9,vertex10;
    int warnaVertex1 = 1, warnaVertex2 = 1,
            warnaVertex3 = 1, warnaVertex4 = 1,
            warnaVertex5 = 1, warnaVertex6 = 1, warnaVertex7=1,warnaVertex8=1,warnaVertex9=1,warnaVertex10=1, counter = 10000;
    TextView txtClick, txtStatus, txtClickLeft, txtTimer;
    int click = 4, jumlahClickV1 = 1, jumlahClickV2 = 1, jumlahClickV3 = 1, jumlahClickV4 = 1,
            jumlahClickV5 = 1, jumlahClickV6 = 1, jumlahClickV7 = 1,jumlahClickV8=1,jumlahClickV9=1,jumlahClickV10=1;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level9);
        toolbar = (Toolbar) findViewById(R.id.appBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Level 9");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
//                    onBackPressed();
                    Intent i = new Intent(Level9.this, MainActivity.class);
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

        sharedPreferences = getApplicationContext().getSharedPreferences("level", 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        if (click == 0) {
            if (
                    (  warnaVertex1 == KUNING &&
                            warnaVertex2 == BIRU &&
                            warnaVertex3 == KUNING &&
                            warnaVertex4 == BIRU &&
                            warnaVertex5 == KUNING &&
                            warnaVertex6 == BIRU &&
                            warnaVertex7 == KUNING&&
                            warnaVertex8 == KUNING&&
                            warnaVertex9 == BIRU&&
                            warnaVertex10 == KUNING
                    )
                    )

             {
                ubahStatus();
                 int currentScore = sharedPreferences.getInt("currentScore",0);
                 currentScore+=5;
                 int highestScore = sharedPreferences.getInt("highestScore", 0);

                 editor.putInt("currentScore", currentScore);
                 editor.commit();

                 if (currentScore > highestScore) {
                     editor.putInt("highestScore", currentScore);
                     editor.commit();
                 }
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
        sharedPreferences = getApplicationContext().getSharedPreferences("level", 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        int currentScore = sharedPreferences.getInt("currentScore",0);

        AlertDialog.Builder builder = new AlertDialog.Builder(Level9.this);
        View view = getLayoutInflater().inflate(R.layout.dialog_next, null);
        Button dialogButton = (Button) view.findViewById(R.id.nextButton);
        TextView txtScore = (TextView)view.findViewById(R.id.score);

        txtScore.setText("Skor anda : "+String.valueOf(currentScore));
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Level9.this,Level10.class);
                startActivity(i);
            }
        });
        builder.setView(view);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void retryDialog() {
        sharedPreferences = getApplicationContext().getSharedPreferences("level", 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        int currentScore = sharedPreferences.getInt("currentScore",0);


        AlertDialog.Builder builder = new AlertDialog.Builder(Level9.this);
        View view = getLayoutInflater().inflate(R.layout.dialog_retry, null);
        Button dialogButton = (Button) view.findViewById(R.id.retryButton);

        TextView txtScore = (TextView)view.findViewById(R.id.score);

        txtScore.setText("Skor anda : "+String.valueOf(currentScore));
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sharedPreferences = getApplicationContext().getSharedPreferences("level", 0);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("currentScore", 0);
                editor.commit();
                Intent i = new Intent(Level9.this, Level9.class);
                startActivity(i);
                finish();
            }
        });
        builder.setView(view);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void timeoutDialog() {
        sharedPreferences = getApplicationContext().getSharedPreferences("level", 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        int currentScore = sharedPreferences.getInt("currentScore",0);

        AlertDialog.Builder builder = new AlertDialog.Builder(Level9.this);
        View view = getLayoutInflater().inflate(R.layout.dialog_time_out, null);
        Button dialogButton = (Button) view.findViewById(R.id.retryButton);

        TextView txtScore = (TextView)view.findViewById(R.id.score);

        txtScore.setText("Skor anda : "+String.valueOf(currentScore));

        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                sharedPreferences = getApplicationContext().getSharedPreferences("level", 0);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("currentScore", 0);
                editor.commit();
                Intent i = new Intent(Level9.this, Level9.class);
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

        editor.putBoolean("status_" + 9, true);
        editor.putBoolean("level_" + 10, true);


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
        Intent i = new Intent(Level9.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
