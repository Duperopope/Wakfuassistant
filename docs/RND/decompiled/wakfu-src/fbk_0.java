/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from fbK
 */
public abstract class fbk_0 {
    protected final short rSi;
    protected final short rSj;
    protected final int rSk;
    protected final byte rSl;
    protected final int rSm;
    protected final int rSn;
    protected final int rSo;
    protected final boolean rSp;

    protected fbk_0(short s, short s2, int n, byte by, int n2, int n3, int n4, boolean bl) {
        this.rSi = s;
        this.rSj = s2;
        this.rSk = n;
        this.rSl = by;
        this.rSm = n2;
        this.rSn = n3;
        this.rSo = n4;
        this.rSp = bl;
    }

    public short aIi() {
        return this.rSi;
    }

    public int fSb() {
        return this.rSk;
    }

    public int conn() {
        return this.rSn;
    }

    public abstract int Kp(int var1);

    public short coj() {
        return this.rSj;
    }

    public byte fSc() {
        return this.rSl;
    }

    public int fSd() {
        return this.rSm;
    }

    public int fSe() {
        return this.rSo;
    }

    public boolean bcI() {
        return this.rSp;
    }

    public abstract boolean coy();

    public abstract boolean erO();

    public abstract boolean z(TObjectProcedure<fbv_0> var1);

    public abstract boolean Kq(int var1);

    public abstract int[] erP();
}

