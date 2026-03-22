/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fSr
 */
public abstract class fsr_2<T> {
    public static final int vdX = -1;
    protected abn tXJ;
    protected int bUi;
    protected int bMn;
    protected int vdY = 1;
    protected boolean vdZ = true;
    protected int vea = 0;
    protected int bSr = 0;
    protected T veb;
    protected T vec;
    protected boolean dOj = false;
    protected fsf_2 ved;
    private ArrayList<fsh_2> bMZ = null;

    public void a(fsh_2 fsh_22) {
        if (this.bMZ == null) {
            this.bMZ = new ArrayList(3);
        }
        this.bMZ.add(fsh_22);
    }

    public void b(fsh_2 fsh_22) {
        if (this.bMZ != null) {
            this.bMZ.remove(fsh_22);
        }
    }

    public boolean isPaused() {
        return this.dOj;
    }

    public void setPaused(boolean bl) {
        this.dOj = bl;
    }

    public long Tz() {
        return this.bMn;
    }

    public void setDuration(int n) {
        this.bMn = n;
    }

    public int bBR() {
        return this.bSr;
    }

    public void sO(int n) {
        this.bSr = n;
    }

    public boolean gFW() {
        return this.vdZ;
    }

    public void pp(boolean bl) {
        this.vdZ = bl;
    }

    public T gFX() {
        return this.veb;
    }

    public void bl(T t) {
        this.veb = t;
    }

    public T gFY() {
        return this.vec;
    }

    public void bm(T t) {
        this.vec = t;
    }

    public int gFZ() {
        return this.vdY;
    }

    public final void acd(int n) {
        assert (n == -1 || n > 0) : "La valeur de repeat d\u00e9finie n'est pas valide ( inf\u00e9rieure ou \u00e9gale \u00e0 0)";
        this.vdY = n;
    }

    public void setEasing(abn abn2) {
        this.tXJ = abn2;
    }

    public void a(fsf_2 fsf_22) {
        this.ved = fsf_22;
    }

    public fsf_2 gGa() {
        return this.ved;
    }

    public boolean Ma(int n) {
        if (this.dOj) {
            return true;
        }
        if (this.bSr > 0) {
            this.bSr -= n;
        }
        if (this.bSr > 0) {
            return false;
        }
        if (this.bSr < 0) {
            this.bUi -= this.bSr;
            this.bSr = 0;
        } else {
            this.bUi += n;
        }
        if (this.bUi >= this.bMn) {
            ++this.vea;
            if (this.vea != this.vdY) {
                if (this.vdZ) {
                    T t = this.veb;
                    this.veb = this.vec;
                    this.vec = t;
                }
                this.bUi = this.bMn != 0 ? (this.bUi %= this.bMn) : 0;
            } else {
                this.bUi = this.bMn;
            }
        }
        if (this.vdY != -1 && this.vea >= this.vdY) {
            this.ved.b(this);
            return false;
        }
        return true;
    }

    public void cbz() {
        this.bmX();
        if (this.bMZ != null) {
            for (int i = this.bMZ.size() - 1; i >= 0; --i) {
                this.bMZ.get(i).onTweenEvent(this, fsg_2.veA);
            }
        }
    }

    public void bmX() {
    }
}

