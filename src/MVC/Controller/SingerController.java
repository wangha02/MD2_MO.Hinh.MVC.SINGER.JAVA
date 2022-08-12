package MVC.Controller;

import MVC.Model.Singer;
import MVC.Service.Singer.ISingerService;
import MVC.Service.Singer.SingerServiceIMPL;

import java.util.List;

public class SingerController {
    private final ISingerService iSingerService = new SingerServiceIMPL();

    public List<Singer> getSinger() {
        return iSingerService.findAll();
    }

    public List<Singer> showListSinger() {
        return iSingerService.findAll();
    }

    public List<Singer> createSinger(String name, int age) {
        return iSingerService.save(new Singer(showListSinger().size() + 1, name, age));
    }

    public List<Singer> editSinger(int id, String name, int age) {
        return iSingerService.edit(id, name, age);
    }

    public List<Singer> sortSinger() {
        return iSingerService.sortByName();
    }

    public List <Singer> findSingerById(int id) {
        return iSingerService.findById(id);
    }

    public List<Singer> deleteSinger(int id){
        return iSingerService.deleteById(id);
    }
}
