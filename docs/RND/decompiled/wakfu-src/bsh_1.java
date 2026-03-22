/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from bSH
 */
class bsh_1
implements fcM<bgt_0> {
    final /* synthetic */ bsg_1 lie;

    bsh_1(bsg_1 bsg_12) {
        this.lie = bsg_12;
    }

    @Override
    public void N(bgt_0 bgt_02) {
    }

    @Override
    public void O(bgt_0 bgt_02) {
        if (!bgt_02.dmc()) {
            return;
        }
        bsz_2 bsz_22 = new bsz_2(bgt_02);
        this.lie.b(bsz_22);
        try {
            bsz_22.buq();
        }
        catch (IOException iOException) {
            bsg_1.lhV.warn((Object)String.format("Error occurred on load of AccountPreferenceStore for hero : %s", bgt_02.Sn()), (Throwable)iOException);
        }
    }

    public void P(bgt_0 bgt_02) {
        if (!bgt_02.dmc()) {
            return;
        }
        this.lie.a(bgt_02.Sn(), (bsz_2)null);
    }

    public void Q(bgt_0 bgt_02) {
    }

    @Override
    public /* synthetic */ void L(exP exP2) {
        this.Q((bgt_0)exP2);
    }

    @Override
    public /* synthetic */ void M(exP exP2) {
        this.P((bgt_0)exP2);
    }

    @Override
    public /* synthetic */ void N(exP exP2) {
        this.O((bgt_0)exP2);
    }

    @Override
    public /* synthetic */ void O(exP exP2) {
        this.N((bgt_0)exP2);
    }
}

