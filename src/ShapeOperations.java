public interface ShapeOperations {
    // Абстрактний метод
    double calculatePerimeter();

    // Статичний метод
    static void printInfo() {
        System.out.println("This is a Shape Operations interface.");
    }

    // Приватний метод
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    // Константа
    double PI = 3.14159;
}

// Вкладений клас
class NestedClass {
    // Вкладений інтерфейс
    interface NestedInterface {
        void nestedMethod();
    }
}

// Enums для тварин
enum Animal {
    DOG, CAT, ELEPHANT, LION, MONKEY
}