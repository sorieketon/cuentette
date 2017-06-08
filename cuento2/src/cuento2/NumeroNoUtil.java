package cuento2;

public class NumeroNoUtil extends RuntimeException
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String MENSAJE_ERROR = "OPCION NO VALIDA";

	public NumeroNoUtil() {
		super(MENSAJE_ERROR);

	}
}
