package com.wilson.study;

import java.util.ArrayList;
import java.util.List;

/**
 * .
 *
 * @author zhangweilong
 * @create 1/16/19 19:22
 **/
public class Test {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        persons.add(new Person("zhang", 12));
        persons.add(new Person("zhang1", 13));
        persons.add(new Person("zhang2", 14));
        persons.add(new Person("zhang3", 15));

        List<Person> subList = persons.subList(0, 2);
        subList.stream().forEach(person -> {
            person.setAge(100);
        });

        subList.stream().forEach(person -> System.out.println(person));
        persons.stream().forEach(person -> System.out.println(person));

    }

    static class Person {
        private String name;
        private Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

//        @Override
//        public String toString() {
//            final StringBuilder sb = new StringBuilder("Person{");
//            sb.append("name='").append(name).append('\'');
//            sb.append(", age=").append(age);
//            sb.append('}');
//            return sb.toString();
//        }
    }
}
