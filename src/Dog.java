class Dog extends Animal implements Run, Speak{
    private String name;
    public Dog(String name)
    {
        this.name = name;
        run(name);
        speak(name);
    }
    @Override
    public void run (String name)
    {
        System.out.println(name + " Biega i kopie");
    }
    @Override
    public void speak (String name)
    {
        System.out.println(name + " Szczeka i warczy");
    }
    public String getName()
    {
        return name;
    }
}
