package component;

import java.util.List;

/**
 * Integer와 Long 타입에 대한 Input Generator 입니다.
 * @param
 */
public class IntegerLine extends Line {
    private List<Integer> numbers;
    private int min;
    private int max;

    public IntegerLine(int n, int min, int max, int sortType, boolean duplicate) {
        super(n, sortType, duplicate);
        this.min = min;
        this.max = max;
    }
    public IntegerLine(int n, int min, int max, int sortType) {
        super(n, sortType, false);
        this.min = min;
        this.max = max;
    }
    public IntegerLine(int n, int min, int max) {
        super(n, NOTHING , false);
        this.min = min;
        this.max = max;
    }

    @Override
    public String generate() {
        String delimiter = " ";
        StringBuilder sb = new StringBuilder();

        if (max == Integer.MAX_VALUE) {
            for (int i = 0; i < N; i++) {
                numbers.add(random.nextInt());
            }
            return sb.toString();
        } else {
            for (int i = 0; i < N; i++) {
                numbers.add(random.nextInt(min, max + 1));
            }
        }

        // TODO : 중복

        // TODO : 정렬

    }

}
