/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bmo
 */
public class bmo_1
implements aeh_2,
bmm_1,
cfi_2 {
    private static final List<fm_1> iAx = List.of(fm_1.px, fm_1.pz, fm_1.pJ);
    public static final List<fm_1> iAy = List.of(fm_1.pB, fm_1.pD, fm_1.pE, fm_1.pC, fm_1.pF, fm_1.pJ);
    public static final String iAz = "preview";
    public static final String iAA = "firstSlots";
    public static final String iAB = "secondSlots";
    public static final String iAC = "hasCostume";
    public static final String iAD = "hideHat";
    public static final String[] iAE = new String[]{"preview", "firstSlots", "secondSlots", "hasCostume", "hideHat"};
    private blR izr;
    private final Map<fm_1, bmn_1> iAF = new LinkedHashMap<fm_1, bmn_1>();
    private final List<bmn_1> iAG = new ArrayList<bmn_1>();
    private final List<bmn_1> iAH = new ArrayList<bmn_1>();
    private boolean iyh = false;

    @NotNull
    public blR dvz() {
        return this.izr;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        String string2 = string;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{iAz, iAA, iAB, iAC, iAD}, (Object)string2, n)) {
            case 0 -> this.izr;
            case 1 -> this.iAG;
            case 2 -> this.iAH;
            case 3 -> this.iAF.get((Object)fm_1.pw).aaz();
            case 4 -> this.iyh;
            default -> null;
        };
    }

    public void t(@NotNull bgt_0 bgt_02) {
        this.dvU();
        bgt_02.dmL().fUd().forEach((ffS2, l) -> {
            Optional<ffV> optional = bgt_02.dnP().B((Long)l);
            if (optional.isEmpty()) {
                return;
            }
            Optional<fm_1> optional2 = bjf_1.c(ffS2);
            if (optional2.isEmpty()) {
                return;
            }
            this.iAF.get((Object)optional2.get()).Ec(optional.get().avr());
        });
        bjf_1.jM(bgt_02.Sn()).ifPresentOrElse(eks_02 -> {
            eks_02.fye().forEach((fm_12, list) -> {
                if (list.isEmpty()) {
                    return;
                }
                if (!this.iAF.containsKey(fm_12)) {
                    return;
                }
                this.iAF.get(fm_12).Ec(((ekp_0)list.getFirst()).AK());
            });
            this.iyh = eks_02.dva();
        }, () -> {
            this.iyh = false;
        });
    }

    public void r(Collection<? extends fhc_0> collection) {
        EnumSet<fm_1> enumSet = EnumSet.noneOf(fm_1.class);
        for (fhc_0 fhc_02 : collection) {
            fgl_0 fgl_02 = fhc_02.fUZ();
            if (fgl_02 instanceof bga_1) {
                bga_1 bga_12 = (bga_1)fgl_02;
                fm_1 fm_13 = bga_12.duW();
                if (!this.iAF.containsKey((Object)fm_13)) {
                    return;
                }
                this.iAF.get((Object)fm_13).Ec(fhc_02.d());
                enumSet.add(fm_13);
                continue;
            }
            for (ffS ffS2 : fhc_02.dGh().fZq()) {
                bjf_1.c(ffS2).ifPresent(fm_12 -> {
                    if (!this.iAF.containsKey(fm_12)) {
                        return;
                    }
                    this.iAF.get(fm_12).Ec(fhc_02.d());
                    enumSet.add((fm_1)((Object)((Object)fm_12)));
                });
            }
        }
        this.dvN();
        this.izr = new blR(this, null);
        this.e(enumSet);
    }

    private void dvU() {
        bmn_1 bmn_12;
        this.iAF.clear();
        this.iAG.clear();
        this.iAH.clear();
        for (fm_1 fm_12 : bjf_1.inI) {
            bmn_12 = new bmn_1(fm_12);
            this.iAF.put(fm_12, bmn_12);
            this.iAG.add(bmn_12);
        }
        for (fm_1 fm_12 : iAx) {
            bmn_12 = new bmn_1(fm_12);
            this.iAF.put(fm_12, bmn_12);
            this.iAH.add(bmn_12);
        }
    }

    private void e(Set<fm_1> set) {
        if (this.iAF.get((Object)fm_1.pv).aaz()) {
            this.izr.duA();
        }
        if (set.contains((Object)fm_1.pu)) {
            this.izr.duE();
        } else if (set.contains((Object)fm_1.px)) {
            this.izr.a(blX.iyd);
        } else if (this.iAF.get((Object)fm_1.pu).aaz()) {
            this.izr.duE();
        }
        if (this.iAF.get((Object)fm_1.pz).aaz()) {
            this.izr.duI();
        }
    }

    public void dvV() {
        this.izr.deS();
    }

    private void dvN() {
        boolean bl = this.iAF.get((Object)fm_1.pw).aaz();
        for (fm_1 fm_12 : iAy) {
            this.iAF.get((Object)fm_12).setEnabled(!bl);
        }
        fse_1.gFu().a((aef_2)this, iAC);
    }

    public void u(@NotNull fm_1 fm_12) {
        this.iAF.get((Object)fm_12).Ec(-1);
        this.dvN();
        this.izr.deS();
    }

    public void a(int n, @NotNull fm_1 fm_12) {
        this.iAF.get((Object)fm_12).Ec(n);
        this.dvN();
        this.izr.deS();
        switch (fm_12) {
            case pv: {
                this.izr.duA();
                break;
            }
            case pu: {
                this.izr.duE();
                break;
            }
            case pz: {
                this.izr.duI();
            }
        }
    }

    @Override
    public Optional<ekp_0> s(fm_1 fm_12) {
        return Optional.ofNullable(this.iAF.get((Object)fm_12)).map(bmn_1::AK).filter(n -> n != -1).map(n -> new ekp_0((int)n, null, null));
    }

    @Override
    public boolean dva() {
        return this.iyh;
    }

    public void gx(boolean bl) {
        if (this.iyh == bl) {
            return;
        }
        this.iyh = bl;
        this.izr.deS();
        fse_1.gFu().a((aef_2)this, iAD);
    }

    public bgt_0 daL() {
        return ctd_2.daL();
    }

    @Override
    public Optional<ffV> d(@NotNull ffS ffS2) {
        if (ffS2 == ffS.sgX || ffS2 == ffS.sgZ) {
            return eIp.a((exP)this.daL(), ffS2);
        }
        return Optional.empty();
    }

    @Override
    public Iterable<fm_1> dvQ() {
        return iAy;
    }

    @Override
    public void p(@NotNull ffV ffV2) {
        bjf_1.a(ffV2.dOg()).forEach(fm_12 -> this.iAF.get(fm_12).gz(true));
    }

    public void v(@NotNull fm_1 fm_12) {
        this.iAF.get((Object)fm_12).gz(true);
    }

    @Override
    public void dvW() {
        this.iAF.values().forEach(bmn_12 -> bmn_12.gz(false));
    }

    @Override
    public String[] bxk() {
        return iAE;
    }

    @Override
    public /* synthetic */ bhJ cXJ() {
        return this.daL();
    }
}

