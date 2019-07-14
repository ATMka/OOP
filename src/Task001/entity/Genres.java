package Task001.entity;

public enum Genres {

    Fantastic("Фантастика"),
    Child("Детская"),
    Detective("Детектив"),
    Humor("Юмор"),
    Prose("Проза");

    private  String nameGenre;
    Genres(String nameGenre) {
        this.nameGenre = nameGenre;
    }

    public String getNameGenre() {
        return nameGenre;
    }
}

