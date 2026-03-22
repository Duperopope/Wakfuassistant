/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 */
import gnu.trove.iterator.TLongObjectIterator;

/*
 * Renamed from czH
 */
public final class czh_0
implements aaq_2<crV> {
    @Override
    public boolean a(crV crV2) {
        TLongObjectIterator tLongObjectIterator = crV2.chB().iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            long l = (Long)((azy_1)tLongObjectIterator.value()).getFirst();
            bCA bCA2 = bcw_0.dQn().kY(l);
            if (bCA2 == null) continue;
            long l2 = tLongObjectIterator.key();
            byte[] byArray = (byte[])((azy_1)tLongObjectIterator.value()).aHI();
            Long l3 = (Long)((azy_1)tLongObjectIterator.value()).bTE();
            acd_1 acd_12 = anf_2.gn(l3);
            bCA2.b(acd_12);
            bCA2.as(byArray);
            bCA2.beD();
            bCA2.dC(l2);
            bCA2.kZ(l);
            for (ng_1 ng_12 : bCA2.aVG()) {
                if (!(ng_12 instanceof afk_0)) continue;
                afk_0 afk_02 = (afk_0)ng_12;
                afh_0.bxU().a(afk_02);
                afk_02.bpH();
                agX.c(afk_02);
            }
            bCA2.aVQ();
            czh_0.a(bCA2, true);
            bzj_2.eqi().k(bCA2);
        }
        return false;
    }

    private static boolean a(ni_1 ni_12, boolean bl) {
        bCA bCA2;
        bgt_0 bgt_02 = aie_0.cfo().cVK();
        bnv_2 bnv_22 = bgt_02.dnw();
        if (ni_12 == null) {
            return false;
        }
        if (bnv_22 == null) {
            return false;
        }
        fnH fnH2 = null;
        if (ni_12 instanceof fnH) {
            fnH2 = (fnH)((Object)ni_12);
        } else if (ni_12 instanceof bCA && (bCA2 = (bCA)ni_12).bej()) {
            fnH2 = bCA2.dNk();
        }
        if (fnH2 == null) {
            return false;
        }
        if (bl) {
            bnv_22.a(fnH2);
        } else {
            bnv_22.b(fnH2);
        }
        return false;
    }

    @Override
    public int bkq() {
        return 12282;
    }
}

