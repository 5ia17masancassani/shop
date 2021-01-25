package ch.bbw.shop.article;

import java.util.ArrayList;
import java.util.List;

public class SizeGroup {

    private int id;
    private String groupName;
    private List<Size> sizes;

    public SizeGroup(int id, String groupName, List<Size> sizes) {
        this.id = id;
        this.groupName = groupName;
        this.sizes = sizes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<Size> getNormalSizes() {
        return sizes;
    }

    public List<String> getSizes() {
        List<String> stringSizes = new ArrayList<>();
        for(Size size: this.sizes){
            stringSizes.add(size.getSize());
        }

        return stringSizes;
    }

    public void setSizes(List<Size> sizes) {
        this.sizes = sizes;
    }
}
