/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from Ep
 */
public class ep_0
implements eu_0 {
    private final fe_1 ayr;

    public ep_0(fe_1 fe_12) {
        this.ayr = fe_12;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void b(fp_0 fp_02) {
        try {
            void var5_10;
            fp_02.k(this.ayr.aIi());
            fp_02.g(this.ayr.aIl());
            if (this.ayr.mK(64)) {
                fp_02.bo(this.ayr.getName());
            }
            fp_02.mz(this.ayr.aIj());
            fp_02.mz(this.ayr.aIk());
            int[] nArray = this.ayr.aKw();
            fp_02.k((short)nArray.length);
            int[] objectArray = nArray;
            int objectArray2 = objectArray.length;
            boolean bl = false;
            while (var5_10 < objectArray2) {
                int n = objectArray[var5_10];
                fp_02.mz(n);
                ++var5_10;
            }
            short[] sArray = this.ayr.aKy();
            fp_02.k((short)sArray.length);
            for (int n : sArray) {
                fp_02.k((short)n);
            }
            short[] sArray2 = this.ayr.aKz();
            fp_02.k((short)sArray2.length);
            for (short s : sArray2) {
                fp_02.k(s);
            }
            eo_0.a(fp_02, this.ayr.aKx().aII());
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Unable to save sprite " + this.ayr.getName(), iOException);
        }
    }
}

