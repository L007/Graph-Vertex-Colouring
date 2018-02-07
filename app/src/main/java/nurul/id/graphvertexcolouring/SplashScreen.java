package nurul.id.graphvertexcolouring;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread splash = new Thread(){
          public void run(){
              try {
                  sleep(2000);
              } catch (InterruptedException a){
                  a.printStackTrace();
              } finally {
                  startActivity(new Intent (SplashScreen.this, Index.class));
                  finish();
              }
          }
        };
        splash.start();
    }
}
