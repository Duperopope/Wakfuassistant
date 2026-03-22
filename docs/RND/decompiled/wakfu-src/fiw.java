/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import java.nio.ByteBuffer;
import org.apache.commons.lang3.ArrayUtils;

public class fiw {
    public static final fiu srZ = new fiu("", -1, -1, null, "", false);
    public static final int ssa = 1;
    public static final int ssb = 5;
    public static final int ssc = 5;
    private static final int[] ssd = new int[]{1, 5};

    private fiw() {
    }

    public static boolean VM(int n) {
        return ArrayUtils.contains((int[])ssd, (int)n);
    }

    public static fiu gc(ByteBuffer byteBuffer) {
        vt_1 vt_12 = new vt_1();
        vt_12.aG(byteBuffer);
        fiu fiu2 = new fiu();
        fiu2.b(vt_12);
        return fiu2;
    }
}

