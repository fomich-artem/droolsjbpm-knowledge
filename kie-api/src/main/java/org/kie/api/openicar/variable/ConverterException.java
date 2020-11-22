package org.kie.api.openicar.variable;

/**
 * Converter exceptions class
 * 
 * @author <a href="mailto:a.fomichev@comsoft-corp.ru">Fomichev Artem</a> <br>
 *
 */
public class ConverterException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/**
	 * @param message
	 */
	public ConverterException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public ConverterException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ConverterException(String message, Throwable cause) {
		super(message, cause);
	}

}