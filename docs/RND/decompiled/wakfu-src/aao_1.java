/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aAo
 */
public class aao_1
extends aaj_2 {
    public aao_1(int n) {
        super(n);
    }

    public aao_1() {
        super(10);
    }

    public void fW(long l) {
        this.bTJ();
        int n = this.gQ(l);
        if (n >= 0) {
            this.dwx[n] = l;
            ++this.cRf;
        }
    }

    public boolean gN(long l) {
        if (this.cRf == 0) {
            return false;
        }
        int n = this.gP(l);
        if (n < 0) {
            return false;
        }
        return this.wy(n);
    }

    public boolean wy(int n) {
        this.dwx[n] = this.dwx[this.cRf - 1];
        --this.cRf;
        return true;
    }
}

