package chap15.time;

public class Ex15_2 {

	public static void main(String[] args) {
		String folder = "C:\\javadev\\";
		String file = "readme.txt";
		String path = renketsu(folder, file);
		System.out.println(path);

	}
	
	public static String renketsu(String folder, String file) {
		if (!folder.endsWith("\\")) {
			folder = folder + "\\";
		}
		return folder + file;
	}
	

}