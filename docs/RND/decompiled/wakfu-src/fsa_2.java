/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fSA
 */
public class fsa_2
extends fsr_2<axb_2> {
    private final axb_2 ver;
    private final boolean ves;

    public fsa_2(axb_2 axb_22, axb_2 axb_23, fzc fzc2, int n, int n2, int n3, abn abn2) {
        this(axb_22, axb_23, fzc2, n, n2, n3, true, abn2);
    }

    public fsa_2(axb_2 axb_22, axb_2 axb_23, fzc fzc2, int n, int n2, int n3, boolean bl, abn abn2) {
        this.bl(axb_22);
        this.bm(axb_23);
        this.a((fsf_2)((Object)fzc2));
        this.sO(n);
        this.setDuration(n2);
        this.acd(n3);
        this.setEasing(abn2);
        this.ver = fzc2.getModulationColor();
        this.ves = bl;
    }

    @Override
    public boolean Ma(int n) {
        if (!super.Ma(n)) {
            return false;
        }
        if (this.tXJ == null) {
            return true;
        }
        float f2 = this.tXJ.h(((axb_2)this.veb).aIU(), ((axb_2)this.vec).aIU(), this.bUi, this.bMn);
        float f3 = this.tXJ.h(((axb_2)this.veb).aIV(), ((axb_2)this.vec).aIV(), this.bUi, this.bMn);
        float f4 = this.tXJ.h(((axb_2)this.veb).aIW(), ((axb_2)this.vec).aIW(), this.bUi, this.bMn);
        float f5 = this.tXJ.h(((axb_2)this.veb).aIX(), ((axb_2)this.vec).aIX(), this.bUi, this.bMn);
        awx_2 awx_22 = new awx_2(f2, f3, f4, f5);
        ((fzc)((Object)this.ved)).setModulationColor(awx_22);
        return true;
    }

    @Override
    public void cbz() {
        if (this.ves) {
            ((fzc)((Object)this.ved)).setModulationColor(this.ver);
        } else {
            ((fzc)((Object)this.ved)).setModulationColor((axb_2)this.vec);
        }
        super.cbz();
    }

    public String toString() {
        return "[ModulationColorTween] " + String.valueOf(this.veb) + " -> " + String.valueOf(this.vec);
    }
}

