package com.train.service.impl;

import com.train.dao.StudentInfoDao;
import com.train.pojo.StudentInfo;
import com.train.service.StudentInfoManagement;

import java.util.List;

public class StudentInfoManagementImpl implements StudentInfoManagement {

    private StudentInfoDao dao = StudentInfoDao.getDaoObj();

    private StudentInfoManagementImpl() {}

    private static StudentInfoManagementImpl management;

    public static StudentInfoManagementImpl getManagementObj() {
        if (management == null) {
            management = new StudentInfoManagementImpl();
        }
        return management;
    }

    @Override
    public List<StudentInfo> getAllStudentInfo() {
        return dao.queryAllStudentInfo();
    }

}
