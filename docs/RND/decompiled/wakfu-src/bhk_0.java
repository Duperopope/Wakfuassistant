/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bhK
 */
class bhk_0
implements ZJ {
    final /* synthetic */ bhJ ijk;

    bhk_0(bhJ bhJ2) {
        this.ijk = bhJ2;
    }

    @Override
    public void animationEnded(ZC zC) {
        if (this.ijk.hKX == null) {
            return;
        }
        if (!this.ijk.iji) {
            this.ijk.hKX.b(this);
            return;
        }
        String string = zC.bkI();
        if (!(string.startsWith("AnimStatique") || string.startsWith("AnimCourse") || string.startsWith("AnimMarche") || string.endsWith("-Fin"))) {
            return;
        }
        this.ijk.hKX.b(this);
        if (!(this.ijk.hKX.dcP() instanceof bhJ)) {
            return;
        }
        if (!this.ijk.ijh && cdO.eug().au((bhJ)this.ijk.hKX.dcP())) {
            this.ijk.ijh = true;
            this.ijk.dpN();
        }
    }
}

