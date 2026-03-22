/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

final class cgn
extends ceK<cqq_0, bsi_0> {
    private static final Logger lTG = Logger.getLogger(cgn.class);

    cgn() {
    }

    public boolean c(cqq_0 cqq_02) {
        boolean bl = false;
        for (int i = 0; i < cqq_02.exY(); ++i) {
            if (aue_0.cVJ().cVK().Sn() != cqq_02.Li(i)) continue;
            bl = true;
            break;
        }
        if (bl) {
            if (ceG.euA().euD() != null) {
                aVi.cWF().zY(ceG.euA().euD().d());
            }
            TIntObjectIterator<bsS> tIntObjectIterator = bsU.dHk().dHl();
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                bsS bsS2 = (bsS)tIntObjectIterator.value();
                if (!(bsS2 instanceof bsi_0)) continue;
                ((bsi_0)bsS2).dGu();
            }
            bsU.dHk().Fu(cqq_02.bha());
            for (int i = 0; i < cqq_02.exY(); ++i) {
                long l = cqq_02.Li(i);
                bgy bgy2 = bgg_0.dlO().ju(l);
                if (bgy2 == null) {
                    bgy bgy3 = (bgy)fcL.rUh.sw(l);
                    if (bgy3 == null) continue;
                    bgg_0.dlO().aq(bgy3);
                    bgy3.CI(cqq_02.bha());
                    continue;
                }
                bgy2.CI(cqq_02.bha());
            }
            btc_0 btc_02 = new btc_0();
            new eUq(btc_02).eL(ByteBuffer.wrap(cqq_02.eyp()));
            bsj_0 bsj_02 = bsU.dHk().a((int)cqq_02.exZ(), cqq_02.bha(), (rh_0)btc_02, cqq_02.dGW(), cqq_02.eyt(), cqq_02.eyu());
            bsj_02.a(btu.jlv);
            bsj_02.a(new bts_1());
            btu.jlv.a(bsR.jjA, new bth_1());
            ceG.euA().m(bsj_02);
            return ceG.euA().b(cqq_02);
        }
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.c((cqq_0)aam_22);
    }
}

