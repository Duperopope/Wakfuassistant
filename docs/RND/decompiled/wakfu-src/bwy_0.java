/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

/*
 * Renamed from bwY
 */
public class bwy_0
extends bwx_0 {
    public static final bwl_0 jAz = new bwy_0();

    private bwy_0() {
    }

    @Override
    public bwt_0 a(bgy bgy2, bdj_2 bdj_22, int n) {
        if (bgy2.c((pt_0)exx_2.rGl) <= 0) {
            return super.a(bgy2, bdj_22, n);
        }
        acd_1 acd_12 = this.e(bgy2, bdj_22);
        if (acd_12 == null) {
            return super.a(bgy2, bdj_22, n);
        }
        int[][] nArray = new int[1][3];
        nArray[0][0] = acd_12.getX();
        nArray[0][1] = acd_12.getY();
        nArray[0][2] = acd_12.bdi();
        bwt_0 bwt_02 = new bwt_0(new anp_2(nArray), false);
        bwt_02.hp(true);
        return bwt_02;
    }

    private acd_1 e(bgy bgy2, bdj_2 bdj_22) {
        bsj_0 bsj_02 = bgy2.dkZ();
        if (!this.b(bsj_02, bgy2)) {
            return null;
        }
        return this.a(bsj_02, bgy2, bdj_22);
    }

    private acd_1 a(bsj_0 bsj_02, bgy bgy2, bdj_2 bdj_22) {
        acd_1 acd_12 = cub_1.eSi().eSj();
        if (this.a(bsj_02, bgy2, acd_12.getX(), acd_12.getY(), acd_12.bdi())) {
            return new acd_1(acd_12);
        }
        return null;
    }

    private boolean b(bsj_0 bsj_02, bgy bgy2) {
        acd_1 acd_12 = bgy2.eap();
        return this.a(bsj_02, bgy2, acd_12.getX(), acd_12.getY(), acd_12.bdi());
    }

    private boolean a(bsj_0 bsj_02, bgy bgy2, int n, int n2, short s) {
        Collection<QQ> collection = bsj_02.bai().bdh();
        for (QQ qQ : collection) {
            if (qQ.bci() != bgy2 || qQ.aeV() != etm_0.rnr.aHp() || !qQ.d(n, n2, s)) continue;
            return true;
        }
        return false;
    }
}

