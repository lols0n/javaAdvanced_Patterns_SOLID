package com.company.innerClasses.localClasses;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class LocalClassTest {

    public static void main(String[] args) {

        class  LocalPerson {

            private String personName;

            public  LocalPerson(String personName) {
                this.personName = personName;
            }
            public String getPersonName() {
                return personName;
            }
        }
        LocalPerson person = new LocalPerson("Jan Kowalski");
        System.out.println(person.personName); //p. tabulator
    }
}
