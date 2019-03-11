

public class ChickenCoopTest {
    
    ChickenCoop chickenCoop = new ChickenCoop();


    @Test
    public void addChickensTest() {
        //given
         ArrayList<Chicken> listOfChickens = new List<Chicken>();
       Chicken chicken1 = new Chicken();
       Chicken chicken2 = new Chicken();
       Chicken chicken3 = new Chicken();
       Chicken chicken4 = new Chicken();
       listOfChickens.add(chicken1);
       listOfChickens.add(chicken2);
       listOfChickens.add(chicken3);
       listOfChickens.add(chicken4);

       //when
       chickenCoop.addChickens(listOfChickens);
       List<Chickens> chickensAddedToCoop = chickenCoop.getChickens();
       //then
       Assert.assertEquals(chickensAddedToCoop, listOfChickens);

    }

    @Test
    public Chicken removeChickenTest() {
        //given
        Chicken chicken = new Chicken();
        chickenCoop.add(chicken);
        
        //when
        Chicken removedChicken = chickenCoop.removeChicken(chicken);
        
        //then
        Assert.assertEquals(removedChicken, chicken);
        
    }

    @Test
    public void removeChickensTest() {
       //given
       ArrayList<Chicken> listOfChickens = new List<Chicken>();
       Chicken chicken1 = new Chicken();
       Chicken chicken2 = new Chicken();
       Chicken chicken3 = new Chicken();
       Chicken chicken4 = new Chicken();
       listOfChickens.add(chicken1);
       listOfChickens.add(chicken2);
       listOfChickens.add(chicken3);
       listOfChickens.add(chicken4);
       chickenCoop.addChickens(listOfChickens);

       //when
       List<Chicken> removedListOfChickens = chickenCoop.removeChickens(listOfChickens);

       //then
       Assert.assertEquals(removedListOfChickens, listOfChickens);
    }



}
