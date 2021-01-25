package ch.bbw.shop.article;

public class Article {
    private int id;
    private String number;
    private String text;
    private String description;
    private double price;
    private String image;
    private SizeGroup sizegroup;
    private String size;

    public Article(int id, String number, String text, String description, double price) {
        this.id = id;
        this.number = number;
        this.text = text;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(String size) {
        switch (size) {
            case "XS":
                this.price = 24.00;
                break;
            case "S":
                this.price = 26.50;
                break;
            case "XL":
                this.price = 36.00;
                break;
            case "M":
            case "L":
            case "250g":
                this.price = 29.00;
                break;
            case "500g":
                this.price = 56.00;
                break;
            case "1kg":
                this.price = 109.00;
                break;
        }

    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public SizeGroup getSizegroup() {
        return sizegroup;
    }

    public void setSizegroup(SizeGroup sizegroup) {
        this.sizegroup = sizegroup;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
