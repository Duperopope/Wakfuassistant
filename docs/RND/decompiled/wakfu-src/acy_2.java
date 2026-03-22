/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from aCy
 */
public class acy_2
implements ace_2 {
    private acp_1 cvS;
    private acp_1 cvU;
    private long dBw;
    private long dBx;
    private final ArrayList<ace_2> dBy = new ArrayList();

    public acy_2(long l) {
        this.dBw = l;
        this.dBx = l;
    }

    public void a(ace_2 ace_22) {
        if (this.cvS == null) {
            this.cvS = ace_22.bzK();
        }
        this.cvU = ace_22.bzM();
        ace_22.hs(this.dBx);
        this.dBx += ace_22.bXF() - ace_22.bXG();
        this.dBy.add(ace_22);
    }

    @Override
    public acp_1 fZ(long l) {
        if (l >= this.dBx) {
            return this.bzM();
        }
        for (ace_2 ace_22 : this.dBy) {
            if (l < ace_22.bXG() || l >= ace_22.bXF()) continue;
            return ace_22.fZ(l);
        }
        return this.cvS;
    }

    @Override
    public acp_1 bzK() {
        return this.cvS;
    }

    @Override
    public acp_1 bzM() {
        return this.cvU;
    }

    @Override
    public long bXF() {
        return this.dBx;
    }

    @Override
    public long bXG() {
        return this.dBw;
    }

    @Override
    public boolean hr(long l) {
        if (l >= this.dBx) {
            return false;
        }
        for (ace_2 ace_22 : this.dBy) {
            if (l < ace_22.bXG() || l >= ace_22.bXF()) continue;
            return ace_22.hr(l);
        }
        return false;
    }

    @Override
    public acp_1 a(long l, abi_1 abi_12, anp_2 anp_22) {
        return acb_2.a(this, l, abi_12, anp_22);
    }

    @Override
    public void hs(long l) {
        this.dBw += l;
        this.dBx += l;
    }
}

