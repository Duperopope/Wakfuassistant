/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.common.nio.Buffers
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 *  com.jogamp.opengl.Threading
 *  org.apache.log4j.Logger
 */
import com.jogamp.common.nio.Buffers;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.Threading;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from ati
 */
public final class ati_2
extends awk_1 {
    private static final Logger dbs = Logger.getLogger(ati_2.class);
    private static final int dbt = ayl_2.gR("DXT1");
    private static final int dbu = ayl_2.gR("DXT3");
    private static final int dbv = ayl_2.gR("DXT5");
    public static final int dbw = 32856;
    private static final int dbx = 25;
    private int[] dby;

    public ati_2(long l, String string, boolean bl) {
        super(l, string, bl);
        this.aPg();
    }

    public ati_2(long l, axc_2 axc_22, boolean bl) {
        super(l, axc_22, bl);
        this.aPg();
    }

    public ati_2(long l, int n, int n2, boolean bl) {
        super(l, n, n2, bl);
        this.aPg();
    }

    public int bLb() {
        return this.dby[0];
    }

    public int bLc() {
        return this.dby[3];
    }

    @Override
    public boolean b(GL gL) {
        return Threading.isOpenGLThread() && (this.dmF ? this.d(gL) : this.e(gL));
    }

    @Override
    public boolean c(GL gL) {
        if (this.bQr() == null) {
            return false;
        }
        int n = 0;
        if (this.bQr().bLb() == dbt) {
            n = 33777;
        } else if (this.bQr().bLb() == dbu) {
            n = 33778;
        } else if (this.bQr().bLb() == dbv) {
            n = 33779;
        }
        gL.glBindTexture(3553, this.dby[0]);
        gL.glTexParameterf(3553, 10242, 10497.0f);
        gL.glTexParameterf(3553, 10243, 10497.0f);
        gL.glTexParameterf(3553, 10240, 9729.0f);
        gL.glTexParameterf(3553, 10241, 9729.0f);
        for (int i = 0; i < this.bQq(); ++i) {
            axj_2 axj_22 = this.ve(i);
            if (axj_22 == null) {
                return false;
            }
            byte[] byArray = axj_22.aKU();
            if (byArray == null) {
                return false;
            }
            int n2 = byArray.length;
            ByteBuffer byteBuffer = Buffers.newDirectByteBuffer((int)n2);
            byteBuffer.put(byArray, 0, n2);
            byteBuffer.rewind();
            if (this.aPj()) {
                gL.glCompressedTexImage2D(3553, i, n, GC.mV(axj_22.getWidth()), GC.mV(axj_22.getHeight()), 0, byArray.length, (Buffer)byteBuffer);
                continue;
            }
            gL.glTexImage2D(3553, i, 32856, GC.mV(axj_22.getWidth()), GC.mV(axj_22.getHeight()), 0, ati_2.a(axj_22), 5121, (Buffer)byteBuffer);
        }
        this.aCx = true;
        this.cSL = false;
        return true;
    }

    private static int a(axj_2 axj_22) {
        if (axj_22.bPK() == 1) {
            return 6407;
        }
        if (axj_22.bPK() == 17) {
            return 6408;
        }
        if (axj_22.bPK() == 18) {
            return 32993;
        }
        if (axj_22.bPK() == 2) {
            return 32992;
        }
        return 6408;
    }

    @Override
    public void f(GL2 gL2) {
        if (!this.bPe()) {
            this.b((GL)gL2);
        }
        this.bLd();
        ava_2 ava_22 = ava_2.bMH();
        ava_22.db(true);
        ava_22.h(gL2);
        gL2.glBindTexture(3553, this.dby[0]);
        ava_22.a(this.dmC);
        ava_22.h(gL2);
    }

    private boolean d(GL gL) {
        boolean bl;
        gL.glGenFramebuffers(1, this.dby, 3);
        gL.glGenTextures(1, this.dby, 0);
        gL.glGenRenderbuffers(1, this.dby, 2);
        gL.glBindFramebuffer(36160, this.dby[3]);
        gL.glBindTexture(3553, this.dby[0]);
        gL.glTexParameteri(3553, 10242, 33071);
        gL.glTexParameteri(3553, 10243, 33071);
        axj_2 axj_22 = this.ve(0);
        if (axj_22 == null) {
            return false;
        }
        int n = axj_22.getWidth();
        int n2 = axj_22.getHeight();
        if (this.dmG) {
            gL.glTexParameterf(3553, 10240, 9729.0f);
            gL.glTexParameterf(3553, 10241, 9987.0f);
            gL.glTexImage2D(3553, 0, 32856, n, n2, 0, ati_2.a(axj_22), 5121, null);
            gL.glGenerateMipmap(3553);
        } else {
            gL.glTexParameteri(3553, 10240, 9729);
            gL.glTexParameteri(3553, 10241, 9729);
            gL.glTexParameteri(3553, 34891, 6409);
            gL.glTexImage2D(3553, 0, 32856, n, n2, 0, ati_2.a(axj_22), 5121, null);
        }
        gL.glFramebufferTexture2D(36160, 36064, 3553, this.dby[0], 0);
        gL.glBindRenderbuffer(36161, this.dby[2]);
        gL.glRenderbufferStorage(36161, 35056, n, n2);
        gL.glFramebufferRenderbuffer(36160, 36096, 36161, this.dby[2]);
        gL.glFramebufferRenderbuffer(36160, 36128, 36161, this.dby[2]);
        int n3 = gL.glCheckFramebufferStatus(36160);
        gL.glBindFramebuffer(36160, 0);
        this.aCx = bl = n3 == 36053;
        this.cSL = false;
        return bl;
    }

    private boolean e(GL gL) {
        if (this.doz != null) {
            if (this.doz.bQR()) {
                this.bQx();
            } else if (this.doz.bQS()) {
                this.doz = null;
            } else {
                return false;
            }
        }
        gL.glPixelStorei(3317, 1);
        gL.glGenTextures(1, this.dby, 0);
        if (this.dby[0] == 0) {
            dbs.error((Object)"Unable to generate a new texture");
            return false;
        }
        boolean bl = this.c(gL);
        if (bl && !this.dmD) {
            if (this.dmE) {
                this.vg(25);
            }
            this.bPf();
        }
        return bl;
    }

    public void f(GL gL) {
        if (!this.bPe()) {
            this.b(gL);
        }
        gL.glBindTexture(3553, this.dby[0]);
        this.bLd();
    }

    public void bLd() {
        int n = this.bSW();
        if (n > this.dmH) {
            this.dmH = n;
        }
    }

    @Override
    public void g(GL gL) {
        if (!this.bPd()) {
            return;
        }
        this.dmB = false;
        gL.glBindTexture(3553, 0);
    }

    @Override
    public void h(art_1 art_12) {
    }

    @Override
    public void i(art_1 art_12) {
    }

    @Override
    protected void bLe() {
        assert (Threading.isOpenGLThread()) : "Trying to release a texture in a non-opengl thread";
        assert (this.dmJ == awl_1.dmP || this.dmJ == awl_1.dmM);
        super.bLe();
        GL2 gL2 = aru_2.cVG.bIv().bIq();
        gL2.glDeleteTextures(1, this.dby, 0);
        if (this.dmF) {
            gL2.glDeleteFramebuffers(1, this.dby, 3);
            gL2.glDeleteRenderbuffers(1, this.dby, 2);
        }
        this.aCx = false;
        this.dmH = 0;
        this.dmJ = awl_1.dmQ;
    }

    @Override
    public boolean aPj() {
        return this.bQr().bLb() == dbt || this.bQr().bLb() == dbu || this.bQr().bLb() == dbv;
    }

    private void aPg() {
        if (this.dmF) {
            this.dby = new int[4];
            this.dby[1] = 0;
            this.dby[2] = 0;
            this.dby[3] = 0;
        } else {
            this.dby = new int[1];
        }
        this.dby[0] = 0;
        this.aCx = false;
        if (!avh_2.dhF.a(avg_2.dho)) {
            int n = this.bQs().bWx();
            int n2 = this.bQs().bWy();
            int n3 = GC.mV(n);
            int n4 = GC.mV(n2);
            if (n3 != n || n4 != n2) {
                this.bQu();
            }
        }
        this.dmJ = awl_1.dmM;
    }

    public static void a(GL gL, int n, int n2, int[] nArray, boolean bl) {
        gL.glGenTextures(1, nArray, 0);
        gL.glBindTexture(3553, nArray[0]);
        gL.glTexImage2D(3553, 0, 32856, n, n2, 0, 6408, 5121, (Buffer)ByteBuffer.allocateDirect(n * n2 * 4));
        gL.glTexParameterf(3553, 10242, 33071.0f);
        gL.glTexParameterf(3553, 10243, 33071.0f);
        gL.glTexParameterf(3553, 10240, bl ? 9729.0f : 9728.0f);
        gL.glTexParameterf(3553, 10241, bl ? 9729.0f : 9728.0f);
    }

    public String toString() {
        return this.aCH;
    }
}

