/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.TestOnly
 */
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.TestOnly;

/*
 * Renamed from fik
 */
public class fik_0 {
    private static final int[] srE = new int[]{12097, 12191, 12184, 12185, 12186, 12187, 12188, 12189, 12190, 12192, 12193, 12194, 12195, 12196, 12197, 12178, 12183, 15107, 15108, 15109, 15110};
    @TestOnly
    public static final int srF = srE[0];
    public static final short srG = 100;

    private fik_0() {
    }

    public static boolean tX(int n) {
        return ArrayUtils.contains((int[])srE, (int)n);
    }
}

