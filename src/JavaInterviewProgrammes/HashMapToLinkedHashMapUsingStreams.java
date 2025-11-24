package JavaInterviewProgrammes;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class HashMapToLinkedHashMapUsingStreams {
    public static void main(String[] args) {

        HashMap<String,Employee> map = new HashMap<>();
        map.put("A",new Employee("John"));
        map.put("B",new Employee("Alice"));
        map.put("C",new Employee("Bob"));
        map.put("D",new Employee("Henry"));
        map.put("E",new Employee("Micheal"));
        map.put("F",new Employee("Cory"));

        final LinkedHashMap<String,Employee> collect = map.entrySet().stream()
                .sorted(Comparator.comparing(o->o.getValue().getName()))
                .collect(Collectors.toMap(e->e.getKey(),v->v.getValue(),(o,o2)
                ->o, LinkedHashMap::new));

        collect.forEach((key,value)->System.out.println(key+ " : "+value.getName()));
    }
}
