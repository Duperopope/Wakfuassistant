/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from bep
 */
public class bep_1
extends beh_2 {
    public final float[] hNg;
    public final float hNh;
    public final boolean hNi;
    int hNj;

    public bep_1(enk_0 enk_02, float[] fArray, float f2, boolean bl) {
        super(enk_02);
        this.hNg = fArray;
        this.hNh = f2;
        this.hNi = bl;
    }

    private bep_1(bep_1 bep_12) {
        super(bep_12.hMZ);
        this.hNg = bep_12.hNg;
        this.hNh = bep_12.hNh;
        this.hNi = bep_12.hNi;
    }

    public bep_1 deu() {
        return new bep_1(this);
    }

    @Override
    public void p(bdj_2 bdj_22) {
        acf acf2 = (acf)asx_2.day.btu();
        acf2.a(bdj_22);
        acf2.t(0.0f, 0.0f, 0.0f);
        acf2.u(this.hNg[0], this.hNg[1], this.hNg[2]);
        acf2.s(0.0f, 0.0f, 0.2f);
        acf2.aT(this.hNh);
        acq_0.cge.a(acf2);
        if (this.hNi) {
            acf2.ut(500);
        } else {
            this.hNj = acf2.d();
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        bep_1 bep_12 = (bep_1)object;
        if (this.hNi != bep_12.hNi) {
            return false;
        }
        if (Float.compare(bep_12.hNh, this.hNh) != 0) {
            return false;
        }
        return Arrays.equals(this.hNg, bep_12.hNg);
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + (this.hNg != null ? Arrays.hashCode(this.hNg) : 0);
        n = 31 * n + (this.hNh != 0.0f ? Float.floatToIntBits(this.hNh) : 0);
        n = 31 * n + (this.hNi ? 1 : 0);
        return n;
    }

    public /* synthetic */ beh_2 deb() {
        return this.deu();
    }
}

