package URLParser;

import java.util.Scanner;

public class URLParser {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();

        String protocol = "";
        String server = "";
        String resource = "";
        int serverIndex = 0;

        String inputRightPart = input;
        int protocolSymbol = input.indexOf("://");
        if (protocolSymbol >= 0) {
            protocol = input.substring(0, protocolSymbol);
            serverIndex = protocolSymbol + 3;
            inputRightPart = input.substring(serverIndex, input.length());
        }

        int serverSymbol = inputRightPart.indexOf("/");
        if (serverSymbol >= 0) {
                server = inputRightPart.substring(0, serverSymbol);
                int resourceIndex = serverSymbol + 1;
                resource = inputRightPart.substring(resourceIndex, inputRightPart.length());
        } else if (serverSymbol < 0 && inputRightPart.length() > 0) {
            server = inputRightPart;
        }

        System.out.printf("[protocol] = \"%s\"%n", protocol);
        System.out.printf("[server] = \"%s\"%n", server);
        System.out.printf("[resource] = \"%s\"%n", resource);
    }
}