package cuento2;

public class NumeroNoUtil extends RuntimeException
{

	private static final String MENSAJE_ERROR = "OPCION NO VALIDA";

	public NumeroNoUtil() {
		super(MENSAJE_ERROR);

	}
}
