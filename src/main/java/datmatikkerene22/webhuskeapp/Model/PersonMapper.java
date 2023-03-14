package datmatikkerene22.webhuskeapp.Model;

import datmatikkerene22.webhuskeapp.Controller.AppStart;
import datmatikkerene22.webhuskeapp.Controller.Entitet.Person;

import java.util.ArrayList;
import java.util.Map;

public class PersonMapper
{

    private static Map<String, Person> personMap = AppStart.getPersonMap();


    protected static Map<String, Person> getAllPerson() {

    return personMap;

    }

    public static Person copyPerson(Person person)
    {
        if(person == null)
        {
            return null;
        }
        ArrayList<String> strings = new ArrayList<>(person.getStringArrayList());
        return new Person(person.getNavn(),person.getKode(),strings);
    }


    public static Person getPerson(String navn)
    {
        return copyPerson(personMap.getOrDefault(navn,null));
    }

    public static String savePerson(Person person)
    {
        if(personMap.containsKey(person.getNavn()))
        {
            personMap.put(person.getNavn(),person);
            return "opdaterer "+ person.getNavn()+".";
        }
        return "gemmer "+person.getNavn();
    }
}
