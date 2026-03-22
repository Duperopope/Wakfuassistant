/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ben
 */
public class ben_1
extends beh_2 {
    public ben_1(enk_0 enk_02) {
        super(enk_02);
    }

    public ben_1 det() {
        return new ben_1(this);
    }

    ben_1(ben_1 ben_12) {
        super(ben_12.hMZ);
    }

    @Override
    public void p(bdj_2 bdj_22) {
        this.a(bdj_22, true);
    }

    public void a(bdj_2 bdj_22, boolean bl) {
        bdj_22.ft(true);
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
        return super.equals(object);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public /* synthetic */ beh_2 deb() {
        return this.det();
    }
}

