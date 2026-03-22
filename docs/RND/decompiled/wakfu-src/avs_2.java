/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import java.nio.Buffer;

/*
 * Renamed from avS
 */
public class avs_2
extends awx_1 {
    private avo_2 dip;
    private static final VertexBufferPCT diq;
    private static final float[] dir;
    private float aAx = 0.0f;
    private float aAy = 0.0f;
    private float aXn = 1.0f;

    public void a(avo_2 avo_22) {
        this.dip = avo_22;
    }

    @Override
    public String bNu() {
        return this.dip == null ? null : this.dip.bNn();
    }

    @Override
    public int bNv() {
        if (this.dip == null) {
            return 0;
        }
        return this.dip.bNf();
    }

    @Override
    public awh_2 getFont() {
        return this.dip;
    }

    @Override
    public awh_2 b(int n, float f2) {
        return null;
    }

    @Override
    public int e(char c2) {
        avr_2 avr_22 = this.dip.d(c2);
        if (avr_22 == null) {
            return 4;
        }
        return avr_22.din;
    }

    @Override
    public int f(char c2) {
        avr_2 avr_22 = this.dip.d(c2);
        if (avr_22 == null) {
            return 4;
        }
        return avr_22.aAv;
    }

    @Override
    public int g(char c2) {
        avr_2 avr_22 = this.dip.d(c2);
        if (avr_22 == null) {
            return 4;
        }
        return avr_22.aAw;
    }

    @Override
    public int bNw() {
        if (this.dip == null) {
            return 8;
        }
        return this.dip.bNp() + this.dip.bNg() * 2;
    }

    @Override
    public int bNx() {
        if (this.dip == null) {
            return 12;
        }
        return this.dip.bNq() + this.dip.bNg() * 2;
    }

    @Override
    public int e(String string, int n, int n2) {
        if (string == null || string.length() == 0) {
            return 0;
        }
        if (this.dip == null) {
            return string.length();
        }
        float f2 = this.dip.bNg();
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            if (i == n) {
                return n;
            }
            avr_2 avr_22 = this.dip.d(cArray[i]);
            if (avr_22 == null) continue;
            f2 += (float)avr_22.din;
            if (avr_22.dio != null && i < cArray.length - 1) {
                f2 += (float)avr_22.dio.wr(cArray[i + 1]);
            }
            if (!(f2 > (float)n2)) continue;
            return i;
        }
        return string.length();
    }

    @Override
    public int gj(String string) {
        if (this.dip == null) {
            return 4 * string.length();
        }
        float f2 = 0.0f;
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            avr_2 avr_22 = this.dip.d(cArray[i]);
            if (avr_22 == null) continue;
            if (avr_22.dio != null && i < cArray.length - 1) {
                f2 += (float)avr_22.dio.wr(cArray[i + 1]);
            }
            f2 += (float)avr_22.din;
        }
        return (int)(f2 += (float)this.dip.bNg());
    }

    @Override
    public int gk(String string) {
        if (this.dip == null) {
            return 12;
        }
        return this.dip.getCellHeight();
    }

    @Override
    public int gp(String string) {
        return this.dip.bNs();
    }

    @Override
    public boolean bNy() {
        return false;
    }

    @Override
    public void c(float f2, float f3, float f4, float f5) {
        avs_2.dir[0] = f2 * f5;
        avs_2.dir[1] = f3 * f5;
        avs_2.dir[2] = f4 * f5;
        avs_2.dir[3] = f5;
    }

    @Override
    public final void a(char[] cArray, float f2, float f3) {
        this.a(cArray, f2, cArray.length, f3, 1.0f);
    }

    @Override
    public final void a(char[] cArray, float f2, float f3, float f4) {
        this.a(cArray, f2, cArray.length, f3, f4);
    }

    @Override
    public final void a(char[] cArray, float f2, int n, float f3, float f4) {
        this.a(cArray, f2, n, f3, f4, 0.0f);
    }

    @Override
    public void a(char[] cArray, float f2, int n, float f3, float f4, float f5) {
        int n2;
        if (this.dip == null) {
            return;
        }
        float f6 = f2;
        this.aXn = f4;
        short s = this.dip.bNg();
        f6 += this.aAx - (float)s;
        f3 += this.aAy - (float)s + (float)this.dip.bNr();
        atg_2 atg_22 = aru_2.cVG.bIv();
        GL2 gL2 = atg_22.bIq();
        awk_1 awk_12 = this.dip.bNo();
        ava_2.bMH().a((GL)gL2, (ati_2)awk_12);
        ava_2.bMH().h(gL2);
        acc_1 acc_12 = awk_12.vf(0);
        float f7 = acc_12.bWx();
        float f8 = acc_12.bWy();
        diq.bIH();
        int n3 = Math.min(cArray.length, n);
        for (n2 = 0; n2 < n3; ++n2) {
            char c2 = cArray[n2];
            avr_2 avr_22 = this.dip.d(c2);
            if (avr_22 == null) continue;
            if (c2 == ' ') {
                f6 += ((float)avr_22.din + f5) * this.aXn;
                continue;
            }
            float f9 = (float)(avr_22.dim + avr_22.aAw) / 2.0f;
            float f10 = (float)GC.A(f6) + (float)avr_22.dil * this.aXn;
            float f11 = f3 - f9 * this.aXn - f9;
            float f12 = f10 + (float)avr_22.aAv * this.aXn;
            float f13 = f11 + (float)avr_22.aAw * this.aXn;
            float f14 = (float)avr_22.ccg / f7;
            float f15 = (float)avr_22.cch / f8;
            float f16 = (float)(avr_22.ccg + avr_22.aAv) / f7;
            float f17 = (float)(avr_22.cch + avr_22.aAw) / f8;
            diq.a(f10, f11, f14, f17, dir);
            diq.a(f10, f13, f14, f15, dir);
            diq.a(f12, f13, f16, f15, dir);
            diq.a(f12, f11, f16, f17, dir);
            if (avr_22.dio != null && n2 < n3 - 1) {
                f6 += (float)avr_22.dio.wr(cArray[n2 + 1]) * this.aXn;
            }
            f6 += (float)avr_22.din * this.aXn;
        }
        diq.bIi();
        n2 = diq.bIF();
        gL2.glVertexPointer(2, 5126, 0, (Buffer)diq.bIy());
        gL2.glColorPointer(4, 5126, 0, (Buffer)diq.bIz());
        gL2.glTexCoordPointer(2, 5126, 0, (Buffer)diq.bIA());
        gL2.glDrawArrays(7, 0, n2);
    }

    @Override
    public void cd(int n, int n2) {
        this.aAx = -n / 2;
        this.aAy = -n2 / 2;
        atg_2 atg_22 = aru_2.cVG.bIv();
        atg_22.dbl.uu(13);
        ava_2.bMH().a(auw_2.dfL, auw_2.dfM);
    }

    @Override
    public void bNz() {
    }

    @Override
    public void bNA() {
        this.aAx = 0.0f;
        this.aAy = 0.0f;
        atg_2 atg_22 = aru_2.cVG.bIv();
        atg_22.dbl.uu(13);
        ava_2.bMH().a(auw_2.dfL, auw_2.dfM);
    }

    @Override
    public void bNB() {
    }

    static {
        dir = new float[4];
        int n = 4096;
        diq = VertexBufferPCT.cWa.ue(4096);
    }
}

