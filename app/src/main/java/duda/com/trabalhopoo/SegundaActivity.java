package duda.com.trabalhopoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Toast.makeText(
                getApplicationContext(),
                "Esses são seus dados pessoais!",
                Toast.LENGTH_LONG
        ).show();

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String nome = bundle.getString("Nome");
        EditText nome = (EditText) findViewById(R.id.edtTexto1);
        nome.setText(nome);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String idade = bundle.getString("Idade");
        EditText idade = (EditText) findViewById(R.id.edtTexto2);
        idade.setText(idade);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String sexo = bundle.getString("Sexo");
        Spinner theSpinner sexo = (Spinner) findViewById(R.id.spiSexo);
        sexo.setText(sexo);
    }
    public void vaiPraTerceiraActivity(View v){
        Intent intent = new Intent(this, TerceiraActivity.class);
        startActivity(intent);
    }
}
