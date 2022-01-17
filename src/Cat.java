class Cat extends Animal implements Run, Speak{
    private String name;
    public Cat(String name)
    {
        this.name = name;
        run(name);
        speak(name);
    }
    @Override
    public void run (String name)
    {
        System.out.println(name + " Biega i skacze");
    }
    @Override
    public void speak (String name)
    {
        System.out.println(name + " Miałczy");
    }
    public String getName()
    {
        return name;
    }
}
