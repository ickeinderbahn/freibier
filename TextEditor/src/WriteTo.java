import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class WriteTo {
	
	public static void main(String[] args) {
		
	Writer fw = null;

	try
	{
	  fw = new FileWriter( "fileWriter.txt" );
	  fw.write( "das ist der Text, der ins File geschrieben werden soll." );
	  fw.append( System.getProperty("line.separator") );
	  fw.write( "und noch eine Zeile ... Dave!." );
	}
	catch ( IOException e ) {
	  System.err.println( "Konnte Datei nicht erstellen" );
	}
	finally {
	  if ( fw != null )
	    try { fw.close(); } catch ( IOException e ) { e.printStackTrace(); }
	}

}
}