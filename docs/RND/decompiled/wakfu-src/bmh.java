/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

public class bmh
implements aeh_2 {
    private static final bmh iza = new bmh();
    public static final String izb = "cosmeticCategories";
    public static final String izc = "hasSelectedCategory";
    public static final String izd = "preview";
    public static final String ize = "currentPreset";
    public static final String izf = "isPresetsListReduced";
    public static final String izg = "presetsList";
    public static final String izh = "selectedPresetView";
    public static final String izi = "countAndLimit";
    public static final String izj = "canCreateNewPreset";
    public static final String izk = "canDeleteCurrentPreset";
    public static final String izl = "deletePresetButtonPopup";
    public static final String izm = "canEditPreset";
    public static final String izn = "readOnly";
    public static final String[] izo = new String[]{"cosmeticCategories", "hasSelectedCategory", "preview", "currentPreset", "isPresetsListReduced", "presetsList", "selectedPresetView", "countAndLimit", "canCreateNewPreset", "canDeleteCurrentPreset", "deletePresetButtonPopup", "canEditPreset", "readOnly"};
    public static final int izp = Integer.MAX_VALUE;
    private static eks_0 izq = null;
    private blR izr = null;
    private final List<bln_0> izs = new ArrayList<bln_0>();
    @Nullable
    private bln_0 izt;
    private bmk izu;
    private bml izv;
    private boolean izw = false;

    public static bmh dvr() {
        return iza;
    }

    private bmh() {
    }

    private void u(String ... stringArray) {
        fse_1.gFu().a((aef_2)this, stringArray);
    }

    @NotNull
    private static eks_0 dvs() {
        if (izq == null) {
            String string = aum_0.cWf().c("cosmetic.preset.temporary.name", new Object[0]);
            izq = new eks_0(Integer.MAX_VALUE, -1, string, Map.of(), uw_0.bju());
        }
        return izq;
    }

    private static Optional<ekr_0> dvt() {
        if (!ctb_2.eQr().dtg()) {
            return bbs_2.a(eva_1.owz);
        }
        ekr_0 ekr_02 = bbs_2.a(eva_1.owz).orElseGet(ekr_0::new);
        if (!ekr_02.Qt(Integer.MAX_VALUE)) {
            ekr_02.a(Integer.MAX_VALUE, bmh.dvs());
        }
        return Optional.of(ekr_02);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "cosmeticCategories": {
                return this.izt != null ? this.izt : this.izs;
            }
            case "hasSelectedCategory": {
                return this.izt != null;
            }
            case "preview": {
                return this.izr;
            }
            case "currentPreset": {
                return this.izu;
            }
            case "isPresetsListReduced": {
                return this.izw;
            }
            case "presetsList": {
                return this.izv.dvR();
            }
            case "selectedPresetView": {
                return this.izv.Eb(this.izu.d());
            }
            case "countAndLimit": {
                return "(" + this.izv.aVo() + "/" + ekj_0.fxQ() + ")";
            }
            case "canCreateNewPreset": {
                return this.izv.aVo() < ekj_0.fxQ() && ctb_2.eQr().eQv() && !ctb_2.eQr().dtg();
            }
            case "canDeleteCurrentPreset": {
                return this.izv.aVo() > 1 && ctb_2.eQr().eQv() && !ctb_2.eQr().dtg();
            }
            case "deletePresetButtonPopup": {
                if (this.izv.aVo() <= 1) {
                    return aum_0.cWf().c("cosmetic.preset.cannot.delete.last", new Object[0]);
                }
                return aum_0.cWf().c("cosmetic.preset.delete", new Object[0]);
            }
            case "canEditPreset": {
                return ctb_2.eQr().eQv();
            }
            case "readOnly": {
                return ctb_2.eQr().dtg();
            }
        }
        return null;
    }

    public void bkZ() {
        this.izs.clear();
        for (fm_1 fm_12 : ekj_0.qBp) {
            if (!bjf_1.h(fm_12)) continue;
            this.izs.add(new bln_0(fm_12));
        }
        this.izs.sort(Comparator.comparingInt(bln_02 -> bjf_1.f(bln_02.duf())));
        this.izt = null;
        this.izw = ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.lkH);
        this.dvv();
    }

    public void clean() {
        this.izr = null;
        this.izt = null;
        this.izu = null;
        this.izv = null;
    }

    public void dvu() {
        this.o(this::dvv);
    }

    public void dvv() {
        bhJ bhJ2 = ctb_2.eQw();
        Optional<ekr_0> optional = bmh.dvt();
        if (ctb_2.eQr().dtg()) {
            if (this.izu != null) {
                eks_0 eks_02 = optional.flatMap(ekr_02 -> ekr_02.Qu(this.izu.d())).orElseGet(bmh::dvs);
                this.izu = new bmk(eks_02, bhJ2);
            } else {
                this.izu = new bmk(bmh.dvs(), bhJ2);
            }
            this.a(optional, OptionalInt.of(Integer.MAX_VALUE));
        } else {
            this.izu = this.a(optional, bhJ2);
            this.a(optional, OptionalInt.empty());
        }
        this.dvy();
        this.u(izo);
    }

    private bmk a(Optional<ekr_0> optional, bhJ bhJ2) {
        if (optional.isPresent()) {
            Optional<eks_0> optional2 = this.izu == null ? optional.get().qd(bhJ2.Sn()) : Optional.of(this.izu.dvM());
            return optional2.map(eks_02 -> new bmk((eks_0)eks_02, bhJ2)).orElseGet(() -> new bmk(bhJ2));
        }
        return new bmk(bhJ2);
    }

    public void dvw() {
        this.u(izm);
    }

    public void a(OptionalInt optionalInt) {
        Optional<ekr_0> optional = bmh.dvt();
        this.a(optional, optionalInt);
        this.u(izg, izh, izi, izj, izk);
    }

    public void dvx() {
        Optional<ekr_0> optional = bmh.dvt();
        if (optional.isEmpty()) {
            return;
        }
        Optional<eks_0> optional2 = optional.get().Qu(this.izu.d());
        bhJ bhJ2 = ctb_2.eQw();
        this.izu = optional2.map(eks_02 -> new bmk((eks_0)eks_02, bhJ2)).orElseGet(() -> new bmk(bhJ2));
        this.a(optional, OptionalInt.empty());
        if (this.izt != null) {
            this.q(this.izt.duf());
        }
        this.dvy();
        this.u(izo);
    }

    private void a(Optional<ekr_0> optional, OptionalInt optionalInt) {
        bml bml2 = this.izv;
        this.izv = new bml(optional.orElseGet(ekr_0::new), optionalInt);
        this.izv.dvT();
        if (bml2 != null) {
            this.izv.a(bml2);
        }
    }

    private void dvy() {
        this.izr = new blR(this.izu, this.izr);
        for (bln_0 bln_02 : this.izs) {
            bln_02.J(this.izu.t(bln_02.duf()));
            if (!bjf_1.a(bln_02.duf())) continue;
            bln_02.y(this.izu.r(bln_02.duf()).dvH());
        }
    }

    public blR dvz() {
        return this.izr;
    }

    public bmk dvA() {
        return this.izu;
    }

    public void dvB() {
        this.izw = !this.izw;
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.lkH, this.izw);
        this.u(izf);
    }

    public void DS(int n) {
        bhJ bhJ2 = ctb_2.eQw();
        Optional<ekr_0> optional = bmh.dvt();
        if (optional.isPresent()) {
            Optional<eks_0> optional2 = optional.get().Qu(n);
            this.izu = optional2.map(eks_02 -> new bmk((eks_0)eks_02, bhJ2)).orElseGet(() -> new bmk(bhJ2));
        } else {
            this.izu = new bmk(bhJ2);
        }
        this.dvy();
        if (this.izt != null) {
            this.q(this.izt.duf());
        }
        this.u(izd, ize, izh);
    }

    public void mc(String string) {
        this.izv.mc(string);
        this.u(izg, izh);
    }

    public void a(int n, blZ blZ2) {
        if (this.izv.b(n, blZ2)) {
            this.u(izg, izh);
        }
    }

    public void dvC() {
        this.izv.dvR().forEach(blZ::dvd);
        this.izu.ah(ctb_2.eQw());
        fse_1.gFu().a((aef_2)this.izu, "isActive");
    }

    public void DT(int n) {
        if (this.izu.d() == n) {
            this.dvv();
        } else {
            this.a(OptionalInt.empty());
        }
    }

    public int Cs() {
        return this.izv.aVo();
    }

    public bln_0 p(fm_1 fm_12) {
        return this.izs.stream().filter(bln_02 -> bln_02.duf() == fm_12).findFirst().orElse(null);
    }

    public @Unmodifiable List<bln_0> dcb() {
        return Collections.unmodifiableList(this.izs);
    }

    public void q(@NotNull fm_1 fm_12) {
        this.izt = this.p(fm_12);
        this.izt.fm(false);
        this.izu.dvP().forEach(bmi2 -> bmi2.setSelected(bmi2.duf() == fm_12));
        this.u(izb, izc);
    }

    public void dvD() {
        this.izt = null;
        this.izu.dvP().forEach(bmi2 -> bmi2.setSelected(false));
        this.u(izb, izc);
    }

    public void f(Consumer<bln_0> consumer) {
        this.izs.forEach(consumer);
    }

    public void lW(@Nullable String string) {
        this.izs.forEach(bln_02 -> bln_02.lW(string));
    }

    public void a(@NotNull blQ blQ2) {
        this.izs.forEach(bln_02 -> bln_02.a(blQ2));
    }

    public Optional<blP> DU(int n) {
        for (bln_0 bln_02 : this.izs) {
            Optional<blP> optional = bln_02.DH(n);
            if (!optional.isPresent()) continue;
            return optional;
        }
        return Optional.empty();
    }

    public void b(fm_1 fm_12, List<Integer> list) {
        this.p(fm_12).H(list);
    }

    public void j(blP blP2) {
        if (this.izu == null) {
            return;
        }
        this.izu.r(blP2.duf()).gz(true);
    }

    public void dvE() {
        if (this.izu == null) {
            return;
        }
        this.izu.dvP().forEach(bmi2 -> bmi2.gz(false));
    }

    public void o(Runnable runnable) {
        Map<fm_1, blP> map = this.izr.duv();
        runnable.run();
        for (bln_0 bln_02 : this.izs) {
            blP blP2 = map.get((Object)bln_02.duf());
            if (blP2 == null) continue;
            bln_02.y(blP2.dut());
        }
        this.izr.u(map);
    }

    @Override
    public String[] bxk() {
        return izo;
    }
}

