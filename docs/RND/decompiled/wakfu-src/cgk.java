/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.util.HashSet;
import org.apache.log4j.Logger;

final class cgk
extends ceK<cqn, bsi_0> {
    private static final Logger lTD = Logger.getLogger(cgk.class);
    private static final boolean lTE = false;

    cgk() {
    }

    public boolean a(cqn cqn2) {
        eUw eUw2 = eUw.Sy(cqn2.exZ());
        if (eUw2 == null) {
            lTD.error((Object)String.format("FightModel (typeId=%d) inconnu dans la cr\u00e9ation de l'external fight id=%d", cqn2.exZ(), cqn2.bha()));
            return false;
        }
        bsi_0 bsi_02 = new bsi_0(eUw2, cqn2.eyg());
        bsi_02.h((byte)0, cqn2.eyh());
        bsi_02.h((byte)1, cqn2.eyi());
        bsi_02.i((byte)0, cqn2.eyj());
        bsi_02.i((byte)1, cqn2.eyk());
        btc_0 btc_02 = new btc_0();
        new eUq(btc_02).eL(ByteBuffer.wrap(cqn2.eyc()));
        bsi_02.lK(cqn2.bha());
        bsi_02.a(cqn2.eyd());
        bsi_02.F(cqn2.eyf());
        bsi_02.d(btc_02);
        btc_02.a(true, false);
        boolean bl = aue_0.cVJ().cVK().dkZ() == null;
        for (int i = 0; i < cqn2.exY(); ++i) {
            byte by = cqn2.Lj(i);
            long l = cqn2.Li(i);
            bsi_02.f(by, l);
        }
        cgj.lTp.lTq.add(cqn2.bha());
        bsi_02.kr(cqn2.eye().get(0));
        bsi_02.ks(cqn2.eye().get(1));
        bsi_02.bK(cqn2.dGD());
        bgy bgy2 = bsi_02.kq(cqn2.eye().get(0));
        bgy bgy3 = bsi_02.kq(cqn2.eye().get(1));
        if (bgy2 != null && bgy3 != null) {
            cgj.lTp.lTr.put(cqn2.bha(), (Object)avx_0.a(1, (int)eui_1.rsG.aJr(), 0, bgy2, bgy3));
            cgj.lTp.lTs.put(cqn2.bha(), (Object)avx_0.a(2, (int)eui_1.rsG.aJr(), 0, bgy3, bgy2));
            cgj.lTp.lTt.put(cqn2.bha(), (Object)avx_0.a(3, (int)eui_1.rsG.aJr(), 0, bsi_02.bL(bgy2.bcP()), bgy3));
            cgj.lTp.lTu.put(cqn2.bha(), (Object)avx_0.a(4, (int)eui_1.rsG.aJr(), 0, bsi_02.bL(bgy3.bcP()), bgy2));
            cgj.lTp.lTw.put(cqn2.bha(), (Object)avb_0.a(6, eui_1.rsH.aJr(), 0, bgy3, "AnimHit", 250));
            if (bl) {
                cgj.lTp.lTx.put(cqn2.bha(), (Object)aVL.a(10, (int)eui_1.rsK.aJr(), 0, bgy3));
                HashSet<bgy> hashSet = new HashSet<bgy>(bsi_02.bL(bgy3.bcP()));
                hashSet.remove(bgy3);
                cgj.lTp.lTy.put(cqn2.bha(), (Object)aVL.a(10, (int)eui_1.rsK.aJr(), 0, hashSet));
            }
        }
        if (bgy2 != null) {
            bsi_02.aW(bgy2);
        }
        if (bgy3 != null) {
            bsi_02.aX(bgy3);
        }
        if (bl) {
            eSM eSM2 = eTo.fIZ().iU(cqn2.eya());
            if (eSM2 != null) {
                eSM eSM3 = (eSM)eSM2.b(new etj_0(cqn2.eyb(), btc_02.bgm(), btc_02.bgn(), btc_02.bdI(), bsi_02.bbh(), 0L, null, 0, abi_1.dzt));
                eSM3.h(btc_02);
                bsi_02.bai().a(eSM3);
            } else {
                lTD.error((Object)("Impossible de cr\u00e9er la bulle de combat : la zone d'effet d'index " + cqn2.eya() + " n'existe pas"));
            }
            ((bsh_0)bsi_02.dGx()).d(btc_02);
        }
        bsU.dHk().q(bsi_02);
        bzj_2.eqi().l(bsi_02);
        if (bgy2 != null && bgy3 != null) {
            aJP.cig().a(bsi_02);
        }
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cqn)aam_22);
    }
}

