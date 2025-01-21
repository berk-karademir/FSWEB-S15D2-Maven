package org.example;

import org.example.entity.Priority;
import org.example.entity.Status;
import org.example.entity.Task;
import org.example.entity.TaskData;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

//        Task task9 = new Task("proje  adı","desc","Ali",Status.ASSIGNED,Priority.HIGH);
//        System.out.println(task9);
//        Task task8 = new Task("proje  adı","desc","Ali",Status.ASSIGNED,Priority.HIGH);
//
//        Task task7 = new Task("proje  adı","desc","Ali",Status.ASSIGNED,Priority.HIGH);
//
//        Task task6 = new Task("proje  adı","desc","Ali",Status.ASSIGNED,Priority.HIGH);
//
//
//
//
//        System.out.println("-----------***    ANN     ***-----------");
//
//        Set<Task> annsTasks = new HashSet<>();
//        Task annsTask1 = new Task("OOP Project","JAVA - OOP Practice","Ann", Status.IN_PROGRESS, Priority.MED);
//        Task annsTask2 = new Task("Front-End Project","React JS Project","Ann", Status.IN_QUEUE, Priority.LOW);
//
//        annsTasks.add(annsTask1);
//        annsTasks.add(annsTask2);
//        System.out.println("-----------***    BOB     ***-----------");
//
//        Set<Task> bobsTasks = new HashSet<>();
//        Task bobsTask1 = new Task("OOP Project","JAVA - OOP Practice","Bob", Status.IN_PROGRESS, Priority.MED);
//        Task bobsTask2 = new Task("Front-End Project","React JS Project","Bob", Status.IN_QUEUE, Priority.LOW);
//
//        bobsTasks.add(bobsTask1);
//        bobsTasks.add(bobsTask2);
//
//
//
//
//        System.out.println("-----------***    CAROL     ***-----------");
//        Set<Task> carolsTasks = new HashSet<>();
//        Task carolsTask1 = new Task("OOP Project","JAVA - OOP Practice","Carol", Status.IN_PROGRESS, Priority.MED);
//        Task carolsTask2 = new Task("Front-End Project","React JS Project","Carol", Status.IN_QUEUE, Priority.LOW);
//
//        carolsTasks.add(carolsTask1);
//        carolsTasks.add(carolsTask2);
//        System.out.println("-----------***    UNASSIGNED     ***-----------");
//
//        Set<Task> unassignedTasks = new HashSet<>();
//        Task unassignedTask = new Task("JS Project","JS Practice",null, Status.IN_PROGRESS, Priority.MED);
//        unassignedTasks.add(unassignedTask);
//
//        TaskData taskData = new TaskData(annsTasks, bobsTasks, carolsTasks, unassignedTasks);
//
//        System.out.println(taskData.getTasks("Ann"));
//        System.out.println(taskData.getTasks("Bob"));
//        System.out.println(taskData.getTasks("Carol"));
//        System.out.println("HER BİR ÇALIŞANIN ÜZERİNDEKİ UNIQUE OLMAYAN TASKLAR" + taskData.getTasks("all"));
//
//
//        System.out.println("Herhangi bir çalışana atanmamış task:" + taskData.getDifferences(unassignedTasks, taskData.getTasks("ann")));
//
//        System.out.println("BİRDEN FAZLA ÇALIŞANA ATANMIŞ OLAN TASK VARMI ? (KESİŞİM) ");
//        System.out.println("------------- KESİŞİM 1-------------------");
//        System.out.println(taskData.getIntersection(annsTasks,bobsTasks));
//        System.out.println("------------- KESİŞİM 2 -------------------");
//        System.out.println(taskData.getIntersection(annsTasks,carolsTasks));
//        System.out.println("-------------KESİŞİM 3-------------------");
//        System.out.println(taskData.getIntersection(bobsTasks,carolsTasks));


        Task task1 = new Task("PROJE1", "DESC1","John", Status.ASSIGNED, Priority.MED);
        Task task2 = new Task("PROJE1", "DESC1","Osman", Status.IN_QUEUE, Priority.LOW);
        Task task3 = new Task("PROJE3", "DESC1","ASSIGNEE1", Status.ASSIGNED, Priority.MED);
        Task task4 = new Task("PROJE1", "DESC4","ASSIGNEE1", Status.ASSIGNED, Priority.MED);
        Task task5 = new Task("PROJE5", "DESC1","ASSIGNEE1", Status.ASSIGNED, Priority.MED);

        /*"Task classındaki equals metodunda equality, constructordaki project ve description fieldlarının unique olup olmamasına
         göre değişiyor. YANİ: project ve description fieldları birebir aynı set edilmişse(eqaulsı buna göre ezdik)
         ise diğer fieldlara bakılmaksızın, bu objeler duplicate sayılır, yani unique değillerdir.    */


        // task 1 ve task 2 nin project ve description fieldları aynı set edildi. Kalan diğer fieldlar farklı set edildi.
        // task1 unique değildir, duplicatedir!
        System.out.println("Task classından oluşturulan objeler(tasklar) eşitmi diye bakıyoruz:");

        System.out.println(task1.equals(task2)); // equals ✓ true

        // task1 ve task3'ün project fieldları farklı descriptionları aynı, unique sayılır, duplicate değil!
        System.out.println(task1.equals(task3)); // equals x false

        // task1 ve task4'ün project fieldları aynı descriptionları farklı, unique sayılır, duplicate değil!
        System.out.println(task1.equals(task4)); // equals x false

        //sonuç olarak equalsta, unique'liği hangi fielda göre belirlersek ona göre data tutabiliriz.


        //Task data, yukardaki tasklara dokunmadım isme göre task vericem.
        Task annsTask1 = new Task("JS PROJECT","JS PRACTISE","ANN", Status.IN_PROGRESS, Priority.HIGH);
        Task annsTask1Duplicate = new Task("JS PROJECT","JS PRACTISE","ANN", Status.IN_PROGRESS, Priority.HIGH);
        Task annsTask2 = new Task("JQUERY PROJECT","JQUERY PRACTISE","ANN", Status.ASSIGNED, Priority.LOW);
        Task bobsTask = new Task("REACT PROJECT","REACT PRACTISE","BOB", Status.IN_PROGRESS, Priority.HIGH);
        Task carolsTask = new Task("ECOMM PROJECT","ECOMM PRACTISE","CAROL", Status.IN_PROGRESS, Priority.HIGH);
        Task carolsTask2 = new Task("EXAMPLE","EXAMPLE PRACTISE","CAROL", Status.IN_PROGRESS, Priority.HIGH);
        Task unassignedTask1 = new Task("FS PROJECT","FS PRACTISE","ATANMAMIŞ", Status.IN_PROGRESS, Priority.LOW);
        Task unassignedTask1Dup = new Task("FS PROJECT","FS PRACTISE","ATANMAMIŞ", Status.IN_PROGRESS, Priority.HIGH);
        Task unassignedTask2 = new Task("FS++ PROJECT","FS PRACTISE","ATANMAMIŞ", Status.IN_PROGRESS, Priority.HIGH);

        Set<Task> annsTasks = new HashSet<>();
        System.out.println("------------------    ANN     ----------------------");
        System.out.println("annsTask1, Ann'a eklendi mi ? " + annsTasks.add(annsTask1));
        System.out.println("annsTask1Duplicate, Ann'a eklendi mi ?  " + annsTasks.add(annsTask1Duplicate));
        System.out.println("Ann'ın tasklarına duplicate olanı eklememiş olmalı yani şuan Ann'ın bir taskı olmalı " + (annsTasks.size() == 1 ? "Doğru" : "Yanlıs"));
        System.out.println("annsTask2 Ann'a eklendi mi ? " + annsTasks.add(annsTask2));
        System.out.println("Şuan Ann'ın üstüne 2 task var doğru mu ? " + (annsTasks.size() == 2 ? "Doğru" : "Yanlıs"));


        Set<Task> bobsTasks = new HashSet<>();
        System.out.println("------------------    BOB     ----------------------");
        System.out.println("annsTask1 zaten Ann'da ekli iken Bob'a da eklenebildimi ? " + bobsTasks.add(annsTask1));
        System.out.println("Bob'a kendi taskı bobsTask da eklendi mi ? " + bobsTasks.add(bobsTask));
        System.out.println("Şuan Bob'un üstüne 2 task var doğru mu ? " + (bobsTasks.size() == 2 ? "Doğru" : "Yanlıs"));


        Set<Task> carolsTasks = new HashSet<>();
        System.out.println("------------------    CAROL     ----------------------");
        System.out.println("carolsTask, Carol'a eklendi. (Kendi taskı) " + carolsTasks.add(carolsTask));
        System.out.println("carolsTask2, Carol'a eklendi. (Kendi taskı) " + carolsTasks.add(carolsTask2));
        System.out.println("bobsTask zaten Bob'da ekli iken Coral'a da eklenebildimi ? " + carolsTasks.add(bobsTask));
        System.out.println("annsTask1 zaten hem Ann'da hem de Bob'da ekli iken, Carol'a da eklenebildimi ? " + carolsTasks.add(annsTask1));
        System.out.println("annsTask2, zaten Ann'da ekli iken Carol'a da eklenebildimi ? " + carolsTasks.add(annsTask2));
        System.out.println("Şuan Carol'un üstüne 4 task var doğru mu ? " + (carolsTasks.size() == 5 ? "Doğru:" : "Yanlıs:"));
        System.out.println("Bir task kendisinin 2 taskı + bobsTask + annsTask1 + annsTask2");


        Set<Task> unassignedTasks = new HashSet<>();
        System.out.println("------------  UNASSIGNED TASKLARIN unassignedTasks OBJESİNE ATANMASI ---------");
        System.out.println("unassignedTask1 atandı mı ? " + unassignedTasks.add(unassignedTask1));
        System.out.println("unassignedTask1Dup atandı mı ? " + unassignedTasks.add(unassignedTask1Dup));
        System.out.println("unassignedTask2 atandı mı ? " + unassignedTasks.add(unassignedTask2));

        TaskData taskData1 = new TaskData(annsTasks, bobsTasks, carolsTasks, unassignedTasks);
        System.out.println("------------   RESULTS AFTER ASSIGNMENTS   --------------");
        System.out.println("Ann'ın üstündeki tasklar : \n" + taskData1.getTasks("ann"));
        System.out.println("Bob'un üstündeki tasklar : \n" + taskData1.getTasks("bob"));
        System.out.println("Carol'ın üstündeki tasklar : \n" + taskData1.getTasks("carol"));

        // DİKKAT! "all" caseinde atanmamış taskları return etmiyor! sadece çalışanlara atanmış tasklar!
        // ```` return getUnion(annsTasks,bobsTasks,carolsTasks);
        System.out.println("Çalışanlara atanmış tüm tasklar: \n" + taskData1.getTasks("all"));

        System.out.println("ATANMAMIŞ TASKLAR " + unassignedTasks);
        System.out.println();



        System.out.println("---------   INTERSECTIONS   ---   KESİŞİMLER   -----------------");
        System.out.println("Hem Ann'a hem Bob'a atanmış ortak task sayısı: " + taskData1.getIntersection(annsTasks, bobsTasks).size() + "\n" + taskData1.getIntersection(annsTasks, bobsTasks));
        System.out.println("Hem Ann'a hem Carol'a atanmış ortak task sayısı: " + taskData1.getIntersection(annsTasks, carolsTasks).size() + "\n"  + taskData1.getIntersection(annsTasks, carolsTasks));
        System.out.println("Hem Bob'a hem Carol'a atanmış ortak task sayısı: " + taskData1.getIntersection(bobsTasks, carolsTasks).size() + "\n"  + taskData1.getIntersection(bobsTasks, carolsTasks));




        System.out.println("---------   UNIONS   ---   BİRLEŞİMLER   -----------------");
        System.out.println("Ann ve Bob'daki tasklarım tamamı: " + taskData1.getUnion(annsTasks, bobsTasks).size() + " unique task\n" + taskData1.getUnion(annsTasks, bobsTasks));
        System.out.println("Ann ve Carol'deki taskların tamamı:  " + taskData1.getUnion(annsTasks, carolsTasks).size() + " unique task\n" + taskData1.getUnion(annsTasks, carolsTasks));
        System.out.println("Bob ve Carol'deki taskların tamamı: " + taskData1.getUnion(bobsTasks, carolsTasks).size() + " unique task\n" + taskData1.getUnion(bobsTasks, carolsTasks));



        System.out.println("--------- DIFFERENCE   ---    FARKLAR   -----------------");
        System.out.println("Ann'da olup Bob'da olmayan " + taskData1.getDifferences(annsTasks, bobsTasks).size() + " unique task\n" + taskData1.getDifferences(annsTasks, bobsTasks));
        System.out.println("Ann'da olup Carol'de olmayan  " + taskData1.getDifferences(annsTasks, carolsTasks).size() + " unique task\n" + taskData1.getDifferences(annsTasks, carolsTasks));
        System.out.println("Bob'da olup Carol'de olmayan " + taskData1.getDifferences(bobsTasks, carolsTasks).size() + " unique task\n" + taskData1.getDifferences(bobsTasks, carolsTasks));
        System.out.println("Bob'da olup Ann'da olmayan " + taskData1.getDifferences(bobsTasks, annsTasks).size() + " unique task\n" + taskData1.getDifferences(bobsTasks, annsTasks));
        System.out.println("Carol'de olup Bob'da olmayan " + taskData1.getDifferences(carolsTasks, bobsTasks).size() + " unique task\n" + taskData1.getDifferences(carolsTasks, bobsTasks));
        System.out.println("Carol'de olup Ann'da olmayan " + taskData1.getDifferences(carolsTasks, annsTasks).size() + " unique task\n" + taskData1.getDifferences(carolsTasks, annsTasks));


    }
}