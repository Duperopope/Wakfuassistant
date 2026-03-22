/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;

/*
 * Renamed from ash
 */
public class ash_2 {
    private VertexBufferPCT cdJ = null;
    private ati_2 cXv;
    private Entity3D bRE;
    private int cXw;
    private auw_2 bVo;
    private auw_2 bVp;

    public ash_2(auw_2 auw_22, auw_2 auw_23) {
        this.b(auw_22, auw_23);
    }

    public ash_2() {
        this(auw_2.dfL, auw_2.dfM);
    }

    public final void b(auw_2 auw_22, auw_2 auw_23) {
        this.bVo = auw_22;
        this.bVp = auw_23;
    }

    public final void bJq() {
        if (this.cdJ != null) {
            this.cdJ.bsI();
            this.cdJ = null;
        }
    }

    public final void a(Entity3D entity3D, int n) {
        int n2 = n * 4;
        this.cXw = n;
        if (this.cdJ != null && this.cdJ.bIG() != n2) {
            this.cdJ.bsI();
            this.cdJ = null;
        }
        if (this.cdJ == null) {
            this.cdJ = VertexBufferPCT.cWa.uf(n2);
        }
        this.cdJ.bII();
        this.bRE = entity3D;
    }

    public final void bJr() {
        this.bJs();
        this.bRE = null;
        this.cXv = null;
    }

    private void bJs() {
        assert (this.cdJ != null);
        assert (this.bRE != null);
        if (this.cdJ.bIF() != 0) {
            GLGeometryMesh gLGeometryMesh = (GLGeometryMesh)GLGeometryMesh.dbh.bSK();
            gLGeometryMesh.c(this.bVo, this.bVp);
            gLGeometryMesh.a(aso_1.cZT, this.cdJ, arq_2.cVv);
            this.bRE.a(gLGeometryMesh, this.cXv, null);
            gLGeometryMesh.bsI();
        }
    }

    public final void a(int n, int n2, int n3, int n4, awg_1 awg_12, float f2, float f3, float f4, float f5, axb_2 axb_22) {
        assert (n3 != 0 && n4 != 0);
        assert (awg_12 != null);
        assert (this.cdJ.bIF() + 4 <= this.cdJ.bIG());
        if (this.cXv != null && this.cXv != awg_12.bHg()) {
            this.bJs();
            this.cdJ.bsI();
            this.cdJ = VertexBufferPCT.cWa.uf(this.cXw * 4);
        }
        GeometrySprite.b(this.cdJ, n2, n, n3, n4);
        if (axb_22 != null) {
            GeometrySprite.a(this.cdJ, axb_22.aIU(), axb_22.aIV(), axb_22.aIW(), axb_22.aIX());
        } else {
            GeometrySprite.a(this.cdJ, 1.0f, 1.0f, 1.0f, 1.0f);
        }
        GeometrySprite.a(this.cdJ, f2, f3, f4, f5, awg_12.getRotation());
        this.cXv = (ati_2)awg_12.bHg();
        --this.cXw;
        this.cdJ.ud(4 + this.cdJ.bIF());
    }

    public final void a(int n, int n2, int n3, int n4, awg_1 awg_12, axb_2 axb_22) {
        if (awg_12 == null) {
            --this.cXw;
            return;
        }
        this.a(n, n2, n3, n4, awg_12, awg_12.aKp(), awg_12.aKq(), awg_12.aKr(), awg_12.aKs(), axb_22);
    }
}

