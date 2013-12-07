import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class ReverseWords {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cases;
		try {
			cases = Integer.parseInt(br.readLine());
			for (int i = 0; i < cases; i++){
				System.out.println("Case #" + (i+1) + ": " + reverse(br.readLine()));
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static String reverse(String str){
		String[] reStr = str.split(" ");
		String returnStr = "";
		for (int i = reStr.length - 1; i >= 0; i--){
			returnStr += reStr[i] + " ";
		}
		return returnStr;
	}
}
