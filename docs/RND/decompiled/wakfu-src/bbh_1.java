/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bBH
 */
public class bbh_1
extends bcs_0 {
    private bbi_1 jGu;

    @Override
    public void aVI() {
        super.aVI();
        this.jGu = new bbi_1(this);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.jGu = null;
    }

    @Override
    public void a(@NotNull ni_1 ni_12) {
        super.a(ni_12);
        ((bzz)ni_12).a(this);
    }

    private void dNX() {
        if (this.crg == null) {
            super.aPc();
            return;
        }
        bzz bzz2 = (bzz)this.crg;
        int n = this.bxZ();
        super.nU(n);
        this.dT(bzz2.getAnimName());
        this.dV(bzz2.getAnimName());
        int n2 = bzz2.dOM();
        Object r = fgD.fXh().Vd(n2);
        if (r == null) {
            super.aPc();
            return;
        }
        if (this.a(bzz2, (fhc_0)r)) {
            super.aPc();
            return;
        }
        if (this.d((fhc_0)r)) {
            super.aPc();
        }
    }

    private boolean d(fhc_0 fhc_02) {
        azl_2<enk_0> azl_22 = fhc_02.bcx();
        for (enk_0 enk_02 : azl_22) {
            if (enk_02.avZ() != enf_0.qUR.d()) continue;
            int n = enk_02.a(0, (short)0, ene_0.qPu);
            fqU fqU2 = fqX.gjM().Zr(n);
            if (fqU2 == null) continue;
            this.a(fqU2);
        }
        return false;
    }

    private void a(fqU fqU2) {
        ArrayList<enk_0> arrayList = fqU2.fB((short)0);
        for (enk_0 enk_02 : arrayList) {
            byte by = ((bzz)this.aVD()).aWO();
            ang_2 ang_22 = enk_02.fAx();
            if (ang_22 == null) {
                this.l(enk_02);
                continue;
            }
            if (!(ang_22 instanceof egu_0) || ((egu_0)ang_22).aWO() != by) continue;
            this.l(enk_02);
        }
    }

    private void l(enk_0 enk_02) {
        List<Pf> list = enk_02.fAC();
        for (Pf pf : list) {
            this.c(enk_02, pf);
        }
    }

    private boolean c(enk_0 enk_02, Pf pf) {
        if (pf.aXu() == ph_0.bcW) {
            Pu pu = (Pu)pf;
            bdz_1 bdz_12 = new bdz_1(enk_02, pu.aXP(), pu.aXY(), pu.aXX());
            bdz_12.a(this, false);
            return true;
        }
        if (pf.aXu() == ph_0.bdi) {
            Pv pv = (Pv)pf;
            bee_1 bee_12 = new bee_1(enk_02, pv.aXZ(), pv.aXY(), pv.aJe());
            bee_12.a((ZH)this, false);
            return true;
        }
        return false;
    }

    private boolean a(bzz bzz2, fhc_0 fhc_02) {
        fgl_0 fgl_02 = fhc_02.fUZ();
        if (fgl_02 == null) {
            super.aPc();
            return false;
        }
        if (fgl_02.dTl() != fgM.skF) {
            super.aPc();
            return false;
        }
        short s = ((bfs_1)fgl_02).cpe();
        bEq bEq2 = bEr.dSi().bW(s);
        if (bEq2 == null) {
            bWl.error((Object)("Panoplie inconnue " + s));
            super.aPc();
            return false;
        }
        for (bgv_2 bgv_22 : bEq2) {
            fhy_0 fhy_02 = bgv_22.dGh();
            byte by = fhy_02.fZq()[0].aJr();
            this.jGu.a(bgv_22, (short)by, bzz2.aWO());
        }
        return true;
    }

    @Override
    protected void a(byte by, boolean bl, RJ rJ, abi_1 abi_12) {
        this.a(abi_12);
    }

    @Override
    public void aPc() {
        this.dNX();
    }

    @Override
    public void nU(int n) {
        if (this.crg == null) {
            super.nU(n);
            return;
        }
        this.dNX();
    }

    static /* synthetic */ void a(bbh_1 bbh_12, ayv_2 ayv_22) {
        bbh_12.a(ayv_22);
    }

    static /* synthetic */ Logger aGi() {
        return bWl;
    }

    static /* synthetic */ Logger aGj() {
        return bWl;
    }
}

