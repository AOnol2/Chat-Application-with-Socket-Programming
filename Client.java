import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345);
             Scanner in = new Scanner(socket.getInputStream());
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             Scanner consoleInput = new Scanner(System.in)) {

            new Thread(() -> {
                while (in.hasNextLine()) {
                    System.out.println("Server: " + in.nextLine());
                }
            }).start();

            while (true) {
                String message = consoleInput.nextLine();
                out.println(message);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
