/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRq
 */
public abstract class crq_1
extends cpr_1 {
    protected short nmg;
    protected fdg_0 nmh;

    @Override
    public boolean isUsable() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (!this.ad(bgt_02)) {
            this.niu.add(1);
        }
        return this.niu.isEmpty() && super.isUsable();
    }

    protected boolean ad(bgt_0 bgt_02) {
        if (this.nmg <= 0) {
            nii.error((Object)"Teleporter sans instance li\u00e9e");
            return false;
        }
        crr_1 crr_12 = new crr_1(this, bgt_02);
        return evg_1.osQ.a(new eve_2[]{crr_12});
    }

    public void cM(short s) {
        this.nmg = s;
    }

    public fdg_0 eMC() {
        return this.nmh;
    }

    public void k(fdg_0 fdg_02) {
        this.nmh = fdg_02;
    }

    @Override
    public String getLabel() {
        String string = this.eMp();
        ahv_2 ahv_22 = new ahv_2();
        if (this.nix != null && !this.nix.isEmpty()) {
            ahv_22.c(this.nix);
        }
        if (ahv_22.bXe() > 0) {
            ahv_22.ceH();
        }
        ahv_22.c(string);
        if (this.nmh.fTQ()) {
            ahv_22.k(' ').ceu().c(aum_0.cWf().c("downscale.mru.dungeonAuto", new Object[0])).cev();
        }
        if (this.niv != null && !this.niv.isEmpty()) {
            ahv_22.ceH().c(this.niv);
        }
        if (this.niu.contains(3)) {
            ahv_22.ceH().ih(nim).c(aum_0.cWf().c("error.otherInstanceOpenByGroup", new Object[0]));
        }
        if (this.niu.contains(1)) {
            ahv_22.ceH().ih(nim).c(aum_0.cWf().c("booster.pack.required", new Object[0]));
        }
        return ahv_22.ceL();
    }
}

