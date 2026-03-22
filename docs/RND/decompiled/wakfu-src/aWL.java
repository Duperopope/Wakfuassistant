/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

public class aWL
extends aUT {
    private final short hvD;

    public aWL(int n, int n2, int n3, int n4, boolean bl, boolean bl2, long l, int n5, int n6, short s, int n7, short s2, bmx_0 bmx_02) {
        super(n, n2, n3, n4, bl, bl2, l, n5, n6, s);
        this.hvD = s2;
        if (bmx_02 != null && bmx_02.giP() != null) {
            this.xV(((bmt_0)bmx_02.giP()).cbt());
            return;
        }
        Object r = fgD.fXh().Vd(n7);
        if (r == null) {
            return;
        }
        Integer n8 = exe.oUi.get(((fhc_0)r).dGh().aIi());
        if (n8 == null) {
            return;
        }
        this.xV(n8);
    }

    @Override
    public short cmL() {
        return this.hvD;
    }

    @Override
    public long cbk() {
        bgy bgy2 = this.iD(this.caQ());
        if (bgy2 == null || !this.cWB()) {
            return super.cbk();
        }
        if (bgy2.dkZ() != null) {
            bgy2.dkZ().a((short)1, (exP)bgy2);
        }
        if (this.cWw()) {
            this.R(bgy2);
            this.cXl();
        }
        this.U(bgy2);
        return super.cbk();
    }

    private void U(bgy bgy2) {
        ahv_2 ahv_22 = new ahv_2().c(aum_0.cWf().c("fight.closeCombat", new ahv_2().e(aPc.ewv).c(bgy2.aZk()).ceL()));
        if (this.cWw()) {
            ahv_22.ceu().e(aPc.eww).c(" (").c(aum_0.cWf().c("critical", new Object[0])).c(")").cev();
        }
        if (this.cWx()) {
            ahv_22.ceu().e(aPc.eww).c(" (").c(aum_0.cWf().c("critical.miss", new Object[0])).c(")").cev();
        }
        hrZ.ap(ahv_22.ceL());
    }

    private void R(bgy bgy2) {
        this.d(bgy2, 800017);
    }

    private void d(bgy bgy2, int n) {
        FreeParticleSystem freeParticleSystem;
        if ((aue_0.cVJ().cVK().dkZ() == null || aue_0.cVJ().cVK().bqo() == this.cja().d()) && (freeParticleSystem = agY.bzw().sk(n)) != null) {
            if (this.cja() != null) {
                freeParticleSystem.pu(this.cja().d());
            }
            freeParticleSystem.a(bgy2.ddI());
            agZ.bzy().b(freeParticleSystem);
        }
    }

    private void cXl() {
        if (aue_0.cVJ().cVK().bqo() == this.cja().d()) {
            cAY.eHc().nP(600122L);
        }
    }
}

