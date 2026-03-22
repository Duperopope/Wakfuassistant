/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import java.util.Optional;
import java.util.OptionalInt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from caP
 */
public class cap_1 {
    private static final Logger lHz = LoggerFactory.getLogger(cap_1.class);
    private static final cap_1 lHA = new cap_1();
    private static final long lHB = Long.MIN_VALUE;
    private long brw;
    @Nullable
    private ftt_0 lHC;
    @Nullable
    private ftj_0 lHD;
    private caq_1 lHE;
    private cas_1 lHF;
    @Nullable
    private ftq_0 lHG;
    @Nullable
    private cav_1 lHH;
    @Nullable
    private Long lHI;

    public static cap_1 erG() {
        return lHA;
    }

    private cap_1() {
    }

    public ftt_0 erH() {
        return this.lHC;
    }

    public void a(@NotNull ftt_0 ftt_02) {
        this.lHC = ftt_02;
    }

    public void eqO() {
        this.lHC = null;
        this.lHE = null;
        this.lHF = null;
        this.lHG = null;
        this.lHH = null;
        this.lHI = null;
    }

    public boolean erI() {
        return this.lHC != null;
    }

    public boolean el(int n, int n2) {
        return this.lHD != null && this.lHD.el(n, n2);
    }

    public void mK(long l) {
        if (this.lHC == null) {
            lHz.error("Trying to initialize ranch of instance {} but we did not receive server data", (Object)l);
            return;
        }
        Optional<ftj_0> optional = ftk_0.glR().aak((int)l);
        if (optional.isEmpty()) {
            lHz.error("No ranch biome set for instance {}", (Object)l);
            return;
        }
        this.lHD = optional.get();
        this.brw = l;
        this.lHE = new caq_1(l, -5, -6, 9, 10);
        this.lHC.gmg().values().forEach(fty_02 -> fty_02.gmn().forEach((l, ftv_02) -> this.lHE.j(new cav_1(l, ftv_02.gmk(), ftv_02.gmd(), ftv_02.bkP(), ftv_02.bkQ()))));
        this.lHE.a(this.lHD, this.lHC);
        this.lHF = new cas_1(this.lHE, l);
        WX.a(l, this.lHF);
    }

    private static void erJ() {
        WV.bnj().bnk().brI();
    }

    public void Kn(int n) {
        this.a(null, n);
    }

    public void a(@NotNull ftv_0 ftv_02) {
        this.a(ftv_02, ftv_02.gmk());
    }

    private void a(@Nullable ftv_0 ftv_02, int n) {
        Optional<ftq_0> optional = ftr_0.gmc().aam(n);
        if (optional.isEmpty()) {
            return;
        }
        if (cxo_1.eXw().eXx()) {
            cxo_1.eXw().kR(false);
        }
        this.erK();
        this.lHG = optional.get();
        boolean bl = ftv_02 == null;
        abi_1 abi_12 = bl ? this.lHG.glZ().gmd() : ftv_02.gmd();
        long l = bl ? Long.MIN_VALUE : ftv_02.gmj();
        this.lHH = new cav_1(l, n, abi_12, bl ? 0 : ftv_02.bkP(), bl ? 0 : ftv_02.bkQ());
        cxo_1.eXw().a(bl ? bke_0.kps : bke_0.kpv);
        cxo_1.eXw().a(this.lHH, abi_12);
        if (!bl) {
            cxo_1.b(this.lHH);
        }
        cxo_1.eXw().a((int n2, int n3) -> {
            if (this.lHH == null) {
                return;
            }
            abi_1 abi_12 = this.lHH.bcB();
            if (bl) {
                cnm_0 cnm_02 = new cnm_0(n, abi_12, n2, n3);
                aue_0.cVJ().etu().d(cnm_02);
            } else if (n2 != ftv_02.bkP() || n3 != ftv_02.bkQ() || ftv_02.gmd() != abi_12) {
                cnn_0 cnn_02 = new cnn_0(ftv_02.gmj(), abi_12, n2, n3);
                aue_0.cVJ().etu().d(cnn_02);
            }
        });
        cxo_1.eXw().a((boolean bl2) -> {
            this.erK();
            if (!bl && !bl2) {
                this.lHF.a(new cav_1(ftv_02));
                cap_1.erJ();
            }
        });
        if (!cxo_1.eXw().eXx()) {
            aue_0.cVJ().a(cxo_1.eXw());
        }
    }

