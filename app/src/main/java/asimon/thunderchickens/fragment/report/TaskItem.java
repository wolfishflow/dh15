package asimon.thunderchickens.fragment.report;

/**
 * Created by alansimon on 2017-03-05.
 */

public class TaskItem {
    String mName;
    String mRoom;
    String mStatus1;

    int mImage;

    Boolean mPriority;

    public TaskItem(Boolean priority,int image, String name, String room, String status1, String status2) {
        mPriority = priority;
        mImage = image;
        mName = name;
        mRoom = room;
        mStatus1 = status1;
    }
}
