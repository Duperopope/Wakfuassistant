/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Iterator;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public abstract class fqE<Spell extends fqD>
implements RT,
eNl,
ftA,
gq_0<ym_1> {
    protected static final Logger sUG = Logger.getLogger(fqE.class);
    public static final short sUH = 1;
    public static final short sUI = 1;
    public static final short sUJ = 1;
    public static final int sUK = -1;
    protected Spell sUL;
    protected long bgK;
    protected short ejt;

    protected fqE() {
    }

    public Spell giP() {
        return this.sUL;
    }

    public abstract fqF<Spell> eeM();

    @Override
    public int bab() {
        if (this.sUL == null) {
            sUG.error((Object)("ATTENTION, on essaie de v\u00e9rifier le type de conteneur mais le spell est inconnu, uid : " + this.bgK), (Throwable)new Exception("for stacktrace"));
            return 11;
        }
        if (((fqD)this.sUL).eeY()) {
            return 25;
        }
        return 11;
    }

    @Override
    public long QF() {
        if (this.sUL == null) {
            sUG.error((Object)"On cherche a r\u00e9cup\u00e9rer l'id d'un SpellLevel mais son spell associ\u00e9 est null ", (Throwable)new Exception("Exception pour etude de stack"));
            return 0L;
        }
        return fqE.O(((fqD)this.sUL).d(), this.cmL());
    }

    public static long O(int n, short s) {
        return ((long)n << 16) + (long)(s & 0xFF);
    }

    public static int uC(long l) {
        return (int)(l >> 16);
    }

    public static short uD(long l) {
        return (short)(l & 0xFFL);
    }

    @Override
    @NotNull
    public Iterator<enk_0> iterator() {
        return ((fqD)this.sUL).fA(this.cmL());
    }

    @Override
    public void aZp() {
    }

    protected void clear() {
        this.sUL = null;
        this.ejt = 0;
        this.bgK = -1L;
    }

    public void di(long l) {
        this.bgK = l;
    }

    @Override
    public long LV() {
        return this.bgK;
    }

    public int aVt() {
        return -1;
    }

    @Override
    public int avr() {
        return ((fqD)this.sUL).d();
    }

    public boolean d(ym_1 ym_12) {
        ym_12.ZC = this.bgK;
        ym_12.alB = ((fqD)this.sUL).d();
        ym_12.Xr = this.ejt;
        return true;
    }

    public zh_2 giQ() {
        return zh_2.axC().bU(this.bgK).kn(((fqD)this.sUL).d()).ko(this.ejt).axI();
    }

    public boolean e(ym_1 ym_12) {
        this.bgK = ym_12.ZC;
        this.sUL = this.eeM().Ig(ym_12.alB);
        if (this.sUL == null) {
            sUG.error((Object)("Unable to unserialize the spell " + ym_12.alB + ", UID : " + this.bgK));
            return false;
        }
        this.cj(ym_12.Xr);
        return true;
    }

    @Override
    public short bfd() {
        return 1;
    }

    @Override
    public void ak(short s) {
    }

    @Override
    public void al(short s) {
    }

    @Override
    public boolean n(RT rT) {
        return false;
    }

    @Override
    public short bfe() {
        return 1;
    }

    @Override
    public boolean bfh() {
        return true;
    }

    @Override
    public short fvT() {
        return 1;
    }

    @Override
    public short fvU() {
        return 1;
    }

    @Override
    public short fvV() {
        return 1;
    }

    @Override
    public short cmL() {
        return this.ejt;
    }

    public short aVe() {
        return (short)((fqD)this.sUL).Fq();
    }

    public short cj(short s) {
        if (s > ((fqD)this.sUL).Fq()) {
            s = (short)((fqD)this.sUL).Fq();
        }
        this.ejt = s;
        return this.ejt;
    }

    public eNd dTh() {
        if (this.sUL == null) {
            return null;
        }
        return eNd.ff(((fqD)this.sUL).giG());
    }

    public fqO a(exP exP2, Object object, Object object2) {
        if (this.sUL == null) {
            return null;
        }
        return ((fqD)this.sUL).g(this, exP2, object, object2);
    }

    public int axA() {
        if (this.sUL != null) {
            return ((fqD)this.sUL).d();
        }
        return -1;
    }

    public byte b(exP exP2, Object object, Object object2) {
        return (byte)GC.B(((fqD)this.sUL).b(this, exP2, object, object2) + ((fqD)this.sUL).c(this, exP2, object, object2) * (float)this.cmL());
    }

    public String toString() {
        return "AbstractSpellLevel{m_spell=" + String.valueOf(this.sUL) + ", m_uid=" + this.bgK + ", m_level=" + this.ejt + "}";
    }

    @Override
    public /* synthetic */ boolean b(Object object) {
        return this.e((ym_1)object);
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.d((ym_1)object);
    }
}

