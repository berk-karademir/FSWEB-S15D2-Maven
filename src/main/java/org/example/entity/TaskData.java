package org.example.entity;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class TaskData {

    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;


    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    // return value is Set<Task>
    public Set<Task> getTasks(String name) {
        name = name.toLowerCase();
        switch (name) {
            case "ann":
                return this.annsTasks;
            case "bob":
                return this.bobsTasks;
            case "carol":
                return this.carolsTasks;
            case "all":
                return getUnion(annsTasks,bobsTasks,carolsTasks);
        }
        return new HashSet<>();
    }
// Union (birleşim) >>> Task setlerinden oluşan listeyi parametre olarak alır.
// return value is union of all sets

    public Set<Task> getUnion(Set<Task> ...sets) {
        HashSet<Task> union = new LinkedHashSet<>();
        for (Set<Task> taskSet: sets) {
            union.addAll(taskSet);
        }
        return union;
    }



// Intersection (kesişim) >> return value is intersection of set1 + set2

public Set<Task> getIntersection(Set<Task> set1, Set<Task> set2) {
        Set<Task> intersect = new HashSet<>(set1);
        intersect.retainAll(set2);
        return intersect;
}



//Difference (fark) >>> return value is diff of set2 from set1
    // set1'de olup set2'de olmayanlar
    public  Set<Task> getDifferences(Set<Task> set1, Set<Task> set2)  {
        Set<Task> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        return difference;

    }

}
