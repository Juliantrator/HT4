
import java.io.FileNotFoundException;

/**
 * Universidad del Valle de Guatemala
 * 22-08-16
 * @author Isaac Rodriguez 
 *@author Julian Lopez
 */
import java.io.FileNotFoundException;

public interface ADTCalculadora<P> {
	public void readFile(String file) throws FileNotFoundException, Exception;
	public double calcular() throws Exception;
	
	
}
