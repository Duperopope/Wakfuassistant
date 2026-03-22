/*
 * Decompiled with CFR 0.152.
 */
final class bhc
extends eyj_0 {
    private final pr_1 ifK;
    final /* synthetic */ bgt_0 ifL;

    bhc(bgt_0 bgt_02, pr_1 pr_12) {
        this.ifL = bgt_02;
        this.ifK = pr_12;
        this.ifK.DM().a(this);
    }

    @Override
    public void zl() {
        bgt_0.aGh().error((Object)(this.getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    @Override
    public void zm() {
        if (this.ifL.ieZ != null) {
            this.ifL.ieZ.aZp();
        }
        this.ifL.ieZ = new bnv_2();
        this.ifL.ieZ.dyV().fr(aue_0.cVJ().cVO().xl());
        if (!this.ifL.ieZ.b(this.ifK.SI)) {
            bgt_0.aGi().error((Object)"Erreur durant la r\u00e9cup\u00e9ration des donn\u00e9es du sac dimensionel du joueur.");
        }
        if (!this.ifL.dmc()) {
            this.ifL.cWp().a(this.ifL);
        }
    }

    public String toString() {
        return "LocalPlayerCharacterPartDimensionalBagForClient{m_part=" + String.valueOf(this.ifK) + "}";
    }
}

