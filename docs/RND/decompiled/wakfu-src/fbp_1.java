/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fBP
 */
class fbp_1
implements fis_1 {
    final /* synthetic */ fbn_2 tWz;

    fbp_1(fbn_2 fbn_22) {
        this.tWz = fbn_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        this.tWz.tVX = null;
        if (this.tWz.tVW && this.tWz.tWc != Integer.MIN_VALUE && this.tWz.tWd != Integer.MIN_VALUE) {
            int n = this.tWz.dhZ + this.tWz.tWc * 20;
            int n2 = this.tWz.dia + this.tWz.tWd * 20;
            this.tWz.a(new fbt_2(this.tWz, n, n2, 1000));
            this.tWz.tWc = Integer.MIN_VALUE;
            this.tWz.tWd = Integer.MIN_VALUE;
        }
        return false;
    }
}

