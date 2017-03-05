package asimon.thunderchickens.fragment.schedule;

import android.support.annotation.StringRes;

/**
 * Created by alansimon on 2017-03-05.
 */

public class CardItem {
    String mName;
    String mRoom;
    String mStatus1;
    String mStatus2;

    int mImage;

    public CardItem(int image, String name, String room, String status1, String status2) {
        mImage = image;
        mName = name;
        mRoom = room;
        mStatus1 = status1;
        mStatus2 = status2;
    }
}
