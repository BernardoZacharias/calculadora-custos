package com.gestock.calculadora_custos.dto;

public class EstoqueResponse {

    // Resultado principal
    private double custoTotalPorPeca;  // R$/peça ou pallet
    private double custoTotalMensal;   // R$/mês (tudo)

    // Quebra para mostrar no site
    private double custoEstruturaPorPeca; // aluguel/IPTU/condomínio
    private double custoPessoalPorPeca;   // mão de obra do estoque
    private double custoOutrosPorPeca;    // equipamentos + energia + sistemas
    private double custoCapitalPorPeca;   // capital empatado
    private double custoPerdasPorPeca;    // perdas/avarias

    public double getCustoTotalPorPeca() { return custoTotalPorPeca; }
    public void setCustoTotalPorPeca(double custoTotalPorPeca) { this.custoTotalPorPeca = custoTotalPorPeca; }

    public double getCustoTotalMensal() { return custoTotalMensal; }
    public void setCustoTotalMensal(double custoTotalMensal) { this.custoTotalMensal = custoTotalMensal; }

    public double getCustoEstruturaPorPeca() { return custoEstruturaPorPeca; }
    public void setCustoEstruturaPorPeca(double custoEstruturaPorPeca) { this.custoEstruturaPorPeca = custoEstruturaPorPeca; }

    public double getCustoPessoalPorPeca() { return custoPessoalPorPeca; }
    public void setCustoPessoalPorPeca(double custoPessoalPorPeca) { this.custoPessoalPorPeca = custoPessoalPorPeca; }

    public double getCustoOutrosPorPeca() { return custoOutrosPorPeca; }
    public void setCustoOutrosPorPeca(double custoOutrosPorPeca) { this.custoOutrosPorPeca = custoOutrosPorPeca; }

    public double getCustoCapitalPorPeca() { return custoCapitalPorPeca; }
    public void setCustoCapitalPorPeca(double custoCapitalPorPeca) { this.custoCapitalPorPeca = custoCapitalPorPeca; }

    public double getCustoPerdasPorPeca() { return custoPerdasPorPeca; }
    public void setCustoPerdasPorPeca(double custoPerdasPorPeca) { this.custoPerdasPorPeca = custoPerdasPorPeca; }
}
