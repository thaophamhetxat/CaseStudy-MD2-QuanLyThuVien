package com.codegym;


import java.io.*;
import java.util.ArrayList;

public class ManagerUserPerson {
    static ArrayList<UserPerson> listUser = new ArrayList<>();

    public static void writeFileUser() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("user.csv");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(listUser);
    }

    public static void readFileUser() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("user.csv");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        listUser = (ArrayList<UserPerson>) objectInputStream.readObject();

    }

    public static void removeUser(String nameUser) throws IOException, ClassNotFoundException {
        readFileUser();
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUserName().equals(nameUser)) {
                listUser.remove(i);
            }
        }
        writeFileUser();
    }
}
