package MVC.Service.Singer;

import MVC.Model.Singer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingerServiceIMPL implements MVC.Service.Singer.ISingerService {

    public static List<Singer> singerList = new ArrayList<>();

    static {
        singerList.add(new Singer(1, "Tung", 18));
        singerList.add(new Singer(2, "Phu", 20));
        singerList.add(new Singer(3, "Duc", 16));
        singerList.add(new Singer(4, "Ba", 19));

    }


    @Override
    public List<Singer> findAll() {
        return singerList;
    }

    @Override
    public List<Singer> save(Singer singer) {
        singerList.add(singer);
        return singerList;
    }

    @Override
    public List<Singer> search(String name) {
        List<Singer> singers =new ArrayList<>();
        for (Singer singer : singerList){
            if (singer.getName().equals(name)){
                singers.add(singer);
            }
        }
        return singers;
    }

    @Override
    public List<Singer> remove(int id) {
        singerList.remove(id - 1);
        return singerList;
    }

    @Override
    public List<Singer> edit(int id, String name, int age) {
        singerList.get(id - 1).setName(name);
        singerList.get(id - 1).setAge(age);
        return singerList;
    }

    @Override
    public List<Singer> sortByName() {
        Collections.sort(singerList); // sap xep
        updateId();
        return singerList;
    }

    @Override
    public List<Singer> deleteById(int id) {
        singerList.remove(id -1);
        updateId();
        return singerList;
    }

    @Override
    public List<Singer> findById(int id) {
        List<Singer> singers = new ArrayList<>();
        for (int i = 0; i <singerList.size(); i++){
            singers.add(singerList.get(id-1));
            break;
        }
        return singers;
    }

    public void updateId() {
        for (int i = 0; i < singerList.size(); i++) {
            singerList.get(i).setId(i +1);
        }
    }


}
