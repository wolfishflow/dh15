package asimon.thunderchickens.fragment.schedule;

/**
 * Created by alansimon on 2017-03-05.
 */

public class ListItem {
    private String itemTitle;


    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public ListItem(String title){
        this.itemTitle = title;
    }
}
