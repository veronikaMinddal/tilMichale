package datmatikkerene22.webhuskeapp.Model;

import datmatikkerene22.webhuskeapp.Controller.AppStart;
import datmatikkerene22.webhuskeapp.Controller.Entitet.Person;

import java.util.Map;

public class PersonMapper
{



    protected static Map<String, Person> getAllPerson() {

    return AppStart.getPersonMap();




    }


}
