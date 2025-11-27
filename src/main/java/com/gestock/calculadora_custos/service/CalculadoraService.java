package com.gestock.calculadora_custos.service;

import com.gestock.calculadora_custos.dto.*;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public FuncionarioResponse calcularFuncionario(FuncionarioRequest req) {
        double salario = req.getSalarioBruto();

        double percEncargos;
        if ("SIMPLES_PEQ_EMPRESA".equalsIgnoreCase(req.getRegime())) {
            percEncargos = 0.60;
        } else {
            percEncargos = 0.80;
        }

        double encargos = salario * percEncargos;

        double beneficios = (req.getVrDia() * req.getDiasTrabalhoMes())
                + req.getVtMensal()
                + req.getOutrosBeneficiosMensais();

        double custosIndiretos = req.getOutrosCustosIndiretos();

        double custoMensal = salario + encargos + beneficios + custosIndiretos;

        double horasMes = req.getHorasPorDia() * req.getDiasPorSemana() * 4.5;
        double custoHora = horasMes > 0 ? custoMensal / horasMes : 0;

        double percentualAcimaSalario = ((custoMensal / salario) - 1.0) * 100.0;

        FuncionarioResponse resp = new FuncionarioResponse();
        resp.setSalario(salario);
        resp.setEncargos(encargos);
        resp.setBeneficios(beneficios);
        resp.setCustosIndiretos(custosIndiretos);
        resp.setCustoMensal(custoMensal);
        resp.setCustoPorHora(custoHora);
        resp.setPercentualAcimaSalario(percentualAcimaSalario);

        return resp;
    }

    public EstoqueResponse calcularEstoque(EstoqueRequest req) {
        int qtd = req.getQuantidadePecas();
        if (qtd <= 0) {
            throw new IllegalArgumentException("Quantidade de peças deve ser maior que zero");
        }

        double custoEstruturaPorPeca = req.getCustoAreaMensal() / qtd;
        double custoPessoalPorPeca = req.getCustoPessoalMensal() / qtd;
        double custoOutrosPorPeca = (req.getCustoEquipamentosMensal()
                + req.getCustoEnergiaMensal()
                + req.getCustoSistemasMensal()) / qtd;

        double custoCapitalPorPeca = req.getValorMedioPeca() * req.getTaxaCustoCapital();
        double custoPerdasPorPeca = req.getValorMedioPeca() * req.getPercentualPerdas();

        double custoTotalPorPeca = custoEstruturaPorPeca
                + custoPessoalPorPeca
                + custoOutrosPorPeca
                + custoCapitalPorPeca
                + custoPerdasPorPeca;

        double custoTotalMensal = custoTotalPorPeca * qtd;

        EstoqueResponse resp = new EstoqueResponse();
        resp.setCustoEstruturaPorPeca(custoEstruturaPorPeca);
        resp.setCustoPessoalPorPeca(custoPessoalPorPeca);
        resp.setCustoOutrosPorPeca(custoOutrosPorPeca);
        resp.setCustoCapitalPorPeca(custoCapitalPorPeca);
        resp.setCustoPerdasPorPeca(custoPerdasPorPeca);
        resp.setCustoTotalPorPeca(custoTotalPorPeca);
        resp.setCustoTotalMensal(custoTotalMensal);

        return resp;
    }
}
