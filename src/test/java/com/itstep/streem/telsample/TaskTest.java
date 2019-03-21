package com.itstep.streem.telsample;

import com.itsrep.streem.telsample.Task;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class TaskTest {

    Task taskTest= new Task ("task1","streem","hight","Ivanov",10);


    @Test
    public void getDataTest(){

        taskTest.setDateOfExpiration(taskTest.getData(2019,1,12));
        taskTest.setDateOfCreation(taskTest.getData(2018,1,12));

        Assert.assertTrue(taskTest!=null);

        Assert.assertTrue(taskTest.getHeadline()=="task1");

        System.out.println( taskTest.getDateOfCreation().toString());
        System.out.print( taskTest.getDateOfExpiration().toString());
    }


}
