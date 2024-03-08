package component;

import java.util.Random;

public abstract class Line implements Generator {
    protected static final int NOTHING = 0;

    // SORT_TYPE
    protected static final int ASC = 1;
    protected static final int DESC = 2;

    protected final Random random = new Random();

    protected int N;
    protected int sortType;
    protected boolean duplicate;

    public Line(int n, int sortType, boolean duplicate) {
        N = n;
        this.sortType = sortType;
        this.duplicate = duplicate;
    }
}
