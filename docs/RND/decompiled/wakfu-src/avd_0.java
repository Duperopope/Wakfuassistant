/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aVd
 */
public class avd_0
extends aUV {
    public avd_0(int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4);
    }

    @Override
    public long cbk() {
        QQ qQ;
        if (this.bai() != null && (qQ = this.bai().dp(this.caQ())) != null) {
            if (qQ.a(etl_0.rnm)) {
                return 0L;
            }
            if (qQ instanceof bbC) {
                bbC bbC2 = (bbC)((Object)qQ);
                bby bby2 = bbC2.cZE();
                if (bbC2.la("AnimMort") && bby2.dae()) {
                    return bby2.ld("AnimMort");
                }
                return 0L;
            }
        }
        return 0L;
    }

    @Override
    protected void caV() {
        QQ qQ;
        if (this.bai() != null && (qQ = this.bai().dp(this.caQ())) != null) {
            bbC bbC2 = (bbC)((Object)qQ);
            cxq_1.eWO().a(bbC2.cZE().dac());
            this.cWu().bai().b(qQ);
        }
        super.caV();
    }
}

