package langcompdatabase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BasicDatabase {
	// Will store database file
	// private File mainbase;
	
	// Reading and writing tools
	private FileReader read;
	private FileWriter write;
	private BufferedReader br;
	private BufferedWriter bw;
	
	// Stores strings of all recognized/supported dialects
	private List<String> recDialects;
	
	public BasicDatabase(String datdir) throws NullPointerException, FileNotFoundException, IOException {
		read = new FileReader(datdir);
		write = new FileWriter(datdir, true);
		br = new BufferedReader(read);
		bw = new BufferedWriter(write);
		String line = new String();
		recDialects = new ArrayList<String>();
		if((line = br.readLine()) != null) {
			String[] dlcts = line.split(",");
			for(String dlct : dlcts) {
				addDialect(dlct);
			}
		}
		else {
			recDialects.add("No dialects entered");
		}
		br.close();
		write.close();
		read.close();
	}
	
	public String[] getDialects() {
		// Convert list into string array so it may be returned
		String[] statdial = new String[recDialects.size()];
		int i = 0;
		for (String dial : recDialects) {
			statdial[i] = dial;
			i++;
		}
		return statdial;
	}
	
	public void addDialect(String s) {
		for (String dlct : recDialects) {
			if(s.equalsIgnoreCase(dlct)) {
				return;
			}
		}
		recDialects.add(s);
	}
}
