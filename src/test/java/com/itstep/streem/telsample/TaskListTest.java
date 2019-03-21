package com.itstep.streem.telsample;

import com.itsrep.streem.telsample.Task;
import com.itsrep.streem.telsample.TaskList;
import com.itsrep.streem.telsample.UserAlreadyExistsException;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TaskListTest {

    TaskList taskListTest= new TaskList();

    @Test
    public void addTaskTest()  throws UserAlreadyExistsException {

        Task taskTest= new Task ("task1","streem","hight","Ivanov",10);
        taskTest.setDateOfExpiration(taskTest.getData(2019,1,12));
        taskTest.setDateOfCreation(taskTest.getData(2018,1,12));
        taskListTest.addTask(taskTest);

        Assert.assertTrue(taskListTest.getListTask().contains(taskTest));

    }


    @Test
    public  void writeListTask() throws UserAlreadyExistsException {

        Task taskTest= new Task ("task1","streem","hight","Ivanov",10);
        taskTest.setDateOfExpiration(taskTest.getData(2019,1,12));
        taskTest.setDateOfCreation(taskTest.getData(2018,1,12));

        Task taskTest2= new Task ("task2","streem","hight","Sidorow",8);
        taskTest.setDateOfExpiration(taskTest.getData(2019,2,2));
        taskTest.setDateOfCreation(taskTest.getData(2018,1,12));

        taskListTest.addTask(taskTest);

        taskListTest.addTask(taskTest2);
        taskListTest.writeListTask( taskListTest.getListTask(),"listtask.txt");

    }


    @Test
    public  void readTaskListTest() throws UserAlreadyExistsException{

        Task taskTest= new Task ("task1","streem","hight","Ivanov",10);
        taskTest.setDateOfExpiration(taskTest.getData(2019,1,12));
        taskTest.setDateOfCreation(taskTest.getData(2018,1,12));

        Task taskTest2= new Task ("task2","streem","hight","Sidorow",8);
        taskTest.setDateOfExpiration(taskTest.getData(2019,2,2));
        taskTest.setDateOfCreation(taskTest.getData(2018,1,12));

        taskListTest.addTask(taskTest);

        taskListTest.addTask(taskTest2);
        taskListTest.writeListTask( taskListTest.getListTask(),"listtask.txt");

        taskListTest.readTaskListOn("listtask.txt");
        Assert.assertTrue(taskListTest.readTaskListOn("listtask.txt").size()==2);
        Assert.assertTrue ( taskListTest.readTaskListOn("listtask.txt").get(0).getHeadline().equals("task1"));
        Assert.assertTrue( taskListTest.readTaskListOn("listtask.txt").get(1).getHeadline().equals("task2"));


    }
}
