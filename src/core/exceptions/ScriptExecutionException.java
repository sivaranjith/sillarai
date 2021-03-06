package core.exceptions;

import java.util.logging.Logger;

public class ScriptExecutionException extends Exception
{

	private static final long serialVersionUID = 1L;
	final String message;
	final static Logger LOGGER = Logger.getLogger(UTXOException.class.toString());

	public ScriptExecutionException(final String message)
	{
		super(message);
		this.message = message;
	}
	
	public ScriptExecutionException(final Throwable cause)
	{
		super(cause);
		this.message = cause.getMessage();
	}
	
	public String getLocalizedMessage()
	{
		LOGGER.info(this.message);
		return this.message;
	}
}
