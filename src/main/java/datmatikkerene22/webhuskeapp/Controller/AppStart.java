package datmatikkerene22.webhuskeapp.Controller;

import datmatikkerene22.webhuskeapp.Controller.Entitet.Person;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.*;

public class AppStart implements ServletContextListener
{
    private static Map<String, Person> personMap;

    @Override
    public void contextInitialized(ServletContextEvent sce)
    {
//        ServletContextListener.super.contextInitialized(sce);


        List<Person> personList = new ArrayList<>();

        Person person = new Person("nik", "1", "bamse, is, pude");
        Person person1 = new Person("Daniel", "1", "bamse, is, pude");
        Person person2 = new Person("Tobias", "1", "øl, pløkker, pude");
        Person person3 = new Person("signe", "1", "vand, is, gril");

        personList.add(person);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);


        personMap = new TreeMap<>();

        for (Person element : personList) {

            personMap.put(element.getNavn(), element);
        }




    }

    public static Map<String , Person> getPersonMap() {

        return personMap;

    }


    @Override
    public void contextDestroyed(ServletContextEvent sce)
    {
        ServletContextListener.super.contextDestroyed(sce);
    }
}
