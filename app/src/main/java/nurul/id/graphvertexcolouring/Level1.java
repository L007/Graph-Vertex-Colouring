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

public class Level1 extends AppCompatActivity {
    ImageButton vertex1, vertex2, vertex3,vertex4;
    final int KUNING = 1, BIRU = 2, MERAH = 3;
    int warnaVertex1 = 1, warnaVertex2 = 1, warnaVertex3 = 1,warnaVertex4 = 1;
    TextView txtClick, txtStatus, txtClickLeft, txtTimer;
    int click = 2, jumlahClickV1 = 1, jumlahClickV2 = 1, jumlahClickV3 = 1,jumlahClickV4 = 1;
    Toolbar toolbar;
    private int count = 10;
    private int counter = 10000;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);
        toolbar = (Toolbar) findViewById(R.id.appBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Level 1");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onBackPressed();
//                    Intent i = new Intent(Level1.this, MainActivity.class);
//                    startActivity(i);
                    finish();
                }
            });
        }
        vertex1 = (ImageButton) findViewById(R.id.Vertex1);
        vertex2 = (ImageButton) findViewById(R.id.Vertex2);
        vertex3 = (ImageButton) findViewById(R.id.Vertex3);
        vertex4 = (ImageButton) findViewById(R.id.Vertex4);

        txtClick = (TextView) findViewById(R.id.max_click);
        txtClickLeft = (TextView) findViewById(R.id.click_left);
        txtStatus = (TextView) findViewById(R.id.judul);
        txtTimer = (TextView) findViewById(R.id.timer);


        waktu();


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

            if ((
                    warnaVertex1 == KUNING &&
                            warnaVertex2 == BIRU &&
                            warnaVertex3 == KUNING &&
                            warnaVertex4 == BIRU
            ) ||
                    (
                            warnaVertex1 == BIRU &&
                                    warnaVertex2 == KUNING &&
                                    warnaVertex3 == BIRU&&
                                    warnaVertex4 == KUNING

                    )

                    ) {
                ubahStatus();
                nextDialog();
                txtStatus.setText("Awesome");

            } else {
                txtStatus.setText("Too much click");
                retryDialog();
            }


        }
    }

    private void nextDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Level1.this);
        View view = getLayoutInflater().inflate(R.layout.dialog_next, null);
        Button dialogButton = (Button) view.findViewById(R.id.nextButton);
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Level1.this, Level2.class);
                startActivity(i);
                finish();
            }
        });
        builder.setView(view);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void retryDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Level1.this);
        View view = getLayoutInflater().inflate(R.layout.dialog_retry, null);
        Button dialogButton = (Button) view.findViewById(R.id.retryButton);
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Level1.this, Level1.class);
                startActivity(i);
            }
        });
        builder.setView(view);
        AlertDialog dialog = builder.create();
        dialog.show();
    }
    private void timeoutDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Level1.this);
        View view = getLayoutInflater().inflate(R.layout.dialog_time_out, null);
        Button dialogButton = (Button) view.findViewById(R.id.retryButton);
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Level1.this, Level1.class);
                startActivity(i);
            }
        });
        builder.setView(view);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void ubahStatus(){
        sharedPreferences = getApplicationContext().getSharedPreferences("level",0);
        SharedPreferences.Editor editor = sharedPreferences.edit();


        editor.putBoolean("status_"+1,true);
        editor.putBoolean("level_"+2,true);

        editor.commit();
    }
    private void waktu(){
        new CountDownTimer(counter, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                txtTimer.setText(String.valueOf(millisUntilFinished/1000));
                //count--;
                if (txtStatus.getText().equals("Awesome")){
                    cancel();
                }
                else if(txtStatus.getText().equals("Too much click")){
                    cancel();
                }
            }

            @Override
            public void onFinish() {
                txtTimer.setText("Time is Out");
                timeoutDialog();
                cancel();
            }

        }.start();
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(Level1.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
