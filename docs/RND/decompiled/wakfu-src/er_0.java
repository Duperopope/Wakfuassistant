/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from Er
 */
public class er_0
implements eu_0 {
    private final fh_0 ayt;

    public er_0(fh_0 fh_02) {
        this.ayt = fh_02;
    }

    @Override
    public final void b(fp_0 fp_02) {
        try {
            fp_02.k(this.ayt.aIi());
            fp_02.g(this.ayt.aIl());
            if (this.ayt.mK(64)) {
                fp_02.bo(this.ayt.getName());
            }
            fp_02.mz(this.ayt.aIj());
            fp_02.mz(this.ayt.aIk());
            fp_02.k(this.ayt.aKG());
            eo_0.a(fp_02, this.ayt.aKx().aII());
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Unable to save sprite " + this.ayt.getName(), iOException);
        }
    }
}

