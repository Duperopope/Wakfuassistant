/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from Ex
 */
public class ex_0 {
    private final fm_0 ayx;

    public ex_0(fm_0 fm_02) {
        this.ayx = fm_02;
    }

    public void b(fp_0 fp_02) {
        try {
            String string = this.ayx.aKJ();
            int n = this.ayx.aKL();
            if (string == null || n == 0) {
                fp_02.k((short)0);
                return;
            }
            fp_02.k((short)1);
            fp_02.bo(string);
            fp_02.mz(n);
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Unable to save texture", iOException);
        }
    }
}

