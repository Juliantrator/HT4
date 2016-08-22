import java.io.FileNotFoundException;

/**
 * @author Isaac Rodriguez 
 *
 */
import java.io.FileNotFoundException;

public interface ADTCalculadora<P> {
	public void readFile(String file) throws FileNotFoundException, Exception;
	public double calcular() throw Exception;
	
	
}
