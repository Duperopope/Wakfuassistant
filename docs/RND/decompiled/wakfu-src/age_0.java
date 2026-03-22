/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;

/*
 * Renamed from agE
 */
final class age_0
extends agb_0 {
    static final /* synthetic */ boolean cus;

    @Override
    public void a(Entity3D entity3D, byte by, float f2, float f3, float f4, float f5) {
        if (!cus && entity3D.bJf() != 1) {
            throw new AssertionError();
        }
        GeometryMesh geometryMesh = (GeometryMesh)entity3D.uh(0);
        VertexBufferPCT vertexBufferPCT = geometryMesh.bKd();
        agb_0.cuo[0] = -f4;
        agb_0.cuo[1] = -f5;
        agb_0.cuo[2] = -f4;
        agb_0.cuo[3] = f5;
        agb_0.cuo[4] = f4;
        agb_0.cuo[5] = -f5;
        agb_0.cuo[6] = f4;
        agb_0.cuo[7] = f5;
        vertexBufferPCT.E(agb_0.cuo);
    }

    static {
        cus = !agb_0.class.desiredAssertionStatus();
    }
}

