/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

/*
 * Renamed from bwU
 */
public class bwu_0
extends bwx_0 {
    public static final bwl_0 jAp = new bwu_0();

    private bwu_0() {
    }

    @Override
    public bwt_0 a(bgy bgy2, bdj_2 bdj_22, int n) {
        acd_1 acd_12;
        if (n > 0 && (acd_12 = this.d(bgy2, bdj_22)) != null) {
            int[][] nArray = new int[1][3];
            nArray[0][0] = acd_12.getX();
            nArray[0][1] = acd_12.getY();
            nArray[0][2] = acd_12.bdi();
            return new bwt_0(new anp_2(nArray), false);
        }
        return super.a(bgy2, bdj_22, n);
    }

    private acd_1 d(bgy bgy2, bdj_2 bdj_22) {
        bsj_0 bsj_02 = bgy2.dkZ();
        byte by = this.a(bsj_02, bgy2);
        if (by == -1) {
            return null;
        }
        return this.b(bsj_02, by);
    }

    private acd_1 b(bsj_0 bsj_02, byte by) {
        acd_1 acd_12 = cub_1.eSi().eSj();
        if (this.a(bsj_02, acd_12.getX(), acd_12.getY(), acd_12.bdi()) == by) {
            return new acd_1(acd_12);
        }
        return null;
    }

    private byte a(bsj_0 bsj_02, bgy bgy2) {
        acd_1 acd_12 = bgy2.eap();
        return this.a(bsj_02, acd_12.getX(), acd_12.getY(), acd_12.bdi());
    }

    private byte a(bsj_0 bsj_02, int n, int n2, short s) {
        Collection<QQ> collection = bsj_02.bai().bdh();
        for (QQ qQ : collection) {
            if (qQ.aeV() != etm_0.rnG.aHp() || !qQ.d(n, n2, s)) continue;
            return qQ.bcP();
        }
        return -1;
    }
}

