package DesafiosDIO.Desafio6;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class SistemaAcionistas {
 public List<String> obterAnalisesDesempenho(String dataInicialStr, String dataFinalStr) throws ParseException {
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    Date dataInicial = df.parse(dataInicialStr);
    Date dataFinal = df.parse(dataFinalStr);

    List<Analise> analises = new ArrayList<>();
    analises.add(new Analise(df.parse("01/01/2023"), "Analise de Desempenho Financeiro"));
    analises.add(new Analise(df.parse("15/02/2023"), "Analise de Riscos e Exposicoes"));
    analises.add(new Analise(df.parse("31/03/2023"), "Analises Corporativas"));
    analises.add(new Analise(df.parse("05/04/2023"), "Analise de Politicas e Regulamentacoes"));
    analises.add(new Analise(df.parse("01/04/2023"), "Analise de Politicas e Regulamentacoes"));
    analises.add(new Analise(df.parse("15/05/2023"), "Analise de Ativos"));
    analises.add(new Analise(df.parse("30/06/2023"), "Analise de Inovacao e Tecnologia"));

    List<String> analisesFiltradas = new ArrayList<>();
    for (Analise analise : analises) {
      if (analise.data.after(dataInicial) && analise.data.before(dataFinal)) {
        analisesFiltradas.add(analise.descricao);
      }
    }

    return analisesFiltradas;
  }
