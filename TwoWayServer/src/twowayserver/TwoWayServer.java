
package twowayserver;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TwoWayServer
{


    public static void main(String[] args)
    {
        try
        {
            ServerSocket ss = new ServerSocket(3333);
            System.out.println("Server Started...");
            Socket socket = ss.accept();
            DataInputStream din = new DataInputStream(
                                    socket.getInputStream());
            DataOutputStream dout = new DataOutputStream(
                                    socket.getOutputStream());
            BufferedReader br = new BufferedReader(
                                    new InputStreamReader(
                                            System.in));
            String str="",str2="";
            
            while(!str.equals("stop"))
            {
                str = din.readUTF();
                System.out.println("client says:" + str);
                str2 = br.readLine();
                dout.writeUTF(str2);
                dout.flush();
            }
            din.close();
            socket.close();
            ss.close();
            
        }
        catch (IOException ex)
        {
            Logger.getLogger(TwoWayServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
