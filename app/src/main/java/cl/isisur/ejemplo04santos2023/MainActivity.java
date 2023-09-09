package cl.isisur.ejemplo04santos2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button ayuda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ayuda=(Button) findViewById(R.id.BTAyuda);
        Intent intentAyuda=new Intent(this, MainActivity3.class);
        Intent intentCalcular= new Intent(this, MainActivity2.class);
        ayuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}