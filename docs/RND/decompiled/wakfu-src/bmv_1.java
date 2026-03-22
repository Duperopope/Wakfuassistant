/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bmV
 */
public class bmv_1
implements aeh_2,
bek_0 {
    public static final String iEH = "name";
    public static final String iEI = "level";
    public static final String iEJ = "nameAndLevel";
    public static final String iEK = "quantityText";
    public static final String iEL = "levelShort";
    public static final String iEM = "ingredients";
    public static final String iEN = "productionPercentage";
    public static final String iEO = "productionPercentageShort";
    public static final String iEP = "isSecretRecipe";
    public static final String iEQ = "hasCriterion";
    public static final String iER = "criterionDescription";
    public static final String iES = "obsolete";
    public static final String iET = "canAfford";
    public static final String iEU = "canUseAsIngredient";
    public static final String iEV = "machines";
    public static final String iEW = "craftFee";
    public static final String iEX = "totalCraftFee";
    public static final String iEY = "canPay";
    public static final String iEZ = "isUpgrade";
    public static final String iFa = "craftXp";
    public static final String iFb = "productionPercentageValue";
    public static final String iFc = "baseCraftXp";
    public static final String[] iFd = new String[]{"name", "level", "nameAndLevel", "quantityText", "ingredients", "productionPercentage", "hasCriterion", "isSecretRecipe", "obsolete", "canAfford", "craftFee", "totalCraftFee", "craftXp", "productionPercentageValue"};
    private final eKR iFe;
    private final bms_1 iFf;
    private static final awx_2 iFg = new awx_2(0.8f, 0.0f, 0.0f, 1.0f);
    private static final awx_2 iFh = new awx_2(0.8f, 0.4f, 0.0f, 1.0f);
    private static final awx_2 iFi = new awx_2(0.8f, 0.8f, 0.0f, 1.0f);
    private static final awx_2 iFj = new awx_2(0.06f, 0.9f, 0.06f, 1.0f);
    private boolean iFk = false;
    private final boolean iFl;

    public bmv_1(eKR eKR2, bms_1 bms_12) {
        this.iFe = eKR2;
        this.iFf = bms_12;
        this.iFl = this.dxw();
    }

    private boolean dxw() {
        return eKQ.qEb.M(this.iFe.fyZ().azv());
    }

    public void dxx() {
        fse_1.gFu().a((aef_2)this, iET, iEY, iEW, iEX);
    }

    public void gD(boolean bl) {
        this.iFk = bl;
        fse_1.gFu().a((aef_2)this, iET);
    }

    @Override
    public String[] bxk() {
        return iFd;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(iEH)) {
            return this.getName();
        }
        if (string.equals(iEI)) {
            String string2 = new ahv_2().ceu().aN(this.dxy()).cev().ceL();
            return aum_0.cWf().c("craft.recipeLevel", string2);
        }
        if (string.equals(iEL)) {
            return aum_0.cWf().c("levelShort.custom", this.dxy());
        }
        if (string.equals(iEJ)) {
            Optional optional = Optional.ofNullable(fgD.fXh().Vd(this.iFe.fyZ().azv()));
            return this.a(optional.map(fhc_0::dwg).orElse(fgj.siA));
        }
        if (string.equals(iEK)) {
            short s = this.dxC();
            return s == 1 ? "" : "x" + s;
        }
        if (string.equals(iEM)) {
            return this.dxz();
        }
        if (string.equals(iEN)) {
            long l = Math.round(this.iFe.dU(this.iFf.cmL()) * 100.0);
            ahv_2 ahv_22 = new ahv_2();
            awx_2 awx_22 = iFj;
            if (l < 100L) {
                awx_22 = l > 50L ? iFi : (l > 25L ? iFh : iFg);
            }
            String string3 = ahv_22.ceu().ih(awx_22.bQk()).hY(l).cev().ceL();
            return aum_0.cWf().c("craft.recipeChance", string3);
        }
        if (string.equals(iEO)) {
            long l = Math.round(this.iFe.dU(this.iFf.cmL()) * 100.0);
            ahv_2 ahv_23 = new ahv_2();
            awx_2 awx_23 = iFj;
            if (l < 100L) {
                awx_23 = l >= 50L ? iFh : iFg;
            }
            ahv_23.ceC().ih(awx_23.bQk()).c(l + "%").ceD();
            return ahv_23.ceL();
        }
        if (string.equals(iEP)) {
            return this.iFe.c(eKS.qEv);
        }
        if (string.equals(iEQ)) {
            return this.iFe.bdo() != null;
        }
        if (string.equals(iER)) {
            ang_2 ang_22 = this.iFe.bdo();
            if (ang_22 == null) {
                return null;
            }
            ahv_2 ahv_24 = new ahv_2();
            boolean bl = this.iFe.at(aue_0.cVJ().cVK());
            ahv_24.ceC().ih((bl ? awx_2.dnL : awx_2.dnJ).bQk());
            ahv_24.c(eLP.b(ang_22));
            ahv_24.ceD();
            return ahv_24.ceL();
        }
        if (string.equals(iET)) {
            return this.iFk;
        }
        if (string.equals(iEU)) {
            return this.iFl;
        }
        if (string.equals(iES)) {
            eKW eKW2 = eKQ.qEb.QV(this.iFf.dwk());
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            eki_0 eki_02 = bgt_02.dpK();
            short s = eki_02.PG(this.iFf.dwk());
            return eKX.a(s, this.dxy(), eKW2, bgt_02) == 0L;
        }
        if (string.equals(iEV)) {
            return this.dxD();
        }
        if (string.equals(iEW)) {
            return aum_0.cWf().c("kama.shortGain", this.dxE());
        }
        if (string.equals(iEX)) {
            int n = fse_1.gFu().dq("currentCraftNb");
            return aum_0.cWf().c("kama.shortGain", this.dxE() * (long)n);
        }
        if (string.equals(iEY)) {
            long l = aue_0.cVJ().cVK().dmi();
            return l >= this.dxE();
        }
        if (string.equals(iEZ)) {
            return this.dxG();
        }
        if (string.equals(iFa)) {
            bgt_0 bgt_03 = aue_0.cVJ().cVK();
            eki_0 eki_03 = bgt_03.dpK();
            int n = this.iFe.cms();
            long l = this.iFe.a(eki_03.PG(n), bgt_03);
            int n2 = bgt_03.dmn().a(eje_0.qyu, n, 8);
            float f2 = (float)(100 + n2) / 100.0f;
            l = (long)((float)l * f2);
            l = (long)((double)l * (2.0 - this.iFe.dU(this.iFf.cmL())));
            l = (long)((float)l * bgt_03.dpL().fdP());
            return l;
        }
        if (string.equals(iFc)) {
            bgt_0 bgt_04 = aue_0.cVJ().cVK();
            return this.iFe.a(bgt_04);
        }
        if (string.equals(iFb)) {
            return Math.round(this.iFe.dU(this.iFf.cmL()) * 100.0);
        }
        bgv_2 bgv_22 = this.dxB();
        return bgv_22 != null ? bgv_22.dSz().eu(string) : null;
    }

    private String a(fgj fgj2) {
        return new ahv_2().ceu().ih(beo_0.e(fgj2)).c(this.getName()).c(" (").c(aum_0.cWf().c("levelShort.custom", this.dxy())).c(")").cev().ceL();
    }

    public short dxy() {
        return this.iFe.dxy();
    }

    public String getName() {
        return bgv_2.Dm(this.iFe.fyZ().azv());
    }

    public String dah() {
        return bgv_2.Dn(this.iFe.fyZ().azv());
    }

    public ArrayList<bmj_2> dxz() {
        ArrayList<bmj_2> arrayList = new ArrayList<bmj_2>();
        Iterator<Map.Entry<Integer, Bu<Short, Short>>> iterator = this.iFe.fza();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Bu<Short, Short>> entry = iterator.next();
            int n = entry.getKey();
            arrayList.add(new bmj_2(entry.getValue().getFirst(), entry.getValue().aHI(), (bgv_2)fgD.fXh().Vd(n)));
        }
        arrayList.sort(new bmw_2(this));
        return arrayList;
    }

    public eKR dxA() {
        return this.iFe;
    }

    @Nullable
    public bgv_2 dxB() {
        eKV eKV2 = this.iFe.fyZ();
        if (eKV2 == eKV.qEF) {
            return null;
        }
        return (bgv_2)fgD.fXh().Vd(eKV2.azv());
    }

    public short dxC() {
        return this.iFe.fyZ().bfd();
    }

    public String dxD() {
        ahv_2 ahv_22 = new ahv_2();
        int[] nArray = this.iFe.fyV();
        int n = nArray.length;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                ahv_22.c(", ");
            }
            ahv_22.c(aum_0.cWf().a(59, (long)nArray[i], new Object[0]));
        }
        return ahv_22.ceL();
    }

    public long dxE() {
        if (!this.iFf.dwq()) {
            return 0L;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bnv_2 bnv_22 = bgt_02.dnw();
        if (bnv_22 == null) {
            return 0L;
        }
        bhJ bhJ2 = bnv_22.dyS();
        if (this.dxB() == null) {
            return 0L;
        }
        boolean bl = bhJ2.Ya() > 0L && bhJ2.Ya() == bgt_02.Ya();
        return bhJ2.dpK().a(this.iFe, bl);
    }

    fgj dxF() {
        bgv_2 bgv_22 = this.dxB();
        return bgv_22 != null ? bgv_22.dSz().dwg() : null;
    }

    public boolean dxG() {
        return this.iFe.dxG();
    }

    @Override
    public bgv_2 duo() {
        return this.dxB();
    }
}

