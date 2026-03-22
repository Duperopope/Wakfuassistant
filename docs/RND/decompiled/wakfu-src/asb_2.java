/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  org.apache.log4j.Logger
 */
import com.jogamp.opengl.GL;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from asb
 */
public class asb_2
extends arz_2 {
    protected static Logger oO = Logger.getLogger(asb_2.class);
    private static final int cWC = 1024;
    private static final int cWD = 1024;
    private static final int cWE = 2;
    private static final int cWF = 200;
    private final ByteBuffer[] cWG = new ByteBuffer[2];
    private final int[] cWH = new int[2];

    @Override
    public void aPg() {
        super.aPg();
        for (int i = 0; i < 2; ++i) {
            this.cWG[i] = ByteBuffer.allocate(0x400000);
            for (int j = 0; j < 0x100000; ++j) {
                this.cWG[i].putInt(Math.round(GC.aNJ() * 5.368709E8f));
            }
            this.cWG[i].rewind();
        }
        this.cWv.glEnable(3553);
        this.cWv.glGenTextures(2, this.cWH, 0);
    }

    @Override
    public void a(arx_2 arx_22) {
        long l = System.nanoTime();
        for (int i = 0; i < 200; ++i) {
            int n = i % 2;
            this.cWv.glBindTexture(3553, this.cWH[n]);
            this.cWv.glPixelStorei(3317, 1);
            this.a((GL)this.cWv, 32993, this.cWG[n]);
        }
        long l2 = System.nanoTime() - l;
        l = System.nanoTime();
        for (int i = 0; i < 200; ++i) {
            int n = i % 2;
            this.cWv.glBindTexture(3553, this.cWH[n]);
            this.cWv.glPixelStorei(3317, 1);
            this.a((GL)this.cWv, 6408, this.cWG[n]);
        }
        long l3 = System.nanoTime() - l;
        long l4 = 800L;
        if (l2 < l3) {
            arx_22.ug(32993);
        } else {
            arx_22.ug(6408);
        }
        arx_22.E(800.0 / ((double)l2 / 1.0E9));
        arx_22.D(800.0 / ((double)l3 / 1.0E9));
    }

    @Override
    public void bmX() {
        this.cWv.glDeleteTextures(2, this.cWH, 0);
        for (int i = 0; i < 2; ++i) {
            this.cWG[i] = null;
        }
        super.bmX();
    }

    private void a(GL gL, int n, ByteBuffer byteBuffer) {
        gL.glTexImage2D(3553, 0, 32856, 1024, 1024, 0, n, 5121, (Buffer)byteBuffer);
    }

    @Override
    public String getName() {
        return "GL bandwidth and texture format";
    }
}

