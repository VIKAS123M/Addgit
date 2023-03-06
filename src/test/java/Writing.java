import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Writing {
	public static void main(String[] args) throws IOException {
	OutputStream output = new FileOutputStream("config.properties");
	Properties prop = new Properties();
	
	prop.setProperty("DB.User", "New");
	prop.setProperty("DB.url", "localhost");
	prop.setProperty("DB.password", "Password");
	
	prop.store(output, null);
	
	InputStream input = new FileInputStream("config.properties");
	prop.load(input);
	System.out.println(prop.getProperty("DB.User"));
	System.out.println(prop.getProperty("DB.url"));
}
}
