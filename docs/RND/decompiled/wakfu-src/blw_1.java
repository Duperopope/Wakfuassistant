/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bLW
 */
public class blw_1
extends eze_0 {
    protected static final Logger kvp = Logger.getLogger(blw_1.class);

    public blw_1() {
    }

    @Override
    public eze_0 edU() {
        return new blw_1();
    }

    public blw_1(short s, String string, int n, short s2, exP exP2, fqP<fqE> fqP2) {
        super(s, string, n, s2, exP2, fqP2);
    }

    public blw_1 a(short s, String string, int n, short s2, exP exP2, fqP<fqE> fqP2) {
        return new blw_1(s, string, n, s2, exP2, fqP2);
    }

    public blw_1(short s, RW<fqE, ym_1> rW, RU<fqE> rU, boolean bl, boolean bl2, boolean bl3) {
        super(s, rW, rU, bl, bl2, bl3);
    }

    @Override
    public eze_0 d(short s, RW<fqE, ym_1> rW, RU<fqE> rU, boolean bl, boolean bl2, boolean bl3) {
        return new blw_1(s, rW, rU, bl, bl2, bl3);
    }

    @Override
    public void a(exP exP2, exP exP3) {
        Object object;
        super.a(exP2, exP3);
        bhx_0 bhx_02 = (bhx_0)exP2;
        bgy bgy2 = (bgy)exP3;
        bdj_2 bdj_22 = bhx_02.ddI();
        if (bgy2 == null) {
            return;
        }
        bhx_02.CV(bgy2.aVt());
        bhx_02.CK(bgy2.aVt());
        if (bgy2 instanceof bhJ) {
            object = (bhJ)bgy2;
            bjf_2 bjf_22 = new bjf_2();
            eIF eIF2 = ((bhJ)object).dph();
            bjf_22.a(new bji_2(arx_1.cTt, (axb_2)new awx_2(eIF2.sE())));
            bjf_22.a(new bji_2(arx_1.cTs, (axb_2)new awx_2(eIF2.sC())));
            if (bft_2.dgp().n(((exP)object).aWP(), ((exP)object).aWO(), ((bhJ)object).dlz())) {
                bjf_22.a(new bji_2(arx_1.cTz, (axb_2)new awx_2(eIF2.sG())));
            }
            bjf_22.a(new bji_2(arx_1.cTB, (axb_2)new awx_2(eIF2.sI())));
            bjf_22.a(new bji_2(arx_1.cTC, (axb_2)new awx_2(eIF2.sK())));
            bjf_22.a(new bji_2(arx_1.cTD, (axb_2)new awx_2(eIF2.sM())));
            bjf_22.a(new bji_2(arx_1.cTE, (axb_2)new awx_2(eIF2.sO())));
            bjf_22.a(new bji_2(arx_1.cTF, (axb_2)new awx_2(eIF2.sQ())));
            bjf_22.a(new bji_2(arx_1.cTG, (axb_2)new awx_2(eIF2.sS())));
            bjf_22.a(new bjj_2(bgy2.dly(), ary_2.fT("VETEMENTCUSTOM")));
            bjf_22.a(new bjj_2(bgy2.dlx(), ary_2.fT("CHEVEUXCUSTOM")));
            bhx_02.a(bjf_22);
            bgw_0 bgw_02 = ((bgy)object).djy();
            if (bgw_02 != null) {
                bhx_02.b(bgw_02);
            }
        } else if (bgy2 instanceof bhx_0) {
            object = ((bhx_0)bgy2).doR();
            bhx_02.a((bjf_2)object);
        } else {
            kvp.error((Object)("Summoner type not handled : " + String.valueOf(bgy2) + " : " + bgy2.getClass().getSimpleName()));
            return;
        }
        bhx_02.a(bgy2.dkE());
        object = bgy2.ddI();
        if (object != null) {
            ((bdj_2)object).ddm().h(bdj_22);
        }
        bhx_02.dkr();
        bdj_22.setVisible(false);
    }

    public /* synthetic */ eze_0 b(short s, String string, int n, short s2, exP exP2, fqP fqP2) {
        return this.a(s, string, n, s2, exP2, fqP2);
    }
}

