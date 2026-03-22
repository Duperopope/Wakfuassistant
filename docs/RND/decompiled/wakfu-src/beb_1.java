/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from beb
 */
public class beb_1
extends beh_2 {
    public final float[] hMP;
    public final int hMQ;

    public beb_1(enk_0 enk_02, float[] fArray, int n) {
        super(enk_02);
        this.hMP = beb_1.aa(fArray);
        this.hMQ = n;
    }

    private beb_1(beb_1 beb_12) {
        super(beb_12.hMZ);
        this.hMQ = beb_12.hMQ;
        this.hMP = beb_12.hMP;
    }

    private static float[] aa(float[] fArray) {
        return new float[]{fArray[0] * 1.25f, fArray[1] * 1.25f, fArray[2] * 1.25f, 1.0f};
    }

    @Override
    public void p(bdj_2 bdj_22) {
        this.a(bdj_22, true);
    }

    public void a(bdj_2 bdj_22, boolean bl) {
        bdj_22.a(this.hMQ, this.hMP);
        if (bl) {
            bdj_22.dcP().dkr();
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
        beb_1 beb_12 = (beb_1)object;
        if (this.hMQ != beb_12.hMQ) {
            return false;
        }
        return Arrays.equals(this.hMP, beb_12.hMP);
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + (this.hMP != null ? Arrays.hashCode(this.hMP) : 0);
        n = 31 * n + this.hMQ;
        return n;
    }

    public beb_1 dej() {
        return new beb_1(this);
    }

    public /* synthetic */ beh_2 deb() {
        return this.dej();
    }
}

