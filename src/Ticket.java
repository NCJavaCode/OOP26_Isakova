// Клас "Квиток" - описує квиток на певне місце в залі
public class Ticket {
    // Приховані поля (інкапсуляція)
    private int row;      // номер ряду
    private int seat;     // номер місця в ряду
    private double price; // ціна квитка у гривнях

    // Конструктор - створює квиток
    public Ticket(int row, int seat, double price) {
        this.row = row;
        this.seat = seat;
        this.price = price;
    }

    // Гетери

    // повертає номер ряду
    public int getRow() {
        return row;
    }

    // повертає номер місця
    public int getSeat() {
        return seat;
    }

    // повертає ціну квитка
    public double getPrice() {
        return price;
    }

    // Сетери

    //  номер ряду повинен бути більшим за нуль
    public void setRow(int row) {
        if (row > 0) {
            this.row = row;
        }
    }

    // номер місця повинен бути більшим за нуль
    public void setSeat(int seat) {
        if (seat > 0) {
            this.seat = seat;
        }
    }

    // ціна повинна бути більшою за нуль
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }
}
