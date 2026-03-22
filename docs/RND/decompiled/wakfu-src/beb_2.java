/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from beB
 */
public class beb_2
extends beh_2 {
    public final bdy_2 hNG;

    public beb_2(enk_0 enk_02, String string, boolean bl) {
        super(enk_02);
        this.hNG = new bdy_2(string, bl);
    }

    public beb_2 deB() {
        return new beb_2(this);
    }

    private beb_2(beb_2 beb_22) {
        super(beb_22.hMZ);
        this.hNG = beb_22.hNG;
    }

    @Override
    public void p(bdj_2 bdj_22) {
        bdj_22.a(this.hNG);
        this.hNG.Z(bdj_22.dcP());
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
        beb_2 beb_22 = (beb_2)object;
        return this.hNG.b(beb_22.hNG);
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + this.hNG.hashCode();
        return n;
    }

    public /* synthetic */ beh_2 deb() {
        return this.deB();
    }
}

