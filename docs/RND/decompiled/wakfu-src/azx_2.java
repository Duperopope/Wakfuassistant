/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from azX
 */
public abstract class azx_2 {
    protected byte[] dwp;
    protected int cRf;

    protected azx_2(int n) {
        this.dwp = new byte[n];
        this.cRf = 0;
    }

    public boolean vS(int n) {
        if (n > this.dwp.length) {
            byte[] byArray = this.dwp;
            this.dwp = new byte[n];
            System.arraycopy(byArray, 0, this.dwp, 0, byArray.length);
            return true;
        }
        return false;
    }

    protected final int aH(byte by) {
        for (int i = this.cRf - 1; i >= 0; --i) {
            if (by != this.dwp[i]) continue;
            return i;
        }
        return -1;
    }

    protected final int aI(byte by) {
        for (int i = this.cRf - 1; i >= 0; --i) {
            if (by != this.dwp[i]) continue;
            return -i - 1;
        }
        return this.cRf;
    }

    protected final void bTM() {
        if (this.cRf == this.dwp.length) {
            this.vS(this.dwp.length * 2);
        }
    }

    public final boolean aJ(byte by) {
        return this.aH(by) != -1;
    }

    public final void bTN() {
        this.cRf = 0;
    }

    public void clear() {
        this.cRf = 0;
    }

    public final int bTO() {
        return this.cRf;
    }

    public final byte vV(int n) {
        return this.dwp[n];
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        azx_2 azx_22 = (azx_2)object;
        if (this.cRf != azx_22.cRf) {
            return false;
        }
        return Arrays.equals(this.dwp, azx_22.dwp);
    }

    public int hashCode() {
        int n = this.dwp != null ? Arrays.hashCode(this.dwp) : 0;
        n = 31 * n + this.cRf;
        return n;
    }
}

