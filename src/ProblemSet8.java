import java.util.Arrays;

public class ProblemSet8 {
    public boolean common(int[] a, int[] b) {
        if (a == null || b == null || a.length == 0 || b.length == 0) {
            return false;
        }
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    public int[] middleman(int[] a, int[] b) {
        if (a == null || b == null || a.length % 2 == 0 || b.length % 2 == 0) {
            return null;
        }
        return new int[]{a[a.length/2], b[b.length/2]};
    }

    public int[] bigger(int[] a, int[] b) {
        if (a == null || b == null) {
            return null;
        }
        int aSum = 0;
        int bSum = 0;
        if (a.length != 0) {
            for (int j : a) {
                aSum += j;
            }
        }
        if (b.length != 0) {
            for (int j : b) {
                bSum += j;
            }
        }
        if (bSum > aSum) {
            return b;
        }
        return a;
    }

    public int[] doubleMiddle(int[] a, int[] b) {
        if (a == null || b == null || a.length % 2 == 1 || b.length % 2 == 1 || a.length == 0 || b.length == 0) {
            return null;
        }
        return new int[]{a[(a.length / 2) - 1], a[a.length / 2], b[(b.length / 2) - 1], b[b.length / 2]};
    }

    public int[] swapMe(int[] a) {
        if (a == null) {
            return null;
        }
        if (a.length < 2) {
            return a;
        }
        int x = a[0];
        a[0] = a[a.length -1];
        a[a.length -1] = x;
        return a;
    }

    public int[] threePoint(int[] a) {
        if (a == null || a.length % 2 == 0) {
            return null;
        }

        return new int[]{a[0], a[a.length / 2], a[a.length - 1]};
    }

    public int headHoncho(int[] a) {
        if (a == null || a.length == 0) {
            return -1;
        }

        int highest = 0;
        for (int j : a) {
            if (j < 0) {
                return -1;
            }
            if (j > highest) {
                highest = j;
            }
        }
        return highest;
    }

    public boolean tippingPoint(int[] a, int threshold) {
        if (a == null) {
            return false;
        }

        int sum = 0;

        if (a.length != 0) {
            for (int j : a) {
                sum += j;
            }
        }

        return sum > threshold;
    }

    public String halfway(int[] a) {
        if (a == null || a.length % 2 == 1 || a.length == 0) {
            return null;
        }

        int left = 0;

        for (int j = 0; j < a.length / 2;j++) {
            left += a[j];
        }

        int right = 0;

        for (int j = a.length / 2; j < a.length;j++) {
            right += a[j];
        }
        System.out.println(left + ",    " + right);

        if (left > right) {
            return "LEFT";
        }
        return "RIGHT";
    }

    public int[] sequential(int[] a, int[] b) {
        if (a == null || b == null || b.length + a.length < 3) {
            return null;
        }

        int i = 0;
        int [] c = new int[3];

        while (i < 3 && i < a.length) {
            c[i] = a[i];
            i++;
        }

        for (int j = 0; j < c.length && i < 3; j++) {
            c[i] = b[j];
            i++;
        }
        return c;
    }
}
