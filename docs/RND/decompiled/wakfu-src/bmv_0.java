/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bMv
 */
public class bmv_0
implements Comparable {
    private final bmt_0 kxn;
    private bmx_0 kxo;

    public bmv_0(bmt_0 bmt_02, bmx_0 bmx_02) {
        this.kxn = bmt_02;
        this.kxo = bmx_02;
    }

    public bmt_0 eeG() {
        return this.kxn;
    }

    public bmx_0 eeH() {
        return this.kxo;
    }

    public void d(bmx_0 bmx_02) {
        this.kxo = bmx_02;
    }

    public int compareTo(@NotNull Object object) {
        if (!(object instanceof bmv_0)) {
            return 0;
        }
        return this.kxn.cvD() - ((bmv_0)object).kxn.cvD();
    }
}

