/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cYV
 */
class cyv_1
implements fsh_2 {
    final /* synthetic */ cyr_2 nZN;

    cyv_1(cyr_2 cyr_22) {
        this.nZN = cyr_22;
    }

    @Override
    public void onTweenEvent(fsr_2 fsr_22, fsg_2 fsg_22) {
        if (fsg_22 == fsg_2.veA) {
            this.nZN.nZx = (int)this.nZN.nZw.getOffset();
            int n = this.nZN.kSK.eiX();
            if (n == 0) {
                return;
            }
            int n2 = (this.nZN.nZx % n + n) % n;
            this.nZN.kSK.IP(n2);
        }
    }
}

