/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bpb
 */
public class bpb_0
implements aeh_2 {
    public static final String iTL = "sublimationItemsListSearchPopup";
    public static final String iTM = "sublimationItems";
    public static final String iTN = "hasFilterOtherThanNameAndType";
    public static final String iTO = "canSwapSublimationType";
    public static final String iTP = "isOnSpecialSublimations";
    public static final String iTQ = "sublimationTypeToggleText";
    public static final String iTR = "ownedFilterValue";
    public static final String iTS = "validForItemFilterValue";
    public static final String iTT = "selectedSublimation";
    public static final String iTU = "canRemoveSublimation";
    public static final String iTV = "canAddSublimation";
    public static final String iTW = "removeSublimationButtonLabel";
    public static final String iTX = "addSublimationButtonLabel";
    public static final String[] iTY = new String[]{"sublimationItemsListSearchPopup", "sublimationItems", "hasFilterOtherThanNameAndType", "canSwapSublimationType", "isOnSpecialSublimations", "sublimationTypeToggleText", "ownedFilterValue", "validForItemFilterValue", "selectedSublimation", "canRemoveSublimation", "canAddSublimation", "removeSublimationButtonLabel", "addSublimationButtonLabel"};
    private static final String[] iTZ = new String[]{"selectedSublimation", "canRemoveSublimation", "canAddSublimation", "removeSublimationButtonLabel", "addSublimationButtonLabel"};
    private final Map<Integer, bpe_0> iUa = new HashMap<Integer, bpe_0>();
    private final List<bpe_0> iUb = new ArrayList<bpe_0>();
    @NotNull
    private bpa_0 iUc = bpa_0.iTC;
    private final Map<buh_0, bug_0<bpe_0>> iUd = new EnumMap<buh_0, bug_0<bpe_0>>(buh_0.class);
    @Nullable
    private bpe_0 iUe;

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case iTL -> bon_0.dBR();
            case iTM -> this.iUb;
            case iTN -> {
                for (buh_0 var5_11 : this.iUd.keySet()) {
                    if (var5_11 == buh_0.jot || var5_11 == buh_0.jow) continue;
                    yield true;
                }
                yield false;
            }
            case iTO -> {
                ffV var4_5 = cui_1.eRw().dBU();
                if (var4_5 == null) {
                    yield false;
                }
                yield var4_5.fVX() > 0 && (var4_5.dwg() == fgj.siF || var4_5.dwg() == fgj.siH);
            }
            case iTP -> this.dCr();
            case iTQ -> {
                ffV var4_6 = cui_1.eRw().dBU();
                if (var4_6 == null) {
                    yield null;
                }
                if (var4_6.dwg() == fgj.siF) {
                    yield aum_0.cWf().c("enchantment.sublimation.relic", new Object[0]);
                }
                if (var4_6.dwg() == fgj.siH) {
                    yield aum_0.cWf().c("enchantment.sublimation.epic", new Object[0]);
                }
                yield aum_0.cWf().c("market.filter.sublimation.epic.relic", new Object[0]);
            }
            case iTT -> this.iUe;
            case iTR -> {
                Optional<bph_0> var4_7 = this.b(buh_0.joO);
                yield var4_7.map(bun_0::dIS).map(String::valueOf).orElse(null);
            }
            case iTS -> {
                Optional<bpk_0> var4_8 = this.b(buh_0.joP);
                yield var4_8.map(bpk_0::bDR).map(String::valueOf).orElse(null);
            }
            case iTU -> this.dCt();
            case iTV -> this.dCw();
            case iTW -> {
                bpd_0 var4_9 = this.dCr() ? bpb_0.dCv() : bpb_0.dCu();
                aum_0 v1 = aum_0.cWf();
                String v2 = switch (var4_9.ordinal()) {
                    default -> throw new MatchException(null, null);
                    case 0 -> {
                        fhr_0 var5_12 = this.dCo().map(bpj_0::dCF).orElse(fhr_0.sqz);
                        switch (var5_12) {
                            default: {
                                throw new MatchException(null, null);
                            }
                            case sqz: {
                                yield "enchantment.sublimation.remove";
                            }
                            case sqx: {
                                yield "enchantment.sublimation.remove.epic";
                            }
                            case sqy: 
                        }
                        yield "enchantment.sublimation.remove.relic";
                    }
                    case 1 -> "impossible.during.fight";
                    case 2 -> "impossible.during.trade";
                    case 3, 4, 5, 6 -> "enchantment.sublimation.none.to.remove";
                    case 7 -> "enchantment.sublimation.not.stacked";
                };
                yield v1.c(v2, new Object[0]);
            }
            case iTX -> {
                bpd_0 var4_10 = this.dCr() ? this.dCy() : this.dCx();
                aum_0 v3 = aum_0.cWf();
                String v4 = switch (var4_10.ordinal()) {
                    default -> throw new MatchException(null, null);
                    case 0 -> "enchantment.sublimation.add";
                    case 1 -> "impossible.during.fight";
                    case 2 -> "impossible.during.trade";
                    case 3 -> "enchantment.sublimation.not.owned";
                    case 4 -> "enchantment.sublimation.already.present";
                    case 5 -> "enchantment.sublimation.none.selected";
                    case 6 -> "enchantment.sublimation.invalid.for.item";
                    case 7 -> "enchantment.sublimation.not.stacked";
                };
                yield v3.c(v4, new Object[0]);
            }
            default -> null;
        };
    }

    private Optional<bpj_0> dCo() {
        return this.b(buh_0.jow);
    }

    public void Q(@NotNull ffV ffV2) {
        fhr_0 fhr_02 = this.dCo().map(bpj_0::dCF).orElse(fhr_0.sqz);
        this.dCp();
        fhr_0 fhr_03 = bpb_0.a(ffV2, fhr_02);
        this.iUd.put(buh_0.jow, new bpj_0(fhr_03));
        this.b(ffV2, fhr_03);
        this.iUa.values().forEach(bpe_02 -> fse_1.gFu().a((aef_2)bpe_02, "nameStyle"));
        this.gM(false);
        fse_1.gFu().a((aef_2)this, iTY);
    }

    @NotNull
    private static fhr_0 a(@NotNull ffV ffV2, fhr_0 fhr_02) {
        return switch (fhr_02) {
            default -> throw new MatchException(null, null);
            case fhr_0.sqz -> {
                if (ffV2.fVX() == 0) {
                    if (fhr_0.sqy.aA(ffV2)) {
                        yield fhr_0.sqy;
                    }
                    if (fhr_0.sqx.aA(ffV2)) {
                        yield fhr_0.sqx;
                    }
                }
                yield fhr_0.sqz;
            }
            case fhr_0.sqy -> {
                if (ffV2.dwg() == fgj.siF) {
                    yield fhr_0.sqy;
                }
                if (ffV2.dwg() == fgj.siH) {
                    yield fhr_0.sqx;
                }
                yield fhr_0.sqz;
            }
            case fhr_0.sqx -> ffV2.dwg() == fgj.siH ? fhr_0.sqx : (ffV2.dwg() == fgj.siF ? fhr_0.sqy : fhr_0.sqz);
        };
    }

    public void gL(boolean bl) {
        this.iUa.clear();
        bev_0.dSZ().m(n -> this.iUa.put((Integer)n, new bpe_0((int)n)));
        fcI.a(bbs_2.xl(), (exP2, ffV2) -> {
            if (ffV2.dCC() == null) {
                return true;
            }
            int n = ffV2.avr();
            if (this.iUa.containsKey(n)) {
                this.iUa.get(n).S((ffV)ffV2);
            } else {
                this.iUa.put(n, new bpe_0((ffV)ffV2));
            }
            return true;
        });
        if (this.iUe != null) {
            this.iUe = this.iUa.get(this.iUe.dCA());
        }
        this.gM(bl);
    }

    private void dCp() {
        this.iUd.put(buh_0.joO, new bph_0(true));
        this.iUd.put(buh_0.joP, new bpk_0(true));
    }

    public void a(@NotNull bug_0<bpe_0> bug_02) {
        this.iUd.remove((Object)bug_02.dcz());
        if (bug_02.isValid()) {
            this.iUd.put(bug_02.dcz(), bug_02);
        }
        this.gM(true);
    }

    public void b(@NotNull ffV ffV2, boolean bl) {
        fhr_0 fhr_02 = bpb_0.a(ffV2, bl ? fhr_0.sqy : fhr_0.sqz);
        this.a(new bpj_0(fhr_02));
        this.b(cui_1.eRw().dBU(), fhr_02);
        fse_1.gFu().a((aef_2)this, iTZ);
    }

    public void a(@NotNull bpa_0 bpa_02) {
        this.iUc = bpa_02;
        this.gM(true);
    }

    public void dCq() {
        this.gM(true);
    }

    private void gM(boolean bl) {
        this.iUb.clear();
        if (this.iUd.isEmpty()) {
            this.iUb.addAll(this.iUa.values());
        } else {
            this.iUb.addAll(this.iUa.values().stream().filter(this::a).toList());
        }
        this.iUb.sort(this.iUc.dcC());
        if (bl) {
            fse_1.gFu().a((aef_2)this, iTM, iTN, iTP, iTT);
        }
    }

    private boolean a(bpe_0 bpe_02) {
        for (bug_0<bpe_0> bug_02 : this.iUd.values()) {
            if (bug_02.ah(bpe_02)) continue;
            return false;
        }
        return true;
    }

    public <T extends bug_0<bpe_0>> Optional<T> b(buh_0 buh_02) {
        return Optional.ofNullable(this.iUd.get((Object)buh_02));
    }

    public boolean dCr() {
        Optional<bpj_0> optional = this.dCo();
        if (optional.isEmpty()) {
            return false;
        }
        return optional.get().dCF() != fhr_0.sqz;
    }

    public OptionalInt dCs() {
        if (this.iUe == null) {
            return OptionalInt.empty();
        }
        return OptionalInt.of(this.iUe.dCA());
    }

    private void b(@Nullable ffV ffV2, fhr_0 fhr_02) {
        if (ffV2 == null) {
            this.H(null);
            return;
        }
        int n = ffV2.dXg() ? (fhr_02 == fhr_0.sqz ? ffV2.eAZ().ahy() : ffV2.eAZ().ahA()) : -1;
        this.H(n > 0 && this.iUa.get(n).oP() > 0 ? Integer.valueOf(n) : null);
    }

    public void H(@Nullable Integer n) {
        this.iUe = n == null ? null : this.iUa.get(n);
        fse_1.gFu().a((aef_2)this, iTZ);
        bmq_0 bmq_02 = n == null ? null : (bmq_0)cfg_2.getState(n).orElse(null);
        fse_1.gFu().b("describedState", bmq_02, "enchantmentDialog");
        if (bmq_02 != null) {
            fse_1.gFu().b("describedStateLevel", bmq_02.cmL(), "enchantmentDialog");
        }
    }

    public boolean dCt() {
        bpd_0 bpd_02 = this.dCr() ? bpb_0.dCv() : bpb_0.dCu();
        return bpd_02 == bpd_0.iUg;
    }

    private static bpd_0 dCu() {
        if (aue_0.cVJ().cVK().djU()) {
            return bpd_0.iUh;
        }
        if (aue_0.cVJ().cVK().fhv() == 24) {
            return bpd_0.iUi;
        }
        ffV ffV2 = cui_1.eRw().dBU();
        if (ffV2 == null || !ffV2.dXg()) {
            return bpd_0.iUm;
        }
        if (ffV2.bfd() > 1) {
            return bpd_0.iUn;
        }
        return ffV2.eAZ().fYQ() ? bpd_0.iUg : bpd_0.iUm;
    }

    private static bpd_0 dCv() {
        if (aue_0.cVJ().cVK().djU()) {
            return bpd_0.iUh;
        }
        if (aue_0.cVJ().cVK().fhv() == 24) {
            return bpd_0.iUi;
        }
        ffV ffV2 = cui_1.eRw().dBU();
        if (ffV2 == null || !ffV2.dXg()) {
            return bpd_0.iUm;
        }
        if (ffV2.bfd() > 1) {
            return bpd_0.iUn;
        }
        return ffV2.eAZ().dXi() ? bpd_0.iUg : bpd_0.iUj;
    }

    public boolean dCw() {
        bpd_0 bpd_02 = this.dCr() ? this.dCy() : this.dCx();
        return bpd_02 == bpd_0.iUg;
    }

    private bpd_0 dCx() {
        if (aue_0.cVJ().cVK().djU()) {
            return bpd_0.iUh;
        }
        if (aue_0.cVJ().cVK().fhv() == 24) {
            return bpd_0.iUi;
        }
        if (this.iUe == null) {
            return bpd_0.iUl;
        }
        if (this.iUe.dCC().dCF() != fhr_0.sqz) {
            return bpd_0.iUm;
        }
        ffV ffV2 = cui_1.eRw().dBU();
        if (ffV2 == null || !ffV2.dXg()) {
            return bpd_0.iUm;
        }
        if (ffV2.eAZ().ahy() == this.iUe.dCA()) {
            return bpd_0.iUk;
        }
        if (ffV2.bfd() > 1) {
            return bpd_0.iUn;
        }
        boolean bl = fhk_0.a(ffV2.eAZ(), this.iUe.dCC());
        if (!bl) {
            return bpd_0.iUm;
        }
        return this.iUe.oP() > 0 ? bpd_0.iUg : bpd_0.iUj;
    }

    private bpd_0 dCy() {
        if (aue_0.cVJ().cVK().djU()) {
            return bpd_0.iUh;
        }
        if (aue_0.cVJ().cVK().fhv() == 24) {
            return bpd_0.iUi;
        }
        if (this.iUe == null) {
            return bpd_0.iUl;
        }
        if (this.iUe.dCC().dCF() == fhr_0.sqz) {
            return bpd_0.iUm;
        }
        ffV ffV2 = cui_1.eRw().dBU();
        if (ffV2 == null) {
            return bpd_0.iUm;
        }
        if (ffV2.dXg() && ffV2.eAZ().ahA() == this.iUe.dCA()) {
            return bpd_0.iUk;
        }
        if (ffV2.bfd() > 1) {
            return bpd_0.iUn;
        }
        if (!this.iUe.dCC().dCF().aA(ffV2)) {
            return bpd_0.iUm;
        }
        return this.iUe.oP() > 0 ? bpd_0.iUg : bpd_0.iUj;
    }

    public void R(@NotNull ffV ffV2) {
        int n;
        if (!ffV2.dXg()) {
            return;
        }
        fhi_0 fhi_02 = ffV2.eAZ();
        int n2 = n = this.dCr() ? fhi_02.ahA() : fhi_02.ahy();
        if (this.iUe == null || this.iUe.dCA() != n) {
            return;
        }
        if (this.iUe.oP() == 0) {
            this.H(null);
        }
    }

    @Override
    public String[] bxk() {
        return iTY;
    }
}

