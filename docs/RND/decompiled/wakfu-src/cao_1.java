/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.map.hash.THashMap;
import gnu.trove.map.hash.TShortObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cao
 */
public class cao_1
implements WW {
    private static final Logger lGh = Logger.getLogger(cao_1.class);
    private static final int lGi = 375;
    private adk bQk;
    private aaa_0 bYl;
    private acj_0 bQm;
    private final cav_2 lGj;

    public cao_1(cav_2 cav_22) {
        this.lGj = cav_22;
    }

    void a(cab_1 cab_12) {
        this.bYl.a(cab_12, cab_12.ery());
        this.erh();
    }

    @Override
    public void a(adk adk2, aaa_0 aaa_02, acj_0 acj_02) {
        this.bQk = adk2;
        this.bYl = aaa_02;
        this.bQm = acj_02;
    }

    @Override
    public void n(short s, short s2) {
        bze_2 bze_22;
        ewi ewi2 = this.lGj.ah(s, s2);
        wa_0.a(this.lGj.bhh(), s, s2, (short)0, ewi2);
        caz_2 caz_22 = this.lGj.L(s, s2);
        this.bQm.a(s, s2, caz_22);
        ajo_0 ajo_02 = this.lGj.M(s, s2);
        cas_2.lGp.i(ajo_02);
        this.bQk.a(s, s2, ajo_02);
        if (bzj_2.eqi().blc() && (bze_22 = (bze_2)bzj_2.eqi().aE(s, s2)) != null) {
            bze_22.x(new cap_2(this));
        }
    }

    @Override
    public void fz(long l) {
        try {
            this.a(this.lGj.erp());
        }
        catch (Exception exception) {
            lGh.error((Object)"", (Throwable)exception);
        }
    }

    private void erh() {
        cao_1.a(this.lGj);
    }

    public static void a(@NotNull fsr_0 fsr_02) {
        int[] nArray = new int[]{1};
        THashMap tHashMap = new THashMap();
        TShortObjectHashMap tShortObjectHashMap = new TShortObjectHashMap();
        fsr_02.y((TObjectProcedure<fam_0>)((TObjectProcedure)fam_02 -> {
            cal_2 cal_22 = (cal_2)fam_02.fRg();
            car_2 car_22 = new car_2(nArray[0], (TShortObjectHashMap<short[]>)tShortObjectHashMap, cal_22.bno());
            cal_22.a(car_22);
            nArray[0] = nArray[0] + cal_22.bno();
            tHashMap.put(fam_02, (Object)car_22.erj());
            return true;
        }));
        cao_1.a(fsr_02, (THashMap<fam_0, caq_2>)tHashMap, (TShortObjectHashMap<short[]>)tShortObjectHashMap);
        WY.bnm().a(nArray[0], (TShortObjectHashMap<short[]>)tShortObjectHashMap);
    }

    private static void a(@NotNull fsr_0 fsr_02, THashMap<fam_0, caq_2> tHashMap, TShortObjectHashMap<short[]> tShortObjectHashMap) {
        ArrayList arrayList = new ArrayList();
        fsr_02.y((TObjectProcedure<fam_0>)((TObjectProcedure)fam_02 -> {
            arrayList.add(fam_02);
            return true;
        }));
        for (fam_0 fam_03 : arrayList) {
            for (fam_0 fam_04 : arrayList) {
                if (fam_03 == fam_04) continue;
                caq_2 caq_22 = (caq_2)tHashMap.get((Object)fam_03);
                caq_2 caq_23 = (caq_2)tHashMap.get((Object)fam_04);
                caq_2.a(caq_22, caq_23, tShortObjectHashMap);
            }
        }
    }

    @Override
    public boolean m(short s, short s2) {
        return this.lGj.ai(s, s2);
    }

    @Override
    public void clear() {
    }

    @Override
    public void fA(long l) {
        adg_0.bup().fy(375L);
        adg_0.bup().buq();
    }
}

