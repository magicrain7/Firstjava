package com.yedam.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourceExample {
	public static void main(String[] args) {

		String paths = "src/com/yedam/exceptions/AccountExample.java";
		try (FileInputStream fis = new FileInputStream(paths)) {
			int readByte;
			while ((readByte = fis.read()) != -1) {
				System.out.write(readByte);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을수 없습니다.");
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없습니다.");
		}

	} // end of main()
}
