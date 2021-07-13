package vn.techmaster.basicthymeleaf.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import vn.techmaster.basicthymeleaf.model.Person;

@Repository
public class InMemoryRepository {
    private ArrayList<Person> people;
    public InMemoryRepository() {
        people = new ArrayList<>(List.of(new Person("Trịnh Minh Cường", "Vietnam", "1975-11-27", "Male"),
                new Person("John Tery", "UK", "1972-11-02", "Male"),
                new Person("Chiang Jian", "China", "2011-05-02", "Female"),
                new Person("Lý Hoàng Đức", "Vietnam", "2001-07-08", "Male"),
                new Person("Lyan Kuwai", "Singapore", "2000-05-02", "Female"),
                new Person("Luke Shaw", "UK", "1995-07-12", "Male"),
                new Person("Leonardo Bonucci", "Italy", "1987-05-01", "Male"),
                new Person("Lionel Messi", "Argentina", "1987-06-24", "Male")));
    }
     
    public List<Person> getPeople(){
        return people;
    }
}
