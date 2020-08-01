package com.company.solid.dip.fix;

public class FixedTest {

    public static void main(String[] args) {

        Repository repository = new FileRepository();
        TaskService service = new TaskService(repository);

        service.addTask("SampleFile.txt");
        service.removeTask("OtherFile.txt");

        //======================================

        repository = new DatabaseRepository();
        service = new TaskService(repository);

        service.addTask("Customers");
        service.removeTask("Cars");

        //======================================

        Repository dbRepository = new DatabaseRepository();
        TaskService forDbService = new TaskService(dbRepository);

        forDbService.addTask("Customers");
        forDbService.removeTask("Cars");
    }
}
