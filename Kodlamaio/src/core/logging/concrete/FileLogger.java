package core.logging.concrete;

import core.logging.Abstract.Logger;

public class FileLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Dosyaya loglandı." + data);
		
	}

}
