package duda.com.trabalhopoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TerceiraActivity extends AppCompatActivity implements View.OnClickListener {

    private Button ok;
    private EditText texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);

        ok = (Button) findViewById(R.id.botaoOk);
        texto = (EditText) findViewById(R.id.edtTexto3);

        ok.setOnClickListener(this);
    }
    @Override
    protected void onClick(View v) {
       AlertDialog.Builder dlg = new AlertDialo.Builder(TerceiraActivity.this);
       dlg.setMessage(texto.getText().toString());
       dlg.setNeutralButton("ok", null);
       dgl.show();

       NotificationCompat.Builder builder = new NotificationCompat.Builder(this.edtTexto3);
       builder.setContentTitle("Mágica!!");
       builder.setContentText("TAN NAN!");
       builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);

       PendingIntent pendingIntent =
               PendingIntent.getActivity(this, 0, new Intent (this, MainActivity.class), 0);
       builder.setAutoCancel(true);
       builder.setContentIntent(pendingIntent);

       NotificationManager nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
       nm.notify(456789, builder.build());


       Button Proximo = (Button)
       findViewById(R.id.botaoProx);

       Proximo.setOnClickListener(new
               View.OnClickListener(){
       public void onClick(Vieww v){
       Intent it = new
       Intent(TerceiraActivity.this,QuartaActivity.class);
             startActivity(it);
       }
               }
    });
}
