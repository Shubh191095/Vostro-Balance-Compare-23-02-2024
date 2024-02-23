package BasicProgram;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CreateFile {

public static void main(String[] args) throws IOException {
Properties properties = new Properties();
		
		properties.setProperty("web_URL", "http://10.180.184.30:8080/grs-web/#/login");
		
		String filepath = System.getProperty("user.dir")+"\\properties\\name.properties";
		
		FileOutputStream file= new FileOutputStream(filepath);
		
		properties.store(file, "sample data");
		file.close();

	}

}
