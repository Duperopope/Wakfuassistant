/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Collections;

/*
 * Renamed from bJe
 */
public class bje_0
implements adm_0,
adp_0,
ady_0<ads_0> {
    private static final st_0 kkm = new st_0();
    private static final int kkn = 25;
    private static final int kko = 400;
    private static final int kkp = 300;
    private static final wz_0 kkq;
    private final bdf_1 kkr;
    private final boolean kks;

    public bje_0(bdf_1 bdf_12) {
        this.kkr = bdf_12;
        this.kks = false;
    }

    public bje_0(bdf_1 bdf_12, boolean bl) {
        this.kkr = bdf_12;
        this.kks = bl;
    }

    public void a(ads_0 ads_02, int n, int n2, short s) {
        anp_2 anp_22 = ads_02.bvF();
        if (anp_22 != null) {
            return;
        }
        this.a(ads_02, anp_22, n, n2, s);
    }

    @Override
    public void pathStarted(ads_0 ads_02, anp_2 anp_22) {
        if (anp_22 == null) {
            return;
        }
        int[] nArray = anp_22.bDX();
        if (nArray == null) {
            return;
        }
        int n = nArray[0];
        int n2 = nArray[1];
        short s = (short)nArray[2];
        this.a(ads_02, anp_22, n, n2, s);
    }

    @Override
    public void pathEnded(ads_0 ads_02, int n, int n2, short s) {
        ads_02.c(this);
        this.a(ads_02, ads_02.bvF(), n, n2, s);
    }

    private void a(ads_0 ads_02, anp_2 anp_22, int n, int n2, short s) {
        int n3 = this.kkr.bcC();
        int n4 = this.kkr.bcD();
        int n5 = n3 - n;
        int n6 = n4 - n2;
        acd_1 acd_12 = bje_0.V(n, n2, s);
        if (n5 * n5 + n6 * n6 > 300) {
            this.kkr.e(acd_12.getX(), acd_12.getY(), acd_12.bdi());
            return;
        }
        kkq.reset();
        sr_0 sr_02 = sr_0.bgd();
        bje_0.kkm.bqM = this.kks;
        bje_0.kkm.bqT = this.kks;
        bje_0.kkm.bqY = false;
        bje_0.kkm.bqZ = false;
        bje_0.kkm.bra = true;
        bje_0.kkm.brb = false;
        sr_02.a(kkm);
        sr_02.a((int)this.kkr.aKu(), this.kkr.bcO(), this.kkr.bvy());
        sr_02.b(kkq);
        if (wa_0.k(this.kkr.bcC(), this.kkr.bcD(), this.kkr.bcE())) {
            sr_02.p(n, n2, s);
        } else {
            sr_02.p(this.kkr.bcC(), this.kkr.bcD(), this.kkr.bcE());
        }
        wa_0.a(n3, n4, acd_12.getX(), acd_12.getY(), kkq);
        sr_02.q(acd_12.getX(), acd_12.getY(), acd_12.bdi());
        sr_02.bgj();
        anp_2 anp_23 = sr_02.bgh();
        sr_02.aZp();
        if (anp_23.bDV()) {
            abg_2.bUP().a((Runnable)new bjf_0(anp_23, this.kkr), this.kkr.bvO().a(this.kkr) / 2, 1);
        } else if (anp_22 != null) {
            ads_02.b(this);
        } else {
            this.kkr.e(acd_12.getX(), acd_12.getY(), acd_12.bdi());
        }
    }

    public static acd_1 V(int n, int n2, short s) {
        abi_1[] abi_1Array = abi_1.bVQ();
        Collections.shuffle(Arrays.asList(abi_1Array));
        int n3 = n;
        int n4 = n2;
        short s2 = s;
        boolean bl = true;
        int n5 = abi_1Array.length;
        for (int i = 0; i < n5 && bl; ++i) {
            abi_1 abi_12 = abi_1Array[i];
            n3 = n + abi_12.dzz;
            n4 = n2 + abi_12.dzA;
            wy_0 wy_02 = wa_0.aQ(n3, n4);
            if (wy_02 == null || (s2 = wa_0.w(n3, n4, s)) == Short.MIN_VALUE || Math.abs(s - s2) > 6 || wy_02.g(n3, n4, s2) || wy_02.k(n3, n4, s2)) continue;
            bl = false;
        }
        if (bl) {
            n3 = n;
            n4 = n2;
            s2 = s;
        }
        return new acd_1(n3, n4, s2);
    }

    @Override
    public /* synthetic */ void cellPositionChanged(afW afW2, int n, int n2, short s) {
        this.a((ads_0)afW2, n, n2, s);
    }

    static {
        bje_0.kkm.bqO = 25;
        bje_0.kkm.bqN = 400;
        bje_0.kkm.bqR = false;
        kkq = new wz_0();
    }
}

