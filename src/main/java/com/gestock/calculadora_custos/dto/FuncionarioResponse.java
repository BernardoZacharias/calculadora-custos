package com.gestock.calculadora_custos.dto;

public class FuncionarioResponse {

    private double custoMensal;
    private double custoPorHora;
    private double salario;
    private double encargos;
    private double beneficios;
    private double custosIndiretos;
    private double percentualAcimaSalario;

    public double getCustoMensal() { return custoMensal; }
    public void setCustoMensal(double custoMensal) { this.custoMensal = custoMensal; }

    public double getCustoPorHora() { return custoPorHora; }
    public void setCustoPorHora(double custoPorHora) { this.custoPorHora = custoPorHora; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public double getEncargos() { return encargos; }
    public void setEncargos(double encargos) { this.encargos = encargos; }

    public double getBeneficios() { return beneficios; }
    public void setBeneficios(double beneficios) { this.beneficios = beneficios; }

    public double getCustosIndiretos() { return custosIndiretos; }
    public void setCustosIndiretos(double custosIndiretos) { this.custosIndiretos = custosIndiretos; }

    public double getPercentualAcimaSalario() { return percentualAcimaSalario; }
    public void setPercentualAcimaSalario(double percentualAcimaSalario) { this.percentualAcimaSalario = percentualAcimaSalario; }
}
