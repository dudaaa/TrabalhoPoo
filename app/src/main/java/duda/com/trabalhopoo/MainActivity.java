
package duda.com.trabalhopoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Public void confirmarClicado(View V){
        Intent intent = new Intent(this, SegundaActivity.class);
        Bundle bundle = new Bundle();
        EditText editText = (EditText) findViewById(R.id.edtTexto1);
        bundle.putString("Nome", EditText.getText().ToString());
        intent.putExtras(bundle);

        Intent intent = new Intent(this, SegundaActivity.class);
        Bundle bundle = new Bundle();
        EditText editText = (EditText) findViewById(R.id.edtTexto2);
        bundle.putString("Idade", EditText.getText().ToString());
        intent.putExtras(bundle);

        Intent intent = new Intent(this, SegundaActivity.class);
        Bundle bundle = new Bundle();
        Spinner theSpinner = (Spinner) findViewById(R.id.spiSexo);
        bundle.putString("Sexo", theSpinner.getSexo().ToString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
