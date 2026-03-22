/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.Table
 */
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.util.Optional;

/*
 * Renamed from aod
 */
public final class aod_2 {
    private static final Table<Integer, Integer, int[]> cLc = HashBasedTable.create();

    private aod_2() {
    }

    public static int[] bQ(int n, int n2) {
        return Optional.ofNullable((int[])cLc.get((Object)n, (Object)n2)).orElseGet(() -> {
            int[] nArray = new int[]{n, n2};
            cLc.put((Object)n, (Object)n2, (Object)nArray);
            return nArray;
        });
    }
}

