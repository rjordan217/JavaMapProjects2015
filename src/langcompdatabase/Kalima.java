package langcompdatabase;

public class Kalima extends Dialect {
	private String english;
	private String anglicised;
	private String kilma;
	
	public Kalima() {
		super();
		english = "Default";
		anglicised = "ghiiaabii";
		kilma = "غيابي";
	}
	
	public Kalima(String dialect, String eng, String angcise, String kalim) {
		super(dialect);
		english = eng;
		anglicised = angcise;
		kilma = kalim;
	}
	
	public String getEnglish() {
		return english;
	}
	
	public String getAnglicised() {
		return anglicised;
	}
	
	public String getKilma() {
		return kilma;
	}
	
	public void setEnglish(String s) {
		english = s;
	}
	
	public void setAnglicised(String s) {
		anglicised = s;
	}
	
	public void setKilma(String s) {
		kilma = s;
	}
}
