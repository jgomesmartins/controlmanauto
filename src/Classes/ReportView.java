package Classes;

import Banco.Banco;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class ReportView {

    private JasperPrint impressao;
    private JasperViewer viewer;

    public ReportView() {

    }

    public void showReportVeiculo(HashMap<String, Object> parametro) throws Exception {

        this.showReport(parametro, "Relatório do cadastro de veículo.", "rpt-veiculos.jasper", Banco.getConn());

    }

    public void showReportTipoManutencao(HashMap<String, Object> parametro) throws Exception {

        this.showReport(parametro, "Relatório do cadastro de tipo de manutenção", "rpt-tipo-manutencao.jasper", Banco.getConn());

    }

    public void showReportResultadoFIPE(HashMap parametro, List<Object> dados) throws Exception {

        JRDataSource ds = new JRBeanArrayDataSource(dados.toArray());
        this.showReport(parametro, "Relatório da consulta tabela FIPE.", "rpt-resultado-fipe.jasper", ds);

    }

    public void showReportQuilometragem(HashMap parametro) throws Exception {

        this.showReport(parametro, "Relatório do cadastro quilometragem.", "rpt-quilometragem.jasper", Banco.getConn());
    }

    private void showReport(HashMap parametro, String title, String reportname, Connection conn) throws Exception {

        impressao = JasperFillManager.fillReport(Config.CAMINHOREL + reportname, parametro, conn);

        viewer = new JasperViewer(impressao, false);
        viewer.setName(title);
        viewer.setTitle(title);
        viewer.setIconImage(Config.IMAGEICON.getImage());
        viewer.setVisible(true);

    }

    private void showReport(HashMap parametro, String title, String reportname, JRDataSource conn) throws Exception {

        impressao = JasperFillManager.fillReport(Config.CAMINHOREL + reportname, parametro, conn);

        viewer = new JasperViewer(impressao, false);
        viewer.setName(title);
        viewer.setTitle(title);
        viewer.setIconImage(Config.IMAGEICON.getImage());
        viewer.setVisible(true);

    }

    public void showReportManutencao(HashMap parametro, List<HashMap> listDados) throws Exception {

        JRDataSource ds = new JRBeanArrayDataSource(listDados.toArray());
        this.showReport(parametro, "Relatório do cadastro de manutenção.", "rpt-manutencao.jasper", ds);
    }

}
