package com.company.javaAdvenced.reflections;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MainReflection {

    public static void main(String[] args) {


        try {
            Class<?> studentClass = Class.forName("com.company.javaAdvenced.reflections.Student");
            Method[] methods = studentClass.getDeclaredMethods();
            Method[] allMethods = studentClass.getMethods();

            Field[] fields = studentClass.getDeclaredFields();
            Field[] allFields = studentClass.getFields();

            System.out.println("-----Declared methods:-----");
            for (Method method : methods) {
                System.out.println(method);
            }

            //todo add stream for allMethods

            System.out.println("-----Declared allMethods:-----"); //petla for tez zadziala
            Arrays.stream(allMethods)
                    .forEach(System.out::println);

            System.out.println("-----Declared Fields:-----");
            for (Field field : fields) {
                System.out.println(field);
            }


            //todo add stream for allFields

            System.out.println("-----Declared allFields:-----");  //petla for tez zadziala
            Arrays.stream(allFields)
                    .forEach(System.out::println);

            //Creating object and setting it's fields
            Student student = (Student) studentClass.newInstance();

            Method setNameMethod = studentClass.getDeclaredMethod( "setName", String.class);
            Method getNameMethod = studentClass.getDeclaredMethod( "getName");

            setNameMethod.invoke(student, "Florian");
            System.out.println("-----Reflection call-----");
            System.out.println(getNameMethod.invoke(student));
            System.out.println("-----Traditional call-----");
            System.out.println(student.getName());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
