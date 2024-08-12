package chat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {

	public static void main(String[] args) {

		Socket socket = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new Socket("localhost", 9999);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while (true) {
				
				System.out.println("보내기 >>");
				String outMsg = sc.nextLine();
				
				if (outMsg.equalsIgnoreCase("bye")) {
					out.write(outMsg + "\n");
					out.flush();
					break;
				}
				
				// 정상 메시지
				out.write(outMsg + "\n");
				out.flush();
				
				String inMsg = in.readLine();				
				System.out.println("서버 : " + inMsg);

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				sc.close();
				out.close();
				in.close();
				socket.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
