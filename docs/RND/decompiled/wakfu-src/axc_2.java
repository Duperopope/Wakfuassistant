/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GLProfile
 *  com.jogamp.opengl.util.texture.TextureData
 *  com.jogamp.opengl.util.texture.awt.AWTTextureIO
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.util.texture.TextureData;
import com.jogamp.opengl.util.texture.awt.AWTTextureIO;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from axc
 */
public class axc_2
extends ayy_2 {
    public static final axi_2 dow;
    public static final axi_2 dox;
    public static final axi_2 doy;
    protected axr_2 doz;
    protected boolean cSL;
    protected static final axj_2 doA;
    private static final Logger doB;
    private ayl_2 doC;
    private ArrayList<axj_2> doD;
    private acc_1 doE;
    private acc_1 doF;
    private boolean doG;
    private static final boolean doH = false;

    public axc_2() {
        this(ayl_2.dtT, doA);
    }

    public static axc_2 a(BufferedImage bufferedImage) {
        axd_2 axd_22 = new axd_2(bufferedImage);
        axd_22.bQy();
        int n = axd_22.bQz();
        TextureData textureData = AWTTextureIO.newTextureData((GLProfile)GLProfile.getDefault(), (BufferedImage)bufferedImage, (int)n, (int)n, (boolean)false);
        Buffer buffer = textureData.getBuffer();
        axj_2 axj_22 = new axj_2(textureData.getWidth(), textureData.getHeight(), axd_22.bQA(), null, (ByteBuffer)buffer);
        axj_22.aC(axd_22.bQB());
        axc_2 axc_22 = new axc_2(ayl_2.dtT, axj_22);
        axj_22.bsI();
        return axc_22;
    }

    private void bQo() {
        if (!this.doD.isEmpty()) {
            this.doE = this.vf(0);
            this.doF = new acc_1(this.doE);
        }
    }

    public axc_2(ayl_2 ayl_22, axj_2[] axj_2Array) {
        this.doC = ayl_22;
        this.doD = new ArrayList(axj_2Array.length);
        for (axj_2 axj_22 : axj_2Array) {
            this.b(axj_22);
        }
        this.bQo();
    }

    public axc_2(ayl_2 ayl_22, axj_2 axj_22) {
        this.doC = ayl_22;
        this.doD = new ArrayList(1);
        this.b(axj_22);
        this.bQo();
    }

    public axc_2(axc_2 axc_22) {
        assert (axc_22.doC != null) : "On copie une image releas\u00e9e";
        this.doC = axc_22.doC;
        int n = axc_22.doD.size();
        this.doD = new ArrayList(n);
        for (int i = 0; i < n; ++i) {
            this.b(new axj_2(axc_22.ve(i)));
        }
        this.bQo();
    }

    public axc_2(String string) {
        this.gF(string);
    }

    public boolean gE(String string) {
        axc_1 axc_12 = axc_2.gI(string);
        this.doE = axc_2.a(axc_12, string);
        if (this.doE == null) {
            return false;
        }
        this.doF = new acc_1(GC.mV(this.doE.bWx()), GC.mV(this.doE.bWy()));
        this.doz = new axr_2(axc_12, string);
        fo_0.a(this.doz);
        return true;
    }

    public boolean gF(String string) {
        return this.a(axc_2.gH(string));
    }

    private boolean a(axc_2 axc_22) {
        if (axc_22 == null) {
            return false;
        }
        this.doC = axc_22.doC;
        if (this.doD != null) {
            for (int i = 0; i < this.doD.size(); ++i) {
                this.doD.get(i).bsI();
            }
        }
        this.doD = axc_22.doD;
        this.bQo();
        axc_22.doD = null;
        axc_22.bsI();
        return true;
    }

    public static axc_2 a(byte[] byArray, String string) {
        axc_2 axc_22 = axc_2.b(byArray, string);
        if (axc_22 == null) {
            return null;
        }
        axc_22.bQo();
        return axc_22;
    }

    public boolean p(String ... stringArray) {
        assert (stringArray.length > 0);
        axj_2 axj_22 = this.doD.remove(0);
        axj_22.bsI();
        ayl_2 ayl_22 = null;
        int n = -1;
        int n2 = -1;
        for (int i = 0; i < stringArray.length; ++i) {
            axc_2 axc_22 = axc_2.gH(stringArray[i]);
            if (axc_22 == null) {
                return false;
            }
            if (ayl_22 != null && !ayl_22.equals(axc_22.doC)) {
                axc_22.bsI();
                return false;
            }
            ayl_22 = axc_22.doC;
            assert (axc_22.doC != null) : "image releas\u00e9e";
            int n3 = axc_22.bQq();
            for (int j = 0; j < n3; ++j) {
                axj_2 axj_23 = axc_22.ve(j);
                if (n == -1 && n2 == -1) {
                    n = axj_23.getWidth();
                    n2 = axj_23.getHeight();
                } else if (n != axj_23.getWidth() || n2 != axj_23.getHeight()) {
                    axc_22.bsI();
                    return false;
                }
                this.b(axj_23);
            }
            axc_22.bsI();
        }
        this.doC = ayl_22;
        this.bQo();
        return true;
    }

    public void a(int n, awz_2 awz_22) {
        this.doD.get(n).a(awz_22);
    }

    public void a(int n, axj_2 axj_22) {
        axj_22.bGY();
        this.doD.get(n).bsI();
        this.doD.set(n, axj_22);
    }

    public final void b(axj_2 axj_22) {
        axj_22.bGY();
        this.doD.add(axj_22);
    }

    public final boolean bQp() {
        return this.doD == null || this.doD.isEmpty() || this.doD.get(0) == doA;
    }

    @Nullable
    public axj_2 ve(int n) {
        if (this.doD == null) {
            return null;
        }
        assert (n < this.doD.size());
        return this.doD.get(n);
    }

    public final int bQq() {
        if (this.doD == null) {
            return 0;
        }
        return this.doD.size();
    }

    public final ayl_2 bQr() {
        return this.doC;
    }

    public final acc_1 vf(int n) {
        return this.ve(n).bQs();
    }

    public acc_1 bQs() {
        return this.doE;
    }

    public axb_2 I(int n, int n2, int n3) {
        return this.ve(n3).ck(n, n2);
    }

    public void dp(boolean bl) {
        this.doG = bl;
    }

    public acc_1 bQt() {
        return this.doF;
    }

    public final void bQu() {
        int n = this.bQq();
        for (int i = 0; i < n; ++i) {
            axj_2 axj_22 = axc_2.c(this.ve(i));
            this.a(i, axj_22);
            axj_22.bsI();
        }
        if (!this.doD.isEmpty()) {
            this.doF = this.vf(0);
        }
    }

    private static axj_2 c(axj_2 axj_22) {
        axj_2 axj_23 = axc_2.a(axj_22.aKU(), axj_22.getWidth(), axj_22.getHeight(), axj_22.bQI());
        axj_23.aC(axj_22.bPK());
        axj_23.A(axj_22.bQG(), axj_22.bQH());
        return axj_23;
    }

    public void bQv() {
        this.cSL = true;
    }

    public final void a(float f2, float f3, axi_2 axi_22) {
        for (axj_2 axj_22 : this.doD) {
            axj_22.a(f2, f3, axi_22);
        }
        this.bQo();
    }

    public final void bQw() {
        for (int i = this.doD.size() - 1; i >= 1; --i) {
            axj_2 axj_22 = this.doD.get(i);
            axj_2 axj_23 = this.doD.get(i - 1);
            if (axj_22.bQI() != 32) {
                this.a(i - 1, axj_22);
                continue;
            }
            axj_23.d(axj_22);
            this.doD.remove(i);
            axj_22.bsI();
        }
    }

    public static acc_1 gG(String string) {
        axc_1 axc_12 = axc_2.gI(string);
        return axc_2.a(axc_12, string);
    }

    public static acc_1 a(axc_1 axc_12, String string) {
        if (axc_12 == null) {
            return null;
        }
        acc_1 acc_12 = axc_12.gL(string);
        if (acc_12 == null) {
            doB.error((Object)("Unable to read image " + string));
        }
        return acc_12;
    }

    public static axc_2 gH(String string) {
        axc_1 axc_12 = axc_2.gI(string);
        if (axc_12 == null) {
            return null;
        }
        axc_2 axc_22 = axc_12.gM(string);
        if (axc_22 == null) {
            doB.error((Object)("Impossible de lire l'image " + string));
        }
        return axc_22;
    }

    public static axc_2 b(byte[] byArray, String string) {
        assert (byArray != null);
        axc_1 axc_12 = axd_1.bQW().gN(string);
        if (axc_12 == null) {
            doB.error((Object)("No ImageReader registered for file ext (." + string + ")"));
            doB.error((Object)("Did you forget to call ImageReaderFactory.getInstance().registerReader (\"" + string + "\", new " + string + "Reader ()); ?"));
            return null;
        }
        axc_2 axc_22 = axc_12.dE(byArray);
        if (axc_22 == null) {
            doB.error((Object)"Impossible de lire les donn\u00e9es d'image.");
        }
        return axc_22;
    }

    public static void c(byte[] byArray, int n) {
        block3: {
            block2: {
                if (n != 16) break block2;
                int n2 = 0;
                while (n2 < byArray.length) {
                    byte by = byArray[n2];
                    byte by2 = byArray[n2 + 1];
                    byArray[n2++] = (byte)(by2 << 3 | by & 7);
                    byArray[n2++] = (byte)(by2 & 0xE0 | by >> 3);
                }
                break block3;
            }
            if (n != 24 && n != 32) break block3;
            int n3 = n / 8;
            for (int i = 0; i < byArray.length; i += n3) {
                byte by = byArray[i];
                byArray[i] = byArray[i + 2];
                byArray[i + 2] = by;
            }
        }
    }

    public static byte[] b(BufferedImage bufferedImage) {
        switch (bufferedImage.getType()) {
            case 6: {
                return axc_2.c(bufferedImage);
            }
            case 0: 
            case 5: 
            case 13: {
                return axc_2.d(bufferedImage);
            }
        }
        doB.error((Object)("Unhandled format " + bufferedImage.getType()));
        return axc_2.d(bufferedImage);
    }

    public static byte[] c(BufferedImage bufferedImage) {
        byte[] byArray = ByteBuffer.wrap(((DataBufferByte)bufferedImage.getRaster().getDataBuffer()).getData()).array();
        ByteBuffer byteBuffer = ByteBuffer.allocate(byArray.length);
        for (int i = 0; i < byArray.length; i += 4) {
            byte by = byArray[i];
            byte by2 = byArray[i + 1];
            byte by3 = byArray[i + 2];
            byte by4 = byArray[i + 3];
            byteBuffer.put(by4);
            byteBuffer.put(by3);
            byteBuffer.put(by2);
            byteBuffer.put(by);
        }
        byteBuffer.rewind();
        return byteBuffer.array();
    }

    public static byte[] d(BufferedImage bufferedImage) {
        int n = bufferedImage.getWidth();
        int n2 = bufferedImage.getHeight();
        int[] nArray = bufferedImage.getRGB(0, 0, n, n2, null, 0, n);
        ByteBuffer byteBuffer = ByteBuffer.allocate(nArray.length * 4);
        for (int i = 0; i < nArray.length; ++i) {
            int n3 = nArray[i];
            byte by = (byte)(n3 & 0xFF);
            byte by2 = (byte)(n3 >>> 8 & 0xFF);
            byte by3 = (byte)(n3 >>> 16 & 0xFF);
            byte by4 = (byte)(n3 >>> 24 & 0xFF);
            byteBuffer.put(by3);
            byteBuffer.put(by2);
            byteBuffer.put(by);
            byteBuffer.put(by4);
        }
        byteBuffer.rewind();
        return byteBuffer.array();
    }

    public static void d(byte[] byArray, int n) {
        assert (byArray.length % n == 0) : "Unable to flip the image since the buffer length is not a muptiple of line size";
        byte[] byArray2 = new byte[n];
        int n2 = byArray.length / n;
        int n3 = byArray.length - n;
        int n4 = 0;
        for (int i = 0; i < n2 / 2; ++i) {
            System.arraycopy(byArray, n4, byArray2, 0, n);
            System.arraycopy(byArray, n3, byArray, n4, n);
            System.arraycopy(byArray2, 0, byArray, n3, n);
            n3 -= n;
            n4 += n;
        }
    }

    public static axj_2 a(byte[] byArray, int n, int n2, int n3) {
        int n4 = GC.mV(n);
        int n5 = GC.mV(n2);
        if (n4 == n && n5 == n2) {
            return new axj_2(n4, n5, (short)n3, null, (byte[])byArray.clone());
        }
        int n6 = n3 / 8;
        byte[] byArray2 = new byte[n4 * n5 * n6];
        int n7 = n * n6;
        int n8 = n4 * n6;
        int n9 = byArray.length / n7;
        int n10 = 0;
        int n11 = 0;
        for (int i = 0; i < n9; ++i) {
            System.arraycopy(byArray, n10, byArray2, n11, n7);
            n10 += n7;
            n11 += n8;
        }
        return new axj_2(n4, n5, (short)n3, null, byArray2);
    }

    public static axj_2 a(axj_2 axj_22, int n, int n2, int n3, int n4) {
        assert (n >= 0 && n3 > n && n3 <= axj_22.getHeight());
        assert (n2 >= 0 && n4 > n2 && n4 <= axj_22.getWidth());
        int n5 = axj_22.bQI() / 8;
        int n6 = n4 - n2;
        int n7 = n3 - n;
        byte[] byArray = new byte[n6 * n7 * n5];
        int n8 = axj_22.getWidth() * n5;
        int n9 = n3 - n;
        int n10 = n6 * n5;
        byte[] byArray2 = axj_22.aKU();
        int n11 = n * n8 + n2 * n5;
        int n12 = 0;
        for (int i = 0; i < n9; ++i) {
            System.arraycopy(byArray2, n11, byArray, n12, n10);
            n11 += n8;
            n12 += n10;
        }
        axj_2 axj_23 = new axj_2(n6, n7, (short)axj_22.bQI(), null, byArray);
        axj_23.aC(axj_22.bPK());
        return axj_23;
    }

    public static void a(axj_2 axj_22, aci_1 aci_12) {
        aci_12.wR(axj_22.getWidth());
        aci_12.wT(axj_22.getHeight());
        aci_12.wS(0);
        aci_12.wU(0);
        for (int i = 0; i < axj_22.getWidth(); ++i) {
            for (int j = 0; j < axj_22.getHeight(); ++j) {
                if (axj_22.cj(i, j) == 0) continue;
                if (i < aci_12.bWF()) {
                    aci_12.wR(i);
                }
                if (i > aci_12.bWG()) {
                    aci_12.wS(i);
                }
                if (j < aci_12.bWH()) {
                    aci_12.wT(j);
                }
                if (j <= aci_12.bWI()) continue;
                aci_12.wU(j);
            }
        }
        if (aci_12.bWH() > aci_12.bWI()) {
            aci_12.wR(0);
            aci_12.wS(0);
            aci_12.wT(0);
            aci_12.wU(0);
        }
    }

    public void vg(int n) {
        for (axj_2 axj_22 : this.doD) {
            axj_22.vh(n);
        }
    }

    public void bQx() {
        if (!this.a(this.doz.bQT())) {
            doB.error((Object)("Unable to read image " + this.doz.aLy()));
            return;
        }
        if (this.doG) {
            this.bQu();
        }
        this.doz = null;
        this.cSL = true;
    }

    private static axc_1 gI(String string) {
        String string2 = fq_0.bI(string).toUpperCase();
        axc_1 axc_12 = axd_1.bQW().gN(string2);
        if (axc_12 == null) {
            doB.error((Object)("No ImageReader registered for file ext (." + string2 + ")"));
            doB.error((Object)("Did you forget to call ImageReaderFactory.getInstance().registerReader (\"" + string2 + "\", new " + string2 + "Reader ()); ?"));
        }
        return axc_12;
    }

    @Override
    protected void bLe() {
        super.bLe();
        if (this.doD != null) {
            for (axj_2 axj_22 : this.doD) {
                axj_22.bsI();
            }
            this.doD = null;
        }
        this.doC = null;
        this.doE = null;
        this.doF = null;
        this.doG = false;
    }

    static {
        int n;
        dow = new axi_2(3);
        dox = new axi_2(3);
        doy = new axi_2(3);
        float f2 = 1.5f;
        float f3 = 4.5f;
        float[] fArray = new float[dow.bQF() * dow.bQF()];
        int n2 = dow.bQF() / 2;
        float f4 = 0.0f;
        int n3 = -1;
        for (n = -n2; n < n2 + 1; ++n) {
            for (int i = -n2; i < n2 + 1; ++i) {
                float f5 = (float)(0.0707355302630646 * StrictMath.exp((float)(-(n * n + i * i)) / 4.5f));
                f4 += f5;
                fArray[++n3] = f5;
            }
        }
        n3 = 0;
        while (n3 < fArray.length) {
            int n4 = n3++;
            fArray[n4] = fArray[n4] / f4;
        }
        dow.V(fArray);
        int n5 = dox.bQF();
        float[] fArray2 = new float[n5 * n5];
        int n6 = n5 / 2;
        float f6 = 0.0f;
        int n7 = -1;
        for (n3 = -n6; n3 < n6 + 1; ++n3) {
            for (n = -n6; n < n6 + 1; ++n) {
                float f7 = n5 + n5 * n3 * n3 + n * n;
                f6 += f7;
                fArray2[++n7] = f7;
            }
        }
        n7 = 0;
        while (n7 < fArray2.length) {
            int n8 = n7++;
            fArray2[n8] = fArray2[n8] / f6;
        }
        dox.V(fArray2);
        n5 = doy.bQF();
        fArray2 = new float[n5 * n5];
        n6 = n5 / 2;
        f6 = 0.0f;
        n7 = -1;
        for (n3 = -n6; n3 < n6 + 1; ++n3) {
            for (n = -n6; n < n6 + 1; ++n) {
                float f8 = 1.0f;
                f6 += 1.0f;
                fArray2[++n7] = 1.0f;
            }
        }
        n7 = 0;
        while (n7 < fArray2.length) {
            int n9 = n7++;
            fArray2[n9] = fArray2[n9] / f6;
        }
        doy.V(fArray2);
        doB = Logger.getLogger(axc_2.class);
        n5 = 128;
        int n10 = 64;
        byte[] byArray = new byte[32768];
        doA = new axj_2(128, 64, 32, null, byArray);
        doA.vh(255);
        doA.bGY();
    }
}

