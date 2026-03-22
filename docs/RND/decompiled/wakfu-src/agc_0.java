/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;

/*
 * Renamed from agC
 */
final class agc_0
extends agb_0 {
    static final /* synthetic */ boolean cuq;

    @Override
    public void a(Entity3D entity3D, byte by, float f2, float f3, float f4, float f5) {
        if (!cuq && entity3D.bJf() != 1) {
            throw new AssertionError();
        }
        GeometryMesh geometryMesh = (GeometryMesh)entity3D.uh(0);
        VertexBufferPCT vertexBufferPCT = geometryMesh.bKd();
        agb_0.cuo[0] = -f3;
        agb_0.cuo[1] = (by & 1) == 1 ? f2 : 0.0f;
        agb_0.cuo[2] = 0.0f;
        agb_0.cuo[3] = f3 * 0.5f + ((by & 2) == 2 ? f2 : 0.0f);
        agb_0.cuo[4] = f3;
        agb_0.cuo[5] = (by & 4) == 4 ? f2 : 0.0f;
        agb_0.cuo[6] = 0.0f;
        agb_0.cuo[7] = -f3 * 0.5f + ((by & 8) == 8 ? f2 : 0.0f);
        vertexBufferPCT.E(agb_0.cuo);
    }

    static {
        cuq = !agb_0.class.desiredAssertionStatus();
    }
}

