package Project.Client;
import Project.data.Packet;
import Project.data.User;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientSocket {
    private Socket socket = null;
    private ObjectOutputStream oos = null;
    private ObjectInputStream ois = null;

    public ClientSocket(){
        try{
            socket = new Socket("localhost", 2001);
            oos = new ObjectOutputStream(socket.getOutputStream());
            ois = new ObjectInputStream(socket.getInputStream());
        }
        catch(Exception e){e.printStackTrace();}
    }
    public void disconnect(){
        try{
            oos.close();
            ois.close();
            socket.close();
        }
        catch(Exception e){e.printStackTrace();}
    }

    public boolean toRegister(User user){
        String code = "";

        try{
            Packet packet = new Packet("REG", user);
            oos.writeObject(packet);

            Packet answerPacket = (Packet)ois.readObject();
            code = answerPacket.getCode();
        }
        catch(Exception e){e.printStackTrace();}

        if(code.equals("SUCCESS"))
            return true;

        return false;
    }
    public User toLogin(User user){
        User authUser = null;
        try{
            Packet packet = new Packet("LOGIN", user);
            oos.writeObject(packet);

            Packet answerPacket = (Packet)ois.readObject();
            authUser = (User)answerPacket.getData();
        }
        catch(Exception e){e.printStackTrace();}

        return authUser;
    }
}