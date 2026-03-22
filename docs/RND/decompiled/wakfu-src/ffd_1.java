/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;

/*
 * Renamed from fFD
 */
public class ffd_1
extends ffc_1 {
    @Override
    protected void c(VertexBufferPCT vertexBufferPCT, int n) {
        vertexBufferPCT.ud(n);
        if (this.tEC != null) {
            boolean bl = false;
            for (int i = 0; i < n; ++i) {
                float f2 = 1.0f - Math.abs(((float)n / 2.0f - (float)i) / ((float)n / 2.0f));
                boolean bl2 = i % 4 < 2;
                bl = !bl;
                float f3 = bl2 ? this.tEC.aKs() : this.tEC.aKq();
                float f4 = bl ? this.tEC.aKp() : this.tEC.aKr();
                vertexBufferPCT.b(i, f3, f4);
                vertexBufferPCT.a(i, 1.0f, 1.0f, 1.0f, f2);
            }
        }
    }

    @Override
    public void aVI() {
        super.aVI();
        this.setInnerRadiusFactor(0.95f);
    }
}

