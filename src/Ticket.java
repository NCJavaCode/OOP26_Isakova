// Клас "Квиток" - описує квиток на певне місце в залі
public class Ticket {
    // Приховані поля (інкапсуляція)
    private int row;      // номер ряду
    private int seat;     // номер місця в ряду
    private double price; // ціна квитка у гривнях

    // Перевантажені конструктори (однакова назва, різна кількість параметрів)

    // Конструктор 1 - створює квиток із вказаною ціною
    public Ticket(int row, int seat, double price) {
        this.row = row;
        this.seat = seat;
        this.price = price;
    }

    // Конструктор 2 - створює квиток зі стандартною ціною 150 грн
    public Ticket(int row, int seat) {
        this.row = row;
        this.seat = seat;
        this.price = 150;
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

    // Перевантажені методи printInfo (статичний поліморфізм).
    // Назва однакова, а параметри відрізняються кількістю або типом.
    // Який саме метод викликати, компілятор вирішує ще під час компіляції

    // 1) без параметрів - друкує тільки дані квитка
    public void printInfo() {
        System.out.println("Квиток: ряд " + row + ", місце " + seat + ", ціна " + price + " грн");
    }

    // 2) з параметром типу Movie - додатково друкує фільм
    public void printInfo(Movie movie) {
        System.out.println("Фільм: " + movie.getTitle() + " (" + movie.getAgeLimit() + "+)");
        printInfo();
    }

    // 3) з параметром типу Hall - додатково друкує номер залу
    // (кількість параметрів така сама, як у варіанті 2, але тип інший)
    public void printInfo(Hall hall) {
        System.out.println("Зал №" + hall.getNumber());
        printInfo();
    }

    // 4) з двома параметрами - друкує фільм, зал і дані квитка
    public void printInfo(Movie movie, Hall hall) {
        System.out.println("Фільм: " + movie.getTitle() + " (" + movie.getAgeLimit() + "+)");
        System.out.println("Зал №" + hall.getNumber());
        printInfo();
    }

}
