package br.com.rsi.hub_bdd.manager;

import br.com.rsi.hub_bdd.dataProvider.ConfigFileReader;

public class FileReaderManager {

		 
		 private static FileReaderManager fileReaderManager = new FileReaderManager();
		 private static ConfigFileReader configFileReader;
		 
		 private FileReaderManager() {
		 }
		 
		 public static FileReaderManager getInstance( ) {
		       return fileReaderManager;
		 }
		 
		 public ConfigFileReader getConfigReader() {
		 return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
		 }

}
