/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import java.awt.Insets;
import java.util.ArrayList;

/*
 * Renamed from fFU
 */
public final class ffu_1 {
    private axb_2 ncL = null;
    private final ArrayList<fsv_1> urC = new ArrayList();
    private final ArrayList<fth_1> urD = new ArrayList();
    private int bap = 0;
    private int baq = 0;
    private int tWe = 0;
    private int tWf = 0;
    private final boolean urE = false;
    private Entity3D cnV;
    private EntityGroup bVe;
    private EntityGroup urF;

    public final int gwY() {
        return this.bap;
    }

    public final void abc(int n) {
        this.bap = n;
    }

    public final int gwZ() {
        return this.baq;
    }

    public final void abd(int n) {
        this.baq = n;
    }

    public final int gxa() {
        return this.tWf;
    }

    public final void abe(int n) {
        this.tWf = n;
    }

    public final int gxb() {
        return this.tWe;
    }

    public final void abf(int n) {
        this.tWe = n;
    }

    public void a(fsv_1 fsv_12) {
        this.urC.add(fsv_12);
        this.c(fsv_12);
    }

    public void a(fth_1 fth_12) {
        this.urD.add(fth_12);
        this.b(fth_12);
    }

    public void b(fsv_1 fsv_12) {
        int n = this.urC.indexOf(fsv_12);
        this.urC.remove(n);
        this.cnV.c(this.cnV.uh(n));
    }

    public final boolean gxc() {
        return false;
    }

    public final void B(axb_2 axb_22) {
        if (axb_22 == this.ncL) {
            return;
        }
        if (axb_22 != null) {
            this.cnV.c(axb_22.aIU(), axb_22.aIV(), axb_22.aIW(), axb_22.aIX());
        } else {
            this.cnV.c(1.0f, 1.0f, 1.0f, 1.0f);
        }
        this.ncL = axb_22;
    }

    public final axb_2 gxd() {
        return this.ncL;
    }

    public void clear() {
        for (int i = this.cnV.bJf() - 1; i >= 0; --i) {
            this.cnV.c(this.cnV.uh(0));
        }
        this.urC.clear();
        this.urD.clear();
    }

    public void a(fsm_1 fsm_12, Insets insets, Insets insets2, Insets insets3) {
        Object object;
        int n;
        int n2;
        this.bVe.setVisible(true);
        this.cnV.setVisible(true);
        this.urF.setVisible(true);
        int n3 = insets.left + insets2.left + insets3.left;
        int n4 = insets.bottom + insets2.bottom + insets3.bottom;
        this.bVe.bIS().d(0, this.bap, this.baq);
        if (this.ncL != null) {
            this.cnV.c(this.ncL.aIU(), this.ncL.aIV(), this.ncL.aIW(), this.ncL.aIX());
            n2 = this.urD.size();
            for (n = 0; n < n2; ++n) {
                this.urD.get(n).gGD().q(this.ncL.aIU() * this.ncL.aIX(), this.ncL.aIV() * this.ncL.aIX(), this.ncL.aIW() * this.ncL.aIX(), this.ncL.aIX());
            }
        } else {
            this.cnV.c(1.0f, 1.0f, 1.0f, 1.0f);
            n2 = this.urD.size();
            for (n = 0; n < n2; ++n) {
                this.urD.get(n).gGD().q(1.0f, 1.0f, 1.0f, 1.0f);
            }
        }
        n2 = this.urC.size();
        for (n = 0; n < n2; ++n) {
            object = this.urC.get(n);
            int n5 = ((fsv_1)object).getX() * this.tWe + n3;
            int n6 = ((fsv_1)object).getY() * this.tWf + n4 + fsm_12.height;
            GeometrySprite geometrySprite = (GeometrySprite)this.cnV.uh(n);
            geometrySprite.ba(n6, n5);
        }
        n2 = this.urD.size();
        for (n = 0; n < n2; ++n) {
            object = this.urD.get(n);
            GeometryMesh geometryMesh = (GeometryMesh)this.cnV.uh(n + this.urC.size());
            this.a(geometryMesh.bKd(), (fth_1)object);
        }
    }

    public final void gxe() {
        this.urC.clear();
        this.urD.clear();
        this.ncL = null;
        this.cnV.bsI();
        this.cnV = null;
    }

    private void c(fsv_1 fsv_12) {
        GeometrySprite geometrySprite = (GeometrySprite)GLGeometrySprite.dbk.bSK();
        awg_1 awg_12 = fsv_12.getPixmap();
        geometrySprite.o(awg_12.aKp(), awg_12.aKq(), awg_12.aKr(), awg_12.aKs());
        geometrySprite.cb(awg_12.getWidth(), awg_12.getHeight());
        this.cnV.a(geometrySprite, awg_12.bHg(), null);
        geometrySprite.bsI();
    }

    private void a(VertexBufferPCT vertexBufferPCT, fth_1 fth_12) {
        float[] fArray = new float[]{fth_12.getX(), fth_12.getY(), fth_12.getX() + fth_12.getWidth(), fth_12.getY(), fth_12.getX() + fth_12.getWidth(), fth_12.getY(), fth_12.getX() + fth_12.getWidth(), fth_12.getY() + fth_12.getHeight(), fth_12.getX() + fth_12.getWidth(), fth_12.getY() + fth_12.getHeight(), fth_12.getX(), fth_12.getY() + fth_12.getHeight(), fth_12.getX(), fth_12.getY() + fth_12.getHeight(), fth_12.getX(), fth_12.getY()};
        vertexBufferPCT.E(fArray);
    }

    private void b(fth_1 fth_12) {
        GeometryMesh geometryMesh = (GeometryMesh)GLGeometryMesh.dbh.bSK();
        int n = 16;
        VertexBufferPCT vertexBufferPCT = VertexBufferPCT.cWa.uf(16);
        arq_2 arq_22 = arq_2.cVv;
        vertexBufferPCT.ud(16);
        int n2 = vertexBufferPCT.bIF();
        for (int i = 0; i < n2; ++i) {
            vertexBufferPCT.a(i, 1.0f, 1.0f, 1.0f, 1.0f);
        }
        geometryMesh.a(aso_1.cZO, vertexBufferPCT, arq_22);
        this.cnV.b(geometryMesh);
        geometryMesh.bsI();
        vertexBufferPCT.bsI();
    }

    public final void gxf() {
        assert (this.cnV == null);
        this.bVe = (EntityGroup)EntityGroup.cXh.bSK();
        this.bVe.cWR = this;
        this.bVe.bIS().a(new awp_1());
        this.cnV = (Entity3D)Entity3D.cXb.bSK();
        this.urF = (EntityGroup)EntityGroup.cXh.bSK();
        this.urF.cWR = this;
        this.bVe.g(this.cnV);
        this.bVe.g(this.urF);
    }

    public final EntityGroup gxg() {
        return this.bVe;
    }

    public EntityGroup gxh() {
        return this.urF;
    }
}

