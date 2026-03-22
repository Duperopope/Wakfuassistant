/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.io.IOException;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class cAZ
implements aig_2 {
    private final ArrayList<cAN> mto = new ArrayList();
    private final ArrayList<ahp_1> mtp = new ArrayList();
    final /* synthetic */ cAY mtq;

    cAZ(cAY cAY2) {
        this.mtq = cAY2;
        this.mto.add(cAN.mpp);
        this.mto.add(cAN.mpq);
        this.mto.add(cAN.mpu);
        this.mto.add(cAN.mpt);
        this.mto.add(cAN.mpr);
        this.mto.add(cAN.mpv);
        this.mto.add(cAN.mpw);
        this.mto.add(cAN.mps);
    }

    private cAN nU(long l) {
        int n = this.mto.size();
        for (int i = 0; i < n; ++i) {
            cAN cAN2 = this.mto.get(i);
            if (!cAN2.nM(l)) continue;
            return cAN2;
        }
        return null;
    }

    public float a(long l, @NotNull cAN cAN2, long l2, float f2) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (cAN2.eGV()) {
            bsj_0 bsj_02;
            bsj_0 bsj_03 = bsj_02 = bgt_02 != null ? bgt_02.dmV() : null;
            if (l != 530L) {
                if (bsj_02 == null) {
                    f2 *= l2 <= 0L ? 1.0f : 0.25f;
                } else {
                    if ((long)bsj_02.d() != l2) {
                        return -1.0f;
                    }
                    if (l == 111L) {
                        f2 *= this.mtq.msR.bBj();
                    }
                }
            }
        }
        return GC.b(f2, 0.0f, 1.0f);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    @Nullable
    public ahm_1 a(long l, float f2, float f3, int n, long l2, long l3, int n2, int n3, agn_1 agn_12, int n4, boolean bl) {
        agk_1 agk_12;
        if (!this.mtq.cdn()) {
            return null;
        }
        long l4 = ahk_2.hT(l);
        cAN cAN2 = this.nU(l4);
        if (cAN2 == null) {
            return null;
        }
        agk_1 agk_13 = agk_12 = agn_12 != null ? cAN2.eGU() : cAN2.eGT();
        if (!agk_12.cbO()) {
            return null;
        }
        if ((f2 = this.a(l4, cAN2, n2, f2)) == -1.0f) {
            return null;
        }
        ahp_1 ahp_12 = new ahp_1(ahn_1.ccT().ccU(), l, f2, f3, n, l2, l3, n2, n3, agn_12, n4, bl);
        ArrayList<ahp_1> arrayList = this.mtp;
        synchronized (arrayList) {
            if (!agk_12.a(ahp_12, this.mtp)) {
                return null;
            }
            this.mtp.add(ahp_12);
        }
        return ahp_12;
    }

    @Override
    public void ga(long l) {
        cAY.eHc().nR(l);
    }

    @Override
    public void a(long l, float f2) {
        cAY.eHc().i(l, f2);
    }

    @Override
    public void gb(long l) {
        if (this.mtq.msW) {
            cAY.eHc().nO(l);
        }
    }

    @Override
    public void b(long l, float f2) {
        if (this.mtq.msW) {
            cAY.eHc().b(l, f2);
        }
    }

    @Override
    public void bBk() {
        cAY.eHc().bBk();
    }

    private void b(ahp_1 ahp_12) {
        long l;
        ahz_1 ahz_12;
        long l2 = ahp_12.aYj();
        long l3 = ahk_2.hT(l2);
        cAN cAN2 = this.nU(l3);
        if (cAN2 == null) {
            return;
        }
        ago_1 ago_12 = cAN2.eGT();
        if (!ago_12.a(ahp_12)) {
            return;
        }
        try {
            ahz_12 = ago_12.cbI().hE(l2);
        }
        catch (IOException iOException) {
            cAY.aGh().debug((Object)("Impossible de charger le son d'id " + l2));
            return;
        }
        if (ahz_12 == null) {
            cAY.aGi().debug((Object)("Impossible de pr\u00e9parer le son d'id " + l2));
            return;
        }
        ahk_1 ahk_12 = ago_12.a(ahz_12, ahp_12.aYj(), ahp_12.ccq());
        if (ahk_12 == null) {
            return;
        }
        ahk_12.cI(ahp_12.bBt());
        ahk_12.dZ(ahp_12.ccI());
        int n = ahp_12.bBI();
        if (n == 0) {
            ahk_12.cy(true);
        } else if (n > 1) {
            ahk_12.yh(n);
        }
        long l4 = ahp_12.ccY();
        if (l4 != -1L) {
            ahk_12.hJ(l4);
        }
        if ((l = ahp_12.ccZ()) != -1L) {
            ahk_12.hK(l);
        }
        ago_12.a(ahk_12);
    }

    private void c(ahp_1 ahp_12) {
        ahz_1 ahz_12;
        long l = ahp_12.aYj();
        long l2 = ahk_2.hT(l);
        cAN cAN2 = this.nU(l2);
        if (cAN2 == null) {
            return;
        }
        agu_1 agu_12 = cAN2.eGU();
        if (!agu_12.cbO()) {
            return;
        }
        try {
            ahz_12 = agu_12.cbI().hE(l);
        }
        catch (IOException iOException) {
            cAY.aGj().debug((Object)("Impossible de charger le son d'id " + l));
            return;
        }
        if (ahz_12 == null) {
            cAY.aGR().debug((Object)("Impossible de pr\u00e9parer le son d'id " + l));
            return;
        }
        int n = ahp_12.cdb();
        agz_1 agz_12 = this.mtq.yl(n);
        if (agz_12 == null) {
            cAY.aGS().debug((Object)"Les rollOffs n'ont pas \u00e9t\u00e9 initialis\u00e9s");
            return;
        }
        float f2 = ahp_12.bBt();
        float f3 = ahp_12.ccI();
        agn_1 agn_12 = ahp_12.cda();
        try {
            agu_12.a(ahz_12, f2, f3, agn_12, agz_12.bwI(), agz_12.bwF(), agz_12.bwH(), 0, 0, ahp_12.bBI() == 0, false, ahp_12.cdc(), 0.0f, ahp_12.aYj(), ahp_12.ccq());
        }
        catch (Exception exception) {
            cAY.dof().debug((Object)"Exception lev\u00e9e lors de la cr\u00e9ation d'une source positionn\u00e9e", (Throwable)exception);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void bBm() {
        ArrayList<ahp_1> arrayList = this.mtp;
        synchronized (arrayList) {
            int n = this.mtp.size();
            for (int i = 0; i < n; ++i) {
                ahp_1 ahp_12 = this.mtp.get(i);
                if (ahp_12.cda() == null) {
                    this.b(ahp_12);
                    continue;
                }
                this.c(ahp_12);
            }
            this.mtp.clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(long l, @Nullable ahk_1 ahk_12) {
        if (ahk_12 != null) {
            if (ahk_12.bbj()) {
                ahk_12.ccF();
            } else {
                ahk_12.br(0.0f, 300.0f);
                ahk_12.dZ(true);
            }
        } else {
            ArrayList<ahp_1> arrayList = this.mtp;
            synchronized (arrayList) {
                for (int i = this.mtp.size() - 1; i >= 0; --i) {
                    ahp_1 ahp_12 = this.mtp.get(i);
                    if (ahp_12.ccq() != l) continue;
                    this.mtp.remove(i);
                    break;
                }
            }
        }
    }

    @Override
    public void bBl() {
        if (!this.mtq.cdn()) {
            return;
        }
        int n = this.mto.size();
        for (int i = 0; i < n; ++i) {
            ago_1 ago_12 = this.mto.get(i).eGT();
            if (ago_12 == null) continue;
            ago_12.bBl();
        }
    }

    @Override
    public void aX(float f2, float f3) {
        if (!this.mtq.cdn()) {
            return;
        }
        int n = this.mto.size();
        for (int i = 0; i < n; ++i) {
            ago_1 ago_12 = this.mto.get(i).eGT();
            if (ago_12 == null) continue;
            ago_12.dS(f2);
            if (f3 == -1.0f) continue;
            ago_12.dT(f3);
        }
    }
}

