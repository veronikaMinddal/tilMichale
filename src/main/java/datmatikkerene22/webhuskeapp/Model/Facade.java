package datmatikkerene22.webhuskeapp.Model;

import datmatikkerene22.webhuskeapp.Controller.Entitet.Person;

import java.util.Map;

public class Facade
{
    public static Map<String, Person> getAllperson()
    {
        return PersonMapper.getAllPerson();
    }

    public static Person getPerson(String navn)
    {
        return PersonMapper.getPerson(navn);
    }

    public static String savePerson(Person person)
    {
        return PersonMapper.savePerson(person);
    }
}
