package com.javapro.lesson1.task32;

import com.google.gson.*;

import java.io.*;

/**
 * Created by smith on 10.12.16.
 */
public class GSONParser {
    public static void main(String[] args) throws IOException {

        JsonElement jsonElement = new JsonParser().parse(
                readFile("/media/smith/FC8C6E888C6E3D70/Java-projects/Learning/src/com/javapro/lesson1/GSON/json.txt"));

        Gson gson = new GsonBuilder().create();
        Person person = (Person) gson.fromJson(jsonElement, Person.class);

        System.out.println("Name: " + person.name);
        System.out.println("Surname: " + person.surname);
        System.out.println("Phones:");
        for (String phone : person.phones) {
            System.out.println(phone);
        }
        System.out.println("Sites:");
        for (String sites : person.sites) {
            System.out.println(sites);
        }
        System.out.println(person.address.city);
        System.out.println(person.address.country);
        System.out.println(person.address.street);

    }

    public static String readFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            return sb.toString();
        } finally {
            br.close();
        }
    }
}
