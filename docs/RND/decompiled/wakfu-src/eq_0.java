/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from Eq
 */
public class eq_0
implements eu_0 {
    private final fg_0 ays;

    public eq_0(fg_0 fg_02) {
        this.ays = fg_02;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void b(fp_0 fp_02) {
        try {
            void var6_10;
            fp_02.k(this.ays.aIi());
            fp_02.g(this.ays.aIl());
            if (this.ays.mK(64)) {
                fp_02.bo(this.ays.getName());
            }
            fp_02.mz(this.ays.aIj());
            fp_02.mz(this.ays.aIk());
            short[] sArray = this.ays.aKH();
            fp_02.k((short)sArray.length);
            for (short n : sArray) {
                fp_02.k(n);
            }
            short[] sArray2 = this.ays.aKz();
            fp_02.k((short)sArray2.length);
            short[] sArray3 = sArray2;
            int n = sArray3.length;
            boolean bl = false;
            while (var6_10 < n) {
                short s = sArray3[var6_10];
                fp_02.k(s);
                ++var6_10;
            }
            eo_0.a(fp_02, this.ays.aKx().aII());
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Unable to save sprite " + this.ays.getName(), iOException);
        }
    }
}

