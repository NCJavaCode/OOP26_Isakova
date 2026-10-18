// Клас "Концерт" - спадкоємець абстрактного класу Show
// (наприклад, трансляція концерту на великому екрані кінотеатру)
public class Concert extends Show {
    // Власне поле, якого немає в батьківському класі
    private String performer; // виконавець (співак, гурт, оркестр)

    // Конструктор: викликаємо конструктор батьківського класу через super,
    // потім заповнюємо власне поле
    public Concert(String title, int durationMinutes, String performer) {
        super(title, durationMinutes);
        this.performer = performer;
    }

    // Гетер
    public String getPerformer() {
        return performer;
    }

    // Сетер
    public void setPerformer(String performer) {
        this.performer = performer;
    }

    // Реалізація абстрактного методу батьківського класу.
    // Квиток на концерт коштує 250 грн, а якщо концерт довший за 2 години - 350 грн.
    // Поле durationMinutes доступне тут напряму, бо в класі Show воно protected
    @Override
    public double calculateTicketPrice() {
        double price = 250;
        if (durationMinutes > 120) {
            price = price + 100;
        }
        return price;
    }
}