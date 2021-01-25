package ch.bbw.shop.article;

public class Size {

    private int id;
    private String size;
    private int sortOrder;

    public Size(int id, String size, int sortOrder) {
        this.id = id;
        this.size = size;
        this.sortOrder = sortOrder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }
}
