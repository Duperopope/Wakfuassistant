/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aAf
 */
public class aaf_1
extends azz_2 {
    public aaf_1(int n) {
        super(n);
    }

    public aaf_1() {
        super(10);
    }

    public void wm(int n) {
        this.bTP();
        int n2 = this.vY(n);
        if (n2 >= 0) {
            ++this.cRf;
            this.dwq[n2] = n;
        }
    }

    public boolean wb(int n) {
        if (this.cRf == 0) {
            return false;
        }
        int n2 = this.vX(n);
        if (n2 < 0) {
            return false;
        }
        this.dwq[n2] = this.dwq[this.cRf - 1];
        --this.cRf;
        return true;
    }
}

