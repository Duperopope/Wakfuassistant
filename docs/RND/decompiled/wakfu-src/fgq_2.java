/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/*
 * Renamed from fGq
 */
public class fgq_2 {
    private Comparator dvP;

    public fgq_2() {
    }

    public fgq_2(Comparator comparator) {
        this.dvP = comparator;
    }

    public int[] c(ArrayList arrayList, boolean bl) {
        Object[] objectArray = arrayList.toArray(new Object[arrayList.size()]);
        Arrays.sort(objectArray, this.dvP);
        int[] nArray = new int[arrayList.size()];
        int n = objectArray.length;
        for (int i = 0; i < n; ++i) {
            if (bl) {
                nArray[i] = arrayList.indexOf(objectArray[i]);
                continue;
            }
            nArray[n - i - 1] = arrayList.indexOf(objectArray[i]);
        }
        return nArray;
    }
}

