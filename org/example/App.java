package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args) {
        List<Batsman> batsmen = new ArrayList<>();
        batsmen.add(new Batsman("Sachin",2000));
        batsmen.add(new Batsman("Dhoni",3000));
        batsmen.add(new Batsman("Yuvraj",1000));
        batsmen.add(new Batsman("Rohit",500));
        batsmen.add(new Batsman("kohli",4000));
        batsmen.add(new Batsman("kaif",800));
        batsmen.add(new Batsman("raina",900));

        //>800 and top3

        Collections.sort(batsmen, new Comparator<Batsman>() {
            @Override
            public int compare(Batsman o1, Batsman o2) {
                if (o1.getRun()>o2.getRun()) return -1;
                if (o1.getRun()<o2.getRun()) return +1;
                return 0;
            }
        });

        System.out.println(batsmen);

        List<Batsman> filteredList = batsmen.stream().filter(player -> player.getRun()>800).collect(Collectors.toList());
        for (Batsman batsman : filteredList){
            System.out.println("Name :" + batsman.getName() + "Runs : " + batsman.getRun());
        }
//        System.out.println(filteredList);

    }
}

class Batsman implements Comparator<Batsman> {
    private String name;
    private Integer run;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRun() {
        return run;
    }

    public void setRun(Integer run) {
        this.run = run;
    }

    public Batsman(String name, Integer run) {
        this.name = name;
        this.run = run;
    }

    @Override
    public int compare(Batsman o1, Batsman o2) {
        if (o1.getRun() > o2.getRun()) return 1;
        else if (o1.getRun() < o2.getRun()) return -1;
        return 0;
    }

}


