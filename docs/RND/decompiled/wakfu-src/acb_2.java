/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from aCB
 */
public class acb_2
implements ace_2 {
    protected final List<acc_2> dBA;
    protected long dBB;
    protected long aHQ;

    public acb_2(List<acc_2> list, long l) {
        this.dBA = list;
        this.dBB = l;
        this.aHQ = 0L;
        for (acc_2 acc_22 : this.dBA) {
            this.aHQ += acc_22.Tz();
            acc_22.hs(l);
        }
    }

    @Override
    public acp_1 fZ(long l) {
        if (l <= this.dBB) {
            return this.bzK();
        }
        if (l >= this.dBB + this.aHQ) {
            return this.bzM();
        }
        for (int i = 0; i < this.dBA.size(); ++i) {
            acc_2 acc_22 = this.dBA.get(i);
            if (l < acc_22.bXG() || l >= acc_22.bXF()) continue;
            acp_1 acp_12 = acc_22.fZ(l);
            acp_12.ar(acc_22.bzK().aSe());
            return acp_12;
        }
        return this.bzM();
    }

    @Override
    public acp_1 a(long l, abi_1 abi_12, anp_2 anp_22) {
        return acb_2.a(this, l, abi_12, anp_22);
    }

    @Override
    public void hs(long l) {
        for (acc_2 acc_22 : this.dBA) {
            acc_22.hs(l);
        }
        this.dBB += l;
    }

    @Override
    public acp_1 bzK() {
        if (this.dBA == null || this.dBA.size() <= 0) {
            return null;
        }
        return this.dBA.get(0).bzK();
    }

    @Override
    public acp_1 bzM() {
        if (this.dBA == null || this.dBA.size() <= 0) {
            return null;
        }
        return this.dBA.get(this.dBA.size() - 1).bzM();
    }

    @Override
    public long bXF() {
        return this.dBB + this.aHQ;
    }

    @Override
    public long bXG() {
        return this.dBB;
    }

    @Override
    public boolean hr(long l) {
        return false;
    }

    public static acp_1 a(ace_2 ace_22, long l, abi_1 abi_12, anp_2 anp_22) {
        long l2 = 75L;
        acp_1 acp_12 = ace_22.fZ(l);
        if (ace_22.hr(l)) {
            return acp_12;
        }
        acp_1 acp_13 = new acp_1(switch (abi_12.dzz) {
            case -1 -> GC.C(acp_12.aSc());
            case 1 -> GC.B(acp_12.aSc());
            default -> GC.A(acp_12.aSc());
        }, switch (abi_12.dzA) {
            case -1 -> GC.C(acp_12.aSd());
            case 1 -> GC.B(acp_12.aSd());
            default -> GC.A(acp_12.aSd());
        }, GC.A(acp_12.aSe()));
        acp_1 acp_14 = new acp_1(acp_13);
        acp_1 acp_15 = acp_13;
        long l3 = ace_22.bXF();
        boolean bl = anp_22.l(new int[]{(int)acp_14.aSc(), (int)acp_14.aSd(), (int)acp_14.aSe()});
        while (l < l3 && (acp_14.equals(acp_13) || !bl)) {
            acp_15 = ace_22.fZ(l + 75L);
            acp_14.m(switch (abi_12.dzz) {
                case -1 -> GC.C(acp_15.aSc());
                case 1 -> GC.B(acp_15.aSc());
                default -> GC.A(acp_15.aSc());
            }, switch (abi_12.dzA) {
                case -1 -> GC.C(acp_15.aSd());
                case 1 -> GC.B(acp_15.aSd());
                default -> GC.A(acp_15.aSd());
            }, GC.A(acp_15.aSe()));
            l += 75L;
            bl = anp_22.m(new int[]{(int)acp_14.aSc(), (int)acp_14.aSd()});
        }
        return acp_15;
    }
}

