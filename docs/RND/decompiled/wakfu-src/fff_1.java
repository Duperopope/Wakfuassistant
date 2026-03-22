/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;

/*
 * Renamed from fFF
 */
public class fff_1 {
    private fff_1() {
    }

    private static int a(float[] fArray, axb_2 axb_22, float f2, float f3, aso_1 aso_12, boolean bl, Entity3D entity3D) {
        int n;
        GLGeometryMesh gLGeometryMesh = (GLGeometryMesh)GLGeometryMesh.dbh.bSK();
        int n2 = fArray.length / 2;
        VertexBufferPCT vertexBufferPCT = VertexBufferPCT.cWa.uf(n2);
        arq_2 arq_22 = arq_2.cVv;
        vertexBufferPCT.ud(n2);
        vertexBufferPCT.E(fArray);
        int n3 = vertexBufferPCT.bIF();
        for (n = 0; n < n3; ++n) {
            vertexBufferPCT.a(n, axb_22.aIU(), axb_22.aIV(), axb_22.aIW(), axb_22.aIX());
        }
        gLGeometryMesh.a(aso_12, vertexBufferPCT, arq_22);
        gLGeometryMesh.cN(f3);
        gLGeometryMesh.cR(bl);
        n = entity3D.b(gLGeometryMesh);
        vertexBufferPCT.bsI();
        gLGeometryMesh.bsI();
        return n;
    }

    public static void a(int n, int n2, int n3, int n4, awg_1 awg_12, axb_2 axb_22, Entity3D entity3D) {
        if (n3 == 0 || n4 == 0) {
            return;
        }
        GeometrySprite geometrySprite = fff_1.a(n, n2, n3, n4, axb_22);
        awk_1 awk_12 = fff_1.a(awg_12, geometrySprite);
        entity3D.a(geometrySprite, awk_12, null);
        geometrySprite.bsI();
    }

    public static void a(int n, int n2, int n3, int n4, awg_1 awg_12, axb_2 axb_22, EntitySprite entitySprite) {
        if (n3 == 0 || n4 == 0) {
            return;
        }
        GeometrySprite geometrySprite = fff_1.a(n, n2, n3, n4, axb_22);
        awk_1 awk_12 = fff_1.a(awg_12, geometrySprite);
        entitySprite.setTexture(awk_12);
        entitySprite.a(geometrySprite);
        geometrySprite.bsI();
    }

    public static void a(int n, int n2, awk_1 awk_12, axb_2 axb_22, EntitySprite entitySprite) {
        awg_1 awg_12 = new awg_1(awk_12);
        GeometrySprite geometrySprite = fff_1.a(n, n2, awg_12.getWidth(), awg_12.getHeight(), axb_22);
        fff_1.a(awg_12, geometrySprite);
        entitySprite.setTexture(awk_12);
        entitySprite.a(geometrySprite);
        geometrySprite.bsI();
    }

    private static awk_1 a(awg_1 awg_12, GeometrySprite geometrySprite) {
        if (awg_12 == null) {
            return null;
        }
        geometrySprite.a(awg_12.aKp(), awg_12.aKq(), awg_12.aKr(), awg_12.aKs(), awg_12.getRotation());
        return awg_12.bHg();
    }

    public static GeometrySprite a(int n, int n2, int n3, int n4, axb_2 axb_22) {
        GeometrySprite geometrySprite = (GeometrySprite)GLGeometrySprite.dbk.bSK();
        geometrySprite.f(n2, n, n3, n4);
        geometrySprite.c(axb_22.aIU(), axb_22.aIV(), axb_22.aIW(), axb_22.aIX());
        return geometrySprite;
    }
}

