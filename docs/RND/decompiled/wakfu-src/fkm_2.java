/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fKm
 */
class fkm_2 {
    private final ArrayList<fey_2> uGc = new ArrayList();
    int bap;
    int baq;
    private int brs;
    private int brt;
    private float uGd;
    private float uGe;

    fkm_2() {
    }

    public void bP(fey_2 fey_22) {
        this.uGc.add(fey_22);
    }

    public void bQ(fey_2 fey_22) {
        this.uGc.remove(fey_22);
    }

    public boolean aJG() {
        return this.uGc.isEmpty();
    }

    public fey_2 gDa() {
        if (this.uGc.isEmpty()) {
            return null;
        }
        return this.uGc.get(0);
    }

    public ArrayList<fey_2> gDb() {
        return this.uGc;
    }

    public void setPosition(int n, int n2) {
        this.bap = n;
        this.baq = n2;
    }

    public void gvp() {
        if (this.uGc.size() == 0) {
            return;
        }
        boolean bl = false;
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        faw_2 faw_22 = null;
        for (int i = this.uGc.size() - 1; i >= 0; --i) {
            fey_2 fey_22 = this.uGc.get(i);
            if (faw_22 == null) {
                faw_22 = fey_22.getContainer();
            }
            if (!bl) {
                bl = true;
                n = fey_22.getX();
                n2 = fey_22.getX() + fey_22.getWidth();
                n3 = fey_22.getY();
                n4 = fey_22.getY() + fey_22.getHeight();
                continue;
            }
            n = Math.min(n, fey_22.getX());
            n2 = Math.max(n2, fey_22.getX() + fey_22.getWidth());
            n3 = Math.min(n3, fey_22.getY());
            n4 = Math.max(n4, fey_22.getY() + fey_22.getHeight());
        }
        if (faw_22 == null) {
            return;
        }
        this.bap = n;
        this.baq = n3;
        this.brs = n2 - n;
        this.brt = n4 - n3;
        this.uGd = (float)this.bap / (float)(faw_22.getWidth() - this.brs);
        this.uGe = (float)this.baq / (float)(faw_22.getHeight() - this.brt);
    }

    public int getX() {
        return this.bap;
    }

    public int getY() {
        return this.baq;
    }

    public int getWidth() {
        return this.brs;
    }

    public int getHeight() {
        return this.brt;
    }

    public float gDc() {
        return this.uGd;
    }

    public float gDd() {
        return this.uGe;
    }
}

