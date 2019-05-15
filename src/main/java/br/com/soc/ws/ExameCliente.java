package br.com.soc.ws;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Endpoint;
import javax.xml.ws.Service;

public class ExameCliente {
	public static void main(String args[]) throws Exception {
		Endpoint.publish("http://127.0.0.1:8080/exames/exame", new ExameServerImpl());
		
		URL url = new URL("http://127.0.0.1:8080/exames/exame?wsdl");
		QName qname = new QName("http://ws.soc.com.br/", "ExameServerImplService");
		Service ws = Service.create(url, qname);
		ExameServer exameServer = ws.getPort(ExameServer.class);

		System.out.println(exameServer.obterExamePorCpf("11641379642"));
	}
}
