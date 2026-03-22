/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TFloatArrayList
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import gnu.trove.list.array.TFloatArrayList;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.ArrayList;

/*
 * Renamed from fFH
 */
public final class ffh_1 {
    private static final short uqM = 21845;
    private EntityGroup bVe;
    private Entity3D uqN;
    private Entity3D uqO;
    private Entity3D uqP;
    private ash_2 uqQ;
    private ash_2 uqR;
    private ash_2 uqS;
    private axb_2 ncL = null;
    private int uqT = 0;
    private int brs;
    private int brt;
    private fbs_1 uqU = null;

    public void clear() {
        this.uqU = null;
    }

    public void a(fbs_1 fbs_12) {
        this.uqU = fbs_12;
    }

    public int getHeight() {
        return this.brt;
    }

    public void setHeight(int n) {
        this.brt = n;
    }

    public int getWidth() {
        return this.brs;
    }

    public void setWidth(int n) {
        this.brs = n;
    }

    public void setCellWidth(int n) {
        this.uqT = n;
    }

    public void setModulationColor(axb_2 axb_22) {
        if (this.ncL == axb_22) {
            return;
        }
        this.ncL = axb_22;
    }

    public axb_2 getModulationColor() {
        return this.ncL;
    }

    static int gQ(int n, int n2) {
        return n / 2 + ffh_1.gR(n, n2);
    }

    private static int gR(int n, int n2) {
        return n * n2;
    }

    private float gwE() {
        return this.uqU != null ? -this.uqU.gsW() : 0.0f;
    }

    private float gwF() {
        if (this.uqU == null) {
            return 1.0f;
        }
        return (float)this.brt / (this.uqU.gsX() - this.uqU.gsW());
    }

    public float[] gwG() {
        int n;
        int n2 = this.uqU != null ? (int)this.uqU.gsW() : 0;
        int n3 = this.uqU != null ? (int)this.uqU.gsX() : 0;
        int n4 = n2 / 5 * 5;
        int n5 = n3 / 5 * 5;
        int n6 = (n5 - n4) / 5 + 1;
        TFloatArrayList tFloatArrayList = new TFloatArrayList();
        for (n = 0; n < n6; ++n) {
            float f2 = n4 + 5 * n;
            tFloatArrayList.add(0.0f);
            tFloatArrayList.add(f2);
            tFloatArrayList.add((float)this.brs);
            tFloatArrayList.add(f2);
        }
        if (this.uqU != null) {
            int n7 = this.uqU.gsY().size();
            for (n = 0; n < n7; ++n) {
                float f3 = this.uqT * n;
                tFloatArrayList.add(f3);
                tFloatArrayList.add((float)n2);
                tFloatArrayList.add(f3);
                tFloatArrayList.add((float)n3);
            }
        }
        return tFloatArrayList.toArray();
    }

    public void a(Dimension dimension, Insets insets, Insets insets2, Insets insets3) {
        Object object;
        Object object2;
        axb_2 axb_22;
        int n = insets.left + insets2.left + insets3.left;
        int n2 = insets.bottom + insets2.bottom + insets3.bottom;
        this.brs = dimension.width - n;
        this.brt = dimension.height - n2;
        this.uqN.clear();
        this.uqP.clear();
        this.uqO.clear();
        awp_1 awp_12 = (awp_1)this.uqP.bIS().uW(0);
        awp_12.B(1.0f, this.gwF(), 1.0f);
        awp_12.A(n, this.gwE() * this.gwF() + (float)n2, 0.0f);
        this.uqP.bIS().b(0, awp_12);
        awp_12 = (awp_1)this.uqO.bIS().uW(0);
        awp_12.B(1.0f, this.gwF(), 1.0f);
        awp_12.A(n, this.gwE() * this.gwF() + (float)n2, 0.0f);
        this.uqO.bIS().b(0, awp_12);
        axb_2 axb_23 = axb_22 = this.ncL == null ? awx_2.dnF : this.ncL;
        if (this.uqU != null) {
            object2 = this.uqU.gsY();
            int n3 = ((ArrayList)object2).size();
            for (int i = 0; i < n3; ++i) {
                ffm_1 ffm_12 = (ffm_1)((ArrayList)object2).get(i);
                awg_1 awg_12 = ffm_12.gwI();
                Object object3 = object = ffm_12.getModulationColor() != null ? awx_2.a(ffm_12.getModulationColor(), axb_22) : axb_22;
                if (awg_12 != null) {
                    this.b(n + ffh_1.gR(this.uqT, i), n2 + this.brt, this.uqT, this.brt, awg_12, (axb_2)object);
                    continue;
                }
                this.b(n + ffh_1.gR(this.uqT, i), n2 + this.brt, this.uqT, this.brt, (axb_2)object);
            }
        }
        object2 = this.gwG();
        int[] nArray = new int[((float[])object2).length / 2];
        this.a((float[])object2, new axb_2[]{new awx_2(0.0f, 0.0f, 0.0f, 0.5f)}, nArray, 1.0f, aso_1.cZO, this.uqO);
        if (this.uqU != null) {
            ArrayList<ffo_1> arrayList = this.uqU.gta();
            int n4 = arrayList.size();
            for (int i = 0; i < n4; ++i) {
                object = arrayList.get(i);
                this.a(((ffo_1)object).aaZ(this.uqT), ((ffo_1)object).gwJ(), ((ffo_1)object).gwL(), 1.0f, aso_1.cZR, this.uqP);
            }
            ArrayList<ffn_1> arrayList2 = this.uqU.gsZ();
            int n5 = arrayList2.size();
            for (n4 = 0; n4 < n5; ++n4) {
                ffn_1 ffn_12 = arrayList2.get(n4);
                this.a(ffn_12.aaZ(this.uqT), ffn_12.gwJ(), ffn_12.gwL(), 2.0f, aso_1.cZP, this.uqP);
                this.a(ffn_12.aaZ(this.uqT), ffn_12.gwJ(), ffn_12.gwL(), 2.0f, aso_1.cZN, this.uqP);
            }
        }
    }

