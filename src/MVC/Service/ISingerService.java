package MVC.Service.Singer;

import MVC.Model.Singer;

import java.util.List;

public interface ISingerService {

    List<Singer> findAll();

    List<Singer> save(Singer singer);

    List<Singer> edit(int id, String name, int age);

    List<Singer> sortByName();

    List<Singer> search(String name);

    List<Singer> remove(int id);

    List<Singer> findById(int id);

    List<Singer> deleteById(int id);



}
