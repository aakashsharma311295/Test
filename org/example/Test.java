package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<Empployee> emp = new ArrayList<>();
        emp.add(new Empployee("Bill","bill@gmail.com"));
        emp.add(new Empployee("Shubham","shubham@yahoo.com"));
        emp.add(new Empployee("Henry","henry@gmail.com"));
        emp.add(new Empployee("Claire","claire@yahoo.com"));
        emp.add(new Empployee("Nick","nick@gmail.com"));

//        emp.stream().collect(Collectors.groupingBy())
        Map<String, Integer> map = new HashMap<>();
        emp.stream().forEach(empployee -> {
            List<String> list = Arrays.asList(empployee.getEmail_id().split("@"));
            String domain = list.get(1);
            if (map.containsKey(domain)){
                map.put(domain, map.get(domain)+1);
            }else {
                map.put(domain, 1);
            }

        });

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}

class Empployee {
    private String e_name;
    private String email_id;

    public Empployee(String name, String email_id) {
        this.e_name = name;
        this.email_id = email_id;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }
}