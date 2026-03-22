/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

public abstract class fqB
implements eNl {
    public static final short sTS = 0;
    public static final short sTT = 0;
    public static final short sTU = 0;
    protected int sTV;
    protected short ejt;
    protected azl_2<enk_0> bil = new azl_2();

    public static short YZ(int n) {
        return (short)(n & 0xFF);
    }

    @Override
    public short cmL() {
        return this.ejt;
    }

    protected fqB() {
    }

    public fqB(int n) {
        this.sTV = n;
    }

    public abstract fqB ci(short var1);

    public int giA() {
        return 0;
    }

    public int giB() {
        return 0;
    }

    public int giC() {
        return this.sTV;
    }

    public void v(enk_0 enk_02) {
        this.bil.M(enk_02);
    }

    @Override
    @NotNull
    public Iterator<enk_0> iterator() {
        return this.bil.iterator();
    }

    public int eey() {
        return this.bil.aVo();
    }

    public enk_0 Pv(int n) {
        return this.bil.vK(n);
    }

    @Override
    public int bab() {
        return 4;
    }

    @Override
    public long QF() {
        return this.sTV;
    }

    @Override
    public short fvT() {
        return 0;
    }

    @Override
    public short fvU() {
        return 0;
    }

    @Override
    public short fvV() {
        return 0;
    }

    public String toString() {
        return "AbstractEffectGroup{m_effectGroupBaseId=" + this.sTV + ", m_level=" + this.ejt + ", m_effects=" + String.valueOf(this.bil) + "}";
    }
}

