

import Classes.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;


public class Main {
    public static void main(String[] args) {

        EtudiantMangement management = new EtudiantMangement();
        Etudiant e1 = new Etudiant(1, "Janet Jackson", 16);
        Etudiant e2 = new Etudiant(3, "Eliott brown", 17);

        List<Etudiant> listEtudiants = new ArrayList();
        listEtudiants.add(e1);
        listEtudiants.add(e2);

        management.displayStudents(listEtudiants, System.out::println);

        System.out.println("---------------------------");
        management.displayStudentsByFilter(listEtudiants, e -> e.getAge() > 15, System.out::println);
        System.out.println("---------------------------");
        System.out.println(management.returnStudentsNames(listEtudiants, e -> e.getNom()));

        System.out.println("---------------------------");
        Supplier<Etudiant> etudiantSupplier = () -> new Etudiant(2,"Eli olsen", 15);
        Etudiant e3 = management.createStudent(etudiantSupplier);
        listEtudiants.add(e3);
        management.displayStudents(listEtudiants, System.out::println);
        System.out.println("---------------------------");
        Comparator<Etudiant> studentIdCompartor = (etudiant1, etudiant2) -> Integer.compare(etudiant1.getId(), etudiant2.getId());
        management.sortStudentsById(listEtudiants, studentIdCompartor);
        System.out.println("Sorted students by ID:");
        for (Etudiant student : listEtudiants) {
            System.out.println(student);
        }

    }
}