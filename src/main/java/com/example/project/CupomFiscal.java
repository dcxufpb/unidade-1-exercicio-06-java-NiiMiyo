package com.example.project;

public class CupomFiscal {

	public static String NOME_LOJA = "Arcos Dourados Com. de Alimentos LTDA";
	public static String LOGRADOURO = "Av. Projetada Leste";
	public static int NUMERO = 500;
	public static String COMPLEMENTO = "EUC F32/33/34";
	public static String BAIRRO = "Br. Sta Genebra";
	public static String MUNICIPIO = "Campinas";
	public static String ESTADO = "SP";
	public static String CEP = "13080-395";
	public static String TELEFONE = "(19) 3756-7408";
	public static String OBSERVACAO = "Loja 1317 (PDP)";
	public static String CNPJ = "42.591.651/0797-34";
	public static String INSCRICAO_ESTADUAL = "244.898.500.113";

	private static final String ENDLN = System.lineSeparator();

	private static boolean isEmpty(String str){
		Object[] empty = {"", null};
		for (Object _empty : empty) {
			if (str.equals(_empty)) {
				return true;
			}
		}
		return false;
	}

	public static String dadosLoja() {
		//Implemente aqui
		if (isEmpty(MUNICIPIO)){
			throw new RuntimeException("O campo município do endereço é obrigatório");
		}

		if (isEmpty(CNPJ)) {
			throw new RuntimeException("O campo CNPJ da loja é obrigatório");
		}

		if (isEmpty(INSCRICAO_ESTADUAL)) {
			throw new RuntimeException("O campo inscrição estadual da loja é obrigatório");
		}

		if (isEmpty(NOME_LOJA)) {
			throw new RuntimeException("O campo nome da loja é obrigatório");
		}

		if (isEmpty(LOGRADOURO)) {
			throw new RuntimeException("O campo logradouro do endereço é obrigatório");
		}

		if (isEmpty(ESTADO)) {
			throw new RuntimeException("O campo estado do endereço é obrigatório");
		}

		String numeroStr = NUMERO + "";

		if (NUMERO == 0) {
			numeroStr = "s/n";
		}

		String ln2 = LOGRADOURO + ", " + numeroStr;
		ln2 += isEmpty(COMPLEMENTO) ? "" : " " + COMPLEMENTO;
		ln2 += ENDLN;

		String ln3 = "";
		ln3 += isEmpty(BAIRRO) ? "" : BAIRRO + " - ";
		ln3 += MUNICIPIO + " - " + ESTADO + ENDLN;

		String ln4 = "";
		ln4 += isEmpty(CEP) ? "" : "CEP:" + CEP;
		

		if (!isEmpty(TELEFONE)){
			ln4 += isEmpty(ln4) ? "" : " ";
			ln4 += "Tel " + TELEFONE;
		}
		ln4 += isEmpty(ln4) ? "" : ENDLN;

		String ln5 = "";
		ln5 += isEmpty(OBSERVACAO) ? "" : OBSERVACAO;
		ln5 += ENDLN;


		String output = NOME_LOJA + ENDLN;
		output += ln2;
		output += ln3;
		output += ln4;
		output += ln5;
		output += "CNPJ: " + CNPJ + ENDLN;
		output += "IE: " + INSCRICAO_ESTADUAL + ENDLN;

		return output;
	}

}
