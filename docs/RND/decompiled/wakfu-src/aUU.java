/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 */
import gnu.trove.map.hash.THashMap;
import java.util.Map;

public abstract class aUU
extends aga_2 {
    protected static final bsT hse = new bsT();
    private bsS efA;
    private final int hsf;

    public aUU(int n, int n2, int n3, int n4) {
        super(n, n2, n3);
        this.hsf = n4;
        THashMap tHashMap = new THashMap(1);
        tHashMap.put((Object)"fightId", (Object)this.hsf);
        this.t((Map<String, Object>)tHashMap);
        this.cWr();
    }

    protected void cWr() {
        if (this.efA == null) {
            this.efA = bsU.dHk().Ft(this.hsf);
        }
    }

    protected bsS cja() {
        this.cWr();
        return this.efA;
    }

    public int bha() {
        return this.hsf;
    }

    public boolean cWB() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return false;
        }
        this.cWr();
        bsj_0 bsj_02 = bgt_02.dmV();
        if (bsj_02 == null || this.efA == null) {
            return false;
        }
        return bsj_02 == this.efA;
    }

    public bgy iD(long l) {
        this.cWr();
        bgy bgy2 = null;
        if (this.efA != null) {
            bgy2 = this.efA.kq(l);
        }
        if (bgy2 == null) {
            bgy2 = bgg_0.dlO().ju(l);
        }
        return bgy2;
    }

    public QR bai() {
        this.cWr();
        if (this.efA == null) {
            dJP.error((Object)("combat non trouv\u00e9 : " + this.hsf));
            return null;
        }
        return this.efA.bai();
    }

    @Override
    protected void caV() {
        super.caV();
        bgy bgy2 = this.iD(this.caQ());
        bgy bgy3 = this.iD(this.Qy());
        aWq.b(bgy2, bgy3);
    }
}

