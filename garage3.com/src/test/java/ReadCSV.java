import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

public class ReadCSV {
  
	@Test
    public void readsCSV() throws FileNotFoundException {		
		File csvFile = new File("/Users/jawuanlang/downloads/basses.csv");
			BufferedReader br = new BufferedReader(new FileReader(csvFile));
			String line = "";
			try {
				while ((line = br.readLine()) != null) {
					String[] count = line.split(",");
					System.out.println( count[0]+" "+count[1]);
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
}

