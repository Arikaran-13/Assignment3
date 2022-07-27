package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ChatRoom {
    static ArrayList<ChatRoom> al = new ArrayList<>();
    static ArrayList<String> displaymsg = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    private static String name;

    public static void addUser(ChatRoom chat) {
        al.add(chat);
        System.out.println("User added to the chat room successfully");
    }

    public static void userLogin() throws InterruptedException {
        System.out.println("--------login_details: ----------");
        System.out.println("Enter your name : ");
        String n = sc.nextLine();
        name = n;

        System.out.println("Enter your mailid: ");
        String mail = sc.nextLine();
        System.out.println("Enter your password: ");
        String pass = sc.nextLine();

        System.out.println("Checking credentials....");
        Thread.sleep(2000);
        System.out.println("Loged in successfully");
    }

    public static void messages() {
        System.out.println("Please enter your message and hit enter");
        String msg = sc.nextLine();
        displaymsg.add(msg);
        System.out.println("sent :) ");
    }

    public static void chatRoommsg(ChatRoom cr) {
        System.out.println("displaying all message from the given chatroom: ");
        System.out.println(displaymsg);
    }

    public static void listOfUser() {
        if (al == null) {
            System.out.println("Chatroom no longer exist");
        }
        System.out.println("List of Users : ");
        System.out.println(al);
    }

    public static void logout() {
        System.out.println("Loged out sucessfully");
    }

    public static void delete(ChatRoom r) {
        System.out.println("Deleted the user successfully : " + r);
        al.remove(r);
    }

    public static void deleteChatRoom(ChatRoom r) {
        System.out.println("Succesfully deleted the chatroom");
        al = null;
        displaymsg = null;
        r = null;

    }

    @Override
    public String toString() {
        return "ChatRoom{" + "name=" + name + '}';
    }

    public ChatRoom chatroom() {
        ChatRoom cr = new ChatRoom();
        System.out.println("ChatRoom created Succeefully");
        return cr;
    }
}
