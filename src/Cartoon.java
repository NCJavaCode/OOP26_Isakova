// Клас "Мультфільм" - спадкоємець абстрактного класу Show.
// Ключове слово extends означає "успадковує від"
public class Cartoon extends Show {
    // Власне поле, якого немає в батьківському класі
    private boolean format3D; // true - мультфільм у форматі 3D, false - звичайний 2D

    // Конструктор: спочатку викликаємо конструктор батьківського класу (super),
    // який заповнить успадковані поля title і durationMinutes,
    // а потім заповнюємо власне поле
    public Cartoon(String title, int durationMinutes, boolean format3D) {
        super(title, durationMinutes);
        this.format3D = format3D;
    }

    // Гетер
    public boolean isFormat3D() {
        return format3D;
    }

    // Сетер
    public void setFormat3D(boolean format3D) {
        this.format3D = format3D;
    }

    // Реалізація абстрактного методу батьківського класу.
    // Квиток на мультфільм коштує 120 грн, у форматі 3D - на 50 грн дорожче
    @Override
    public double calculateTicketPrice() {
        double price = 120;
        if (format3D) {
            price = price + 50;
        }
        return price;
    }
}