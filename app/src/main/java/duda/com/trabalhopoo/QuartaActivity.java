package duda.com.trabalhopoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class QuartaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarta);
    }

    ArrayList<String> aleatoriosEmUmaLista = new ArrayList<String>();
    aleatoriosEmUmaLista.add("aleatorio1");
    aleatoriosEmUmaLista.add("aleatorio2");
    aleatoriosEmUmaLista.add("aleatorio3");
    aleatoriosEmUmaLista.add("aleatorio4");
    aleatoriosEmUmaLista.add("aleatorio5");
    aleatoriosEmUmaLista.add("aleatorio6");

    ListView nossoListView = findviewwById(R.id.Lista1);

    ArrayAdapter<String> adapter = new ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1,
            aleatoriosEmUmaLista);

    nossoListView.setAdapter(adapter);

    AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){
        public void onItemClick(AdapterView<?> listView, View itemView, int position, long id){
            if (position == INDEX){

            }
        }
    };
    ListView listView = (ListView) findViewById(R.id.Lista1);
    listView.setOnClickListener(itemClickListener);
}
