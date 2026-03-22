/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import org.apache.log4j.Logger;

/*
 * Renamed from auE
 */
public class aue_2
implements aua_2 {
    private static final Logger deO = Logger.getLogger(aue_2.class);
    private static final aue_2 deP = new aue_2();

    public static aue_2 bMt() {
        return deP;
    }

    private aue_2() {
    }

    @Override
    public void a(VertexBufferPCT vertexBufferPCT, float[] fArray, int n) {
        vertexBufferPCT.c(fArray, n);
    }

    @Override
    public void U(float[] fArray) {
    }
}

