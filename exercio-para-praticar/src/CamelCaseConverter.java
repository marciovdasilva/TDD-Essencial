public class CamelCaseConverter {
	public String converter(String nome) {
		if (ehNomeCompostoOuCompleto(nome)) {
			String nomeCompostoOuCompleto = "";
			String[] partesDoNome = nome.split(" ");
			for (int i = 0; i < partesDoNome.length; i++) {
				boolean concatenarComEspaco = i != partesDoNome.length - 1;
				if(concatenarComEspaco) {
					nomeCompostoOuCompleto += converter(partesDoNome[i]) + " ";
				} else {
					nomeCompostoOuCompleto += converter(partesDoNome[i]);
				}
			}
			return nomeCompostoOuCompleto;
		}
		return nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase();
	}

	private static boolean ehNomeCompostoOuCompleto(String nome) {
		return nome.split(" ").length > 1;
	}
}