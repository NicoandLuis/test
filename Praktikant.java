public class Praktikant extends Angestellter
{

	public Praktikant(String vorname, String nachname, int alter)
	{
		super(vorname, nachname, alter, 400);
	}

	public void addGehalt(int erhöhung)
	{
		System.out.println("Du kannst das Gehalt eines Praktikanten nicht erhöhen.");
	}
}