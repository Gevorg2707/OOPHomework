package Task1;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qtylnStock;

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, double price, int qtylnStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtylnStock = qtylnStock;
    }

    public String getNameBook() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtylnStock() {
        return qtylnStock;
    }

    public void setQtylnStock(int qtylnStock) {
        this.qtylnStock = qtylnStock;
    }

    @Override
    public String toString() {
        return "name:" + name +
                ", author email=" + author.getEmail();
    }
}
