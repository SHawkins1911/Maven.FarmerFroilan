package com.zipcodewilmington.froilansfarm;
package com.zipcodewilmington.froilansfarm;

public class FarmHouse {

    package com.zipcodewilmington.froilansfarm;
package com.zipcodewilmington.froilansfarm;

public class ChickenCoop {
    private List<Chicken> chickens = new ArrayList<>();

    public ChickenCoop(){}

    public ChickenCoop(Chicken chickens){
    this.chickens = chickens;}

    public List<Chicken> getChickens() {
        return chickens;
    }

    public void addChicken(Chicken chicken) {
        chickens.add(chicken);
    }

    public void addChickens(List<Chicken> chickensToAdd) {
        for (Chicken chicken : chickensToAdd) {
            chickens.add(chicken);
        }
    }

    public Chicken removeChicken(Chicken chickenToRemove) {
        ArrayList<Chicken> revisedChickensList = List<Chicken>();
        Chicken removedChicken = null;
        for(int i = 0; i < chickens.size(); i++){
            if(!chickens.get(i) === chickenToRemove) {
                revisedChickensList.add(chicken);
            }else {
                removedChicken = chickens.get(i);
            }
        }
        chickens = revisedChickensList;
        return removedChicken;
    }

    public List<Chicken> removeChickens() {
        List<Chicken> chickensToBeRemoved = chickens;
        this.chickens.clear();
        return chickensToBeRemoved;
    }

}
