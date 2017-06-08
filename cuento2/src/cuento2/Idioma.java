package cuento2;

public class Idioma {

	public static String idioma() {
		String idioma = null;
		int coso = 0;
		coso = Valor.leervalor();

		if (coso == 1) {
			idioma = "story_en.properties";
		}
		if (coso == 2) {
			idioma = "story_it.properties";
		}
		if (coso == 3) {
			idioma = "story_es.properties";
		}

		return idioma;
	}
}
