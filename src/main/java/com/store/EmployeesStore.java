package com.store;

import project.Employess;

public class EmployeesStore {
    private static Employess employess;

    public static void setEmployess(Employess emp){
        employess =emp;
    }

    public static Employess getEmployess(){
        return  employess;
    }
}