    public void aVH() {
        this.bVe.bsI();
        this.bVe = null;
        this.uqN.bsI();
        this.uqN = null;
        this.uqO.bsI();
        this.uqO = null;
        this.uqP.bsI();
        this.uqP = null;
        this.ncL = null;
        this.uqU = null;
    }

    public void aVI() {
        assert (this.bVe == null);
        assert (this.uqO == null);
        assert (this.uqP == null);
        this.bVe = (EntityGroup)EntityGroup.cXh.bSK();
        this.bVe.cWR = this;
        this.uqN = (Entity3D)Entity3D.cXb.bSK();
        this.uqO = (Entity3D)Entity3D.cXb.bSK();
        this.uqP = (Entity3D)Entity3D.cXb.bSK();
        this.bVe.g(this.uqN);
        this.bVe.g(this.uqO);
        this.bVe.g(this.uqP);
        this.uqO.a(new ffi_1(this));
        this.uqO.b(new ffj_1(this));
        this.uqP.a(new ffk_1(this));
        this.uqP.b(new ffl_1(this));
        this.uqP.bIS().a(new awp_1());
        this.uqO.bIS().a(new awp_1());
    }

    public final Entity gwH() {
        return this.bVe;
    }

    private int a(float[] fArray, axb_2[] axb_2Array, int[] nArray, float f2, aso_1 aso_12, Entity3D entity3D) {
        int n;
        GLGeometryMesh gLGeometryMesh = (GLGeometryMesh)GLGeometryMesh.dbh.bSK();
        int n2 = fArray.length / 2;
        VertexBufferPCT vertexBufferPCT = VertexBufferPCT.cWa.ue(n2);
        arq_2 arq_22 = arq_2.cVv;
        vertexBufferPCT.ud(n2);
        vertexBufferPCT.E(fArray);
        int n3 = vertexBufferPCT.bIF();
        for (n = 0; n < n3; ++n) {
            axb_2 axb_22 = axb_2Array[nArray[n]];
            vertexBufferPCT.a(n, axb_22.aIU(), axb_22.aIV(), axb_22.aIW(), axb_22.aIX());
        }
        gLGeometryMesh.a(aso_12, vertexBufferPCT, arq_22);
        gLGeometryMesh.cN(f2);
        n = entity3D.b(gLGeometryMesh);
        gLGeometryMesh.bsI();
        vertexBufferPCT.bsI();
        return n;
    }

    private void b(int n, int n2, int n3, int n4, awg_1 awg_12, axb_2 axb_22) {
        if (n3 == 0 || n4 == 0) {
            return;
        }
        float f2 = 0.0f;
        GeometrySprite geometrySprite = (GeometrySprite)GLGeometrySprite.dbk.bSK();
        geometrySprite.f((float)n2 - (float)n4 / 2.0f, n - n3 / 2, n3, n4);
        geometrySprite.c(axb_22.aIU(), axb_22.aIV(), axb_22.aIW(), axb_22.aIX());
        awk_1 awk_12 = null;
        if (awg_12 != null) {
            geometrySprite.a(awg_12.aKp(), awg_12.aKq(), awg_12.aKr(), awg_12.aKs(), awg_12.getRotation());
            awk_12 = awg_12.bHg();
        }
        this.uqN.a(geometrySprite, awk_12, null);
        geometrySprite.bsI();
    }

    private void b(int n, int n2, int n3, int n4, axb_2 axb_22) {
        if (n3 == 0 || n4 == 0) {
            return;
        }
        GeometryMesh geometryMesh = (GeometryMesh)GLGeometryMesh.dbh.bSK();
        float[] fArray = new float[]{n, n2 - n4, n + n3, n2 - n4, n + n3, n2, n, n2};
        VertexBufferPCT vertexBufferPCT = VertexBufferPCT.cWa.uf(4);
        arq_2 arq_22 = arq_2.cVu;
        vertexBufferPCT.ud(4);
        vertexBufferPCT.E(fArray);
        int n5 = vertexBufferPCT.bIF();
        for (int i = 0; i < n5; ++i) {
            vertexBufferPCT.a(i, axb_22.aIU(), axb_22.aIV(), axb_22.aIW(), axb_22.aIX());
        }
        geometryMesh.a(aso_1.cZT, vertexBufferPCT, arq_22);
        vertexBufferPCT.bsI();
        this.uqN.b(geometryMesh);
        geometryMesh.bsI();
    }
}