    public void p(int n, int n2, boolean bl) {
        if (this.lHH == null) {
            return;
        }
        this.lHH = new cav_1(this.lHH, n, n2);
        this.lHF.a(this.lHH.ZC(), bl ? this.lHH : null);
        cap_1.erJ();
    }

    @NotNull
    public abi_1 b(@NotNull abi_1 abi_12, int n) {
        if (this.lHG == null) {
            return abi_12;
        }
        abi_1 abi_13 = abi_12;
        do {
            abi_13 = abi_13.wH(n);
            if (!this.lHG.gma().containsKey(abi_13)) continue;
            return abi_13;
        } while (abi_13 != abi_12);
        return abi_12;
    }

    @Nullable
    public cav_1 l(@NotNull abi_1 abi_12) {
        if (this.lHH == null) {
            return null;
        }
        this.lHH = new cav_1(this.lHH, abi_12);
        return this.lHH;
    }

    public void erK() {
        if (this.lHH == null) {
            return;
        }
        long l = this.lHH.ZC();
        this.lHG = null;
        this.lHH = null;
        this.lHF.a(l, null);
        cap_1.erJ();
    }

    public void b(@NotNull ftv_0 ftv_02, int n) {
        if (this.lHC == null || this.lHD == null) {
            return;
        }
        ftl_0 ftl_02 = (ftl_0)this.lHD.glO().get(n);
        if (ftl_02 == null) {
            lHz.warn("We received a building confirmation for an unknown sector {} in instance {}, that's weird", (Object)n, (Object)this.brw);
            return;
        }
        ((fty_0)this.lHC.gmg().computeIfAbsent(n, fty_0::aan)).gmn().put(ftv_02.gmj(), (Object)ftv_02);
        cav_1 cav_12 = new cav_1(ftv_02);
        this.lHF.a(cav_12, ftl_02.glS());
        cap_1.erJ();
    }

    public void mL(long l) {
        if (this.lHC == null || this.lHD == null) {
            return;
        }
        this.lHC.uM(l).ifPresent(ftv_02 -> {
            if (this.lHH != null && this.lHH.ZC() == l) {
                this.erK();
            }
            this.lHF.a(new cav_1((ftv_0)ftv_02));
            cap_1.erJ();
        });
    }

    public void c(@NotNull ftv_0 ftv_02, int n) {
        if (this.lHC == null || this.lHD == null) {
            return;
        }
        long l = ftv_02.gmj();
        OptionalInt optionalInt = this.lHC.uL(l);
        if (optionalInt.isEmpty()) {
            lHz.warn("[Ranch] We received a building movement result for building " + l + " but the building is unknown, adding it directly");
            this.b(ftv_02, n);
            return;
        }
        int n2 = optionalInt.getAsInt();
        ftl_0 ftl_02 = (ftl_0)this.lHD.glO().get(n);
        if (ftl_02 == null) {
            lHz.warn("We received a building move for an unknown sector " + n + " in instance " + this.brw + ", that's weird");
            return;
        }
        ftl_0 ftl_03 = (ftl_0)this.lHD.glO().get(n2);
        if (ftl_03 == null) {
            lHz.warn("We received a building move for an unknown sector " + n + " in instance " + this.brw + ", that's weird");
            return;
        }
        if (this.lHH != null && this.lHH.ZC() == l) {
            this.erK();
        }
        if (this.lHI != null && this.lHI == l) {
            cxo_1.eXw().eXz();
        }
        ((fty_0)this.lHC.gmg().get(n2)).gmn().remove(l);
        ((fty_0)this.lHC.gmg().computeIfAbsent(n, fty_0::aan)).gmn().put(l, (Object)ftv_02);
        this.lHF.b(l, ftl_03.glS());
        cav_1 cav_12 = new cav_1(ftv_02);
        this.lHF.a(cav_12, ftl_02.glS());
        cap_1.erJ();
    }

