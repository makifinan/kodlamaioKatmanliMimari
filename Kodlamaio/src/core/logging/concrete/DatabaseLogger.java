package core.logging.concrete;

import core.logging.Abstract.Logger;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Veri tabanına loglandı." + data);
		
	}

}
