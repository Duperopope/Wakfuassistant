/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import java.nio.FloatBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from auD
 */
public class aud_2
implements aua_2 {
    private static final Logger deL = Logger.getLogger(aud_2.class);
    private int deM;
    private VertexBufferPCT deN;
    private float[] cdM;

    @Override
    public void a(VertexBufferPCT vertexBufferPCT, float[] fArray, int n) {
        this.deN = vertexBufferPCT;
        this.deM = vertexBufferPCT.bIF() * 4;
        if (this.cdM == null || this.cdM.length != n) {
            this.cdM = new float[n];
        }
        System.arraycopy(fArray, 0, this.cdM, 0, n);
    }

    @Override
    public void U(float[] fArray) {
        if (this.cdM == null) {
            return;
        }
        float f2 = fArray[0];
        float f3 = fArray[1];
        float f4 = fArray[2];
        float f5 = 1.0f;
        int n = 0;
        int n2 = this.cdM.length / 4;
        for (int i = 0; i < n2; ++i) {
            int n3 = n++;
            this.cdM[n3] = this.cdM[n3] * f2;
            int n4 = n++;
            this.cdM[n4] = this.cdM[n4] * f3;
            int n5 = n++;
            this.cdM[n5] = this.cdM[n5] * f4;
            int n6 = n++;
            this.cdM[n6] = this.cdM[n6] * 1.0f;
        }
        FloatBuffer floatBuffer = this.deN.bIz();
        floatBuffer.position(this.deM);
        floatBuffer.put(this.cdM);
    }
}

