/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from beh
 */
public abstract class beh_2 {
    protected final enk_0 hMZ;

    protected beh_2(enk_0 enk_02) {
        this.hMZ = enk_02;
    }

    public abstract void p(bdj_2 var1);

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        beh_2 beh_22 = (beh_2)object;
        return this.hMZ.aZH() == beh_22.hMZ.aZH();
    }

    public int hashCode() {
        return this.hMZ.hashCode();
    }

    public abstract <U extends beh_2> U deb();
}

