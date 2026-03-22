/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

final class chL
implements aaq_2<cvT> {
    chL() {
    }

    @Override
    public boolean a(cvT cvT2) {
        long l = cvT2.aXb();
        int n = cvT2.eEt();
        ArrayList<Integer> arrayList = cvT2.eEu();
        ArrayList<Integer> arrayList2 = cvT2.eEv();
        frb frb2 = new frb();
        frb2.a(l, n, (int)cvT2.cmL(), arrayList, arrayList2);
        Object t = fcL.rUh.sw(l);
        eIm eIm2 = ((exP)t).dnK();
        eIj eIj2 = eIm2.fwt();
        if (eIj2 != null && eIj2.wp() == n) {
            ((exP)t).f(((exP)t).dmQ());
        }
        if (aue_0.cVJ().c(cvu_2.eTO())) {
            cvu_2.eTO().eeK();
        }
        return false;
    }

    @Override
    public int bkq() {
        return 12657;
    }
}

