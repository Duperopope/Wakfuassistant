/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.apache.log4j.Logger
 */
import lombok.Generated;
import org.apache.log4j.Logger;

/*
 * Renamed from alt
 */
public class alt_1
implements ali_2,
alj_2 {
    private static final Logger cFs = Logger.getLogger(alt_1.class);
    private boolean cFm = true;
    private long beA;
    private byte cFh = (byte)100;
    private short cFo = 1;
    private float czo = 1.0f;
    private float czp = 1.0f;

    public alt_1() {
    }

    public alt_1(apl_1 apl_12) {
        this.a(apl_12);
    }

    public alt_1(boolean bl, long l, byte by, short s) {
        this(bl, l, by, s, 1.0f, 1.0f);
    }

    public alt_1(boolean bl, long l, byte by, short s, float f2, float f3) {
        this.cFm = bl;
        this.beA = l;
        this.cFh = by;
        this.cFo = s;
        this.czo = f2;
        this.czp = f3;
    }

    @Override
    public void a(arj_2 arj_22, int n) {
        if (!alu_1.c(arj_22, this.beA)) {
            return;
        }
        if (!alu_1.gh(this.beA)) {
            return;
        }
        alu_1.a(arj_22, this.beA, (float)this.cFh, this.bBN(), this.cFo, this.cFm, n);
    }

    @Override
    public int aeV() {
        return 3;
    }

    @Override
    public void a(apl_1 apl_12) {
        this.beA = apl_12.bFQ();
        this.cFh = apl_12.aIy();
        this.cFm = apl_12.bFS();
        this.cFo = apl_12.aIz();
        this.czo = apl_12.aIB();
        this.czp = apl_12.aIB();
    }

    @Override
    public void b(fs_0 fs_02) {
        fs_02.cq(this.beA);
        fs_02.g(this.cFh);
        fs_02.ay(this.cFm);
        fs_02.k(this.cFo);
        fs_02.b(this.czo);
        fs_02.b(this.czp);
    }

    @Generated
    public boolean bBY() {
        return this.cFm;
    }

    @Generated
    public long aYj() {
        return this.beA;
    }

    @Generated
    public byte bBZ() {
        return this.cFh;
    }

    @Generated
    public short bCa() {
        return this.cFo;
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
    public void cA(boolean bl) {
        this.cFm = bl;
    }

    @Generated
    public void gc(long l) {
        this.beA = l;
    }

    @Generated
    public void aw(byte by) {
        this.cFh = by;
    }

    @Generated
    public void ay(short s) {
        this.cFo = s;
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
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof alt_1)) {
            return false;
        }
        alt_1 alt_12 = (alt_1)object;
        if (!alt_12.C(this)) {
            return false;
        }
        if (this.bBY() != alt_12.bBY()) {
            return false;
        }
        if (this.aYj() != alt_12.aYj()) {
            return false;
        }
        if (this.bBZ() != alt_12.bBZ()) {
            return false;
        }
        if (this.bCa() != alt_12.bCa()) {
            return false;
        }
        if (Float.compare(this.bBu(), alt_12.bBu()) != 0) {
            return false;
        }
        return Float.compare(this.bBv(), alt_12.bBv()) == 0;
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof alt_1;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + (this.bBY() ? 79 : 97);
        long l = this.aYj();
        n2 = n2 * 59 + (int)(l >>> 32 ^ l);
        n2 = n2 * 59 + this.bBZ();
        n2 = n2 * 59 + this.bCa();
        n2 = n2 * 59 + Float.floatToIntBits(this.bBu());
        n2 = n2 * 59 + Float.floatToIntBits(this.bBv());
        return n2;
    }

    @Generated
    public String toString() {
        return "PlaySoundData(m_stopOnAnimationChange=" + this.bBY() + ", m_soundId=" + this.aYj() + ", m_gain=" + this.bBZ() + ", m_playCount=" + this.bCa() + ", m_minPitch=" + this.bBu() + ", m_maxPitch=" + this.bBv() + ")";
    }
}

