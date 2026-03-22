/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

public class blR
implements aeh_2 {
    public static final String iwW = "currentActor";
    public static final String iwX = "currentAnimation";
    public static final String iwY = "currentParticleId";
    public static final String iwZ = "direction";
    public static final String ixa = "petActor";
    public static final String ixb = "petAnimation";
    public static final String ixc = "petScale";
    public static final String ixd = "displayEquipments";
    public static final String ixe = "displayPet";
    public static final String ixf = "canDisplayPet";
    public static final String ixg = "displayMount";
    public static final String ixh = "canDisplayMount";
    public static final String ixi = "displayAura";
    public static final String ixj = "canDisplayAura";
    public static final String[] ixk = new String[]{"currentActor", "currentAnimation", "currentParticleId", "direction", "displayEquipments", "petActor", "petAnimation", "petScale", "displayPet", "canDisplayPet", "displayMount", "canDisplayMount", "displayAura", "canDisplayAura"};
    private static final float ixl = 3.0f;
    private final bmm_1 ixm;
    @NotNull
    private abi_1 ixn = abi_1.dzk;
    private bnx_1 ixo;
    private bnw_1 ixp;
    private bke_2 hKo = null;
    @NotNull
    private String ixq = "AnimStatique-UI";
    @Nullable
    private String ixr;
    @NotNull
    private String ixs = "AnimStatiqueCadre";
    @NotNull
    private blX ixt = blX.iya;
    private boolean ixu = true;
    private boolean ixv = false;
    private boolean ixw = false;
    private boolean ixx = false;
    @NotNull
    private final Map<fm_1, blP> ixy = new EnumMap<fm_1, blP>(fm_1.class);

    public blR(bmm_1 bmm_12, @Nullable blR blR2) {
        this.ixm = bmm_12;
        if (blR2 != null) {
            this.ixn = blR2.ixn;
            this.ixt = blR2.ixt;
            this.ixu = blR2.ixu;
            this.ixv = blR2.ixv;
            this.ixw = blR2.ixw;
            this.ixx = blR2.ixx;
        }
        this.duL();
    }

    private Optional<ekp_0> m(fm_1 fm_12) {
        if (this.ixy.containsKey((Object)fm_12)) {
            return Optional.ofNullable(this.ixy.get((Object)fm_12).dus());
        }
        Optional<ekp_0> optional = this.ixm.s(fm_12);
        if (optional.isPresent() || !this.ixu) {
            return optional;
        }
        Optional<ffS> optional2 = bjf_1.j(fm_12);
        if (optional2.isEmpty()) {
            return Optional.empty();
        }
        Optional<ffV> optional3 = this.ixm.d(optional2.get());
        if (optional3.isEmpty()) {
            return Optional.empty();
        }
        ffV ffV2 = optional3.get();
        if (ffV2.adO()) {
            Integer n = fnp_0.k(ffV2.ead()) ? Integer.valueOf(ffV2.ead().agK()) : null;
            return Optional.of(new ekp_0(ffV2.acs(), ffV2.ead().agI(), n));
        }
        if (ffV2.fUX() > 0) {
            return Optional.of(new ekp_0(ffV2.fUX(), null, null));
        }
        return Optional.of(new ekp_0(ffV2.acs(), null, null));
    }

    public void a(abi_1 abi_12) {
        this.ixn = this.ixt == blX.iyb ? abi_12.wI(0) : abi_12;
        fse_1.gFu().a((aef_2)this, iwZ);
    }

    public void DK(int n) {
        this.ixn = this.ixt == blX.iyb ? this.ixn.wI(n) : this.ixn.wH(n);
        fse_1.gFu().a((aef_2)this, iwZ);
    }

    public void g(@NotNull blP blP2) {
        if (this.i(blP2)) {
            return;
        }
        this.h(blP2);
        this.duL();
    }

    public void u(@NotNull Map<fm_1, blP> map) {
        map.values().forEach(this::h);
        this.duL();
    }

    private void h(@NotNull blP blP2) {
        this.ixy.put(blP2.duf(), blP2);
        fm_1 fm_12 = blP2.duf();
        if (fm_12 == fm_1.pv) {
            this.ixv = true;
        }
        if (fm_12 == fm_1.pu) {
            this.ixw = true;
        }
        if (fm_12 == fm_1.pz) {
            this.ixx = true;
        }
        if (fm_12 == fm_1.px) {
            this.ixt = blX.iyd;
        } else if (fm_12 == fm_1.pG || fm_12 == fm_1.pH) {
            this.ixt = blX.iyb;
        }
    }

    public void n(@NotNull fm_1 fm_12) {
        if (!this.ixy.containsKey((Object)fm_12)) {
            return;
        }
        this.ixy.remove((Object)fm_12);
        this.duL();
    }

    public boolean i(@NotNull blP blP2) {
        blP blP3 = this.ixy.get((Object)blP2.duf());
        return blP3 != null && blP3.dut() == blP2.dut();
    }

    @NotNull
    public @Unmodifiable Map<fm_1, blP> duv() {
        return Collections.unmodifiableMap(this.ixy);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "currentActor": {
                return this.ixo.getAnimatedElement();
            }
            case "currentAnimation": {
                return this.ixq;
            }
            case "currentParticleId": {
                return this.ixr;
            }
            case "direction": {
                return this.ixn.dzy;
            }
            case "petActor": {
                return this.ixp != null ? this.ixp.getAnimatedElement() : null;
            }
            case "petAnimation": {
                return this.ixs;
            }
            case "petScale": {
                if (this.ixp == null) {
                    return Float.valueOf(0.0f);
                }
                return Float.valueOf(3.0f * this.ixp.getAnimatedElement().bqd().getScale());
            }
            case "displayEquipments": {
                return this.ixu;
            }
            case "displayPet": {
                return this.ixv;
            }
            case "canDisplayPet": {
                return this.m(fm_1.pv).isPresent();
            }
            case "displayMount": {
                return this.ixw;
            }
            case "canDisplayMount": {
                return this.m(fm_1.pu).isPresent();
            }
            case "displayAura": {
                return this.ixx;
            }
            case "canDisplayAura": {
                return this.m(fm_1.pz).isPresent();
            }
        }
        return null;
    }

    public void duw() {
        do {
            this.ixt = this.ixt.duX();
        } while (!this.b(this.ixt));
        if (this.ixt == blX.iyb && !this.ixn.bVO()) {
            this.ixn = this.ixn.wI(1);
        }
        this.duL();
    }

    public void a(blX blX2) {
        if (this.b(blX2)) {
            this.ixt = blX2;
            this.duL();
        }
    }

    private boolean b(blX blX2) {
        switch (blX2) {
            case iyb: {
                return !this.duM() && this.m(fm_1.pG).isPresent();
            }
        }
        return true;
    }

    public boolean dux() {
        return this.ixu;
    }

    public void duy() {
        this.ixu = !this.ixu;
        this.duL();
    }

    public boolean duz() {
        return this.ixv;
    }

    public void duA() {
        if (this.ixv) {
            return;
        }
        this.duC();
    }

    public void duB() {
        if (!this.ixv) {
            return;
        }
        this.duC();
    }

    public void duC() {
        if (this.ixv) {
            this.ixv = false;
        } else if (this.m(fm_1.pv).isPresent()) {
            this.ixv = true;
        }
        this.duL();
    }

    public boolean duD() {
        return this.ixw;
    }

    public void duE() {
        if (this.ixw) {
            return;
        }
        this.duG();
    }

    public void duF() {
        if (!this.ixw) {
            return;
        }
        this.duG();
    }

    public void duG() {
        if (this.ixw) {
            this.ixw = false;
        } else if (this.m(fm_1.pu).isPresent()) {
            this.ixw = true;
            if (this.ixt == blX.iyb) {
                this.ixt = blX.iya;
            }
        }
        this.duL();
    }

    public boolean duH() {
        return this.ixx;
    }

    public void duI() {
        if (this.ixx) {
            return;
        }
        this.duK();
    }

    public void duJ() {
        if (!this.ixx) {
            return;
        }
        this.duK();
    }

    public void duK() {
        if (this.ixx) {
            this.ixx = false;
        } else if (this.m(fm_1.pz).isPresent()) {
            this.ixx = true;
        }
        this.duL();
    }

    public void deS() {
        this.duL();
    }

    private void duL() {
        Optional<Object> optional;
        if (this.hKo != null) {
            this.hKo.dsO();
            this.hKo = null;
        }
        this.ixo = this.duQ();
        this.ixo.deS();
        if (this.duM()) {
            optional = this.duN();
        } else {
            optional = Optional.empty();
            this.ixw = false;
        }
        this.duO();
        this.ixq = "AnimStatique-UI";
        this.ixs = "AnimStatiqueCadre";
        switch (this.ixt) {
            case iya: {
                this.ixq = optional.isPresent() ? ajf_0.yG(((fjk)optional.get()).d()) : "AnimStatique-UI";
                this.ixs = "AnimStatiqueCadre";
                break;
            }
            case iyb: {
                Optional<ekp_0> optional2 = this.m(fm_1.pG);
                if (optional2.isPresent()) {
                    ffV ffV2 = ffV.k(bEm.dSb().Vd(optional2.get().AK()));
                    this.ixq = "AnimStatique03-Boucle-" + btq_1.d(ffV2.fWi());
                }
                this.ixs = "AnimStatiqueCadre";
                break;
            }
            case iyc: {
                this.ixq = optional.isPresent() ? ajf_0.yH(((fjk)optional.get()).d()) : "AnimMarche";
                this.ixs = "AnimMarche";
                break;
            }
            case iyd: {
                this.ixq = optional.isPresent() ? ajf_0.yI(((fjk)optional.get()).d()) : this.duP();
                this.ixs = "AnimCourse";
            }
        }
        fse_1.gFu().a((aef_2)this, ixk);
    }

    private boolean duM() {
        return this.ixw && this.m(fm_1.pu).isPresent();
    }

    private Optional<fjk> duN() {
        Optional<ekp_0> optional = this.m(fm_1.pu);
        if (optional.isEmpty()) {
            return Optional.empty();
        }
        Optional<fos_0> optional2 = this.a(optional.get());
        if (optional2.isEmpty()) {
            return Optional.empty();
        }
        this.hKo = new bke_2(optional2.get(), sm_0.bpx, (bdj_2)this.ixo.getAnimatedElement());
        this.hKo.dsM();
        return Optional.of(optional2.get().gfA());
    }

    private Optional<fos_0> a(ekp_0 ekp_02) {
        Optional<ffV> optional;
        fos_0 fos_02 = fou_0.sLB.aA(ekp_02.AK());
        if (fos_02 != null) {
            return Optional.of(fos_02);
        }
        fov_0 fov_02 = foy_0.sLJ.XQ(ekp_02.AK());
        if (fov_02 != null && (optional = fou_0.sLB.az(fov_02.aVt())) != null) {
            return Optional.of(optional);
        }
        optional = eIp.a((exP)this.ixm.cXJ(), ffS.sgZ);
        if (optional.isPresent() && ((ffV)optional.get()).adO() && this.ixu) {
            return Optional.ofNullable(cdO.c(((ffV)optional.get()).ead()));
        }
        return Optional.empty();
    }

    private void duO() {
        Optional<ekp_0> optional = this.m(fm_1.pv);
        if (this.ixv && optional.isPresent()) {
            Optional<foA> optional2 = this.b(optional.get());
            if (optional2.isEmpty()) {
                return;
            }
            Integer n = optional.get().fxV().orElse(null);
            Integer n2 = optional.get().fxW().orElse(null);
            this.ixp = new bnw_1();
            this.ixp.a(optional2.get(), this.ixm.cXJ(), n, n2);
            aJq.a(this.ixp.getAnimatedElement(), this.ixo.egd().HP(), "blason", null);
        } else {
            this.ixv = false;
            this.ixp = null;
        }
    }

    private Optional<foA> b(ekp_0 ekp_02) {
        foA foA2 = foC.sLW.aF(ekp_02.AK());
        if (foA2 != null) {
            return Optional.of(foA2);
        }
        if (!this.ixu) {
            return Optional.empty();
        }
        return foC.sLW.XU(ekp_02.AK());
    }

    @NotNull
    private String duP() {
        Optional<ekp_0> optional = this.m(fm_1.px);
        if (optional.isPresent()) {
            ffV ffV2 = fgD.fXh().Ve(optional.get().AK());
            for (enk_0 enk_02 : ffV2) {
                for (Pf pf : enk_02.fAC()) {
                    if (pf.aXu() != ph_0.bdj) continue;
                    return ((pl_0)pf).aXM();
                }
            }
        }
        return "AnimCourse";
    }

    private bnx_1 duQ() {
        blY blY2 = new blY();
        blY2.ad(this.ixm.cXJ());
        int n = this.duR();
        blY2.DN(n);
        blY2.gx(this.ixm.dva());
        String string = this.ixr = this.ixx ? this.duS() : null;
        if (this.ixr == null) {
            this.ixx = false;
        }
        this.a(blY2, fm_1.pG);
        this.a(blY2, fm_1.pH);
        if (n == 0) {
            for (fm_1 fm_12 : this.ixm.dvQ()) {
                this.a(blY2, fm_12);
            }
        }
        return blY2;
    }

    private void a(bnx_1 bnx_12, fm_1 fm_12) {
        Optional<ffS> optional = bjf_1.j(fm_12);
        if (optional.isEmpty()) {
            return;
        }
        Optional<ekp_0> optional2 = this.m(fm_12);
        if (optional2.isEmpty()) {
            bnx_12.cB(optional.get().shb);
            return;
        }
        ffV ffV2 = ffV.k(bEm.dSb().Vd(optional2.get().AK()));
        if (ffV2 != null) {
            bnx_12.d(ffV2, optional.get().shb);
        }
    }

    private int duR() {
        return this.m(fm_1.pw).map(ekp_0::AK).orElse(0);
    }

    @Nullable
    private String duS() {
        Optional<ekp_0> optional = this.m(fm_1.pz);
        if (optional.isEmpty()) {
            return null;
        }
        azl_2<enk_0> azl_22 = ((fhc_0)fgD.fXh().Vd(optional.get().AK())).bcx();
        for (enk_0 enk_02 : azl_22) {
            if (enk_02.fAC() == null) continue;
            for (Pf pf : enk_02.fAC()) {
                if (pf.aXu() != ph_0.bcS) continue;
                return ((pb_0)pf).aYb() + ".xps";
            }
        }
        return null;
    }

    @Override
    public String[] bxk() {
        return ixk;
    }
}

