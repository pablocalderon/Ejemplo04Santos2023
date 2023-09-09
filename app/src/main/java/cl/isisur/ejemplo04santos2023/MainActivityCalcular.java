package cl.isisur.ejemplo04santos2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class MainActivityCalcular extends AppCompatActivity {


    Button aceptar;
    EditText etnombre,etapellidos;
    String nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calcular);

        aceptar=(Button) findViewById(R.id.BTAceptarCalcular);
        etnombre =(EditText) findViewById(R.id.ETNombre);
        etapellidos=(EditText) findViewById(R.id.ETApellidos);
        //intentP.putExtra("nombre",stNombre);
         nombre=etnombre.getText().toString();
        Intent intent = new Intent(this, MainActivityResultado.class);
        intent.putExtra("nombre",nombre);
        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });



    }
}