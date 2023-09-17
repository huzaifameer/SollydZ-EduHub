package com.mystack.SollydZEduHub.db;

import com.mystack.SollydZEduHub.model.Program;
import com.mystack.SollydZEduHub.model.Student;
import com.mystack.SollydZEduHub.model.Teacher;
import com.mystack.SollydZEduHub.model.User;
import com.mystack.SollydZEduHub.util.security.PasswordManager;

import java.util.ArrayList;

public class Database {
    public static ArrayList<User> userTable
            = new ArrayList();
    public static ArrayList<Student> studentTable
            = new ArrayList();
    public static ArrayList<Teacher> teacherTable
            = new ArrayList();
    public static ArrayList<Program> programTable
            = new ArrayList();

    static {
        userTable.add(
                new User("Huzaifa","Ameer",
                        "h@gmail.com",
                        new PasswordManager().encrypt("1234"))
        );
    }

}
