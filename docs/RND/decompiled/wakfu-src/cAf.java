/*
 * Decompiled with CFR 0.152.
 */
public final class cAf
implements aaq_2<cpc> {
    @Override
    public boolean a(cpc cpc2) {
        long l = cpc2.KU();
        Object t = fcL.rUh.sw(l);
        if (t == null) {
            return false;
        }
        int n = cpc2.ewU();
        int n2 = cpc2.ewV();
        eIj eIj2 = ((exP)t).dnK().PR(n);
        String string = eIj2.getName();
        String string2 = aum_0.cWf().c("buildSheet.set.notification.text", ((exP)t).getName(), string, n2);
        String string3 = aum_0.cWf().c("buildSheet.set.notification.title", new Object[0]);
        if (cvu_2.eQx()) {
            cvu_2.eTO().ow(l);
        }
        aaw_1.bUq().h(new dcd(string3, string2, biu_1.kiv));
        return false;
    }

    @Override
    public int bkq() {
        return 13091;
    }
}

