/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

class cdI
implements aaq_2<cuj_0> {
    cdI() {
    }

    @Override
    public boolean a(cuj_0 cuj_02) {
        long l = cuj_02.bSZ();
        bgt_0 bgt_02 = (bgt_0)fcL.rUh.sw(cuj_02.KU());
        if (bgt_02 == null) {
            cdh_0.lQR.error((Object)("On a re\u00e7u un message d'update de pet pour un personnage qui n'existe pas dans le manager : " + cuj_02.KU()));
            return false;
        }
        Object t = fcI.ag(bgt_02.Xi(), l);
        if (t == null || ((exP)t).Sn() != bgt_02.Sn()) {
            return false;
        }
        ffV ffV2 = bgt_02.jC(l);
        long l2 = aue_0.cVJ().cVO().xl();
        eJS eJS2 = eJN.qAF.Q(l2, l);
        if (eJS2 != null) {
            ffV2 = (ffV)eJS2.dme().dN(l);
        }
        fnm_0 fnm_02 = new fnm_0(ffV2, bgt_02);
        Iterator<fnt_0> iterator = cuj_02.eAy();
        while (iterator.hasNext()) {
            iterator.next().a(fnm_02);
        }
        if (cuj_02.eDt() == fnv_0.sKJ) {
            cxx_1.eXf().bU(ffV2);
        }
        return false;
    }

    @Override
    public int bkq() {
        return 12218;
    }
}