    public void E(long l, int n) {
        if (this.lHC == null || this.lHD == null) {
            return;
        }
        ftl_0 ftl_02 = (ftl_0)this.lHD.glO().get(n);
        if (ftl_02 == null) {
            lHz.warn("We received a building destruction result for an unknown sector " + n + " in instance " + this.brw + ", that's weird");
            return;
        }
        fty_0 fty_02 = (fty_0)this.lHC.gmg().get(n);
        if (fty_02 == null) {
            lHz.warn("We received a building destruction result for a building in an unknown sector " + n);
            return;
        }
        ftv_0 ftv_02 = (ftv_0)fty_02.gmn().remove(l);
        if (ftv_02 == null) {
            lHz.warn("We received a building destruction result for a unknown building " + l + " in sector " + n);
            return;
        }
        if (this.lHH != null && this.lHH.ZC() == l) {
            this.erK();
        }
        if (this.lHI != null && this.lHI == l) {
            cxo_1.eXw().eXz();
        }
        this.lHF.b(ftv_02.gmj(), ftl_02.glS());
        cap_1.erJ();
    }

    public boolean em(int n, int n2) {
        if (this.lHC == null || this.lHD == null || this.lHH == null) {
            return false;
        }
        OptionalInt optionalInt = this.lHD.gD(n, n2);
        if (optionalInt.isEmpty()) {
            return false;
        }
        return ftx_0.a(cam_2.lHu, (fty_0)this.lHC.gmg().get(optionalInt.getAsInt()), ((cal_2)this.lHH.fRg()).gz(n, n2), this.lHH.ZC());
    }

    public Optional<ftv_0> en(int n, int n2) {
        if (this.lHC == null || this.lHD == null) {
            return Optional.empty();
        }
        OptionalInt optionalInt = this.lHD.gD(n, n2);
        if (optionalInt.isEmpty()) {
            return Optional.empty();
        }
        fty_0 fty_02 = (fty_0)this.lHC.gmg().get(optionalInt.getAsInt());
        if (fty_02 == null) {
            return Optional.empty();
        }
        for (ftv_0 ftv_02 : fty_02.gmn().values()) {
            boolean bl = ftr_0.gmc().a(cam_2.lHu, ftv_02).map(cal_22 -> cal_22.gz(ftv_02.bkP(), ftv_02.bkQ()).cL(n, n2)).orElse(false);
            if (!bl) continue;
            return Optional.of(ftv_02);
        }
        return Optional.empty();
    }

    public boolean b(@NotNull ftv_0 ftv_02) {
        return true;
    }

    public void c(@NotNull ftv_0 ftv_02) {
        if (this.lHF == null) {
            return;
        }
        if (this.lHI != null && this.lHI.longValue() == ftv_02.gmj()) {
            return;
        }
        this.erL();
        this.lHI = ftv_02.gmj();
        this.lHF.mG(this.lHI);
    }

    public void erL() {
        if (this.lHI == null) {
            return;
        }
        this.lHF.mH(this.lHI);
        this.lHI = null;
    }

    public void Ko(int n) {
        if (this.lHD == null || this.lHC == null) {
            return;
        }
        ftu_0 ftu_02 = (ftu_0)this.lHC.gmh().computeIfAbsent(n, ftu_0::new);
        ftu_02.a(ftp_0.tfI);
        fti_0 fti_02 = (fti_0)this.lHD.glP().get(n);
        if (fti_02 == null) {
            lHz.error("[Ranch] Unknown bridge with entry Id {} built in current ranch {}", (Object)n, (Object)this.brw);
            return;
        }
        cau_1 cau_12 = this.lHE.a(fti_02);
        this.lHF.a(cau_12);
        cap_1.erJ();
    }
}

