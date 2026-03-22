/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;

/*
 * Renamed from agD
 */
final class agd_0
extends agb_0 {
    static final /* synthetic */ boolean cur;

    @Override
    public void a(Entity3D entity3D, byte by, float f2, float f3, float f4, float f5) {
        if (!cur && entity3D.bJf() != 1) {
            throw new AssertionError();
        }
        GeometryMesh geometryMesh = (GeometryMesh)entity3D.uh(0);
        VertexBufferPCT vertexBufferPCT = geometryMesh.bKd();
        float f6 = GC.mV((int)(f4 * 2.0f));
        float f7 = GC.mV((int)(f5 * 2.0f));
        if (by != 0) {
            float f8 = f4 * 2.0f / f6;
            float f9 = f5 * 2.0f / f7;
            float f10 = 1.0f;
            agb_0.cuo[0] = -f3;
            agb_0.cuo[1] = -1.0f * f5 + ((by & 1) == 1 ? f2 : 0.0f);
            agb_0.cuo[2] = 0.0f;
            agb_0.cuo[3] = -1.0f * f5 + f3 * 0.5f + ((by & 2) == 2 ? f2 : 0.0f);
            agb_0.cuo[4] = f3;
            agb_0.cuo[5] = -1.0f * f5 + ((by & 4) == 4 ? f2 : 0.0f);
            agb_0.cuo[6] = 0.0f;
            agb_0.cuo[7] = -1.0f * f5 + -f3 * 0.5f + ((by & 8) == 8 ? f2 : 0.0f);
            vertexBufferPCT.E(agb_0.cuo);
            vertexBufferPCT.b(0, 0.5f * f8, 0.0f);
            vertexBufferPCT.b(1, 1.0f * f8, 0.5f * f9);
            vertexBufferPCT.b(2, 0.5f * f8, 1.0f * f9);
            vertexBufferPCT.b(3, 0.0f, 0.5f * f9);
        } else {
            agb_0.cuo[0] = -f4;
            agb_0.cuo[1] = f5;
            agb_0.cuo[2] = -f4;
            agb_0.cuo[3] = -f5;
            agb_0.cuo[4] = f4;
            agb_0.cuo[5] = -f5;
            agb_0.cuo[6] = f4;
            agb_0.cuo[7] = f5;
            vertexBufferPCT.E(agb_0.cuo);
        }
    }

    static {
        cur = !agb_0.class.desiredAssertionStatus();
    }
}

