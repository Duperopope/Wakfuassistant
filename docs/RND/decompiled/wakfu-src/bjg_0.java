/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bJg
 */
public abstract class bjg_0<T extends aef_2>
implements aeh_2 {
    private static final Logger kkv = Logger.getLogger(bjg_0.class);
    public static final String kkw = "name";
    public static final String kkx = "levelTextShort";
    public static final String kky = "currentLevelPercentage";
    public static final String kkz = "xpText";
    public static final String kkA = "xpValue";
    public static final String kkB = "smallIconUrl";
    public static final String kkC = "breedName";
    public static final String kkD = "lastMealDateText";
    public static final String kkE = "dietDescription";
    public static final String kkF = "weakDescription";
    public static final String kkG = "animatedElement";
    public static final String kkH = "petAnimationEquipment";
    public static final String kkI = "hpMax";
    public static final String kkJ = "hp";
    public static final String kkK = "hpDescription";
    public static final String kkL = "bonusDescription";
    public static final String kkM = "color";
    public static final String kkN = "colorName";
    public static final String kkO = "accessory";
    public static final String kkP = "accessoryName";
    public static final String kkQ = "equipment";
    public static final String kkR = "hasPet";
    public static final String kkS = "isActive";
    public static final String kkT = "canChangeEquipment";
    public static final String kkU = "isMount";
    public static final String kkV = "canMount";
    public static final String kkW = "hasColorationItems";
    public static final String kkX = "colorationItems";
    public static final String kkY = "hasAccessoryItems";
    public static final String kkZ = "accessoryItems";
    public static final String kla = "possibleMeals";
    public static final String klb = "selectedMeal";
    public static final String[] klc = new String[]{"name", "levelTextShort", "currentLevelPercentage", "xpText", "xpValue", "smallIconUrl", "breedName", "lastMealDateText", "animatedElement", "petAnimationEquipment", "dietDescription", "weakDescription", "hpMax", "hp", "hpDescription", "bonusDescription", "color", "colorName", "equipment", "hasPet", "isActive", "isMount", "canMount", "hasColorationItems", "colorationItems", "hasAccessoryItems", "accessoryItems", "accessory", "accessoryName", "possibleMeals", "selectedMeal"};
    private static final int kld = 6;
    protected bjk_0 kle;
    @NotNull
    protected final fnl_0 klf;
    @NotNull
    protected final T klg;
    private final List<bji_0> klh = new ArrayList<bji_0>();
    @Nullable
    private bji_0 kli;

    protected bjg_0(@NotNull fnl_0 fnl_02, @NotNull T t) {
        this.klf = fnl_02;
        this.klg = t;
    }

    public void dZW() {
        this.a(null);
    }

    public void a(@Nullable bji_0 bji_02) {
        this.klh.clear();
        LinkedHashMap<Integer, Boolean> linkedHashMap = new LinkedHashMap<Integer, Boolean>();
        ArrayList arrayList = new ArrayList();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        this.klf.geL().i((n, bl) -> {
            linkedHashMap.put((Integer)n, (Boolean)bl);
            (bl != false ? arrayList : arrayList2).add(n);
        });
        for (int n2 : this.klf.geL().gft()) {
            linkedHashMap.put(n2, false);
            arrayList2.add(n2);
        }
        HashMap hashMap = new HashMap();
        fcI.a(bbs_2.xl(), (exP2, ffV2) -> {
            int n = ffV2.avr();
            if (!linkedHashMap.containsKey(n)) {
                return true;
            }
            hashMap.put(n, ffV2.bfd() + hashMap.getOrDefault(n, 0));
            return true;
        });
        arrayList.forEach(n -> this.klh.add(new bji_0((int)n, hashMap.getOrDefault(n, 0))));
        int n3 = 6 * GC.r(this.klh.size(), 6) - this.klh.size();
        for (int i = 0; i < n3; ++i) {
            this.klh.add(null);
        }
        arrayList2.forEach(n -> {
            Integer n2 = (Integer)hashMap.get(n);
            if (n2 != null && n2 > 0) {
                this.klh.add(new bji_0((int)n, n2));
            }
        });
        if (bji_02 != null) {
            this.kli = this.b(bji_02);
        } else if (this.kli != null) {
            this.kli = this.b(this.kli);
        }
        fse_1.gFu().a((aef_2)this, kla, klb);
    }

    @Nullable
    private bji_0 b(@NotNull bji_0 bji_02) {
        return this.klh.stream().filter(Objects::nonNull).filter(bji_03 -> bji_03.avr() == bji_02.avr()).findAny().orElse(null);
    }

    public void dZX() {
        this.kle = new bjk_0(this.klf);
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        Optional<ffV> optional = this.dZZ();
        this.kle.lf(bjn_0.a(this.klf.geL(), optional.map(ffV::avr).orElse(0)));
        this.kle.a(abi_1.dzl);
        this.kle.dT("AnimStatique");
        this.kle.a(aeB.bww());
        this.kle.qR(afX.csq.byy());
        this.kle.at((byte)8);
        this.kle.setVisible(true);
        this.kle.bpC();
        this.kle.a(this.klf.geL().XN(this.dZY()));
        optional.ifPresent(ffV2 -> this.kle.Bx(ffV2.aVt()));
        bjn_0.a((ZC)this.kle, bgt_02);
        this.kle.bpC();
    }

    @Override
    public String[] bxk() {
        return klc;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kkw)) {
            return this.getName();
        }
        if (string.equals(kkx)) {
            return aum_0.cWf().c("levelShort.custom", this.klf.cmL());
        }
        if (string.equals(kky)) {
            return this.klf.agN() / 100;
        }
        if (string.equals(kkz)) {
            fov_0 fov_02 = this.klf.geL();
            ahv_2 ahv_22 = new ahv_2();
            ahv_22.ceu();
            ahv_22.c(aum_0.cWf().c("xpRatio", this.klf.agN(), fov_02.fs((short)(this.klf.cmL() + 1))));
            ahv_22.cev().ceH();
            ahv_22.c(aum_0.cWf().c("pet.xpDesc", new Object[0]));
            return ahv_22.ceL();
        }
        if (string.equals(kkA)) {
            fnl_0 fnl_02 = this.klf;
            short s = fnl_02.cmL();
            short s2 = fnl_02.geL().csH();
            int n = s * s2;
            float f2 = fnl_02.agN() - n;
            return Float.valueOf(f2 / (float)s2);
        }
        if (string.equals(kkD)) {
            return this.eab();
        }
        if (string.equals(kkG)) {
            return this.kle;
        }
        if (string.equals(kkH)) {
            return this.kle.bqd();
        }
        if (string.equals(kkF)) {
            Object object = "";
            int[] nArray = this.klf.geL().gft();
            int n = nArray.length;
            for (int i = 0; i < n; ++i) {
                if (i > 0) {
                    object = (String)object + ", ";
                }
                object = (String)object + ((fhc_0)fgD.fXh().Vd(nArray[i])).getName();
            }
            return aum_0.cWf().c("pet.weakDesc", object);
        }
        if (string.equals(kkE)) {
            ahv_2 ahv_23 = new ahv_2();
            this.klf.geL().f(new bjh_0(this, ahv_23));
            ua_0 ua_02 = this.klf.geL().gfv();
            ua_0 ua_03 = this.klf.geL().gfu();
            int n = ua_03.bjR();
            int n2 = ua_02.bjR();
            return aum_0.cWf().c("pet.dietDesc", ahv_23.ceL(), n, n2, this.eab());
        }
        if (string.equals(kkI)) {
            fnl_0 fnl_03 = this.klf;
            return fnl_03.geL().agM();
        }
        if (string.equals(kkJ)) {
            return this.eac();
        }
        if (string.equals(kkM)) {
            bgv_2 bgv_22 = (bgv_2)fgD.fXh().Vd(this.dZY());
            if (bgv_22 != null) {
                return bgv_22.eu("iconUrl");
            }
            return null;
        }
        if (string.equals(kkN)) {
            bgv_2 bgv_23 = (bgv_2)fgD.fXh().Vd(this.dZY());
            if (bgv_23 != null) {
                return bgv_23.getName();
            }
            return null;
        }
        if (string.equals(kkQ)) {
            return fgD.fXh().Ve(foy_0.sLJ.XR(this.klf.geL().d()));
        }
        if (string.equals(kkO)) {
            return this.dZZ().map(ffV2 -> ffV2.eu("iconUrl")).orElse(null);
        }
        if (string.equals(kkP)) {
            return this.dZZ().map(ffV::getName).orElse(null);
        }
        if (string.equals(kkR)) {
            return true;
        }
        if (string.equals(kkS)) {
            return !this.klf.geQ();
        }
        if (string.equals(kkK)) {
            ahv_2 ahv_24 = new ahv_2();
            fnl_0 fnl_04 = this.klf;
            try {
                ahv_24.a(auk_0.zU(4), 16, 16, null).c(" ");
            }
            catch (fu_0 fu_02) {
                kkv.warn((Object)fu_02.getMessage());
                ahv_24.c(aum_0.cWf().c("HPShort", new Object[0])).c(" : ");
            }
            ahv_24.yx(this.eac()).c("/").yx(fnl_04.geL().agM());
            ahv_24.ceH();
            ua_0 ua_04 = this.klf.geL().gfv();
            ua_0 ua_05 = this.klf.geL().gfu();
            int n = ua_05.bjR() * 24 + ua_05.bjE();
            int n3 = ua_04.bjR() * 24 + ua_04.bjE();
            ahv_24.c(aum_0.cWf().c("pet.hpDesc", n, n3));
            return ahv_24.ceL();
        }
        if (string.equals(kkT)) {
            return this.eaa();
        }
        if (string.equals(kkU)) {
            return this.klf.geL().gfz();
        }
        if (string.equals(kkV)) {
            bgt_0 bgt_02 = cvo_2.daL();
            if (!this.I(bgt_02)) {
                return false;
            }
            return cdO.eug().au(bgt_02);
        }
        if (string.equals(kkW)) {
            if (this.klf.geL().gfz()) {
                return false;
            }
            return this.klf.geL().gfC().length > 1;
        }
        if (string.equals(kkX)) {
            return fgD.Q(this.klf.geL().gfC());
        }
        if (string.equals(kkY)) {
            return this.klf.geL().gfB().length > 0;
        }
        if (string.equals(kkZ)) {
            return fgD.Q(this.klf.geL().gfB());
        }
        if (string.equals(kla)) {
            return this.klh;
        }
        if (string.equals(klb)) {
            return this.kli;
        }
        return this.klg.eu(string);
    }

    private int dZY() {
        if (this.klf.agI() != 0) {
            return this.klf.agI();
        }
        return this.klf.geL().gfD();
    }

    private Optional<ffV> dZZ() {
        if (!fnp_0.k(this.klf)) {
            return Optional.empty();
        }
        return Optional.ofNullable(fgD.fXh().Ve(this.klf.agK()));
    }

    public fov_0 dvo() {
        return this.klf.geL();
    }

    public boolean I(bgt_0 bgt_02) {
        return false;
    }

    protected abstract boolean eaa();

    private String eab() {
        ux_0 ux_02 = this.klf.geN();
        if (ux_02.bjv()) {
            return null;
        }
        return aum_0.cWf().v(ux_02);
    }

    private int eac() {
        fnl_0 fnl_02 = this.klf;
        return fnl_02.agM();
    }

    public String getName() {
        String string = this.klf.getName();
        return string == null || string.length() == 0 ? (String)this.klg.eu(kkw) : string;
    }

    public fnl_0 ead() {
        return this.klf;
    }

    public abstract int d();

    public abstract long eae();

    public void clean() {
        if (this.kle != null) {
            this.kle.bpI();
        }
    }

    public boolean Hp(int n) {
        return this.klh.stream().filter(Objects::nonNull).anyMatch(bji_02 -> bji_02.avr() == n);
    }

    @Nullable
    public bji_0 eaf() {
        return this.kli;
    }

    public void c(@Nullable bji_0 bji_02) {
        this.kli = bji_02;
        fse_1.gFu().a((aef_2)this, klb);
    }
}

