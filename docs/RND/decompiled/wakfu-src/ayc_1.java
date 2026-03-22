/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from ayC
 */
public class ayc_1 {
    private static final float dto = 1.0E-6f;
    private final ArrayList<ayd_1> dtp = new ArrayList(8);

    public ayc_1(float f2, float f3) {
        this.dtp.add(new ayd_1(f2, f3));
    }

    public void bg(float f2, float f3) {
        this.dtp.clear();
        this.dtp.add(new ayd_1(f2, f3));
    }

    public void f(int n, float f2, float f3) {
        this.dtp.add(n, new ayd_1(f2, f3));
    }

    public void bh(float f2, float f3) {
        if (f2 > (float)Math.PI * 2) {
            this.bh(f2 - (float)Math.PI * 2, f3 - (float)Math.PI * 2);
        } else if (f3 < 0.0f) {
            this.bh(f2 + (float)Math.PI * 2, f3 + (float)Math.PI * 2);
        } else if (f2 < 0.0f) {
            this.bh(0.0f, f3);
            this.bh(f2 + (float)Math.PI * 2, (float)Math.PI * 2);
        } else if (f3 > (float)Math.PI * 2) {
            this.bh(f2, (float)Math.PI * 2);
            this.bh(0.0f, f3 - (float)Math.PI * 2);
        } else if (this.dtp.size() != 0) {
            int n;
            if (f2 < this.dtp.get((int)0).dtq) {
                n = -1;
            } else {
                int n2 = 0;
                int n3 = 0;
                int n4 = this.dtp.size();
                while (n2 < n4 - 1) {
                    n3 = n2 + n4 >> 1;
                    if (this.dtp.get((int)n3).dtq < f2) {
                        n2 = n3;
                        continue;
                    }
                    n4 = n3;
                }
                n = n2;
            }
            if (n == -1) {
                n = 0;
            } else if (f2 < this.dtp.get((int)n).dtr) {
                float f4 = this.dtp.get((int)n).dtq;
                float f5 = this.dtp.get((int)n).dtr;
                if (f2 - f4 < 1.0E-6f) {
                    if (f3 < f5) {
                        this.dtp.get((int)n).dtq = f3;
                    } else {
                        this.dtp.remove(n);
                    }
                } else {
                    this.dtp.get((int)n).dtr = f2;
                    if (f3 < f5) {
                        this.f(n + 1, f3, f5);
                    }
                    ++n;
                }
            } else if (n < this.dtp.size() - 1 && f3 > this.dtp.get((int)(n + 1)).dtq) {
                ++n;
            } else {
                return;
            }
            while (n < this.dtp.size() && f3 > this.dtp.get((int)n).dtq) {
                if (this.dtp.get((int)n).dtr - f3 < 1.0E-6f) {
                    this.dtp.remove(n);
                    continue;
                }
                this.dtp.get((int)n).dtq = f3;
            }
        }
    }

    public ArrayList<ayd_1> bSh() {
        return this.dtp;
    }
}

