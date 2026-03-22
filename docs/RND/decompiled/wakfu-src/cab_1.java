/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from caB
 */
class cab_1
extends aau_0 {
    private static final Logger lGO = Logger.getLogger(cab_1.class);
    static final int lGP = 1;
    private final cae_2 lGQ = new cac_1(this);
    private final aah_1<aaq_0> lGR = new aah_1();
    protected int lGS;
    protected int lGT = -1;
    protected int lGU;

    cab_1() {
        this.ccF.bW(false);
    }

    aah_1<aaq_0> erw() {
        return this.lGR;
    }

    @Override
    protected aaq_0 a(String string, int n, int n2) {
        assert (this.lGR.bTR() != 0);
        return this.lGR.vK(GC.t(n, n2));
    }

    public void a(int n, int n2, cag_2 cag_22) {
        this.a(n, n2, cag_22.eqV(), this.lGQ, 0L);
    }

    protected void a(int n, int n2, cak_1[] cak_1Array, cae_2 cae_22, long l) {
        aci_1 aci_12 = new aci_1();
        float f2 = 1024.0f;
        float f3 = 576.0f;
        for (cak_1 cak_12 : cak_1Array) {
            ScreenElement screenElement = cab_1.a(n, n2, cak_12);
            cae_22.e(screenElement);
            if (screenElement.bsz() != null) {
                screenElement.bsH();
                screenElement.bV(false);
                screenElement.b(aci_12);
                int n3 = GC.B((float)aci_12.cuQ / 1024.0f);
                int n4 = GC.B((float)aci_12.cuS / 576.0f);
                int n5 = GC.B((float)aci_12.cuR / 1024.0f);
                int n6 = GC.B((float)aci_12.cuT / 576.0f);
                assert (n3 <= n5);
                assert (n4 <= n6);
                for (int i = n3; i <= n5; ++i) {
                    for (int j = n4; j <= n6; ++j) {
                        aaq_0 aaq_02 = this.a(this.lGR, (short)i, (short)j, screenElement);
                        screenElement.bGY();
                        this.a(l, screenElement, aaq_02);
                    }
                }
            }
            screenElement.bsI();
        }
    }

    private static ScreenElement a(int n, int n2, cak_1 cak_12) {
        byte[] byArray = cak_12.erb();
        boolean bl = false;
        if (byArray != null) {
            bl |= true;
        }
        ScreenElement screenElement = new ScreenElement((byte)(bl ? 1 : 0));
        if (byArray != null) {
            cab_1.a(screenElement, byArray);
        }
        int n3 = cak_12.eqY() + n;
        int n4 = cak_12.eqZ() + n2;
        short s = cak_12.era();
        screenElement.I(n3, n4, s);
        screenElement.a(cak_12.eqX());
        screenElement.ro(cak_12.erc());
        screenElement.rn(cak_12.bcN());
        screenElement.bU(cak_12.bsr());
        screenElement.rp(cak_12.bpp());
        screenElement.rq(cak_12.erd());
        screenElement.at(cak_12.erd());
        return screenElement;
    }

    private static void a(ScreenElement screenElement, byte[] byArray) {
        screenElement.f(cab_1.cT(byArray[0]), cab_1.cT(byArray[1]), cab_1.cT(byArray[2]));
    }

    private static float cT(byte by) {
        return ScreenElement.ao(by);
    }

    protected void a(long l, @NotNull ScreenElement screenElement, @NotNull aaq_0 aaq_02) {
    }

    public void erx() {
        int n = this.lGR.bTR();
        for (int i = 0; i < n; ++i) {
            aaq_0 aaq_02 = this.lGR.vU(i);
            aaq_02.bsO();
            aaq_02.bsQ();
        }
    }

    public wb_0 ery() {
        wb_0 wb_02 = new wb_0();
        int n = this.lGR.bTR();
        for (int i = 0; i < n; ++i) {
            aaq_0 aaq_02 = this.lGR.vU(i);
            wb_02.h(aaq_02.bsM(), aaq_02.bsN());
        }
        return wb_02;
    }

    @Override
    public void clear() {
        int n = this.lGR.bTR();
        for (int i = 0; i < n; ++i) {
            this.lGR.vU(i).bsK();
        }
        this.lGR.clear();
        super.clear();
        this.lGU = 0;
        this.lGS = 0;
        this.lGT = 0;
    }

    public void a(@NotNull caj_2 caj_22) {
        cal_2 cal_22 = (cal_2)caj_22.fRg();
        if (cal_22 == null) {
            lGO.error((Object)("pas de model associ\u00e9 \u00e0 l'instance de batiement " + String.valueOf(caj_22)));
            return;
        }
        int n = this.lGT + 1;
        cad_1 cad_12 = new cad_1(this.lGS + 1, n, this.lGU + 1, caj_22.conn());
        this.a(caj_22.fRc(), caj_22.fRd(), cal_22.eqV(), cad_12, caj_22.ZC());
        caj_22.us(n);
        int n2 = cal_22.bno();
        this.lGT += n2;
        this.lGU += n2;
        this.lGS += cad_12.erz();
    }
}

