package langcompdatabase;

public class Dialect {
	private String dlct;
	
	public Dialect() {
		dlct = "MSA";
	}
	
	public Dialect(String version) {
		dlct = version;
	}
	
	public String getDialect() {
		return dlct;
	}
	
	public void setDialect(String s) {
		dlct = s;
	}
}
