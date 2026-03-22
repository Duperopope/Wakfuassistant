/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from cPR
 */
public class cpr_1
extends cqf_1 {
    public static final int niq = 0;
    public static final int nir = 1;
    public static final int nis = 3;
    public static final int nit = 4;
    protected final TIntHashSet niu = new TIntHashSet();
    String niv;
    private boolean niw;
    String nix;
    private boolean mkM;

    public cpr_1 eLH() {
        return new cpr_1();
    }

    @Override
    public boolean isEnabled() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (!evg_1.osQ.a(new eve_2[]{bgt_02})) {
            this.niu.add(1);
            return false;
        }
        if (!this.niw) {
            return false;
        }
        if (this.mkM) {
            return false;
        }
        return super.isEnabled();
    }

    @Override
    public String getLabel() {
        String string = this.eMp();
        ahv_2 ahv_22 = new ahv_2().c(string);
        if (this.niv != null && !this.niv.isEmpty()) {
            ahv_22.ceH().c(this.niv);
        }
        if (this.nix != null && !this.nix.isEmpty()) {
            ahv_22.ceH().c(this.nix);
        }
        return ahv_22.ceL();
    }

    public void pY(String string) {
        this.niv = string;
    }

    public void jU(boolean bl) {
        this.niw = bl;
    }

    public void bl(boolean bl) {
        this.mkM = bl;
    }

    public void pZ(String string) {
        this.nix = string;
    }

    @Override
    public /* synthetic */ cpm_1 eLD() {
        return this.eLH();
    }
}

