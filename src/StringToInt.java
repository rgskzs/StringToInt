package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class StringToInt {
	/**
	 * Iterate through each line of input.
	 */
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String line;

		//入力例 three;seven;eight;nine;two
		while ((line = in.readLine()) != null) {
			String[] lines = line.split(";");
			for(int i = 0; i < lines.length; i++) {
				switch (lines[i]) {
				case "one":
					System.out.print("1");
					break;
				case "two":
					System.out.print("2");
					break;
				case "three":
					System.out.print("3");
					break;
				case "for":
					System.out.print("4");
					break;
				case "five":
					System.out.print("5");
					break;
				case "six":
					System.out.print("6");
					break;
				case "seven":
					System.out.print("7");
					break;
				case "eight":
					System.out.print("8");
					break;
				case "nine":
					System.out.print("9");
					break;
				default:
					System.out.print("");
				}
			}
		}
	}
}
