package edu.catolicasc.estrutura.file;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * Leitura simples estilo java b�sico
 *
 */
public class LerArquivo {
	private static final Logger LOG = Logger.getLogger(LerArquivo.class.getCanonicalName());

	 /**
	  * Realiza a leitura usando as classes do JAVA IO
	  */
	public void reader(String nome, String palavra) throws IOException {
		File       arq  = new File( nome );
		FileReader read = new FileReader(arq);
		BufferedReader lerArq = new BufferedReader(read);
		String linha = lerArq.readLine();
		byte[] b = linha.getBytes("UTF-8");
		LOG.info("Quantidade de bytes na linha -> "+ b.length);
		while (linha != null) {
			linha = lerArq.readLine();
			if (linha != null){
				NaiveSearch naiveSearch = new NaiveSearch(linha, palavra);
				naiveSearch.search();
			}

		}
		read.close();

	}


}
