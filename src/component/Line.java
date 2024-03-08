package component;

/**
 * Integer와 Long 타입에 대한 Input Generator 입니다.
 * @param <T>
 */
public class Line<T> implements Generator {
    private static final int NOTHING = 0;

    // SORT_TYPE
    private static final int ASC = 1;
    private static final int DESC = 2;

    private T N;
    private T min;
    private T max;
    private int sortType;
    private boolean duplicate;

    public Line(T n, T min, T max, int sortType, boolean duplicate) {
        N = n;
        this.min = min;
        this.max = max;
        this.sortType = sortType;
        this.duplicate = duplicate;
    }
    public Line(T n, T min, T max, int sortType) {
        N = n;
        this.min = min;
        this.max = max;
        this.sortType = sortType;
        this.duplicate = false;
    }
    public Line(T n, T min, T max) {
        N = n;
        this.min = min;
        this.max = max;
        this.sortType = NOTHING;
        this.duplicate = false;
    }

    @Override
    public String generate() {
        return null;
    }
}
