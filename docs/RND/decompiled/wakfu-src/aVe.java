/*
 * Decompiled with CFR 0.152.
 */
public class aVe
extends aUU {
    private final boolean hsA;

    public aVe(int n, int n2, int n3, int n4, boolean bl, long l) {
        super(n, n2, n3, n4);
        eSS eSS2;
        this.hsA = bl;
        this.f(new bwe_2(this));
        eTo.fIZ().iY(l);
        if (this.bai() != null && (eSS2 = eTo.fIZ().iY(l)) instanceof bbD) {
            this.xV(((bbD)((Object)eSS2)).cbt());
        }
    }

    @Override
    public long cbk() {
        QQ qQ;
        bgy bgy2 = this.iD(this.Qy());
        if (this.bai() != null && (qQ = this.bai().dp(this.caQ())) != null) {
            if (this.hsA) {
                long l;
                bbC bbC2;
                qQ.a((QD)null, (anu_1)bgy2);
                long l2 = 0L;
                if (qQ instanceof bbC && (bbC2 = (bbC)((Object)qQ)).la("AnimAttaque")) {
                    l2 = bbC2.cZE().ld("AnimAttaque");
                }
                return (l = super.cbk()) > l2 ? l : l2;
            }
            qQ.g(bgy2);
        }
        this.caT();
        return -1L;
    }

    @Override
    protected void caV() {
    }
}

