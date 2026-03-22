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
 * Renamed from alq
 */
public class alq_2
implements ali_2,
alj_2 {
    private static final Logger cFn = Logger.getLogger(alq_2.class);
    private int cFl;
    private boolean cFm = true;
    private long beA;
    private byte cFh = (byte)100;
    private short cFo = 1;
    private float czo = 1.0f;
    private float czp = 1.0f;

    public alq_2() {
    }

    public alq_2(apl_1 apl_12) {
        this.a(apl_12);
    }

    public alq_2(int n, boolean bl, long l, byte by, short s) {
        this.cFl = n;
        this.cFm = bl;
        this.beA = l;
        this.cFh = by;
        this.cFo = s;
    }

    public alq_2(int n, boolean bl, long l, byte by, short s, float f2, float f3) {
        this.cFl = n;
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
        alu_1.a(arj_22, this.beA, this.cFh, this.bBN(), this.cFo, this.cFl, this.cFm, n);
    }

    @Override
    public int aeV() {
        return 5;
    }

    @Override
    public void a(apl_1 apl_12) {
        this.beA = apl_12.bFQ();
        this.cFh = apl_12.aIy();
        this.cFl = apl_12.aIA();
        this.cFm = apl_12.bFS();
        this.cFo = apl_12.aIz();
        this.czo = apl_12.aIB();
        this.czp = apl_12.aIB();
    }

    @Override
    public void b(fs_0 fs_02) {
        fs_02.cq(this.beA);
        fs_02.g(this.cFh);
        fs_02.mz(this.cFl);
        fs_02.ay(this.cFm);
        fs_02.k(this.cFo);
        fs_02.b(this.czo);
        fs_02.b(this.czp);
    }

    @Generated
    public int bBX() {
        return this.cFl;
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
    public void sT(int n) {
        this.cFl = n;
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
        if (!(object instanceof alq_2)) {
            return false;
        }
        alq_2 alq_22 = (alq_2)object;
        if (!alq_22.C(this)) {
            return false;
        }
        if (this.bBX() != alq_22.bBX()) {
            return false;
        }
        if (this.bBY() != alq_22.bBY()) {
            return false;
        }
        if (this.aYj() != alq_22.aYj()) {
            return false;
        }
        if (this.bBZ() != alq_22.bBZ()) {
            return false;
        }
        if (this.bCa() != alq_22.bCa()) {
            return false;
        }
        if (Float.compare(this.bBu(), alq_22.bBu()) != 0) {
            return false;
        }
        return Float.compare(this.bBv(), alq_22.bBv()) == 0;
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof alq_2;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + this.bBX();
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
        return "PlayLocalSoundData(m_rollOffPreset=" + this.bBX() + ", m_stopOnAnimationChange=" + this.bBY() + ", m_soundId=" + this.aYj() + ", m_gain=" + this.bBZ() + ", m_playCount=" + this.bCa() + ", m_minPitch=" + this.bBu() + ", m_maxPitch=" + this.bBv() + ")";
    }
}

