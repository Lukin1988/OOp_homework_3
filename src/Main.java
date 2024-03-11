
public static void main(String[] args) {
    // Використовуемо статичний метод із іннтерфейса
    ShapeOperations.printInfo();

    // Створюемо об'єкт вкладеного класу
    AbstractShape.InnerClass innerClass = new AbstractShape.InnerClass();
    innerClass.innerMethod();

    // Використовуемо enums
    Animal selectedAnimal = Animal.DOG;
    new AbstractShape(){}.printAnimal(selectedAnimal);
}
