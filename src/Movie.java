// Клас "Фільм" - описує фільм, який показують у кінотеатрі
public class Movie {
    // Поля приховані модифікатором private (інкапсуляція):
    // змінити їх ззовні можна лише через методи класу
    private String title;        // назва фільму
    private int durationMinutes; // тривалість
    private int ageLimit;        // вікове обмеження

    // Конструктор - створює фільм
    public Movie(String title, int durationMinutes, int ageLimit) {
        this.title = title;
        this.durationMinutes = durationMinutes;
        this.ageLimit = ageLimit;
    }

    // Гетери

    // повертає назву фільму
    public String getTitle() {
        return title;
    }

    // повертає тривалість фільму
    public int getDurationMinutes() {
        return durationMinutes;
    }

    // повертає вікове обмеження
    public int getAgeLimit() {
        return ageLimit;
    }

    // Сетери

    public void setTitle(String title) {
        this.title = title;
    }

    // тривалість від 1 до 300 хвилин
    public void setDurationMinutes(int durationMinutes) {
        if (durationMinutes > 0 && durationMinutes <= 300) {
            this.durationMinutes = durationMinutes;
        }
    }

    // вікове обмеження від 0 років
    public void setAgeLimit(int ageLimit) {
        if (ageLimit >= 0) {
            this.ageLimit = ageLimit;
        }
    }
}
