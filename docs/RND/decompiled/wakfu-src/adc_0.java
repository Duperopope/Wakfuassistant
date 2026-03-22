/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from adc
 */
public class adc_0 {
    public int cis;
    public String p;
    public int cit;
    public boolean ciu;
    public int civ;
    public byte ciw;
    public int cix;
    public short ciy;

    public adc_0() {
    }

    public adc_0(int n, String string, int n2, boolean bl, int n3, byte by, int n4, short s) {
        this.cis = n;
        this.p = string;
        this.cit = n2;
        this.ciu = bl;
        this.civ = n3;
        this.ciw = by;
        this.cix = n4;
        this.ciy = s;
    }

    final void e(@NotNull apl_1 apl_12) {
        this.cis = apl_12.aIA();
        short s = apl_12.aIz();
        byte[] byArray = apl_12.mv(s);
        this.p = BH.dc(byArray);
        this.cit = apl_12.aIA();
        this.ciu = apl_12.bFS();
        this.civ = apl_12.aIA();
        this.ciw = apl_12.aIy();
        this.cix = apl_12.aIA();
        this.ciy = apl_12.aIz();
    }

    final void f(@NotNull fs_0 fs_02) {
        fs_02.mz(this.cis);
        byte[] byArray = BH.aP(this.p);
        fs_02.k((short)byArray.length);
        fs_02.di(byArray);
        fs_02.mz(this.cit);
        fs_02.ay(this.ciu);
        fs_02.mz(this.civ);
        fs_02.g(this.ciw);
        fs_02.mz(this.cix);
        fs_02.k(this.ciy);
    }
}

