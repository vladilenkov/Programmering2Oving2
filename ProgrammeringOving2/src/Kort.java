
public abstract class Kort
{
	private String fornavn, etternavn;
	private int pinKode, kortNummer = 0;
	private boolean sperretKort;
	private static int antallKort = 0;
	
	public Kort(String fornavn, String etternavn, int pinKode, int kortNummer, boolean sperretKort)
	{
		antallKort++;
		kortNummer = antallKort;
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.pinKode = pinKode;
		sperretKort = false;
	}
	public String getNavn()
	{
		return fornavn + " " + etternavn;
	}
	public boolean isSperret()
	{
		return sperretKort;
	}
	@Override
	public String toString()
	{
		return "Navn: " + getNavn() + ", PIN kode: " + pinKode + ", kort nummer " + kortNummer + 
				", kortet er " + (isSperret() ? "sperret." : "ikke sperret");
	}
	public abstract boolean sjekkPin(int pin);
}
