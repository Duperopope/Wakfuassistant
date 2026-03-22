/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

class byd
extends bhJ {
    private final eIz jCh;

    byd(eIz eIz2) {
        this.jCh = eIz2;
        this.dC(aym_2.bSE());
    }

    @Override
    @NotNull
    public bdj_2 ddI() {
        if (this.hKX == null) {
            this.b(new byc_0(this));
        }
        return this.hKX;
    }

    public eIz dNV() {
        return this.jCh;
    }

    public void dNZ() {
        Object r;
        this.c(bfq_2.dge().BO(this.jCh.aWP()).dfW());
        this.aQ(this.jCh.aWO());
        if (this.jCh instanceof fjy_0) {
            this.ffF().h(fjt.syH.WG(((fjy_0)((Object)this.jCh)).Xt()));
        }
        dR dR2 = this.jCh.fwD();
        this.v(dR2.sC(), true);
        this.w(dR2.sE(), true);
        this.x(dR2.sG(), true);
        this.a(dR2, true);
        this.dkp();
        this.c((byte)dR2.sU(), true);
        this.d((byte)dR2.sW(), true);
        this.dkq();
        byc_0 byc_02 = (byc_0)this.ddI();
        if (dR2.tb() && dR2.tc() > 0 && (r = fgD.fXh().Vd(dR2.tc())) != null) {
            byc_02.a((fhc_0)r, (short)ffS.sgB.shb);
        }
        if (dR2.td() && dR2.te() > 0 && (r = fgD.fXh().Vd(dR2.te())) != null) {
            byc_02.a((fhc_0)r, (short)ffS.sgE.shb);
        }
        if (dR2.tf() && dR2.tg() > 0 && (r = fgD.fXh().Vd(dR2.tg())) != null) {
            byc_02.a((fhc_0)r, (short)ffS.sgG.shb);
        }
        this.setName(aum_0.cWf().c("ie.statue", this.jCh.getName()));
    }

    @Override
    public cpm_1[] chR() {
        return cpm_1.nip;
    }

    @Override
    @NotNull
    public /* synthetic */ WQ dlM() {
        return this.ddI();
    }
}

