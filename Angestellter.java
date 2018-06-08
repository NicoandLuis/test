public class Angestellter
{

	private String vorname;
	private String nachname;
	private int alter;
	private int gehalt;
	
	public Angestellter(String vorname, String nachname, int alter, int gehalt)
	{
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
		this.gehalt = gehalt;
	}

	public void addGehalt(int erhöhung)
	{
		if(erhöhung < 1)
		{
			System.out.println("Du kannst das Gehalt nur erhöhen.");
			return;
		}
		gehalt += erhöhung;
		System.out.println("Gehalt erhöht.");
	}
	
	public void altern()
	{
		alter += 1;
	}
	
	public String getVorname()
	{
		return vorname;
	}

	public String getNachname()
	{
		return nachname;
	}

	public int getAlter()
	{
		return alter;
	}

	public int getGehalt()
	{
		return gehalt;
	}
}