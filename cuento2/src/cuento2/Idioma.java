package cuento2;

public class Idioma {

	public static String idioma() {
		String idioma = null;
		String coso = "";
		coso = Valor.leervalor();

		switch (coso) {
		case "1":
			idioma = "story_en.properties";

			break;
		case "2":
			idioma = "story_it.properties";

			break;
		case "3":
			idioma = "story_es.properties";

			break;

		default:
			throw new NumeroNoUtil();

		}

		return idioma;
	}
}
