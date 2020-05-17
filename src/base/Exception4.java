package base;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exception4 {
	public static void main(String[] args) {
		try {
			try {
				run();
			} catch (ParseException | IOException e ) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	public static void run() throws IOException, FileNotFoundException, ParseException {

	}

}
