/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fGP
 */
public class fgp_1
implements fgr_1 {
    private fgr_1 uvu = null;
    private ArrayList<fgr_1> aXA;
    protected boolean bqK = false;
    private boolean bWn = false;
    private int cKh = 0;
    private Object aGT;

    public fgp_1(Object object) {
        this.aGT = object;
    }

    public void a(fgp_1 fgp_12) {
        if (this.aXA == null) {
            this.aXA = new ArrayList();
        }
        if (!this.aXA.contains(fgp_12)) {
            this.aXA.add(fgp_12);
            fgp_12.uvu = this;
            fgp_12.ti(this.cKh + 1);
        }
    }

    @Override
    public boolean gzJ() {
        return this.aXA != null && !this.aXA.isEmpty();
    }

    @Override
    public ArrayList<fgr_1> getChildren() {
        return this.aXA;
    }

    @Override
    public fgr_1 gzK() {
        return this.uvu;
    }

    @Override
    public void setValue(Object object) {
        this.aGT = object;
    }

    @Override
    public Object getValue() {
        return this.aGT;
    }

    @Override
    public void hW(boolean bl) {
        this.bqK = bl;
    }

    @Override
    public boolean edc() {
        return this.bqK;
    }

    @Override
    public void setSelected(boolean bl) {
        this.bWn = bl;
    }

    @Override
    public boolean bqr() {
        return this.bWn;
    }

    @Override
    public int bDN() {
        return this.cKh;
    }

    @Override
    public void ti(int n) {
        if (this.cKh == n) {
            return;
        }
        this.cKh = n;
        if (this.aXA != null) {
            for (int i = this.aXA.size() - 1; i >= 0; --i) {
                this.aXA.get(i).ti(this.cKh + 1);
            }
        }
    }
}

