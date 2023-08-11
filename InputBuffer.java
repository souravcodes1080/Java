import java.io.*;
class InputBuffer{
	public static void main(String args[]) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int x = Integer.parseInt(br.readLine());
		System.out.println(x);
	}
}
