/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.awt.Color;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from axb
 */
public interface axb_2 {
    public static final int doq = 255;
    public static final int dor = 255;
    public static final int dos = 24;
    public static final int dot = 16;
    public static final int dou = 8;
    public static final int dov = 16;

    default public int aTn() {
        return this.bPU();
    }

    public int bPU();

    default public int bQc() {
        return axb_2.s(this.bPW(), this.bPX(), this.bPY(), this.bPV());
    }

    @Deprecated
    default public int bQd() {
        return axb_2.s(this.bPV(), this.bPW(), this.bPX(), this.bPY());
    }

    default public byte bQe() {
        return (byte)this.bPV();
    }

    default public byte bQf() {
        return (byte)this.bPW();
    }

    default public byte bQg() {
        return (byte)this.bPX();
    }

    default public byte bQh() {
        return (byte)this.bPY();
    }

    public int bPV();

    public int bPW();

    public int bPX();

    public int bPY();

    default public boolean bPZ() {
        return this.bQa() != null;
    }

    @Nullable
    public String bQa();

    default public float aIX() {
        int n = this.bPV();
        if (n < 0) {
            n = 256 + n;
        }
        return (float)n / 255.0f;
    }

    default public float aIU() {
        return (float)this.bPW() / 255.0f;
    }

    default public float aIV() {
        return (float)this.bPX() / 255.0f;
    }

    default public float aIW() {
        return (float)this.bPY() / 255.0f;
    }

    default public float bQi() {
        return Math.max(this.aIU(), Math.max(this.aIW(), this.aIV()));
    }

    default public float aRB() {
        return (this.aIU() + this.aIV() + this.aIW()) / 3.0f;
    }

    default public float[] bQj() {
        return new float[]{this.aIU(), this.aIV(), this.aIW(), this.aIX()};
    }

    public static float uZ(int n) {
        return (float)(n >> 24 & 0xFF) / 255.0f;
    }

    public static float va(int n) {
        return (float)(n >> 16 & 0xFF) / 255.0f;
    }

    public static float vb(int n) {
        return (float)(n >> 8 & 0xFF) / 255.0f;
    }

    public static float vc(int n) {
        return (float)(n & 0xFF) / 255.0f;
    }

    public static int x(float f2, float f3, float f4, float f5) {
        return (int)(GC.b(f5, 0.0f, 1.0f) * 255.0f) << 24 | (int)(GC.b(f2, 0.0f, 1.0f) * 255.0f) | (int)(GC.b(f3, 0.0f, 1.0f) * 255.0f) << 8 | (int)(GC.b(f4, 0.0f, 1.0f) * 255.0f) << 16;
    }

    public static int e(byte by, byte by2, byte by3, byte by4) {
        return ayj_2.aD(by4) << 24 | ayj_2.aD(by) | ayj_2.aD(by2) << 8 | ayj_2.aD(by3) << 16;
    }

    public static int r(int n, int n2, int n3, int n4) {
        return GC.a(n4, 0, 255) << 24 | GC.a(n, 0, 255) | GC.a(n2, 0, 255) << 8 | GC.a(n3, 0, 255) << 16;
    }

    public static int vd(int n) {
        return axb_2.r(n >> 16 & 0xFF, n >> 8 & 0xFF, n & 0xFF, n >> 24 & 0xFF);
    }

    public static int s(int n, int n2, int n3, int n4) {
        return GC.a(n, 0, 255) << 24 | GC.a(n2, 0, 255) << 16 | GC.a(n3, 0, 255) << 8 | GC.a(n4, 0, 255);
    }

    default public String bQk() {
        StringBuilder stringBuilder = new StringBuilder();
        String string = (this.bPW() < 16 ? "0" : "") + Integer.toHexString(this.bPW());
        String string2 = (this.bPX() < 16 ? "0" : "") + Integer.toHexString(this.bPX());
        String string3 = (this.bPY() < 16 ? "0" : "") + Integer.toHexString(this.bPY());
        stringBuilder.append(string).append(string2).append(string3);
        return stringBuilder.toString();
    }

    default public String bQl() {
        StringBuilder stringBuilder = new StringBuilder();
        String string = (this.bPW() < 16 ? "0" : "") + Integer.toHexString(this.bPW());
        String string2 = (this.bPX() < 16 ? "0" : "") + Integer.toHexString(this.bPX());
        String string3 = (this.bPY() < 16 ? "0" : "") + Integer.toHexString(this.bPY());
        String string4 = (this.bPV() < 16 ? "0" : "") + Integer.toHexString(this.bPV());
        stringBuilder.append(string).append(string2).append(string3).append(string4);
        return stringBuilder.toString();
    }

    public static float D(float f2, float f3, float f4) {
        if (f4 < 0.0f) {
            f4 += 1.0f;
        }
        if (f4 > 1.0f) {
            f4 -= 1.0f;
        }
        if (6.0f * f4 < 1.0f) {
            return f2 + (f3 - f2) * 6.0f * f4;
        }
        if (2.0f * f4 < 1.0f) {
            return f3;
        }
        if (3.0f * f4 < 2.0f) {
            return f2 + (f3 - f2) * 6.0f * (0.6666667f - f4);
        }
        return f2;
    }

    default public float[] bQm() {
        float f2 = this.aIU();
        float f3 = this.aIV();
        float f4 = this.aIW();
        float f5 = Math.min(f2, Math.min(f3, f4));
        float f6 = Math.max(f2, Math.max(f3, f4));
        float f7 = 0.0f;
        if (f6 == f5) {
            f7 = 0.0f;
        } else if (f6 == f2) {
            f7 = (60.0f * (f3 - f4) / (f6 - f5) + 360.0f) % 360.0f;
        } else if (f6 == f3) {
            f7 = 60.0f * (f4 - f2) / (f6 - f5) + 120.0f;
        } else if (f6 == f4) {
            f7 = 60.0f * (f2 - f3) / (f6 - f5) + 240.0f;
        }
        float f8 = (f6 + f5) / 2.0f;
        float f9 = 0.0f;
        f9 = f6 == f5 ? 0.0f : (f8 <= 0.5f ? (f6 - f5) / (f6 + f5) : (f6 - f5) / (2.0f - f6 - f5));
        return new float[]{f7, f9 * 100.0f, f8 * 100.0f};
    }

    default public Color bQn() {
        return new Color(this.bPW(), this.bPX(), this.bPY(), this.bPV());
    }
}

