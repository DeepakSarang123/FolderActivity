package ZIP;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class ContentsCopy {

	public void create(String repFileName) {

		String source = "C:\\Users\\DEEPAK\\Documents\\Files to be converted\\Source\\dc26959e49007f1a6b86d2fa34517383ee769e29_macB827EBF55071_dat2020-10-27-10-56-23_boxrpi_modARMv7Processorrev4(v7l)_34fc5249-3c9c-4283-9928888e-75331231.dmp";
		File srcDir = new File(source);

		String destination = "C:\\Users\\DEEPAK\\Documents\\Files to be converted\\Destination\\" + repFileName;
		File destDir = new File(destination);

		try {
			FileUtils.copyDirectory(srcDir, destDir);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
