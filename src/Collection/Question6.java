package Collection;

import java.util.Scanner;

public class Question6 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        System.out.println(">Java chat Application");

        System.out.println("----------Options-----------------");
        int c = 0;
        while (c != 1) {
            System.out.println();
            System.out.println("A) Create the chatroom");
            System.out.println("B) Add the user");
            System.out.println("C) User login");
            System.out.println("D) Send a message");
            System.out.println("E) Display a message from a specific chatroom");
            System.out.println("F) List down the all the user belonged to a specific chatroom");
            System.out.println("G) Logout");
            System.out.println("H) Delete an user");
            System.out.println("I) Delete the chatroom");

            System.out.println("PLEASE ENTER YOUR OPTION :)   ");


            char ch = sc.next().charAt(0);
            ChatRoom cr = new ChatRoom();
            ChatRoom newchatroom = null;
            if (ch == 'A') {

                newchatroom = cr.chatroom();

            } else if (ch == 'B') {


                ChatRoom.addUser(newchatroom);

            } else if (ch == 'C') {
                ChatRoom.userLogin();

            } else if (ch == 'D') {
                ChatRoom.messages();

            } else if (ch == 'E') {
                ChatRoom.chatRoommsg(newchatroom);

            } else if (ch == 'F') {
                ChatRoom.listOfUser();

            } else if (ch == 'G') {
                ChatRoom.logout();

            } else if (ch == 'H') {
                ChatRoom.delete(newchatroom);

            } else if (ch == 'I') {


                ChatRoom.deleteChatRoom(newchatroom);

            } else {
                System.out.println("Enter the correct option");
            }


            System.out.println("To continue press Any number to exit press 1");
            c = sc.nextInt();
        }
    }
}

