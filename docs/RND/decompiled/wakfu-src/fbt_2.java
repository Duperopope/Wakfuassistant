/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fBT
 */
public class fbt_2
extends fss_2<Boolean> {
    private final int tWD;
    private final int tWE;
    private final int tWF;
    private final int tWG;
    final /* synthetic */ fbn_2 tWH;

    public fbt_2(fbn_2 fbn_22, int n, int n2, int n3) {
        this.tWH = fbn_22;
        super(true, false, fbn_22, 0, n3, abn.cdr);
        this.tWD = fbn_22.dhZ;
        this.tWF = fbn_22.dia;
        this.tWE = n;
        this.tWG = n2;
    }

    @Override
    public boolean Ma(int n) {
        super.Ma(n);
        if (this.tXJ != null) {
            int n2 = (int)this.tXJ.h(this.tWD, this.tWE, this.bUi, this.bMn);
            int n3 = (int)this.tXJ.h(this.tWF, this.tWG, this.bUi, this.bMn);
            this.tWH.setDeltaX(n2);
            this.tWH.setDeltaY(n3);
        }
        return true;
    }

    @Override
    public void cbz() {
        super.cbz();
    }
}

