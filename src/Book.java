import java.util.Objects;

public class Book {
    private final Author author;
    private final String nameBook;
    private int yearRelease;


    public Book(Author author, String nameBook, int yearRelease) {
        this.author = author;
        this.nameBook = nameBook;
        this.yearRelease = yearRelease;
    }

    public Author getAuthor() {
        return author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public int getYearRelease() {
        return yearRelease;
    }


    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    @Override
    public String toString() {
        return author.getFirstName() + " " + author.getSecondName() + " " + nameBook + " "
                + yearRelease;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearRelease == book.yearRelease && Objects.equals(author, book.author)
                && Objects.equals(nameBook, book.nameBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, nameBook, yearRelease);
    }
}
