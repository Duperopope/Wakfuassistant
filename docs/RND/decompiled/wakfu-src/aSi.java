/*
 * Decompiled with CFR 0.152.
 */
public class aSi
extends aRY {
    private final byte eNn;
    private final short eNo;
    private final boolean eNp;

    public aSi(byte by, short s, boolean bl) {
        this.eNn = by;
        this.eNo = s;
        this.eNp = bl;
    }

    public aSi(byte by, short s) {
        this(by, s, false);
    }

    public aSi(byte by) {
        this(by, 0);
    }

    public aSi() {
        this(1);
    }

    @Override
    public boolean isValid() {
        if (this.eNn == 2 && this.eNo < 0) {
            return false;
        }
        return this.eNn != 3 || this.eNo >= 0;
    }

    @Override
    public void bGy() {
        if (this.eNn == 1) {
            aSi.jF("Ogrest chaos management");
            aSi.jF("ogrest_chaos ( 'help' | 'h' ) : display command help");
            aSi.jF("ogrest_chaos ( 'force' | 'f' ) instanceId enabled : force Ogrest chaos for specified instanceId to be enabled/disabled");
            aSi.jF("ogrest_chaos ( 'unforce' | 'u' ) instanceId : unforce Ogrest chaos for specified instanceId");
            aSi.jF("ogrest_chaos ( 'list' | 'l' ) : list forced instances");
            return;
        }
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)367);
        ns_02.D(this.eNn);
        if (this.eNn != 4) {
            ns_02.R(this.eNo);
            ns_02.aN(this.eNp);
        }
        ayf_22.d(ns_02);
    }
}

