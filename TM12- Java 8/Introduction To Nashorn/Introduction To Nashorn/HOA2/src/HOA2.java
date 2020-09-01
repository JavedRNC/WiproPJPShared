import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class HOA2 {
	public static void main(String[] args) throws FileNotFoundException, ScriptException, NoSuchMethodException {

		ScriptEngineManager sem = new ScriptEngineManager();
		ScriptEngine sm = sem.getEngineByName("nashorn");
		FileReader fileReader = new FileReader("D:\\SpaceUse\\testDirEclipse\\HOA2\\src\\demo.js");
		sm.eval(fileReader);
		Invocable invocable = (Invocable) sm;
		System.out.println(invocable.invokeFunction("isPrimeNumber", "19"));
	}
}
