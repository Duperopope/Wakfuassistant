/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bPt
 */
public abstract class bpt_1<Id, Ref>
implements aeh_2,
aen_2 {
    private static final Logger kPq = Logger.getLogger(bpt_1.class);
    public static final String kPr = "name";
    public static final String kPs = "description";
    public static final String kPt = "iconUrl";
    public static final String kPu = "subtitle";
    public static final String kPv = "price";
    public static final String kPw = "originalPrice";
    public static final String kPx = "currency";
    public static final String kPy = "currencyId";
    public static final String kPz = "oneClickPrice";
    public static final String kPA = "oneClickOriginalPrice";
    public static final String kPB = "oneClickCurrency";
    public static final String kPC = "oneClickCurrencyId";
    public static final String kPD = "stock";
    public static final String kPE = "remainingTime";
    public static final String kPF = "content";
    public static final String kPG = "contents";
    public static final String kPH = "promotions";
    public static final String kPI = "hasPromotions";
    public static final String kPJ = "canBePreviewed";
    public static final String kPK = "hasEnoughMoney";
    public static final String kPL = "isAvailable";
    public static final String kPM = "isServerRestrictionOK";
    protected final Id kPN;
    @Nullable
    private final String kPO;
    protected final String kPP;
    protected final String kPQ;
    protected final String kPR;
    protected final Double kPS;
    protected final Double kPT;
    protected final bpa_2 kPU;
    protected Integer kPV;
    protected final Double kPW;
    protected final Double kPX;
    protected final bpa_2 kPY;
    protected final uw_0 kPZ;
    protected final ArrayList<bpk_2> kQa;
    protected final List<Ref> kQb;
    protected final ArrayList<bpf_2> kQc;
    protected final ArrayList<bPh> kQd;
    private aem_2 kQe;
    private boolean kQf;
    @Nullable
    private AtomicReference<bel_0> kQg;
    @Nullable
    private List<bel_0> kQh;

    protected bpt_1(Id Id, @Nullable String string, String string2, String string3, String string4, Double d2, Double d3, bpa_2 bpa_22, Integer n, ArrayList<bpk_2> arrayList, List<Ref> list, ArrayList<bPh> arrayList2, ArrayList<bpf_2> arrayList3, uw_0 uw_02, Double d4, Double d5, bpa_2 bpa_23) {
        this.kPN = Id;
        this.kPO = string;
        this.kPP = string2;
        this.kPQ = string3;
        this.kPR = string4;
        this.kPS = d2;
        this.kPT = d3;
        this.kPU = bpa_22;
        this.kPV = n;
        this.kQa = arrayList;
        this.kQb = list;
        this.kQc = arrayList3;
        this.kQd = arrayList2;
        this.kQf = false;
        this.kPZ = uw_02;
        this.kPW = d4;
        this.kPX = d5;
        this.kPY = bpa_23;
        this.eio();
    }

    public Id eid() {
        return this.kPN;
    }

    @Nullable
    public String getKey() {
        return this.kPO;
    }

    public String getName() {
        return this.kPP;
    }

    public String getDescription() {
        return this.kPQ;
    }

    public String eie() {
        return this.kPR;
    }

    public double eif() {
        return this.kPS;
    }

    public uw_0 eig() {
        return this.kPZ;
    }

    public double eih() {
        return this.kPT;
    }

    public bpa_2 ehX() {
        return this.kPU;
    }

    public int eii() {
        return this.kPV;
    }

    public void eij() {
        if (this.kPV > 0) {
            Integer n = this.kPV;
            this.kPV = this.kPV - 1;
            fse_1.gFu().a((aef_2)this, kPD, kPL);
        }
    }

    public boolean a(bpy_2 bpy_22) {
        int n = this.kQa.size();
        for (int i = 0; i < n; ++i) {
            bpk_2 bpk_22 = this.kQa.get(i);
            if (bpk_22.eiN() != bpy_22) continue;
            return true;
        }
        return false;
    }

    public boolean nj(String string) {
        int n = this.kQa.size();
        for (int i = 0; i < n; ++i) {
            bpk_2 bpk_22 = this.kQa.get(i);
            if (bpk_22.nq(string) == null) continue;
            return true;
        }
        return false;
    }

    public ArrayList<bpk_2> eik() {
        return this.kQa;
    }

    @Override
    public String[] bxk() {
        return dGM;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(kPr)) {
            return this.kPP;
        }
        if (string.equals(kPs)) {
            return this.kPQ;
        }
        if (string.equals(kPt)) {
            return this.kQe == null ? null : this.kQe.bZo();
        }
        if (string.equals(kPu)) {
            return this.kPR;
        }
        if (string.equals(kPv)) {
            return this.eil();
        }
        if (string.equals(kPw)) {
            return this.kPT != null && this.kPT > this.kPS ? new ahv_2().cew().c(aum_0.cWf().w(this.kPT)).ceL() : null;
        }
        if (string.equals(kPx)) {
            return this.kPU != null ? this.kPU.byf() : null;
        }
        if (string.equals(kPy)) {
            return this.kPU != null ? Byte.valueOf(this.kPU.aJr()) : null;
        }
        if (string.equals(kPD)) {
            if (this.kPV == -1) {
                return null;
            }
            if (this.kPV == 0) {
                return aum_0.cWf().c("webShop.soldOut", new Object[0]);
            }
            return aum_0.cWf().c("playerGift.itemCount", this.kPV);
        }
        if (string.equals(kPE)) {
            return this.dbr();
        }
        if (string.equals(kPF)) {
            return this.eiu();
        }
        if (string.equals(kPG)) {
            return this.eiv();
        }
        if (string.equals(kPH)) {
            return this.kQc;
        }
        if (string.equals(kPI)) {
            return this.kQc != null && !this.kQc.isEmpty();
        }
        if (string.equals(kPJ)) {
            return this.kQf;
        }
        if (string.equals(kPK)) {
            bpp_2 bpp_22 = (bpp_2)fse_1.gFu().vY("webShop");
            if (bpp_22 == null) {
                return false;
            }
            if (this.kPU != null && this.kPU.eiG()) {
                return true;
            }
            return this.kPS != null && this.kPS <= (double)bpp_22.a(this.kPU);
        }
        if (string.equals(kPL)) {
            return this.ein();
        }
        if (string.equals(kPM)) {
            return this.eim();
        }
        if (string.equals(kPA)) {
            return this.kPX != null && this.kPX > this.kPW ? new ahv_2().cew().c(aum_0.cWf().w(this.kPX)).ceL() : null;
        }
        if (string.equals(kPB)) {
            if (this.kPY == null) {
                return null;
            }
            return this.kPY.byf();
        }
        if (string.equals(kPC)) {
            if (this.kPY == null) {
                return null;
            }
            return this.kPY.aJr();
        }
        if (string.equals(kPz)) {
            return this.kPW != null && this.kPW > 0.0 ? aum_0.cWf().w(this.kPW) : null;
        }
        return null;
    }

    @Nullable
    protected String eil() {
        return this.kPS != null && this.kPS > 0.0 ? aum_0.cWf().w(this.kPS) : null;
    }

    public boolean eim() {
        for (int i = 0; i < this.kQa.size(); ++i) {
            bpk_2 bpk_22 = this.kQa.get(i);
            if (!bpk_22.eim()) continue;
            return true;
        }
        return false;
    }

    public boolean diq() {
        return this.kPZ != null && !this.kPZ.bjv();
    }

    public void a(ux_0 ux_02, int n) {
        this.kPV = n;
        this.kPZ.f(ux_02);
        fse_1.gFu().a((aef_2)this, kPD, kPE, kPL);
    }

    private boolean ein() {
        if (this.kPV == 0) {
            return false;
        }
        if (this.kPZ == null || this.kPZ.bjv()) {
            return true;
        }
        uz_0 uz_02 = ue_0.bjV().bjc().l(this.kPZ);
        return uz_02.aYI();
    }

    private String dbr() {
        if (this.kPZ.bjv()) {
            return null;
        }
        uz_0 uz_02 = ue_0.bjV().bjc().l(this.kPZ);
        return uz_02.aYI() ? uc_0.k(uz_02) : aum_0.cWf().c("webShop.soldOut", new Object[0]);
    }

    private void eio() {
        if (this.kQd == null) {
            return;
        }
        bPh bPh2 = bPj.a(this.kQd, 200, 200, "GALLERY");
        if (bPh2 != null) {
            this.kQe = bPj.a(bPh2, this, kPt);
        }
        this.kQf = this.eiq().anyMatch(bjf_1::b);
    }

    @Override
    public void F(String string, String string2) {
        fse_1.gFu().a((aef_2)this, string);
    }

    public void eip() {
        if (!this.kQf) {
            return;
        }
        List<bgv_2> list = this.eiq().toList();
        ctd_2.eQA().F(list);
    }

    @NotNull
    private Stream<bgv_2> eiq() {
        return this.kQa.stream().map(bpk_2::eiL).map(bEm.dSb()::Vd).filter(Objects::nonNull);
    }

    public bpa_2 eir() {
        return this.kPY;
    }

    public Double eis() {
        return this.kPW;
    }

    public abstract boolean a(bpx_2 var1);

    public List<Ref> eit() {
        return this.kQb;
    }

    @Nullable
    public bel_0 eiu() {
        if (this.kQg == null) {
            bpk_2 bpk_22;
            bgv_2 bgv_22;
            bel_0 bel_02 = !this.kQa.isEmpty() ? ((bgv_22 = (bpk_22 = this.kQa.get(0)).eiM()) != null ? new bel_0(bgv_22, bpk_22.aBF()) : null) : null;
            this.kQg = new AtomicReference<Object>(bel_02);
        }
        return this.kQg.get();
    }

    @NotNull
    public List<bel_0> eiv() {
        if (this.kQh == null) {
            ArrayList<bel_0> arrayList = new ArrayList<bel_0>();
            for (bpk_2 bpk_22 : this.kQa) {
                bgv_2 bgv_22 = bpk_22.eiM();
                if (bgv_22 == null) continue;
                arrayList.add(new bel_0(bgv_22, bpk_22.aBF()));
            }
            this.kQh = Collections.unmodifiableList(arrayList);
        }
        return this.kQh;
    }
}

