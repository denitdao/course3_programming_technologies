package ua.kpi.tef.pt.lab01.controller;

import ua.kpi.tef.pt.lab01.exceptions.InvalidClothesIdException;
import ua.kpi.tef.pt.lab01.exceptions.InvalidClothingSectionException;
import ua.kpi.tef.pt.lab01.model.LowerBodyClothes;
import ua.kpi.tef.pt.lab01.model.UpperBodyClothes;
import ua.kpi.tef.pt.lab01.service.LowerBodyClothesService;
import ua.kpi.tef.pt.lab01.service.UpperBodyClothesService;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

public class ClothesController {
    private final Map<Long, UpperBodyClothes> upperBodyClothes; // + todo generalized (HashMap -> Map) (19)
    private final Map<Long, LowerBodyClothes> lowerBodyClothes;
    private final UpperBodyClothesService upperBodyClothesService;
    private final LowerBodyClothesService lowerBodyClothesService;

    public ClothesController() {
        upperBodyClothes = new HashMap<>();
        lowerBodyClothes = new HashMap<>();
        upperBodyClothesService = new UpperBodyClothesService();
        lowerBodyClothesService = new LowerBodyClothesService();
    }

    // ask about the section of clothes (lower, upper)
    public void createClothes(int section) throws InvalidClothingSectionException {
        System.out.println("Type number of clothing section you want to create:");

        switch(section){
            case 1: {
                LowerBodyClothes item = lowerBodyClothesService.create();
                lowerBodyClothes.put(item.getId(), item);
                break;
            }
            case 2: {
                UpperBodyClothes item = upperBodyClothesService.create();
                upperBodyClothes.put(item.getId(), item);
                break;
            }
            default: {
               throw(new InvalidClothingSectionException("Wrong clothing section number.")); // + todo use of exception (13)
            }
        }
    }

    // ask about the id of the clothes
    public void editClothes(long id) throws InvalidClothesIdException {
        System.out.println("Type id of the clothing you want to edit:");
        if(lowerBodyClothes.containsKey(id)){
            lowerBodyClothesService.edit(lowerBodyClothes.get(id));
        }
        else if(upperBodyClothes.containsKey(id)) {
            upperBodyClothesService.edit(upperBodyClothes.get(id));
        } else {
            throw(new InvalidClothesIdException("Wrong clothes id."));
        }
    }

    // ask about the id of the clothes
    public void showClothes(long id) throws InvalidClothesIdException {
        System.out.println("Type id of the clothing you want to show:");
        if(lowerBodyClothes.containsKey(id)){
            lowerBodyClothesService.show(lowerBodyClothes.get(id));
        }
        else if(upperBodyClothes.containsKey(id)) {
            upperBodyClothesService.show(upperBodyClothes.get(id));
        } else {
            throw(new InvalidClothesIdException("Wrong clothes id."));
        }
    }

    // ask about the id of the clothes
    public void deleteClothes(long id) throws InvalidClothesIdException {
        System.out.println("Type id of the clothing you want to delete:");
        if(lowerBodyClothes.containsKey(id)){
            lowerBodyClothes.remove(id);
        }
        else if(upperBodyClothes.containsKey(id)) {
            upperBodyClothes.remove(id);
        } else {
            throw(new InvalidClothesIdException("Wrong clothes id."));
        }
    }
}
