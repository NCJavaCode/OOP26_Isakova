// Абстрактний клас "Показ" - узагальнює спільні характеристики всього,
// що можна показати в кінотеатрі (фільм, мультфільм, концерт).
// Об'єкт абстрактного класу створити не можна - тільки об'єкти класів-спадкоємців,
// Cartoon (мультфільм) та Concert (концерт)
public abstract class Show {
    // Спільні поля для всіх видів показів.
    // Модифікатор protected: поля приховані від інших класів,
    // але доступні в класах-спадкоємцях
    protected String title; // назва показу
    protected int durationMinutes; // тривалість у хвилинах

    // Конструктор - викликається з конструкторів класів-спадкоємців через super(...)
    public Show(String title, int durationMinutes) {
        this.title = title;
        this.durationMinutes = durationMinutes;
    }

    // Гетери

    // повертає назву показу
    public String getTitle() {
        return title;
    }

    // повертає тривалість показу
    public int getDurationMinutes() {
        return durationMinutes;
    }

    // Сетери

    public void setTitle(String title) {
        this.title = title;
    }

    // тривалість повинна бути більшою за нуль
    public void setDurationMinutes(int durationMinutes) {
        if (durationMinutes > 0) {
            this.durationMinutes = durationMinutes;
        }
    }

    // Абстрактний метод - не має тіла.
    // Кожен вид показу рахує ціну квитка по-своєму,
    // тому реалізацію напишуть класи-спадкоємці
    public abstract double calculateTicketPrice();

    // Звичайний метод - спільний для всіх показів.
    // Він використовує абстрактний метод, не знаючи, як саме рахується ціна
    public void printInfo() {
        System.out.println("Назва: " + title);
        System.out.println("Тривалість: " + durationMinutes + " хв");
        System.out.println("Ціна квитка: " + calculateTicketPrice() + " грн");
    }
}
