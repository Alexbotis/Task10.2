package com.itsrep.streem.telsample;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaskList implements Serializable {

    private List<Task> ListTask = new ArrayList<Task>();

    public List<Task> getListTask() {
        return ListTask;
    }

    public void setListTask(List<Task> listTask) {
      this.ListTask = listTask;
    }

    public void addTask(Task task)  throws UserAlreadyExistsException {
// добавить
              if (ListTask.contains(task)) {
            throw new UserAlreadyExistsException();
        }
        ListTask.add(task);
    }

    public  void writeListTask(List<Task> taskList, String fileName) {
// пишем список задач  в файл
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(new File(fileName));
            //fos= new FileOutputStream(fileName);

            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(taskList);
            fos.close();
        } catch (IOException ex) {
            System.err.println("Input/Output error");
            ex.printStackTrace();
        } finally {
            try {
                fos.close();

            } catch (IOException ex) {

                ex.printStackTrace();
            }
        }

    }


    public  void readTaskList(String fileName) {
// читаем список  с файла
        FileInputStream fis = null;
        List<Task> taskList  = null;
        try {

            fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            taskList = (List<Task>) ois.readObject();
            fis.close();
            System.out.print(taskList.toString());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            System.err.println("Input/Output error");
            ex.printStackTrace();
        } finally {
            try {
                fis.close();

            } catch (IOException ex) {

                ex.printStackTrace();
            }
        }


    }

    public List<Task>  readTaskListOn(String fileName) {
// читаем список  с файла
        FileInputStream fis = null;
        List<Task> taskList  = null;
        try {

            fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            taskList = (List<Task>) ois.readObject();
            fis.close();
            System.out.print(taskList.toString());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            System.err.println("Input/Output error");
            ex.printStackTrace();
        } finally {
            try {
                fis.close();

            } catch (IOException ex) {

                ex.printStackTrace();
            }
        }
return taskList;

    }




}
