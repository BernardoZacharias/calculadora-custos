package com.gestock.calculadora_custos.dto;

public class EstoqueRequest {

    // Perguntas para o usuário:

    // Área total do estoque (m²)
    private double areaTotalM2;

    // Quanto paga nessa área por mês (aluguel + cond + IPTU)
    private double custoAreaMensal;

    // Quantidade média de peças ou pallets
    private int quantidadePecas;

    // Soma dos salários + encargos da equipe de armazenagem
    private double custoPessoalMensal;

    // Outros custos mensais
    private double custoEquipamentosMensal; // empilhadeira, manutenção...
    private double custoEnergiaMensal;
    private double custoSistemasMensal; // WMS/ERP, se tiver

    // Dados da mercadoria
    private double valorMedioPeca;    // R$
    private double taxaCustoCapital;  // ex.: 0.01 = 1% ao mês
    private double percentualPerdas;  // ex.: 0.02 = 2% ao mês

    // getters e setters

    public double getAreaTotalM2() { return areaTotalM2; }
    public void setAreaTotalM2(double areaTotalM2) { this.areaTotalM2 = areaTotalM2; }

    public double getCustoAreaMensal() { return custoAreaMensal; }
    public void setCustoAreaMensal(double custoAreaMensal) { this.custoAreaMensal = custoAreaMensal; }

    public int getQuantidadePecas() { return quantidadePecas; }
    public void setQuantidadePecas(int quantidadePecas) { this.quantidadePecas = quantidadePecas; }

    public double getCustoPessoalMensal() { return custoPessoalMensal; }
    public void setCustoPessoalMensal(double custoPessoalMensal) { this.custoPessoalMensal = custoPessoalMensal; }

    public double getCustoEquipamentosMensal() { return custoEquipamentosMensal; }
    public void setCustoEquipamentosMensal(double custoEquipamentosMensal) { this.custoEquipamentosMensal = custoEquipamentosMensal; }

    public double getCustoEnergiaMensal() { return custoEnergiaMensal; }
    public void setCustoEnergiaMensal(double custoEnergiaMensal) { this.custoEnergiaMensal = custoEnergiaMensal; }

    public double getCustoSistemasMensal() { return custoSistemasMensal; }
    public void setCustoSistemasMensal(double custoSistemasMensal) { this.custoSistemasMensal = custoSistemasMensal; }

    public double getValorMedioPeca() { return valorMedioPeca; }
    public void setValorMedioPeca(double valorMedioPeca) { this.valorMedioPeca = valorMedioPeca; }

    public double getTaxaCustoCapital() { return taxaCustoCapital; }
    public void setTaxaCustoCapital(double taxaCustoCapital) { this.taxaCustoCapital = taxaCustoCapital; }

    public double getPercentualPerdas() { return percentualPerdas; }
    public void setPercentualPerdas(double percentualPerdas) { this.percentualPerdas = percentualPerdas; }
}
