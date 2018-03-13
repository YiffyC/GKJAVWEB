package fr.gk.tpcurrency.business;

public enum Devise
{
	Euro("EUR", "Euro"),
	Dollar("USD", "American dollar");
	
	private String code;
	private String lib;
	
	private Devise (String c, String l)
	{
		code = c;
		lib = l;
	}

	public String getCode() {
		return code;
	}

	public String getLib() {
		return lib;
	}
	
}
