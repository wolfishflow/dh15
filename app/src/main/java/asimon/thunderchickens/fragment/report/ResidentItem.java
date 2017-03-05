package asimon.thunderchickens.fragment.report;

/**
 * Created by alansimon on 2017-03-05.
 */


public class ResidentItem {

    String mPItem1;
    String mPItem2;
    String mCItem1;
    String mCItem2;
    String mTItem1;
    String mSItem1;
    int mImage;
    Boolean mPriority;

    public ResidentItem(Boolean priority, int image, String p_item1, String p_item2, String c_item1, String c_item2, String t_item1, String s_item2) {
        mPriority = priority;
        mImage = image;
        mPItem1 = p_item1;
        mPItem2 = p_item2;
        mCItem1 = c_item1;
        mCItem2 = c_item2;
        mTItem1 = t_item1;
        mSItem1 = s_item2;
    }
}

