/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.Arrays;

final class aaF {
    private static final float cav = 0.0033333334f;
    private static final float caw = 2.0f;
    float[][] cax;
    private final TIntArrayList cay = new TIntArrayList(20);
    private int[] caz;
    private boolean[] caA;
    private boolean[] caB;
    static final /* synthetic */ boolean caC;
    final /* synthetic */ aaE caD;

    aaF(aaE aaE2) {
        this.caD = aaE2;
        this.clear();
    }

    void clear() {
        this.cax = aaE.can;
        this.caA = null;
        this.caB = null;
        this.cay.reset();
        this.caz = null;
    }

    float[] rj(int n) {
        return this.cax[Math.abs(n)];
    }

    void b(int n, float[] fArray) {
        this.cay.add(n);
        if (n < 0) {
            n = -n;
        }
        if (!caC && this.cax[n] != null) {
            throw new AssertionError((Object)"Le groupe est d\u00e9j\u00e0 en cache");
        }
        this.cax[n] = fArray;
        this.caz = null;
    }

    void rk(int n) {
        if (!caC && this.cax != aaE.can) {
            throw new AssertionError();
        }
        if (!caC && this.caB != null) {
            throw new AssertionError();
        }
        if (!caC && this.caA != null) {
            throw new AssertionError();
        }
        this.cax = new float[n][];
        this.caB = new boolean[n];
        this.caA = new boolean[n];
    }

    private boolean a(float[] fArray, float f2) {
        if (fArray == null) {
            return false;
        }
        if (fArray[0] > 0.0f) {
            fArray[0] = fArray[0] - (f2 *= 2.0f);
            fArray[1] = fArray[1] - f2;
            fArray[2] = fArray[2] - f2;
            if (fArray[0] < 0.0f) {
                fArray[3] = fArray[3] - -fArray[0];
                fArray[2] = 0.0f;
                fArray[1] = 0.0f;
                fArray[0] = 0.0f;
                if (fArray[3] < 0.0f) {
                    fArray[3] = 0.0f;
                }
            }
            return false;
        }
        if (fArray[3] > 0.0f) {
            fArray[3] = fArray[3] - f2;
            if (fArray[3] < 0.0f) {
                fArray[3] = 0.0f;
            }
            return false;
        }
        return true;
    }

    private boolean b(float[] fArray, float f2) {
        if (fArray == null) {
            return false;
        }
        if (fArray[0] > 0.0f) {
            fArray[0] = fArray[0] - f2;
            fArray[1] = fArray[1] - f2;
            fArray[2] = fArray[2] - f2;
            fArray[3] = fArray[3] - f2;
            if (fArray[0] < 0.0f) {
                fArray[3] = 0.0f;
                fArray[2] = 0.0f;
                fArray[1] = 0.0f;
                fArray[0] = 0.0f;
            }
            return false;
        }
        return true;
    }

    private boolean c(float[] fArray, float f2) {
        if (fArray == null) {
            return false;
        }
        if (fArray[3] < 1.0f) {
            fArray[3] = fArray[3] + 2.0f * f2;
            if (fArray[3] > 1.0f) {
                f2 = fArray[3] - 1.0f;
                fArray[0] = fArray[0] + f2;
                fArray[1] = fArray[1] + f2;
                fArray[2] = fArray[2] + f2;
                fArray[3] = 1.0f;
                if (fArray[0] > 1.0f) {
                    fArray[2] = 1.0f;
                    fArray[1] = 1.0f;
                    fArray[0] = 1.0f;
                }
            }
            return false;
        }
        if (fArray[0] < 1.0f) {
            fArray[0] = fArray[0] + f2;
            fArray[1] = fArray[1] + f2;
            fArray[2] = fArray[2] + f2;
            if (fArray[0] > 1.0f) {
                fArray[2] = 1.0f;
                fArray[1] = 1.0f;
                fArray[0] = 1.0f;
            }
            return false;
        }
        return true;
    }

    private boolean d(float[] fArray, float f2) {
        if (fArray == null) {
            return false;
        }
        if (fArray[0] < 1.0f) {
            fArray[0] = fArray[0] + f2;
            fArray[1] = fArray[1] + f2;
            fArray[2] = fArray[2] + f2;
            fArray[3] = fArray[3] + f2;
            if (fArray[0] > 1.0f) {
                fArray[3] = 1.0f;
                fArray[2] = 1.0f;
                fArray[1] = 1.0f;
                fArray[0] = 1.0f;
            }
            return false;
        }
        return true;
    }

    void b(int n, boolean bl) {
        float f2 = 0.0033333334f * (float)n;
        int n2 = this.cay.size();
        if (this.caz == null) {
            this.caz = new int[n2];
            this.cay.toArray(this.caz, 0, n2);
            Arrays.sort(this.caz);
        }
        for (int i = 0; i < n2; ++i) {
            int n3;
            int n4 = this.caz[i];
            int n5 = n3 = n4 > 0 ? n4 : -n4;
            if (this.caB[n3]) continue;
            if (bl) {
                this.caA[n3] = true;
            }
            float[] fArray = this.cax[n3];
            if (aaE.rh(n4) || this.caA[n3]) {
                if (!this.a(n4, fArray, f2)) continue;
                this.bh(n3, n4);
                continue;
            }
            if (!this.b(n4, fArray, f2)) continue;
            this.bh(n3, n4);
        }
    }

    private void bh(int n, int n2) {
        this.cax[n] = null;
        this.caA[n] = false;
        aeb_2.a(this.cay, n2);
    }

    private boolean a(int n, float[] fArray, float f2) {
        if (this.caD.bg(this.caD.cas, n)) {
            if (this.c(fArray, f2)) {
                this.caB[n > 0 ? n : -n] = true;
            }
            return false;
        }
        if (this.a(fArray, f2)) {
            this.caB[n > 0 ? n : -n] = true;
            return true;
        }
        return false;
    }

    private boolean b(int n, float[] fArray, float f2) {
        if (this.caD.bg(this.caD.cas, n)) {
            if (this.d(fArray, f2)) {
                this.caB[n > 0 ? n : -n] = true;
            }
            return false;
        }
        if (this.b(fArray, f2)) {
            this.caB[n > 0 ? n : -n] = true;
            return true;
        }
        return false;
    }

    void brX() {
        int n;
        if (this.caB == null) {
            return;
        }
        int n2 = this.caB.length;
        for (n = 0; n < n2; ++n) {
            this.caB[n] = false;
        }
        n2 = this.caA.length;
        for (n = 0; n < n2; ++n) {
            this.caA[n] = false;
        }
    }

    static {
        caC = !aaE.class.desiredAssertionStatus();
    }
}

