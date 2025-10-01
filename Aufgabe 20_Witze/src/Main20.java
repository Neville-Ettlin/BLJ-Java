
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        URL url = new URL("https://witzapi.de/api/joke/");
        InputStream input = url.openStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        String jsonData = reader.readLine();


        Object obj = JSONValue.parse(jsonData);
        JSONArray array = (JSONArray)obj;

        JSONObject obj2 = (JSONObject)array.getFirst();
        System.out.println(obj2.get("text"));

        System.out.println("\nNächsten Witz holen? j/n");
        String eingabe = scanner.nextLine();
        if (eingabe.equals("j")) {
            main(args);
            System.out.println(" ");
        }
    }
}