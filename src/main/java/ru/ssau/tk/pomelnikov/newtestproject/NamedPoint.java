package ru.ssau.tk.pomelnikov.newtestproject;

public class NamedPoint extends Point implements Resettable {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public NamedPoint(double x, double y, double z, String name) {
        super(x, y, z);
        this.name = name;
    }

    public NamedPoint(double x, double y, double z) {
        super(x, y, z);
    }

    public NamedPoint() {
        this(0, 0, 0, "Origin");
    }

    @Override
    public void reset() {
        this.name = "Absent";
    }

    @Override
    public String toString() {
        if (name == null) {
            return super.toString();
        } else {
            return this.name + " " + super.toString();
        }
    }
}
