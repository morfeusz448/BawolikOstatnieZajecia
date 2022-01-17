public class HomeAnimal <T extends Animal & Run & Speak>{
    T ob;
    HomeAnimal(T ob)
    {
        this.ob = ob;
    }
    T getOb()
    {
        return ob;
    }
    void showType()
    {
        System.out.println("Typem T jest " + ob.getClass().getName());
    }
    void sleepOnCouch()
    {
        System.out.println(ob.getName() + " śpi na kanapie");
    }
}
