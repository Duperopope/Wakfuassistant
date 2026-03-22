/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.util.List;
import org.apache.log4j.Logger;

public final class bsM {
    private static final Logger jjd = Logger.getLogger(bsM.class);
    private bsj_0 hvQ;

    public bsj_0 a(cqq_0 cqq_02, bsj_0 bsj_02) {
        Object object;
        this.hvQ = bsj_02;
        cqr_0[] cqr_0Array = cqq_02.eys();
        for (int i = 0; i < cqr_0Array.length; ++i) {
            if (cqr_0Array[i].mfc != 10) continue;
            object = bzj_2.eqi().my(cqr_0Array[i].mfd);
            if (object == null) {
                jjd.error((Object)("IE non trouv\u00e9 " + cqr_0Array[i].mfd));
                continue;
            }
            this.hvQ.k((byx_0)object);
        }
        eSM eSM2 = eTo.fIZ().iU(cqq_02.eya());
        assert (eSM2 != null) : "Impossible de cr\u00e9er la bulle de combat : la zone d'effet d'index " + cqq_02.eya() + " n'existe pas";
        object = this.hvQ.bag();
        eSM eSM3 = (eSM)eSM2.b(new etj_0(cqq_02.eyb(), ((wz_0)object).bgm(), ((wz_0)object).bgn(), ((rh_0)object).bdI(), this.hvQ.bbh(), 0L, null, 0, abi_1.dzt));
        eSM3.h((rh_0)object);
        this.hvQ.a(eSM3);
        bsN bsN2 = this.b(cqq_02);
        this.a(cqq_02, bsN2);
        this.hvQ.eF(cqq_02.eyo());
        bsM.a(cqq_02.eyu(), this.hvQ);
        return this.hvQ;
    }

    public static void a(List<byte[]> list, bsj_0 bsj_02) {
        for (byte[] byArray : list) {
            try {
                ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
                long l = byteBuffer.getLong();
                eSS eSS2 = eTo.fIZ().iY(l);
                if (eSS2 == null) {
                    bsU.jjG.error((Object)("Impossible de recr\u00e9er la zone d'id " + l));
                    continue;
                }
                etj_0 etj_02 = ewa_2.a(byteBuffer, bsj_02);
                eSS eSS3 = (eSS)bsj_02.bai().dp(etj_02.Sn());
                if (eSS3 == null) {
                    eSS3 = eSS2.b(etj_02);
                }
                eSS3.aPg();
                ewa_2.a(eSS3, byteBuffer);
                bsj_02.bai().a(eSS3);
            }
            catch (Exception exception) {
                bsU.jjG.error((Object)"Exception levee", (Throwable)exception);
            }
        }
        akj_0.ciY().aPc();
    }

    private bsN b(cqq_0 cqq_02) {
        bsN bsN2 = new bsN();
        for (int i = 0; i < cqq_02.exY(); ++i) {
            byte by = cqq_02.Lj(i);
            long l = cqq_02.Li(i);
            bgy bgy2 = bgg_0.dlO().ju(l);
            if (bgy2 == null) {
                jjd.error((Object)("Impossible d'ajouter le joueur " + l + " au combat " + cqq_02.bha() + " : ce fighter n'existe pas"));
                continue;
            }
            if (l == cqq_02.eyq() || l == cqq_02.eyr()) {
                bsN2.e(bgy2, by);
                continue;
            }
            bsN2.d(bgy2, by);
        }
        return bsN2;
    }

    private void a(cqq_0 cqq_02, bsN bsN2) {
        for (byte by : new byte[]{0, 1}) {
            if (this.hvQ.a(by, bsN2.bO(by), false)) continue;
            jjd.error((Object)"Impossible d'ajouter une team au combat, client d\u00e9synchronis\u00e9 avec la demande serveur");
        }
        for (int i = 0; i < cqq_02.exY(); ++i) {
            byte by;
            bgy bgy2 = (bgy)this.hvQ.qJ(cqq_02.Li(i));
            byte[] byArray = cqq_02.Lm(i);
            byte[] byArray2 = cqq_02.Ln(i);
            if (bgy2 != null) {
                bgy2.fN(true);
                if (!cqq_02.eyv()) {
                    bgy2.a(this.hvQ, byArray, byArray2);
                }
            }
            if (evv_0.fI(by = cqq_02.Ll(i)) == evv_0.rAc) {
                this.hvQ.aD(bgy2);
                continue;
            }
            if (evv_0.fI(by) != evv_0.rAd) continue;
            this.hvQ.aD(bgy2);
            this.hvQ.aE(bgy2);
        }
    }
}

