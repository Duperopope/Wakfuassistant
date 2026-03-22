/*
 * Decompiled with CFR 0.152.
 */
public class buU
extends eyy_2 {
    public buU(ezu_1 ezu_12) {
        super(ezu_12);
    }

    @Override
    public void B(long l, int n) {
        ezz_1 ezz_12 = this.drl().jP(l);
        int n2 = ezz_12.Xk();
        super.B(l, n);
        int n3 = ezz_12.Xk();
        if (n2 == n3) {
            return;
        }
        if (ezz_12.Sn() != aue_0.cVJ().cVK().Sn()) {
            return;
        }
        aPd.f("guild.chatPointsGain", n3 - n2);
    }

    @Override
    public void t(long l, long l2) {
        ezz_1 ezz_12 = this.drl().jP(l);
        long l3 = ezz_12.Xm();
        super.t(l, l2);
        if (l2 == l3) {
            return;
        }
        Object t = fcL.rUh.sw(l);
        if (t == null) {
            return;
        }
        fab fab2 = this.drl().jR(l2);
        if (fab2 == null) {
            return;
        }
        String string = fab2.getName();
        String string2 = aum_0.cWf().c("notification.guildRankChangeText", ((exP)t).getName(), string);
        cwy_2.nUc.y(string2, 4);
    }

    @Override
    public void kH(long l) {
        super.kH(l);
        fcL.rUh.a(aue_0.cVJ().cVK().Xi(), bgt_02 -> {
            if (this.drl().jP(bgt_02.Sn()) != null) {
                bgt_02.jK(l);
            }
            return true;
        });
    }
}

