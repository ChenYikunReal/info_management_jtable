package com.train.info.controller;

import com.train.info.pojo.StudentInfo;
import com.train.info.service.StudentInfoManagement;
import com.train.info.service.impl.StudentInfoManagementImpl;

import java.util.List;

public class StudentInfoController {

    private StudentInfoManagement management = StudentInfoManagementImpl.getManagementObj();

    private static StudentInfoController controller;

    private StudentInfoController() {}

    public static StudentInfoController getController() {
        if (controller == null) {
            controller = new StudentInfoController();
        }
        return controller;
    }

    public Object[][] getAllStudentInfo() {
        List<StudentInfo> list = management.getAllStudentInfo();
        int length = list.size();
        Object[][] data = new Object[length][6];
        for (int i = 0; i < length; i++) {
            StudentInfo info = list.get(i);
            data[i][0] = info.getId();
            data[i][1] = info.getName();
            data[i][2] = info.getAge();
            data[i][3] = info.getBirthday();
            data[i][4] = info.getEmail();
            data[i][5] = info.getCountry();
        }
        return data;
    }

}
