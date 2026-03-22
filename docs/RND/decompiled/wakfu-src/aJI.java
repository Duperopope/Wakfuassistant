/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Shorts
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.google.common.primitives.Shorts;
import java.awt.Point;

public class aJI
extends ZH
implements crd_1 {
    private static final String ebH = "AnimStatique";
    private static final String ebI = "AnimApparition";
    private static final String ebJ = "AnimEpee-Join";
    private static final String ebK = "AnimEpee-Victoire";
    private static final String ebL = "AnimEpee-Defaite";
    private static final String ebM = "Mob";
    private static final float ebN = 0.7f;
    private final bsi_0 ebO;
    private final byte ebP;
    private final String ebQ;
    private boolean ebR;
    private int ebS = -1;
    private boolean ebT;
    private int ebU = -1;
    private int ebV = -1;

    aJI(long l, int n, int n2, short s, bsi_0 bsi_02, byte by) {
        super(l, n, n2, s);
        this.ebO = bsi_02;
        this.ebP = by;
        this.ebQ = this.chL();
        this.ebT = bsi_02.bG(by);
        this.ebR = bsi_02.bH(by);
    }

    private String chL() {
        bgy bgy2 = this.chQ();
        if (bgy2 == null) {
            return String.valueOf(0);
        }
        if (bgy2 instanceof bhx_0) {
            return ebM;
        }
        fse_0 fse_02 = ((fsf)fsf.gkM()).mC(bgy2.aqZ());
        if (fse_02 != null && fse_02.eqw() || this.ebO.dGo() == eUw.rva) {
            return String.valueOf(bgy2.ffF().Xt());
        }
        return String.valueOf(0);
    }

    void aPg() {
        this.dP("EpeeCombat");
        this.a(this.ebP == 0 ? abi_1.dzn : abi_1.dzj);
        this.aq((short)6);
        this.k(auc_0.cVq().bS("ANMGUIPath") + "EpeeCombat.anm", true);
        this.dV(String.format("%s-%s", ebH, this.ebQ));
        this.dT(String.format("%s-%s", ebI, this.ebQ));
        if (this.chY()) {
            this.chV();
        }
        if (this.ebT) {
            this.chW();
        }
        if (this.ebR) {
            this.chX();
        }
    }

    void chM() {
        this.dT(String.format("%s-%s", ebJ, this.ebQ));
    }

    void chN() {
        bgy bgy2 = this.chQ();
        String string = bgy2 != null && this.ebO.kn(bgy2.Sn()) ? String.format("%s-%s", ebK, this.ebQ) : String.format("%s-%s", ebL, this.ebQ);
        this.a(new aJJ(this));
        this.dT(string);
        this.chO();
    }

    public void chO() {
        if (this.chY()) {
            agZ.bzy().so(this.ebV);
        }
        this.chP();
    }

    public void chP() {
        if (this.ebT) {
            agZ.bzy().so(this.ebU);
        }
        if (this.ebR) {
            agZ.bzy().so(this.ebS);
        }
    }

    public final bgy chQ() {
        boolean bl;
        if (this.ebO.dGC() == null || this.ebO.dGo() == eUw.ruP) {
            boolean bl2 = this.ebO.dGo() == eUw.rva == (this.ebO.dGr() != this.ebP);
            return bl2 ? this.ebO.dGB() : this.ebO.dGC();
        }
        boolean bl3 = bl = this.ebO.dGC().bcP() == this.ebP;
        if (this.ebO.dGo().fLg().fLf()) {
            return bl ? this.ebO.dGB() : this.ebO.dGC();
        }
        return bl ? this.ebO.dGC() : this.ebO.dGB();
    }

    @Override
    public cpm_1[] chR() {
        bgy bgy2 = this.chQ();
        if (bgy2 == null) {
            return cpm_1.nip;
        }
        return bgy2.chR();
    }

    @Override
    public boolean chS() {
        return true;
    }

    @Override
    public Point chT() {
        aam_0 aam_02 = aie_0.cfn().bmC();
        acb_1 acb_12 = agi.c(aam_02, this.getWorldX(), this.getWorldY(), this.getAltitude() + (float)this.bpX());
        return new Point(Math.round(acb_12.aPY), Math.round(acb_12.aPZ));
    }

    @Override
    public short chU() {
        int n = Math.round((float)this.bpX() * 10.0f);
        return Shorts.saturatedCast((long)n);
    }

    @Override
    public boolean isVisible() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return bgt_02 != null && bgt_02.dmV() == null;
    }

    private void chV() {
        this.ebV = this.yK(800742);
    }

    private void chW() {
        int n = this.ebP == 0 ? 800755 : 800747;
        this.ebU = this.m(n, true);
    }

    private void chX() {
        this.ebS = this.m(800748, true);
    }

    public int yK(int n) {
        return this.m(n, false);
    }

    private int m(int n, boolean bl) {
        FreeParticleSystem freeParticleSystem = agY.bzw().sk(n);
        int n2 = freeParticleSystem.bLJ();
        float f2 = 0.0f;
        if (bl) {
            f2 = this.ebP == 0 ? -0.7f : 0.7f;
        }
        freeParticleSystem.r(this.bVz + f2, this.bVA - f2, this.bVB);
        agZ.bzy().b(freeParticleSystem);
        return n2;
    }

    private boolean chY() {
        if (this.ebO == null) {
            return false;
        }
        if (this.ebP > 0) {
            return false;
        }
        return this.ebO.dGo() == eUw.ruP;
    }

    public bsi_0 chZ() {
        return this.ebO;
    }

    public void eq(boolean bl) {
        if (bl == this.ebT) {
            return;
        }
        this.ebT = bl;
        if (this.ebT) {
            this.chW();
        } else {
            agZ.bzy().so(this.ebU);
            this.ebU = -1;
        }
    }

    public void er(boolean bl) {
        if (bl == this.ebR) {
            return;
        }
        this.ebR = bl;
        if (this.ebR) {
            this.chX();
        } else {
            agZ.bzy().so(this.ebS);
            this.ebS = -1;
        }
    }
}

