/*
 * Decompiled with CFR 0.152.
 */
public abstract class Xn
implements xa_0 {
    public static final int bRC = -1;
    private int bRm;
    protected int bRl = 0;
    protected int bMn = -1;

    public void setDuration(int n) {
        this.bMn = n;
    }

    @Override
    public int getDuration() {
        return this.bMn;
    }

    protected int bnA() {
        return this.bRl;
    }

    @Override
    public boolean bnq() {
        if (this.bMn == -1) {
            return true;
        }
        return this.bRl <= this.bMn + this.bRm;
    }

    @Override
    public void qy(int n) {
        if (this.bRm > 0) {
            this.bRm -= n;
            if (this.bRm <= 0) {
                this.setVisible(true);
            }
        } else {
            this.bRl += n;
        }
    }

    public void qC(int n) {
        assert (n >= 0);
        this.bRm = n;
        if (this.bRm > 0) {
            this.setVisible(false);
        }
    }

    public abstract void setVisible(boolean var1);
}

