import java.io.IOException;
import java.util.logging.Logger;

import edu.catolicasc.estrutura.file.LerArquivo;

/**
 * Classe para demonstrar o uso dos métodos de leitura diferentes
 *
 */
public class Start {

	private static final String[] ARQUIVO = new String[42];
	
	
	private static final Logger LOG = Logger.getLogger(Start.class.getCanonicalName());
	
	/**
	 * Inicia o programa realizando as leituras
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			Start.readAll();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Aplica todas técnicas de leitura
	 * @throws IOException 
	 */
	static void readAll() throws IOException {
	
		ARQUIVO[0] = "resource/FolgerDigitalTexts_TXT_Complete/1H4.txt";
		ARQUIVO[1] = "resource/FolgerDigitalTexts_TXT_Complete/1H6.txt";
		ARQUIVO[2] = "resource/FolgerDigitalTexts_TXT_Complete/2H4.txt";
		ARQUIVO[3] = "resource/FolgerDigitalTexts_TXT_Complete/2H6.txt";
		ARQUIVO[4] = "resource/FolgerDigitalTexts_TXT_Complete/3H6.txt";
		ARQUIVO[5] = "resource/FolgerDigitalTexts_TXT_Complete/Ado.txt";
		ARQUIVO[6] = "resource/FolgerDigitalTexts_TXT_Complete/Ant.txt";
		ARQUIVO[7] = "resource/FolgerDigitalTexts_TXT_Complete/AWW.txt";
		ARQUIVO[8] = "resource/FolgerDigitalTexts_TXT_Complete/AYL.txt";
		ARQUIVO[9] = "resource/FolgerDigitalTexts_TXT_Complete/Cor.txt";
		ARQUIVO[10] = "resource/FolgerDigitalTexts_TXT_Complete/Cym.txt";
		ARQUIVO[11] = "resource/FolgerDigitalTexts_TXT_Complete/Err.txt";
		ARQUIVO[12] = "resource/FolgerDigitalTexts_TXT_Complete/H5.txt";
		ARQUIVO[13] = "resource/FolgerDigitalTexts_TXT_Complete/H8.txt";
		ARQUIVO[14] = "resource/FolgerDigitalTexts_TXT_Complete/Ham.txt";
		ARQUIVO[15] = "resource/FolgerDigitalTexts_TXT_Complete/JC.txt";
		ARQUIVO[16] = "resource/FolgerDigitalTexts_TXT_Complete/Jn.txt";
		ARQUIVO[17] = "resource/FolgerDigitalTexts_TXT_Complete/LLL.txt";
		ARQUIVO[18] = "resource/FolgerDigitalTexts_TXT_Complete/Lr.txt";
		ARQUIVO[19] = "resource/FolgerDigitalTexts_TXT_Complete/Luc.txt";
		ARQUIVO[20] = "resource/FolgerDigitalTexts_TXT_Complete/Mac.txt";
		ARQUIVO[21] = "resource/FolgerDigitalTexts_TXT_Complete/MM.txt";
		ARQUIVO[22] = "resource/FolgerDigitalTexts_TXT_Complete/MND.txt";
		ARQUIVO[23] = "resource/FolgerDigitalTexts_TXT_Complete/MV.txt";
		ARQUIVO[24] = "resource/FolgerDigitalTexts_TXT_Complete/Oth.txt";
		ARQUIVO[25] = "resource/FolgerDigitalTexts_TXT_Complete/Per.txt";
		ARQUIVO[26] = "resource/FolgerDigitalTexts_TXT_Complete/PhT.txt";
		ARQUIVO[27] = "resource/FolgerDigitalTexts_TXT_Complete/R2.txt";
		ARQUIVO[28] = "resource/FolgerDigitalTexts_TXT_Complete/R3.txt";
		ARQUIVO[29] = "resource/FolgerDigitalTexts_TXT_Complete/Rom.txt";
		ARQUIVO[30] = "resource/FolgerDigitalTexts_TXT_Complete/Shr.txt";
		ARQUIVO[31] = "resource/FolgerDigitalTexts_TXT_Complete/Son.txt";
		ARQUIVO[32] = "resource/FolgerDigitalTexts_TXT_Complete/TGV.txt";
		ARQUIVO[33] = "resource/FolgerDigitalTexts_TXT_Complete/Tim.txt";
		ARQUIVO[34] = "resource/FolgerDigitalTexts_TXT_Complete/Tit.txt";
		ARQUIVO[35] = "resource/FolgerDigitalTexts_TXT_Complete/Tmp.txt";
		ARQUIVO[36] = "resource/FolgerDigitalTexts_TXT_Complete/TN.txt";
		ARQUIVO[37] = "resource/FolgerDigitalTexts_TXT_Complete/TNK.txt";
		ARQUIVO[38] = "resource/FolgerDigitalTexts_TXT_Complete/Tro.txt";
		ARQUIVO[39] = "resource/FolgerDigitalTexts_TXT_Complete/Ven.txt";
		ARQUIVO[40] = "resource/FolgerDigitalTexts_TXT_Complete/Wiv.txt";
		ARQUIVO[41] = "resource/FolgerDigitalTexts_TXT_Complete/WT.txt";
		

		String palavra = "earth";
		for (String arquivo : ARQUIVO) {
			procurar(arquivo,palavra);
		}
	}

	/**
	 * Chama o método de leitura de cada arquivo
	 * @param io
	 */
	static void procurar(String arquivo,String palavra) throws IOException {
		LOG.info("started");
		LerArquivo leitor = new LerArquivo();
		leitor.reader(arquivo, palavra);
		LOG.info("finished");
	}
}
