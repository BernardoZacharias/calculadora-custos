package com.gestock.calculadora_custos.dto;

public class FuncionarioRequest {

    private double salarioBruto;
    private double vrDia;
    private int diasTrabalhoMes;
    private double vtMensal;
    private double outrosBeneficiosMensais;
    private int horasPorDia;
    private int diasPorSemana;
    // "CLT_EMPRESA_PADRAO" ou "SIMPLES_PEQ_EMPRESA"
    private String regime;
    private double outrosCustosIndiretos;

    public double getSalarioBruto() { return salarioBruto; }
    public void setSalarioBruto(double salarioBruto) { this.salarioBruto = salarioBruto; }

    public double getVrDia() { return vrDia; }
    public void setVrDia(double vrDia) { this.vrDia = vrDia; }

    public int getDiasTrabalhoMes() { return diasTrabalhoMes; }
    public void setDiasTrabalhoMes(int diasTrabalhoMes) { this.diasTrabalhoMes = diasTrabalhoMes; }

    public double getVtMensal() { return vtMensal; }
    public void setVtMensal(double vtMensal) { this.vtMensal = vtMensal; }

    public double getOutrosBeneficiosMensais() { return outrosBeneficiosMensais; }
    public void setOutrosBeneficiosMensais(double outrosBeneficiosMensais) { this.outrosBeneficiosMensais = outrosBeneficiosMensais; }

    public int getHorasPorDia() { return horasPorDia; }
    public void setHorasPorDia(int horasPorDia) { this.horasPorDia = horasPorDia; }

    public int getDiasPorSemana() { return diasPorSemana; }
    public void setDiasPorSemana(int diasPorSemana) { this.diasPorSemana = diasPorSemana; }

    public String getRegime() { return regime; }
    public void setRegime(String regime) { this.regime = regime; }

    public double getOutrosCustosIndiretos() { return outrosCustosIndiretos; }
    public void setOutrosCustosIndiretos(double outrosCustosIndiretos) { this.outrosCustosIndiretos = outrosCustosIndiretos; }
}
