/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class eUv {
    private static final wt_0[] ruD = wt_0.blX();
    private final rh_0 ruE;

    eUv(rh_0 rh_02) {
        this.ruE = rh_02;
    }

    public void d(azg_1 azg_12) {
        short s = this.ruE.bdL();
        short s2 = this.ruE.bdM();
        aci_1 aci_12 = eUq.i(this.ruE);
        for (int i = aci_12.cuS; i < aci_12.cuT; ++i) {
            for (int j = aci_12.cuQ; j < aci_12.cuR; ++j) {
                wy_0 wy_02 = wa_0.a((long)s, (short)j, (short)i, s2);
                ewf ewf2 = this.c(wy_02, i, j);
                ewf2.d(azg_12);
            }
        }
    }

    private ewf c(wy_0 wy_02, int n, int n2) {
        ewf ewf2 = new ewf(n2, n);
        ewi ewi2 = (ewi)wy_02.bmp();
        for (int i = 0; i < 18; ++i) {
            for (int j = 0; j < 18; ++j) {
                int n3 = ewf2.bap + j;
                int n4 = ewf2.baq + i;
                short s = eUv.a(ewi2, n3, n4);
                ewf2.aj(n3, n4, s);
            }
        }
        return ewf2;
    }

    private static short a(ewi ewi2, int n, int n2) {
        if (ewi2.aJ(n, n2)) {
            return Short.MIN_VALUE;
        }
        int n3 = ewi2.a(n, n2, ruD, 0);
        if (n3 != 1) {
            return Short.MIN_VALUE;
        }
        wt_0 wt_02 = ruD[0];
        if (wt_02.vD() != 0 || wt_02.bNP == -1) {
            return Short.MIN_VALUE;
        }
        return wt_02.ban;
    }

    public void eU(ByteBuffer byteBuffer) {
        short s = this.ruE.bdL();
        short s2 = this.ruE.bdM();
        aci_1 aci_12 = eUq.i(this.ruE);
        for (int i = aci_12.cuS; i < aci_12.cuT; ++i) {
            for (int j = aci_12.cuQ; j < aci_12.cuR; ++j) {
                ewf ewf2 = new ewf(j, i);
                ewf2.eU(byteBuffer);
                wa_0.a((long)s, (short)j, (short)i, s2, ewf2);
            }
        }
    }
}

