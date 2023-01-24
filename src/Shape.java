abstract class Shape implements GetNameOfShape {

    private String name;

    public String getName() {
        return name;
    }


    @Override
    public void nameMe() {
        System.out.println("Shape name is [" + getName() + "]");
    }

}
