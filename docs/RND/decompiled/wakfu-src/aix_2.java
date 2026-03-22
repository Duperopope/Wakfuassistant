/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

/*
 * Renamed from aix
 */
public class aix_2
implements ali_2 {
    private long beA;
    private float czn = 100.0f;
    private float czo = 1.0f;
    private float czp = 1.0f;
    private int czq = -1;

    @Generated
    public aix_2() {
    }

    @Generated
    public long aYj() {
        return this.beA;
    }

    @Generated
    public float bBt() {
        return this.czn;
    }

    @Override
    @Generated
    public float bBu() {
        return this.czo;
    }

    @Override
    @Generated
    public float bBv() {
        return this.czp;
    }

    @Generated
    public int bBw() {
        return this.czq;
    }

    @Generated
    public void gc(long l) {
        this.beA = l;
    }

    @Generated
    public void cI(float f2) {
        this.czn = f2;
    }

    @Generated
    public void cJ(float f2) {
        this.czo = f2;
    }

    @Generated
    public void cK(float f2) {
        this.czp = f2;
    }

    @Generated
    public void sy(int n) {
        this.czq = n;
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof aix_2)) {
            return false;
        }
        aix_2 aix_22 = (aix_2)object;
        if (!aix_22.C(this)) {
            return false;
        }
        if (this.aYj() != aix_22.aYj()) {
            return false;
        }
        if (Float.compare(this.bBt(), aix_22.bBt()) != 0) {
            return false;
        }
        if (Float.compare(this.bBu(), aix_22.bBu()) != 0) {
            return false;
        }
        if (Float.compare(this.bBv(), aix_22.bBv()) != 0) {
            return false;
        }
        return this.bBw() == aix_22.bBw();
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof aix_2;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        long l = this.aYj();
        n2 = n2 * 59 + (int)(l >>> 32 ^ l);
        n2 = n2 * 59 + Float.floatToIntBits(this.bBt());
        n2 = n2 * 59 + Float.floatToIntBits(this.bBu());
        n2 = n2 * 59 + Float.floatToIntBits(this.bBv());
        n2 = n2 * 59 + this.bBw();
        return n2;
    }

    @Generated
    public String toString() {
        return "XmlSoundData(m_soundId=" + this.aYj() + ", m_gain=" + this.bBt() + ", m_minPitch=" + this.bBu() + ", m_maxPitch=" + this.bBv() + ", m_rollOff=" + this.bBw() + ")";
    }
}

