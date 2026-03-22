/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.jogamp.opengl.GL;
import org.apache.log4j.Logger;

/*
 * Renamed from asa
 */
public abstract class asa_2
extends arz_2 {
    protected static final Logger cWw = Logger.getLogger(asa_2.class);
    protected static final long cWx = 500000000L;
    protected static final float cWy = -512.0f;
    protected static final float cWz = -512.0f;
    protected static final float cWA = 1024.0f;
    protected static final float cWB = 1024.0f;
    protected VertexBufferPCT cdJ;

    @Override
    public void aPg() {
        super.aPg();
        this.cdJ = VertexBufferPCT.cWa.uf(4);
        this.c(this.cdJ);
    }

    @Override
    public void bmX() {
        this.cdJ.bsI();
        super.bmX();
    }

    private void c(VertexBufferPCT vertexBufferPCT) {
        int n = 0;
        float[] fArray = new float[8];
        fArray[n++] = -512.0f;
        fArray[n++] = 512.0f;
        fArray[n++] = -512.0f;
        fArray[n++] = -512.0f;
        fArray[n++] = 512.0f;
        fArray[n++] = -512.0f;
        fArray[n++] = 512.0f;
        fArray[n++] = 512.0f;
        vertexBufferPCT.E(fArray);
        int n2 = 0;
        float[] fArray2 = new float[8];
        fArray2[n2++] = 0.0f;
        fArray2[n2++] = 0.0f;
        fArray2[n2++] = 0.0f;
        fArray2[n2++] = 1.0f;
        fArray2[n2++] = 1.0f;
        fArray2[n2++] = 1.0f;
        fArray2[n2++] = 1.0f;
        fArray2[n2++] = 0.0f;
        vertexBufferPCT.H(fArray2);
        float[] fArray3 = new float[16];
        for (int i = 0; i < 16; ++i) {
            fArray3[i] = GC.aNJ();
        }
        vertexBufferPCT.G(fArray3);
    }

    protected void bIQ() {
        float f2 = 512.0f;
        float f3 = 512.0f;
        ava_2.bMH().a((GL)this.cWv, 0, 0, 1024, 1024);
        this.cWv.glOrtho(-512.0, 512.0, -512.0, 512.0, 0.0, 65535.0);
        ava_2.bMH().a(this.cWv, auy_2.dfW);
    }
}

