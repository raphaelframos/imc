package br.com.raphaelframos.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.CacheRequest;

import br.com.raphaelframos.imc.model.CalculoImc;
import br.com.raphaelframos.imc.model.Resultado;

public class MainActivity extends AppCompatActivity {

    private EditText editTextPeso;
    private EditText editTextAltura;
    private Button buttonCalcular;
    private TextView textViewImc;
    private ImageView imageViewResultado;
    private TextView textViewLabelImc;
    private TextView textViewClassificacao;
    private TextView textViewConsequencia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

        vinculaView();

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String peso = editTextPeso.getText().toString();
                String altura = editTextAltura.getText().toString();

                CalculoImc calculoImc = new CalculoImc(peso, altura, getApplicationContext());
                mostraResultado(calculoImc.getResultado());

            }
        });

    }

    private void vinculaView(){
        editTextAltura = findViewById(R.id.editTextAltura);
        editTextPeso = findViewById(R.id.editTextPeso);
        buttonCalcular = findViewById(R.id.buttonCalcular);
        textViewImc = findViewById(R.id.textViewImc);
        imageViewResultado = findViewById(R.id.imageViewResultado);
        textViewLabelImc = findViewById(R.id.textViewLabelImc);
        textViewClassificacao = findViewById(R.id.textViewClassificacao);
        textViewConsequencia = findViewById(R.id.textViewConsequencia);
    }

    private void mostraResultado(Resultado resultado) {
        textViewLabelImc.setVisibility(View.VISIBLE);
        textViewImc.setText(resultado.getImc());
        textViewConsequencia.setText(resultado.getoQuePodeAcontecer());
        textViewClassificacao.setText(resultado.getClassificacao());
        imageViewResultado.setImageDrawable(resultado.getImagem());
    }


}
