package chap17;

public class Main688 {

	public static void main(String[] args) {
		String filename = "santa.mmm";
		try {
			if (! filename.endsWith(filename)) {
			throw new UnsuportedMusicFileException("未対応のファイルです");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
