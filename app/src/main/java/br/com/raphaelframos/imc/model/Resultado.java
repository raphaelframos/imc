package br.com.raphaelframos.imc.model;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;

public class Resultado {

    private double imc;
    private String classificacao;
    private String oQuePodeAcontecer;
    private Drawable imagem;

    public double getImc() {
        return imc;
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
