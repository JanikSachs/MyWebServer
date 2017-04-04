import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;

public class Main {
    public static void main(String args[]) throws Exception{
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/static", new StaticFileServer());
        server.createContext("/myStyle.css", new StaticFileServer());
        server.start();
    }
}
