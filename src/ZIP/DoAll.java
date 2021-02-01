package ZIP;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.Scanner;

public class DoAll {

	public static void main(String args[]) throws java.io.IOException, ParseException {

		System.out.println("Enter path of file");
		Scanner sc = new Scanner(System.in);
		String param = sc.nextLine();
		param = param.replace("\\", "\\\\");

		System.out.println(param);
		Path file = Paths.get(param);

		String name = file.getFileName().toString();
		System.out.println(name);
		String[] names = name.split("_");

		String uUID = names[0];
		String macID = names[1];
		String DOP = names[2];

		System.out.println("UUID is: " + uUID + "\n" + "MACID is: " + macID + "\n" + "DOP is: " + DOP);

		MultiplyRenameAndZip obj = new MultiplyRenameAndZip();
		obj.replicateFile(names, name);
	}

}
