/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fke
 */
final class fke_0
implements fkd_0 {
    private final int sAt;
    private final int sAu;
    private final int sAv;
    private final String sAw;
    private final String sAx;
    private final fkj_0[] sAy;

    fke_0(int n, int n2, int n3, String string, String string2, fkj_0[] fkj_0Array) {
        this.sAt = n;
        this.sAu = n2;
        this.sAv = n3;
        this.sAw = string;
        this.sAx = string2;
        this.sAy = fkj_0Array;
    }

    @Override
    public String clY() {
        return this.sAw;
    }

    @Override
    public int clW() {
        return this.sAu;
    }

    @Override
    public String ajo() {
        return this.sAx;
    }

    @Override
    public int clX() {
        return this.sAv;
    }

    @Override
    public boolean b(fkj_0 fkj_02) {
        for (int i = 0; i < this.sAy.length; ++i) {
            if (this.sAy[i] != fkj_02) continue;
            return true;
        }
        return false;
    }

    @Override
    public int d() {
        return this.sAt;
    }
}

