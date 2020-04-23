package br.com.raphaelframos.imc.model;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Resultado {

    private double imc;
    private String classificacao;
    private String oQuePodeAcontecer;
    private Drawable imagem;

    public String getImc() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        return formatter.format(imc);
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getoQuePodeAcontecer() {
        return oQuePodeAcontecer;
    }

    public void setoQuePodeAcontecer(String oQuePodeAcontecer) {
        this.oQuePodeAcontecer = oQuePodeAcontecer;
    }

    @NonNull
    @Override
    public String toString() {
        return "Imc = " + getImc() + " - " + getClassificacao() + " - " + getoQuePodeAcontecer();
    }

    public void setImagem(Drawable imagem) {
        this.imagem = imagem;
    }

    public Drawable getImagem() {
        return imagem;
    }
}
