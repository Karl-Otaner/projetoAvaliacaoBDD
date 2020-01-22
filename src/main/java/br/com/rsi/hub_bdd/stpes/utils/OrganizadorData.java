package br.com.rsi.hub_bdd.stpes.utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class OrganizadorData {
	public static String dataHorParaArquvio() {
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		return new SimpleDateFormat("ddMMYYYY HHmmss").format(ts);
		
	}

}
