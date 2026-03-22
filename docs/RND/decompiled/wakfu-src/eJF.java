/*
 * Decompiled with CFR 0.152.
 */
public class eJF
extends eJE {
    public eJF(fdl fdl2) {
        super(fdl2);
    }

    @Override
    public boolean b(fgj_0 fgj_02, long l) {
        int n = this.qAe.cmm();
        return n != 0 && fgj_02.exS() < (long)n;
    }

    @Override
    public boolean c(fgj_0 fgj_02, long l) {
        throw new UnsupportedOperationException("Impossible de retirer d'argent sur ce type d'inventaire");
    }

    public boolean a(eJG eJG2, int n, int n2) {
        int n3 = this.qAe.Ui(n);
        int n4 = eJG2.Qe(n);
        return n3 != 0 && n2 <= n3 - n4;
    }

    public int b(eJG eJG2, int n, int n2) {
        throw new UnsupportedOperationException("Impossible de retirer d'objet sur ce type d'inventaire");
    }
}

