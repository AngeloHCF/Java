package server;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Main {
  public static void main(String[] args) throws IOException {
    // Create the server on port 8080
    HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

    // map the root URL "/" to a handler
    server.createContext("/", new HelloHandler());

    // set the default executor (null means use the current thread)
    server.setExecutor(null);

    // start the server
    server.start();
    System.out.println("server started on http://localhost:8080");
  }

  // define what happens when someone visits the URL
  static class HelloHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
      String response = "Hello, World! This is a basic Java Server.";
      // send HTTP 200 ok and the length of the response
      exchange.sendResponseHeaders(200, response.length());

      // write the response message to the output stream
      OutputStream os = exchange.getResponseBody();
      os.write(response.getBytes());
      os.close();
    }
  }
}{

}
