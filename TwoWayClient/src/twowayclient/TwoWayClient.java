
package twowayclient;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


public class TwoWayClient
{


    public static void main(String[] args) throws IOException
    {
       Socket socket = new Socket("localhost", 3333);
       DataInputStream din = new DataInputStream(
                              socket.getInputStream()  );
       DataOutputStream dout = new DataOutputStream(
                                socket.getOutputStream());
       BufferedReader br = new BufferedReader(
                                new InputStreamReader(
                                        System.in));
       String str="",str2 = "";
       while( !str.equals("stop"))
       {
           str = br.readLine();
           dout.writeUTF(str);
           dout.flush();
           str2 = din.readUTF();
           System.out.println("Server says: " + str2);
       }
    }
    
}
