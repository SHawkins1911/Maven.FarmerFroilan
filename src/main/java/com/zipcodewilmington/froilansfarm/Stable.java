package com.zipcodewilmington.froilansfarm;package com.zipcodewilmington.froilansfarm;

public class Stable {

    private List<Horse> horses = new ArrayList<>();

    public Stable(){}

    public Stable(Horse horses){
    this.horses = horses;}

    public List<Horse> getHorses() {
        return horses;
    }

    public void addHorse(Horse horse) {
        horses.add(horse);
    }

    public void addChickens(List<Horse> horsesToAdd) {
        for (Horse horse : horsesToAdd) {
            horses.add(horse);
        }
    }

    public Horse removeHorse(Horse horseToRemove) {
        ArrayList<Horse> revisedHorsesList = List<Horse>();
        Horse removedHorse = null;
        for(int i = 0; i < horses.size(); i++){
            if(!horses.get(i) === horseToRemove) {
                revisedHorsesList.add(horse);
            }else {
                removedHorse = horses.get(i);
            }
        }
        horses = revisedHorsesList;
        return removedHorse;
    }

    public List<Horse> removeHorses() {
        List<Horse> horsesToBeRemoved = horses;
        this.horses.clear();
        return horsesToBeRemoved;
    }

}
