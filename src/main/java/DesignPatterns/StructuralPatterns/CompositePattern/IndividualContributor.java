package DesignPatterns.StructuralPatterns.CompositePattern;

public class IndividualContributor implements Employee {
    private String name;
    private String position;
    public IndividualContributor(String name, String position) {
        this.name = name;
        this.position = position;
    }
    @Override
    public void showDetails() {
        System.out.println("Name: " + name + "(" + position + ")");
    }
}
