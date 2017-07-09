/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRPrintPage;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author User
 */
public class TestandoRelatorios {
    Connection conexao = ConectorMySql.getConnection();
	
	public void gerarRelatorio( String caminho, String relatorio, String nomeParametro, Object parametro ) throws JRException , SQLException, ClassNotFoundException {
		
		 
		//executa o relatÃ³rio
		HashMap<String, Object> parametros = new HashMap<String,Object>();//Mapa para parametros a ser passados para gerar relatório - caminho
                if(parametro != null)
                    parametros.put(nomeParametro, parametro);
		
               // JasperReport jasperReport = JasperCompileManager.compileReport(relatorio);
                
                JasperPrint impressao = JasperFillManager.fillReport(caminho + relatorio + ".jasper", parametros,conexao);
                List<JRPrintPage> pages = impressao.getPages();//recebendo a quantidade de páginas que existem no netBeans
                if (pages.size()==0){//Verificando se no parametro passado possui algumregistro
                //No pages, do not export instead do other stuff
                JOptionPane.showMessageDialog(null,"ERRO!!! Não possui nenhum registro nesta categoria");
                return;
                }
                //impressao.        
             
		//exibe o resultado
		JasperViewer viewer = new JasperViewer( impressao , false );
                
                //viewer.setVisible(true);
                JasperExportManager.exportReportToPdfFile(impressao, relatorio+".pdf");//Exportando para PDF
                JasperViewer.viewReport(impressao, false); //Imprimindo um Jasper
                //JOptionPane.showMessageDialog(null, "Exportado");  
              
                 //   JOptionPane.showMessageDialog(null, "Este documento não tem páginas!");
                
	}

}
