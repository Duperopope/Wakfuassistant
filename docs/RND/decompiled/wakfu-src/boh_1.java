/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.collect.Ordering
 *  com.google.common.primitives.Ints
 */
import com.google.common.base.Function;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/*
 * Renamed from bOH
 */
public class boh_1
implements aeh_2 {
    private static final String kNd = "weatherOfDays";
    private static final String kNe = "weatherToday";
    private static final String kNf = "seasons";
    private static final String kNg = "currentWeather";
    private static final String kNh = "temperatureGraph";
    private static final String kNi = "minTemperatureGraph";
    private static final String kNj = "maxTemperatureGraph";
    private static final String kNk = "resources";
    private static final String kNl = "displayCultures";
    private static final String kNm = "displayPlants";
    private static final String kNn = "displayTrees";
    private static final axb_2 kNo = new awx_2(1.0f, 0.8f, 0.0f, 1.0f);
    private static final axb_2 kNp = new awx_2(0.0f, 0.8f, 1.0f, 1.0f);
    private static final axb_2 kNq = new awx_2(1.0f, 0.8f, 0.0f, 0.3f);
    private static final axb_2 kNr = new awx_2(0.0f, 0.8f, 1.0f, 0.3f);
    private static final axb_2[] kNs = new axb_2[]{awx_2.dnG};
    private static final axb_2[] kNt = new axb_2[]{kNo, kNp};
    private static final axb_2[] kNu = new axb_2[]{kNq, kNr};
    private static final Function<bLd, ejj_0> kNv = new boi_1();
    private static final Function<bLd, Integer> kNw = new boj_1();
    private final ArrayList<bog_1> kNx = new ArrayList();
    private final bog_1 kNy = new bog_1();
    private final ArrayList<bog_1> kNz = new ArrayList();
    private fbs_1 kNA;
    private float kNB;
    private float kNC;
    private static final boh_1 kND = new boh_1();

    private boh_1() {
        this.kNz.add(new bog_1());
    }

    public static boh_1 ehH() {
        return kND;
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kNg)) {
            return this.kNy;
        }
        if (string.equals(kNf)) {
            return this.kNx;
        }
        if (string.equals(kNd)) {
            return this.kNz;
        }
        if (string.equals(kNe)) {
            if (this.kNz == null || this.kNz.size() == 0) {
                return null;
            }
            return this.kNz.get(0);
        }
        if (string.equals(kNi)) {
            return aum_0.cWf().c("weather.info.temperatureValue.short", Float.valueOf(this.kNB));
        }
        if (string.equals(kNj)) {
            return aum_0.cWf().c("weather.info.temperatureValue.short", Float.valueOf(this.kNC));
        }
        if (string.equals(kNh)) {
            return this.kNA;
        }
        if (string.equals(kNk)) {
            return this.ehN();
        }
        if (string.equals(kNm)) {
            return bom_1.kNH.ehJ();
        }
        if (string.equals(kNn)) {
            return bom_1.kNH.ehK();
        }
        if (string.equals(kNl)) {
            return bom_1.kNH.ehI();
        }
        return null;
    }

    public boolean ehI() {
        return bom_1.kNH.ehI();
    }

    public void im(boolean bl) {
        bom_1.kNH.im(bl);
        fse_1.gFu().a((aef_2)this, kNl, kNk);
    }

    public boolean ehJ() {
        return bom_1.kNH.ehJ();
    }

    public void in(boolean bl) {
        bom_1.kNH.in(bl);
        fse_1.gFu().a((aef_2)this, kNm, kNk);
    }

    public boolean ehK() {
        return bom_1.kNH.ehK();
    }

    public void io(boolean bl) {
        bom_1.kNH.io(bl);
        fse_1.gFu().a((aef_2)this, kNn, kNk);
    }

    public void ehL() {
        bom_1.kNH.im(true);
        bom_1.kNH.in(true);
        bom_1.kNH.io(true);
    }

    public void b(bof_1 bof_12) {
        this.kNy.a(bof_12);
    }

    public bog_1 ehM() {
        return this.kNy;
    }

    public void clear() {
        this.kNz.clear();
        this.kNx.clear();
    }

    private Set<bLd> ehN() {
        bzr_2 bzr_22 = boa_2.ehn().ehq();
        Ordering ordering = Ordering.natural().onResultOf(kNv).compound((Comparator)Ordering.natural().onResultOf(kNw));
        return bzr_22.eqG().stream().filter(Objects::nonNull).flatMap(bzs_22 -> Ints.asList((int[])bzs_22.eqH()).stream()).map(n -> (bKT)bKU.eca().YN((int)n)).filter(Objects::nonNull).filter(bKT2 -> {
            ejj_0 ejj_02 = ejj_0.dG(bKT2.ghz());
            if (ejj_02 == null) {
                return false;
            }
            switch (ejj_02) {
                case qyI: {
                    return bom_1.kNH.ehI();
                }
                case qyF: {
                    return bom_1.kNH.ehK();
                }
                case qyH: {
                    return bom_1.kNH.ehJ();
                }
            }
            return false;
        }).map(bKT2 -> new bLd((bKT)bKT2, bKT2.ghE())).collect(Collectors.toCollection(() -> new TreeSet(ordering)));
    }

    public void a(ub_0 ub_02, int n, int n2, int n3, float[] fArray, wg_0 wg_02, float f2, float f3) {
        bog_1 bog_12 = new bog_1();
        bof_1 bof_12 = new bof_1();
        bof_12.a(n, n, n2, n3, fArray, wg_02, f2, f3);
        bog_12.e(ub_02);
        bog_12.a(bof_12);
        bog_12.IN(this.kNz.size() + 1);
        this.kNz.add(bog_12);
    }

    private void b(ub_0 ub_02, int n, int n2, int n3, float[] fArray, wg_0 wg_02, float f2, float f3) {
        bog_1 bog_12 = new bog_1();
        bof_1 bof_12 = new bof_1();
        bof_12.a(n, n, n2, n3, fArray, wg_02, f2, f3);
        bog_12.e(ub_02);
        bog_12.a(bof_12);
        this.kNx.add(bog_12);
    }

    public void a(boe_1 boe_12) {
        Object object;
        Object object2;
        this.kNA = new fbs_1();
        this.kNB = Float.MAX_VALUE;
        this.kNC = Float.MIN_VALUE;
        int[] nArray = new int[boe_12.ehx()];
        int[] nArray2 = new int[boe_12.ehx()];
        int[] nArray3 = new int[boe_12.ehx()];
        int[] nArray4 = new int[boe_12.ehx() * 2];
        float[] fArray = new float[boe_12.ehx()];
        float[] fArray2 = new float[boe_12.ehx()];
        float[] fArray3 = new float[boe_12.ehx()];
        float[] fArray4 = new float[boe_12.ehx()];
        for (int i = 0; i < boe_12.ehx(); ++i) {
            object2 = boe_12.IG(i);
            object = new ffm_1();
            switch (bok_1.kNF[((Enum)object2).ordinal()]) {
                case 1: {
                    ((ffm_1)object).setModulationColor(aid_0.dVc);
                    break;
                }
                case 2: {
                    ((ffm_1)object).setModulationColor(aid_0.dVd);
                    break;
                }
                case 3: {
                    ((ffm_1)object).setModulationColor(aid_0.dVe);
                    break;
                }
                case 4: {
                    ((ffm_1)object).setModulationColor(aid_0.dVf);
                }
            }
            this.kNA.a((ffm_1)object);
            fArray[i] = boe_12.IH(i) + boe_12.IJ(i);
            fArray2[i] = boe_12.II(i) + boe_12.IJ(i);
            if (fArray[i] < 0.0f) {
                nArray2[i] = 1;
                nArray4[i * 2] = 1;
            }
            if (fArray2[i] < 0.0f) {
                nArray3[i] = 1;
                nArray4[i * 2 + 1] = 1;
            }
            fArray3[i] = boe_12.d((ub_0)((Object)object2))[0];
            fArray4[i] = boe_12.d((ub_0)((Object)object2))[1];
            this.kNB = Math.min(this.kNB, fArray3[i]);
            this.kNC = Math.max(this.kNC, fArray4[i]);
        }
        ffn_1 ffn_12 = new ffn_1();
        ffn_12.ae(fArray);
        ffn_12.a(kNt, nArray2);
        object2 = new ffn_1();
        ((ffn_1)object2).ae(fArray2);
        ((ffn_1)object2).a(kNt, nArray3);
        object = new ffn_1();
        ((ffn_1)object).ae(fArray3);
        ((ffn_1)object).a(kNs, nArray);
        ffn_1 ffn_13 = new ffn_1();
        ffn_13.ae(fArray4);
        ffn_13.a(kNs, nArray);
        this.kNA.a(ffn_12);
        this.kNA.a((ffn_1)object2);
        this.kNA.a((ffn_1)object);
        this.kNA.a(ffn_13);
        ffo_1 ffo_12 = new ffo_1();
        ffo_12.a(ffn_12);
        ffo_12.a((ffn_1)object2);
        ffo_12.a(kNu, nArray4);
        this.kNA.a(ffo_12);
        this.kNA.fu(this.kNB - 2.0f);
        this.kNA.fv(this.kNC + 2.0f);
    }

    public void dqL() {
        fse_1.gFu().a((aef_2)this, kNg, kNd);
    }

    public void b(boe_1 boe_12) {
        int n;
        this.clear();
        ub_0 ub_02 = null;
        for (n = 0; n < boe_12.ehx(); ++n) {
            ub_0 ub_03 = boe_12.IG(n);
            if (ub_03 == ub_02) continue;
            this.b(ub_03, (int)boe_12.d(ub_03)[0], (int)boe_12.d(ub_03)[1], 0, null, wg_0.bMG, 0.0f, 0.0f);
            ub_02 = ub_03;
        }
        for (n = 0; n < boe_12.ehx(); ++n) {
            this.a(boe_12.IG(n), boe_12.IH(n), boe_12.II(n), boe_12.IJ(n), boe_12.d(boe_12.IG(n)), boe_12.IM(n), boe_12.IK(n), boe_12.IL(n));
        }
        this.a(boe_12);
        fse_1.gFu().a((aef_2)this, kNg, kNd, kNf, kNh, kNi, kNj);
    }
}

