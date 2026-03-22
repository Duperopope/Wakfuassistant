/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bGM
 */
public class bgm_2
implements Sp {
    private final long jWs;
    private final long jWt;
    private final fhk jWu;

    public bgm_2(long l, long l2, fhk fhk2) {
        this.jWs = l;
        this.jWt = l2;
        this.jWu = fhk2;
    }

    @Override
    public void b(Sl sl) {
        Sn sn;
        if (!(sl instanceof Sn)) {
            return;
        }
        Sn sn2 = (Sn)sl;
        ffV ffV2 = (ffV)sn2.bfD();
        if (sn2.bfc() != Sj.bnN) {
            return;
        }
        bgt_0 bgt_02 = (bgt_0)fcL.rUh.sw(this.jWt);
        if (bgt_02 == null) {
            return;
        }
        if (bgt_02.dmL() != this.jWu) {
            return;
        }
        Sm sm = sl.bfB();
        if (sm == Sm.bnZ || sm == Sm.boa) {
            Sn sn3 = (Sn)sl;
            if (sn3.bfD() instanceof ffV) {
                bgt_02.dlG().a(ffV2, sn3);
                ffV2.bYg();
                cAY.eHc().l(ffS.gj((byte)sn3.bfE()));
            }
            int n = ffV2.avr();
            agm_2.cbu().d(new bvh_2(n));
        } else if ((sm == Sm.bob || sm == Sm.boc) && (sn = (Sn)sl).bfD() instanceof ffV) {
            int n = bgt_02.c(exx_2.rGi);
            if (ffV2.dOg().dpq() != 0) {
                bEq bEq2 = bEr.dSi().bW(ffV2.dOg().dpq());
                bgt_02.a(ffV2, bEq2);
            } else {
                bgt_02.bX(ffV2);
            }
            bgt_02.dlk();
            bgt_02.e(exx_2.rGi).op(n);
            bgt_02.dlG().ai(ffV2);
            ffV2.bYg();
        }
    }
}

