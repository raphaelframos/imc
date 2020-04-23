package br.com.raphaelframos.imc.model;

import android.content.Context;

import androidx.core.content.ContextCompat;

import br.com.raphaelframos.imc.R;

public class CalculoImc {

    private Resultado resultado;
    private Context context;

    public CalculoImc(String pesoDigitado, String alturaDigitada, Context context) {
        this.context = context;
        double peso = Double.parseDouble(pesoDigitado);
        double altura = Double.parseDouble(alturaDigitada);
        calcula(peso, altura);
    }

    private void calcula(double peso, double altura) {
        double imc = peso/(altura*altura);
        Resultado resultado = new Resultado();
        resultado.setImc(imc);
        if(imc < 17){
            resultado.setClassificacao("Muito abaixo do peso");
            resultado.setoQuePodeAcontecer("Queda de cabelo, infertilidade, ausência menstrual");
        }else if(imc >= 17 && imc < 18.5){
            resultado.setClassificacao("Abaixo do peso");
            resultado.setoQuePodeAcontecer("Fadiga, stress, ansiedade");
        }else if(imc >= 18.5 && imc < 25){
            resultado.setClassificacao("Peso normal");
            resultado.setoQuePodeAcontecer("Menor risco de doenças cardíacas e vasculares");
            resultado.setImagem(ContextCompat.getDrawable(context, R.drawable.normal));
        }else if(imc >= 25 && imc < 30){
            resultado.setClassificacao("Acima do peso");
            resultado.setoQuePodeAcontecer("Fadiga, má circulação, varizes");
        }else if(imc >= 30 && imc < 35){
            resultado.setClassificacao("Obesidade Grau I");
            resultado.setoQuePodeAcontecer("Diabetes, angina, infarto, aterosclerose");
        }else if(imc >= 35 && imc <= 40){
            resultado.setClassificacao("Obesidade Grau II");
            resultado.setoQuePodeAcontecer("Apneia do sono, falta de ar");
        }else{
            resultado.setClassificacao("Obesidade Grau III");
            resultado.setoQuePodeAcontecer("Refluxo, dificuldade para se mover, escaras, diabetes, infarto, AVC");
        }

        this.resultado = resultado;
    }

    public Resultado getResultado() {
        return resultado;
    }

}
