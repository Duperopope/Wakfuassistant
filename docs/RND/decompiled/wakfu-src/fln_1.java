/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fLn
 */
public class fln_1
extends flk_1 {
    private final ArrayList<axb_2> uIl = new ArrayList();
    private final float[] uIm = new float[4];
    private int bUi;
    private int bMn;
    private final abn uIn = abn.cdr;

    public void F(axb_2 axb_22) {
        this.uIl.add(axb_22);
    }

    public void setDuration(int n) {
        this.bMn = n;
    }

    public int getDuration() {
        return this.bMn;
    }

    public void qy(int n) {
        if (this.uIl.size() < 2) {
            return;
        }
        this.bUi += n;
        if (this.bUi >= this.bMn) {
            this.bUi = 0;
            this.uIl.add(this.uIl.remove(0));
        }
        axb_2 axb_22 = this.uIl.get(0);
        axb_2 axb_23 = this.uIl.get(1);
        this.uIm[0] = this.uIn.h(axb_22.aIU(), axb_23.aIU(), this.bUi, this.bMn);
        this.uIm[1] = this.uIn.h(axb_22.aIV(), axb_23.aIV(), this.bUi, this.bMn);
        this.uIm[2] = this.uIn.h(axb_22.aIW(), axb_23.aIW(), this.bUi, this.bMn);
        this.uIm[3] = this.uIn.h(axb_22.aIX(), axb_23.aIX(), this.bUi, this.bMn);
        this.q(this.uIm);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.uIl.clear();
    }
}

