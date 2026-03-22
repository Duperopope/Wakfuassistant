/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.Set;

class eTN
extends fi_1 {
    final /* synthetic */ eTL rqf;

    eTN(eTL eTL2) {
        this.rqf = eTL2;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        Set<eTw> set = this.rqf.rqc.dEQ();
        byteBuffer.putInt(set.size());
        eTC eTC2 = eTC.fJn();
        for (eTw eTw2 : set) {
            eTC2.p(eTw2);
            eTC2.as(byteBuffer);
        }
        eTC2.aZp();
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.rqf.rqc.clear();
        int n2 = byteBuffer.getInt();
        eTC eTC2 = eTC.fJn();
        for (int i = 0; i < n2; ++i) {
            eTC2.eL(byteBuffer);
            this.rqf.rqc.a(eTC2.dFm());
            eTC2.p(null);
        }
        eTC2.aZp();
    }

    @Override
    public int zt() {
        if (this.rqf.rqc == null) {
            return 0;
        }
        Set<eTw> set = this.rqf.rqc.dEQ();
        int n = 0;
        eTC eTC2 = eTC.fJn();
        for (eTw eTw2 : set) {
            eTC2.p(eTw2);
            n += eTC2.zt();
        }
        eTC2.aZp();
        return 4 + n;
    }
}

