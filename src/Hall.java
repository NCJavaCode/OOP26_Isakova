// Клас "Кінозал" - описує зал, у якому проходить показ фільму
public class Hall {
    // Приховані поля (інкапсуляція)
    private int number;     // номер залу
    private int seatsCount; // кількість місць у залі

    // Конструктор - створює зал
    public Hall(int number, int seatsCount) {
        this.number = number;
        this.seatsCount = seatsCount;
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
}
