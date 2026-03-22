/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bLR
 */
public final class blr_1 {
    private static final Logger kvj = Logger.getLogger(blr_1.class);

    public static void a(bhx_0 bhx_02, bgy bgy2) {
        blr_1.a(bhx_02, bgy2, bgy2.aWO(), bgy2.aWP());
    }

    public static void a(bhx_0 bhx_02, bgy bgy2, byte by, int n) {
        Object object;
        Object object2;
        if (bgy2 == null) {
            return;
        }
        bhx_02.CV(bgy2.aVt());
        bhx_02.CK(bgy2.aVt());
        if (bgy2 instanceof bhJ) {
            object2 = (bhJ)bgy2;
            object = new bjf_2();
            ((bjf_2)object).a(new bji_2(arx_1.cTt, (axb_2)new awx_2(((bhJ)object2).dph().sE())));
            ((bjf_2)object).a(new bji_2(arx_1.cTs, (axb_2)new awx_2(((bhJ)object2).dph().sC())));
            ((bjf_2)object).a(new bji_2(arx_1.cTz, (axb_2)new awx_2(((bhJ)object2).dph().sG())));
            ((bjf_2)object).a(new bji_2(arx_1.cTB, (axb_2)new awx_2(((bhJ)object2).dph().sI())));
            ((bjf_2)object).a(new bji_2(arx_1.cTC, (axb_2)new awx_2(((bhJ)object2).dph().sK())));
            ((bjf_2)object).a(new bji_2(arx_1.cTD, (axb_2)new awx_2(((bhJ)object2).dph().sM())));
            ((bjf_2)object).a(new bji_2(arx_1.cTE, (axb_2)new awx_2(((bhJ)object2).dph().sO())));
            ((bjf_2)object).a(new bji_2(arx_1.cTF, (axb_2)new awx_2(((bhJ)object2).dph().sQ())));
            ((bjf_2)object).a(new bji_2(arx_1.cTG, (axb_2)new awx_2(((bhJ)object2).dph().sS())));
            ((bjf_2)object).a(new bjj_2(bgy2.dly(), ary_2.fT("VETEMENTCUSTOM")));
            ((bjf_2)object).a(new bjj_2(bgy2.dlx(), ary_2.fT("CHEVEUXCUSTOM")));
            bhx_02.a((bjf_2)object);
            bgw_0 bgw_02 = ((bgy)object2).djy();
            if (bgw_02 != null) {
                bhx_02.b(bgw_02);
            }
        } else if (bgy2 instanceof bhx_0) {
            object2 = ((bhx_0)bgy2).doR();
            bhx_02.a((bjf_2)object2);
        } else {
            kvj.error((Object)("Summoner type not handled : " + String.valueOf(bgy2) + " : " + bgy2.getClass().getSimpleName()));
            return;
        }
        bhx_02.a(bgy2.dkE());
        bhx_02.OE(bgy2.doZ());
        object2 = bhx_02.ddI();
        object = bgy2.ddI();
        if (object != null) {
            ((bdj_2)object).ddm().m((bdj_2)object2);
            ((bdj_2)object).ddm().l((bdj_2)object2);
            ((bdj_2)object).ddm().k((bdj_2)object2);
            ((bdj_2)object).ddm().j((bdj_2)object2);
        }
        bhx_02.dkr();
    }

    private static int aHp() {
        return 0;
    }
}

