public abstract class Animal {
    private int order;
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public boolean isOlderThan(Animal other) {
        return this.order < other.order;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "(" + name + ", order=" + order + ")";
    }
}
