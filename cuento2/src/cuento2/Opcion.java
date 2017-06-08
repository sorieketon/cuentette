package cuento2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Opcion {
	public static Object opcion() {
		String idioma = Idioma.idioma();
		Properties properties = null;
		FileReader fr = null;
		try {
			fr = new FileReader(idioma);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		properties = new Properties();

		try {
			properties.load(fr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String start = properties.getProperty("start");
		String end = properties.getProperty("end");
		String body = properties.getProperty("body");

		System.out.println(start);
		System.out.println(body);
		System.out.println(end);

		return null;
	}

}
