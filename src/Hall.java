// Клас "Кінозал" - описує зал, у якому проходить показ фільму.
// Реалізує інтерфейси Nameable і Printable
public class Hall implements Nameable, Printable {
    // Приховані поля (інкапсуляція)
    private int number;     // номер залу
    private int seatsCount; // кількість місць у залі

    private String className; // назва класу (для інтерфейсу Nameable)

    // Конструктор - створює зал
    public Hall(int number, int seatsCount) {
        this.number = number;
        this.seatsCount = seatsCount;

        this.className = "Hall";
    }

    // Гетери

    // повертає номер залу
    public int getNumber() {
        return number;
    }

    // повертає кількість місць
    public int getSeatsCount() {
        return seatsCount;
    }

    // Сетери

    //  номер залу повинен бути більшим за нуль
    public void setNumber(int number) {
        if (number > 0) {
            this.number = number;
        }
    }

    // кількість місць від 1 до 500
    public void setSeatsCount(int seatsCount) {
        if (seatsCount > 0 && seatsCount <= 500) {
            this.seatsCount = seatsCount;
        }
    }

    // Реалізація методів інтерфейсу Nameable

    @Override
    public void setClassName(String name) {
        this.className = name;
    }

    @Override
    public String getClassName() {
        return className;
    }

    // Реалізація методу інтерфейсу Printable

    @Override
    public void printInfo() {
        System.out.println("Кінозал №" + number + ", місць: " + seatsCount);
    }
}
