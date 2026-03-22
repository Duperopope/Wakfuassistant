/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from Es
 */
public class es_0
implements eu_0 {
    private final ff_0 ayu;

    public es_0(ff_0 ff_02) {
        this.ayu = ff_02;
    }

    @Override
    public final void b(fp_0 fp_02) {
        try {
            fp_02.k(this.ayu.aIi());
            fp_02.g(this.ayu.aIl());
            if (this.ayu.mK(64)) {
                fp_02.bo(this.ayu.getName());
            }
            fp_02.mz(this.ayu.aIj());
            fp_02.mz(this.ayu.aIk());
            fp_02.k(this.ayu.aKG());
            short[] sArray = this.ayu.aKz();
            fp_02.k((short)sArray.length);
            for (short s : sArray) {
                fp_02.k(s);
            }
            eo_0.a(fp_02, this.ayu.aKx().aII());
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Unable to save sprite " + this.ayu.getName(), iOException);
        }
    }
}

