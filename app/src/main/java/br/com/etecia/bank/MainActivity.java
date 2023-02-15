package br.com.etecia.bank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView idListaValores;

    String titulo[] = {"Lista de Agências","Itaú - Ag. 1608","Itaú - Ag. 0360", "Itaú - Ag. 6414", "Itaú - Ag. 0767"};

    String descricao[] = {"Consulta a Lista de Agências próximas a você do banco Itaú","Chácara Santo Antônio","Av. Santa Catarina", "Itaú Personnalité Marajoara", "Jd. Prudência\n"};

    String nota[] = {"5.0" , "3,4", "3.0" , "5.0", "4,5"};

    int bank[] = {R.drawable.itau,R.drawable.itausantoantonio,R.drawable.santacatarina,R.drawable.marajoarapersonalite,R.drawable.jdmarajoara};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idListaValores = findViewById(R.id.idListaValores);

        MyAdapter adapter = new MyAdapter();

        idListaValores.setAdapter(adapter);


    }

    public class MyAdapter extends BaseAdapter {


        @Override
        public int getCount() {

            return bank.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {


            ImageView idmdlimg;
            TextView idtxtitulo, idMdlDescricao, idmdlnota;


            View v = getLayoutInflater().inflate(R.layout.modelo_banco, null);


            idmdlimg = v.findViewById(R.id.idmdlimg);
            idtxtitulo = v.findViewById(R.id.idtxtitulo);
            idMdlDescricao = v.findViewById(R.id.idMdlDescricao);
            idmdlnota = v.findViewById(R.id.idmdlnota);

            idtxtitulo.setText(titulo[i]);
            idMdlDescricao.setText(descricao[i]);
            idmdlnota.setText(nota[i]);
            idmdlimg.setImageResource(bank[i]);

            return v;
        }
    }
}