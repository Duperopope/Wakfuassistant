/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

class btw
implements eVf<exP> {
    final /* synthetic */ int jlx;
    final /* synthetic */ QR jly;
    final /* synthetic */ bgt_0 jlz;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    btw(int n, QR qR, bgt_0 bgt_02) {
        this.jlx = n;
        this.jly = qR;
        this.jlz = bgt_02;
    }

    @Override
    public void b(exP exP2, fqD fqD2, acd_1 acd_12) {
        if (fqD2 == null || fqD2.d() != this.jlx) {
            return;
        }
        List<QQ> list = this.jly.g(acd_12);
        if (list.isEmpty()) {
            return;
        }
        for (QQ qQ : list) {
            this.jly.b(qQ);
        }
    }

    @Override
    public void z(exP exP2) {
        if (!this.jlz.equals(exP2)) {
            return;
        }
        this.jlz.e(exx_2.rGk).ot(0);
    }

    @Override
    public void dHP() {
        this.jlz.dkM();
    }
}

