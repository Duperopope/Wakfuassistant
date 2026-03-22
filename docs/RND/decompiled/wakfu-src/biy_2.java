/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bIy
 */
class biy_2 {
    private static final Logger kgD = Logger.getLogger(biy_2.class);
    static final float[] kgE = awx_2.dnF.bQj();
    private static final int kgF = 93606;

    biy_2() {
    }

    static void a(cav_2 cav_22, ArrayList<fsn_1> arrayList) {
        cav_22.y(new biz_2(arrayList, cav_22));
    }

    static String a(fbn_0 fbn_02) {
        String string = aum_0.cWf().a(126, (long)fbn_02.aIi(), new Object[0]);
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.c(string);
        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<String> arrayList2 = fbo_0.h(fbo_0.e(fbn_02));
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        fbn_02.e(new bia_2(arrayList));
        if (!arrayList.isEmpty()) {
            boolean bl;
            boolean bl2 = bl = fbo_0.g(fbn_02) == fbt_0.rSH;
            if (!bl) {
                ahv_22.ceC().e(bJN.kmA);
            }
            for (String string2 : arrayList) {
                ahv_22.ceH().c(string2);
            }
        }
        return ahv_22.ceL();
    }

    static fso_1 b(fbn_0 fbn_02) {
        fbt_0 fbt_02 = fbo_0.g(fbn_02);
        switch (fbt_02) {
            case rSF: {
                return bit_2.kgt;
            }
            case rSG: {
                return bit_2.kgu;
            }
            case rSH: {
                return bit_2.kgv;
            }
        }
        kgD.error((Object)("etat du batiement incorrect " + String.valueOf((Object)fbt_02)));
        return null;
    }

    static void a(cav_2 cav_22, fbb_2 fbb_22) {
        bil_2 bil_22 = new bil_2();
        fbb_22.setMapId(cav_22.bhh());
        fbb_22.setMapDisplayer(bil_22);
        biy_2.a(cav_22, bil_22.dZo());
        biy_2.a(bil_22);
        biy_2.b(cav_22, fbb_22);
    }

    private static void a(cav_2 cav_22, EntityGroup entityGroup) {
        cal_1 cal_12 = cal_1.lFY;
        cie_1 cie_12 = new cie_1();
        cie_12.aVI();
        cie_12.a(cav_22, cal_12);
        cie_12.setCurrentLayer(fsc_0.tdY);
        cie_12.getEntities(entityGroup);
        biy_2.a(entityGroup, cie_12);
        cie_12.aZp();
    }

    private static void a(bil_2 bil_22) {
        awk_1 awk_12 = aai.bqJ().qW(93606);
        awg_1 awg_12 = new awg_1(awk_12, 0, 0, awk_12.ve(0).getWidth(), awk_12.ve(0).getHeight());
        awx_2 awx_22 = new awx_2(0, 0, 1, 1);
        bil_22.a(awg_12, awx_22);
    }

    private static void a(EntityGroup entityGroup, cie_1 cie_12) {
        aco_1 aco_12 = cie_12.getScreenCenter();
        awp_1 awp_12 = new awp_1();
        awp_12.A(aco_12.aSc(), aco_12.aSd(), 0.0f);
        entityGroup.bIS().a(0, awp_12);
    }

    private static void b(cav_2 cav_22, fbb_2 fbb_22) {
        int n = cav_22.gle() * 9;
        int n2 = cav_22.glf() * 9;
        int n3 = n / 2 + cav_22.bwS() * 9;
        int n4 = n2 / 2 + (cav_22.bwT() - 3) * 9;
        fbb_22.setForceDisplayEntity(true);
        int n5 = -((int)afV.bB(n3, n4));
        int n6 = -((int)afV.bC(n3, n4));
        int n7 = Math.max(n, n2);
        int n8 = (int)((float)n7 * 86.0f);
        fbb_22.setMapRect(n5, n6, n8, n8 / 2);
    }
}

