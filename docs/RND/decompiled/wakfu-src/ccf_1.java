/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ccF
 */
class ccf_1
implements aaq_2<ciz_0> {
    ccf_1() {
    }

    @Override
    public boolean a(ciz_0 ciz_02) {
        int n2 = ciz_02.evr();
        String string2 = aum_0.cWf().c("connection.queued.message", n2);
        if (cce_1.lPw != null) {
            cce_1.lPw.vF(string2);
            return false;
        }
        cce_1.lPw = new fik_2().vE(string2).pd(true).vG(ccp_2.mRL.byf()).a(fil_2.gCq()).a((int n, String string) -> {
            aue_0.cVJ().oi(null);
            aue_0.cVJ().oj(null);
            aue_0.cVJ().kS(null);
            aue_0.cVJ().kH("Player cancel waiting queue");
        });
        fiq_2.gCw().d(cce_1.lPw);
        return false;
    }

    @Override
    public int bkq() {
        return 530;
    }
}

