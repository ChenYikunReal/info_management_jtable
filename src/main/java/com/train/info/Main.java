package com.train.info;

import com.train.info.view.StudentInfoTable;

import java.awt.*;

public class Main {

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new StudentInfoTable();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
