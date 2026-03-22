/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bNl
 */
public class bnl_0
implements aeh_2 {
    public static final String kBq = "content";
    public static final String kBr = "unlocked";
    public static final String kBs = "enabled";
    public static final String kBt = "index";
    public static final String kBu = "size";
    public static final String kBv = "unlockingText";
    public static final String kBw = "shortUnlockingText";
    public static final String kBx = "itemNeeded";
    public static final String kBy = "iconUrl";
    public static final String kBz = "displayed";
    public static final String kBA = "name";
    public static final String[] kBB = new String[]{"content", "enabled", "unlocked", "index", "size", "itemNeeded"};
    private final bnk_0 kBC = new bnk_0();
    private final faj kBD;

    public bnl_0(faj faj2) {
        this.kBD = faj2;
    }

    @Override
    public String[] bxk() {
        return kBB;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(kBr)) {
            return this.efO();
        }
        if (string.equals(kBt)) {
            return this.kBD.fQQ();
        }
        if (string.equals(kBu)) {
            if (this.kBC == null) {
                return null;
            }
            return this.kBC.bfa();
        }
        if (string.equals(kBs)) {
            return this.kBC.isEnabled();
        }
        if (string.equals(kBv)) {
            switch (this.efN()) {
                case rOT: {
                    return bnj_0.kBk.efG();
                }
                case rOU: {
                    return bnj_0.kBl.efG();
                }
                case rOS: {
                    return bnj_0.kBj.efG();
                }
                case rOV: {
                    return bnj_0.kBm.efG();
                }
            }
        }
        if (string.equals(kBw)) {
            switch (this.efN()) {
                case rOT: {
                    return bnj_0.kBk.efF();
                }
                case rOU: {
                    return bnj_0.kBl.efF();
                }
                case rOS: {
                    return bnj_0.kBj.efF();
                }
                case rOV: {
                    return bnj_0.kBm.efF();
                }
            }
        }
        if (string.equals(kBx)) {
            return null;
        }
        if (string.equals(kBq)) {
            if (this.kBC == null) {
                return null;
            }
            int n = this.efM();
            ArrayList<aeh_2> arrayList = new ArrayList<aeh_2>(n);
            ArrayList<fai> arrayList2 = this.kBC.efJ();
            for (fai fai2 : arrayList2) {
                for (byte by = 0; by < fai2.bfa(); by = (byte)(by + 1)) {
                    ffV ffV2 = fai2.cv(by);
                    aef_2 aef_22 = fai2.isEnabled() ? (ffV2 == null ? bEb.dRP() : ffV2.fVU()) : (ffV2 == null ? new bei_1(bEb.dRP()) : new bei_1(ffV2));
                    arrayList.add((aeh_2)aef_22);
                }
            }
            for (int i = arrayList.size(); i < n; ++i) {
                arrayList.add(new bei_1(bEb.dRP()));
            }
            return arrayList;
        }
        if (string.equals(kBz)) {
            return this.efO() || this.efP();
        }
        if (string.equals(kBy)) {
            switch (this.efN()) {
                case rOT: {
                    return bnj_0.kBk.byf();
                }
                case rOU: {
                    return bnj_0.kBl.byf();
                }
                case rOS: {
                    return bnj_0.kBj.byf();
                }
                case rOV: {
                    return bnj_0.kBm.byf();
                }
            }
            return null;
        }
        if (string.equals(kBA)) {
            switch (this.efN()) {
                case rOT: {
                    return bnj_0.kBk.getName();
                }
                case rOU: {
                    return bnj_0.kBl.getName();
                }
                case rOS: {
                    return bnj_0.kBj.getName();
                }
                case rOV: {
                    return bnj_0.kBm.getName();
                }
            }
        }
        return null;
    }

    private int efM() {
        LU lU = new LU(0);
        this.kBD.L((TObjectProcedure<fak>)((TObjectProcedure)fak2 -> {
            lU.nt(fak2.rOO);
            return true;
        }));
        return lU.aTn();
    }

    private fal efN() {
        return fak.TL(this.kBD.fQO()).efN();
    }

    public boolean efO() {
        if (this.kBC.efJ().isEmpty()) {
            bnn_0 bnn_02 = cvm_1.eTF().eTG();
            LP lP = new LP(false);
            this.kBD.L((TObjectProcedure<fak>)((TObjectProcedure)fak2 -> {
                if (bnn_02.Il(fak2.rON)) {
                    lP.aH(true);
                    return false;
                }
                return true;
            }));
            return lP.aTe();
        }
        return this.kBC.isEnabled();
    }

    public boolean efP() {
        if (this.kBC.efJ().isEmpty()) {
            bnn_0 bnn_02 = cvm_1.eTF().eTG();
            LP lP = new LP(false);
            this.kBD.L((TObjectProcedure<fak>)((TObjectProcedure)fak2 -> {
                if (bnn_02.Ik(fak2.rON)) {
                    lP.aH(true);
                    return false;
                }
                return true;
            }));
            return lP.aTe();
        }
        return true;
    }

    public void a(feq feq2) {
        this.kBC.a((fai)feq2);
        fse_1.gFu().a((aef_2)this, kBq, kBr, kBs);
    }

    public void efQ() {
        this.kBC.efI();
    }

    public byte deO() {
        return (byte)this.kBD.ordinal();
    }

    private boolean efR() {
        boolean bl = bvk.dJZ().a(eyh_2.rKI) || bvk.dJZ().a(this.kBD.fQP());
        return bl;
    }

    public void a(fec fec2, fai fai2) {
        if (!(this.efR() || fec2.fUt() != fed.rZG && fec2.fUt() != fed.rZJ)) {
            fiq_2.gCw().d(fik_2.gBZ().l("group.error.accessDenied", new Object[0]).vG(ccp_2.mRI.byf()).abQ(1));
            return;
        }
        ckv_0 ckv_02 = new ckv_0(fai2.fQN().rON, fec2);
        aue_0.cVJ().etu().d(ckv_02);
    }

    public void efS() {
        ckt_0 ckt_02 = new ckt_0();
        ckt_02.La(this.kBD.fQO());
        aue_0.cVJ().etu().d(ckt_02);
    }

    public void eaj() {
        fse_1.gFu().a((aef_2)this, kBB);
    }

    public void efT() {
        cku_0 cku_02 = new cku_0();
        cku_02.La(this.d());
        aue_0.cVJ().etu().d(cku_02);
        cvm_1.eTF().b(this);
    }

    public String toString() {
        return "GuildAggregatedCompartmentView{m_compartment=" + String.valueOf(this.kBC) + ", m_guildStorageCompartmentLinkType=" + String.valueOf((Object)this.kBD) + "}";
    }

    public boolean bt(ffV ffV2) {
        return this.kBC.lR(ffV2.LV()) != null;
    }

    public ffV cw(byte by) {
        return this.kBC.cv(by);
    }

    public int d() {
        return this.deO();
    }

    public bnu_1 a(ffV ffV2, short s, byte by) {
        if (by != -1) {
            return this.b(ffV2, s, by);
        }
        short s2 = s;
        byte by2 = this.kBC.bfa();
        for (byte by3 = 0; by3 < by2; by3 = (byte)(by3 + 1)) {
            ffV ffV3 = this.kBC.cv(by3);
            if (ffV3 == null || !ffV3.n(ffV2) || ffV3.bfd() == ffV3.bfe()) continue;
            short s3 = GC.cu(ffV3.bfe() - ffV3.bfd());
            short s4 = GC.cu(Math.min(s2, s3));
            bnu_1 bnu_12 = this.b(ffV2, s4, by3);
            if (bnu_12 != bnu_1.kCn) {
                return bnu_12;
            }
            if ((s2 = (short)(s2 - s4)) != 0) continue;
            return bnu_1.kCn;
        }
        return this.b(ffV2, s2, this.kBC.efL());
    }

    private bnu_1 b(ffV ffV2, short s, byte by) {
        byte by2 = this.kBC.cu(by);
        fai fai2 = this.kBC.ct(by);
        if (!fai2.isEnabled()) {
            return bnu_1.kCp;
        }
        fee fee2 = new fee(ffV2.LV(), ffV2.avr(), s, by2);
        if (!this.kBC.bq(ffV2)) {
            return bnu_1.kCp;
        }
        this.a(fee2, fai2);
        return bnu_1.kCn;
    }

    public bnu_1 b(long l, byte by) {
        byte by2 = this.kBC.lS(l);
        fai fai2 = this.kBC.ct(by2);
        fai fai3 = this.kBC.ct(by);
        byte by3 = this.kBC.cu(by2);
        byte by4 = this.kBC.cu(by);
        if (fai2 == fai3) {
            ffV ffV2 = this.kBC.cv(by);
            if (ffV2 != null && ffV2.LV() == l) {
                return bnu_1.kCp;
            }
            fek fek2 = new fek(l, by4);
            this.a(fek2, fai2);
        } else {
            cks_0 cks_02 = new cks_0();
            cks_02.KY(fai2.fQN().rON);
            cks_02.KZ(fai3.fQN().rON);
            cks_02.dq(by3);
            cks_02.dp(by4);
            aue_0.cVJ().etu().d(cks_02);
        }
        return bnu_1.kCn;
    }

    public bnu_1 a(long l, int n, short s, long l2, byte by) {
        byte by2 = this.kBC.lS(l);
        fai fai2 = this.kBC.ct(by2);
        fem fem2 = new fem(l, n, s, l2, by);
        this.a(fem2, fai2);
        return bnu_1.kCn;
    }
}

