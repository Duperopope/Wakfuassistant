/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aZR
 */
public class azr_0
implements afl {
    public static final azr_0 hyz = new azr_0();

    private azr_0() {
    }

    public void a(WL wL) {
        aqb_1.bGD().a(new aNJ(), aNJ2 -> foy_0.sLJ.b(azr_0.a(aNJ2), aNJ2.AK()));
        wL.b(this);
    }

    /*
     * WARNING - void declaration
     */
    public static fov_0 a(aNJ aNJ2) {
        int[] nArray;
        aNN[] aNNArray;
        Object[] objectArray;
        fox_0 fox_02 = new fox_0(aNJ2.d(), aNJ2.aVt(), aNJ2.ctd(), aNJ2.agM(), aNJ2.csJ(), aNJ2.csK(), aNJ2.csI(), aNJ2.csH(), aNJ2.cqA());
        aNM[] aNMArray = aNJ2.cte();
        if (aNMArray != null) {
            objectArray = aNMArray;
            int n = objectArray.length;
            for (int i = 0; i < n; ++i) {
                Object object = objectArray[i];
                fox_02.a(foq_0.hf(((aNM)object).csP()), ((aNM)object).csQ());
            }
        }
        if ((objectArray = aNJ2.ctf()) != null) {
            for (Object object : objectArray) {
                fox_02.gi(((anl_0)object).azv(), ((anl_0)object).getValue());
            }
        }
        if ((aNNArray = aNJ2.ctg()) != null) {
            for (aNN object : aNNArray) {
                fox_02.ai(object.azv(), object.isVisible());
            }
        }
        if (aNJ2.cth() != null) {
            for (aNO aNO2 : aNJ2.cth()) {
                fox_02.a(aNO2.azv(), uz_0.fo(aNO2.Tz()));
            }
        }
        if ((nArray = aNJ2.cti()) != null) {
            void var8_26;
            int[] nArray2 = nArray;
            int n = nArray2.length;
            boolean bl = false;
            while (var8_26 < n) {
                int n2 = nArray2[var8_26];
                fox_02.XO(n2);
                ++var8_26;
            }
        }
        if (aNJ2.ctj() != null) {
            void var8_28;
            ank_0[] ank_0Array = aNJ2.ctj();
            int n = ank_0Array.length;
            boolean bl = false;
            while (var8_28 < n) {
                ank_0 ank_02 = ank_0Array[var8_28];
                fox_02.ao(ank_02.azv(), ank_02.ctk(), ank_02.ctl());
                ++var8_28;
            }
        }
        return fox_02;
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.item", new Object[0]);
    }
}

