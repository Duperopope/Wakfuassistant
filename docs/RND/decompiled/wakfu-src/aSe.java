/*
 * Decompiled with CFR 0.152.
 */
public class aSe
extends aRY {
    public static final int eNa = 0;
    public static final int eNb = 1;
    public static final int eNc = 2;
    private final int eNd;
    private final long eNe;
    private final int eNf;
    private final ftX eNg;

    public aSe(int n) {
        this(n, -1L, -1, "");
    }

    public aSe(int n, long l, int n2, String string) {
        this.eNd = n;
        this.eNe = l;
        this.eNf = n2;
        this.eNg = "HIDDEN".equals(string) ? ftX.tha : ftX.tgZ;
    }

    @Override
    public boolean isValid() {
        switch (this.eNd) {
            case 0: {
                return this.eNe > 0L && this.eNf > 0;
            }
            case 1: {
                return this.eNe > 0L && this.eNf == -1;
            }
            case 2: {
                return this.eNe == -1L && this.eNf == -1;
            }
        }
        return false;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)2);
        ns_02.Q((short)114);
        ns_02.cX(this.eNe);
        ns_02.nX(this.eNf);
        ns_02.nX(this.eNg.d());
        ayf_22.d(ns_02);
    }
}

