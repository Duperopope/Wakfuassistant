/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.awt.Color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from awX
 */
public final class awx_2
implements axb_2 {
    public static final axb_2 dnB = new awx_2(0.0f, 0.0f, 0.0f, 0.0f);
    public static final axb_2 dnC = new awx_2(1.0f, 1.0f, 1.0f, 0.0f);
    public static final axb_2 dnD = new awx_2(1.0f, 1.0f, 1.0f, 0.5f);
    public static final axb_2 dnE = new awx_2(1.0f, 1.0f, 1.0f, 0.25f);
    public static final axb_2 dnF = new awx_2(1.0f, 1.0f, 1.0f);
    public static final axb_2 dnG = new awx_2(0.0f, 0.0f, 0.0f);
    public static final axb_2 dnH = new awx_2(0.0f, 0.0f, 0.0f, 0.5f);
    public static final axb_2 dnI = new awx_2(217, 65, 65, 255);
    public static final axb_2 dnJ = new awx_2(1.0f, 0.0f, 0.0f);
    public static final axb_2 dnK = new awx_2(217, 0, 0, 255);
    public static final axb_2 dnL = new awx_2(0.0f, 1.0f, 0.0f);
    public static final axb_2 dnM = new awx_2(0.0f, 0.4f, 0.0f);
    public static final axb_2 dnN = new awx_2(34, 170, 213, 255);
    public static final axb_2 dnO = new awx_2(0.0f, 0.0f, 1.0f);
    public static final axb_2 dnP = new awx_2(0.0f, 1.0f, 1.0f);
    public static final axb_2 dnQ = new awx_2(128, 128, 128, 255);
    public static final axb_2 dnR = new awx_2(64, 64, 64, 255);
    public static final axb_2 dnS = new awx_2(192, 192, 192, 255);
    public static final axb_2 dnT = new awx_2(224, 224, 224, 255);
    public static final axb_2 dnU = new awx_2(0.57f, 0.2f, 0.75f, 0.66f);
    public static final axb_2 dnV = new awx_2(255, 190, 220, 255);
    public static final axb_2 dnW = new awx_2(1.0f, 0.5f, 0.75f);
    public static final axb_2 dnX = new awx_2(0.95f, 0.64f, 0.25f);
    public static final axb_2 dnY = new awx_2(237, 172, 97, 255);
    public static final axb_2 dnZ = new awx_2(217, 117, 0, 255);
    public static final axb_2 doa = new awx_2(50, 248, 255, 255);
    public static final axb_2 dob = new awx_2(0.32f, 0.39f, 0.42f);
    public static final axb_2 doc = new awx_2(0.85f, 0.18f, 0.0f);
    public static final axb_2 dod = new awx_2(0.8f, 0.0f, 0.4f);
    private int doe;

    public awx_2(@NotNull axb_2 axb_22) {
        this.doe = axb_22.bPU();
    }

    public awx_2(float ... fArray) {
        if (fArray.length == 0) {
            this.doe = 0;
            return;
        }
        float f2 = fArray.length == 4 ? fArray[3] : 1.0f;
        this.v(fArray[0], fArray[1], fArray[2], f2);
    }

    public awx_2(int n) {
        this.doe = n;
    }

    public awx_2(byte by, byte by2, byte by3, byte by4) {
        this.b(by, by2, by3, by4);
    }

    public awx_2(int n, int n2, int n3, int n4) {
        this.q(n, n2, n3, n4);
    }

    public awx_2(axb_2 axb_22, float f2) {
        this(axb_22.aIU(), axb_22.aIV(), axb_22.aIW(), f2);
    }

    public awx_2(Color color) {
        this(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
    }

    @Override
    public int bPU() {
        return this.doe;
    }

    @Override
    public int bPV() {
        return this.doe >> 24 & 0xFF;
    }

    @Override
    public int bPW() {
        return this.doe & 0xFF;
    }

    @Override
    public int bPX() {
        return this.doe >> 8 & 0xFF;
    }

    @Override
    public int bPY() {
        return this.doe >> 16 & 0xFF;
    }

    @Override
    public boolean bPZ() {
        return false;
    }

    @Override
    @Nullable
    public String bQa() {
        return null;
    }

    public void S(float f2) {
        assert (f2 >= 0.0f && f2 <= 1.0f) : "Invalid intensity value " + f2;
        float f3 = Math.max(this.aIU(), Math.max(this.aIW(), this.aIV()));
        if (f3 == 0.0f) {
            this.v(f2, f2, f2, this.aIX());
            return;
        }
        float f4 = f2 / f3;
        float f5 = Math.min(1.0f, this.aIU() * f4);
        float f6 = Math.min(1.0f, this.aIW() * f4);
        float f7 = Math.min(1.0f, this.aIV() * f4);
        this.v(f5, f7, f6, this.aIX());
    }

    public void v(float f2, float f3, float f4, float f5) {
        this.doe = axb_2.x(f2, f3, f4, f5);
    }

    public void setAlpha(float f2) {
        float f3 = GC.b(f2, 0.0f, 1.0f);
        this.doe = this.doe & 0xFFFFFF | (int)(f3 * 255.0f) << 24;
    }

    public void c(axb_2 axb_22) {
        this.doe = axb_22.bPU();
    }

    public void op(int n) {
        this.doe = n;
    }

    public void uX(int n) {
        this.doe = axb_2.vd(n);
    }

    public void b(byte by, byte by2, byte by3, byte by4) {
        this.doe = axb_2.e(by, by2, by3, by4);
    }

    public void q(int n, int n2, int n3, int n4) {
        this.doe = axb_2.r(n, n2, n3, n4);
    }

    public void d(axb_2 axb_22) {
        this.v(this.aIU() * axb_22.aIU(), this.aIV() * axb_22.aIV(), this.aIW() * axb_22.aIW(), this.aIX() * axb_22.aIX());
    }

    public void bQb() {
        this.q(GC.q(0, 255), GC.q(0, 255), GC.q(0, 255), GC.q(0, 255));
    }

    public static awx_2 a(axb_2 axb_22, axb_2 axb_23) {
        awx_2 awx_22 = new awx_2(axb_22);
        awx_22.d(axb_23);
        return awx_22;
    }

    public String toString() {
        return String.format("%s, %s, %s, %s", Float.valueOf(axb_2.vc(this.doe)), Float.valueOf(axb_2.vb(this.doe)), Float.valueOf(axb_2.va(this.doe)), Float.valueOf(axb_2.uZ(this.doe)));
    }

    public static awx_2 gD(String string) {
        if (string.charAt(0) == '#') {
            string = string.substring(1);
        }
        int n = Integer.parseInt(string.substring(0, 2), 16);
        int n2 = Integer.parseInt(string.substring(2, 4), 16);
        int n3 = Integer.parseInt(string.substring(4, 6), 16);
        int n4 = string.length() == 8 ? Integer.parseInt(string.substring(6, 8), 16) : 255;
        return new awx_2(n, n2, n3, n4);
    }

    public static awx_2 H(int n, int n2, int n3) {
        return awx_2.w(n, n2, n3, 1.0f);
    }

    public static awx_2 w(float f2, float f3, float f4, float f5) {
        if (f3 < 0.0f || f3 > 100.0f) {
            throw new IllegalArgumentException("Color parameter outside of expected range - Saturation");
        }
        if (f4 < 0.0f || f4 > 100.0f) {
            throw new IllegalArgumentException("Color parameter outside of expected range - Luminance");
        }
        if (f5 < 0.0f || f5 > 1.0f) {
            throw new IllegalArgumentException("Color parameter outside of expected range - Alpha");
        }
        float f6 = f3 / 100.0f;
        float f7 = f4 / 100.0f;
        float f8 = (double)f7 < 0.5 ? f7 * (1.0f + f6) : f7 + f6 - f7 * f6;
        float f9 = 2.0f * f7 - f8;
        float f10 = f2 % 360.0f / 360.0f;
        float f11 = Math.max(0.0f, axb_2.D(f9, f8, f10 + 0.33333334f));
        float f12 = Math.max(0.0f, axb_2.D(f9, f8, f10));
        float f13 = Math.max(0.0f, axb_2.D(f9, f8, f10 - 0.33333334f));
        f11 = Math.min(f11, 1.0f);
        f12 = Math.min(f12, 1.0f);
        f13 = Math.min(f13, 1.0f);
        return new awx_2(f11, f12, f13, f5);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        awx_2 awx_22 = (awx_2)object;
        return this.doe == awx_22.doe;
    }

    public int hashCode() {
        return this.doe;
    }
}

