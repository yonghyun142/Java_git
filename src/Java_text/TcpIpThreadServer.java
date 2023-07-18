package Java_text;

import java.io.*;
import java.net.*;
import java.lang.*;
import java.util.Scanner;


public class TcpIpThreadServer {


    public static void main(String[] args)  {
        //멤버
        ServerSocket serverSocket;
        Socket socket;
        String name;

        //대화에 사용할 유저명을 입력받는다.
        Scanner scanner = new Scanner(System.in);
        System.out.print("유저명을 입력해 주세요.");
        name= scanner.nextLine();

        try {
            //서버소켓을 생성하여 7777번 포트와 결합시킨다.
            serverSocket = new ServerSocket(7777);
            System.out.println("서버가 준비 되었습니다.");
            //클라이언트의 접속요구를 대기하고 받아들인다.
            socket = serverSocket.accept();

            //센더, 리시버 객체를 생성한다.
            Sender sender = new Sender(socket,name);
            Receive receive = new Receive(socket);

            sender.start();
            receive.start();
        }catch(IOException ie){
            ie.printStackTrace();
        }
    }
}

//아웃풋 스트림으로 송신을 컨트롤 하기 위한 클래스
class Sender extends Thread{
    //멤버
    Socket socket;
    String name;
    DataOutputStream dos;

    //생성자
    Sender(Socket socket, String name) {
        //socket과 name을 set한다.
        this.socket = socket;
        this.name = name;

        try {
            //소켓에서 아웃풋 스트림을 받아온다.
            this.dos = new DataOutputStream(socket.getOutputStream());
        }catch(IOException ie){
            ie.printStackTrace();
        }
    }

    @Override
    public void run(){
        Scanner scanner = new Scanner(System.in);
        //반복해서 스캐너를 입력받아 문자열 베이스의 출력 스트림을 적어넣는다.
        while (dos != null){
            try {
                String chat = name + " : ";
                chat += scanner.nextLine();
                dos.writeUTF(chat);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}

class Receive extends Thread{
    //멤버
    Socket socket;
    DataInputStream dis;

    //생성자
    Receive(Socket socket)  {
        //소켓을 Set한다.
        this.socket = socket;
        try{
            dis = new DataInputStream(socket.getInputStream());
        }catch(IOException ie){
            ie.printStackTrace();
        }
    }

    @Override
    public void run() {
        while(dis != null){
            try {
                System.out.println(dis.readUTF());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}