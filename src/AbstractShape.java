public class AbstractShape implements ShapeOperations {
    protected String shapeType = null;

    public AbstractShape() {
        this.shapeType = shapeType;
    }

    // Вкладений клас
    static class InnerClass {
        void innerMethod() {
            System.out.println("This is an inner method of InnerClass.");
        }
    }

    // Метод використовуе enums
    public void printAnimal(Animal animal) {
        System.out.println("Selected animal: " + animal);
    }

    // Перевикористаний метод із інтерфейса
    @Override
    public double calculatePerimeter() {
        return 0.0;
    }

    public abstract class InnerAbstractClass {
    }
}
