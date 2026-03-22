/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import java.util.ArrayList;
import java.util.Comparator;
import org.apache.log4j.Logger;

/*
 * Renamed from fGe
 */
public class fge_1 {
    private static final Logger usj = Logger.getLogger(fge_1.class);
    private static final axb_2 usk = new awx_2(0.2f, 0.2f, 0.2f, 0.3f);
    private static final int usl = 86;
    private static final int usm = 43;
    private static final float usn = 0.06f;
    private static final float uso = 1.0f;
    private static final float usp = 0.5f;
    private static final float usq = 193.5f;
    private static final float usr = 387.0f;
    private static final Comparator<Entity> uss = new fgf_1();
    private float ust;
    private float usu;
    private final awp_1 usv = new awp_1();
    private final awp_1 usw = new awp_1();
    private final EntityGroup usx;
    private Entity3D usy;
    private Entity3D usz;
    private final fgg_1 usA = new fgg_1();
    private final fgg_1 usB = new fgg_1();
    private boolean ndM = false;
    private final aci_1 usC = new aci_1();

    public fge_1() {
        this.usx = (EntityGroup)EntityGroup.cXh.bSK();
        this.usx.cWR = this;
        this.usx.bIS().a(this.usv);
        this.usx.bIS().a(this.usw);
    }

    public void fS(float f2) {
        this.usB.setAlpha(f2);
    }

    public void fT(float f2) {
        this.usA.setAlpha(f2);
    }

    public void bM(float f2, float f3) {
        this.ust = f2;
        this.usu = f3;
    }

    public void setSize(int n, int n2) {
        this.usw.A((float)n * 0.5f, (float)n2 * 0.5f, 0.0f);
    }

    public void g(aci_1 aci_12) {
        this.usC.y(aci_12.cuQ, aci_12.cuR + 1, aci_12.cuS, aci_12.cuT + 1);
    }

    public EntityGroup getEntity() {
        this.getEntities(this.usx);
        return this.usx;
    }

    public void getEntities(EntityGroup entityGroup) {
        entityGroup.bJk();
        this.usA.sort(uss);
        this.usB.sort(uss);
        for (EntitySprite entitySprite : this.usA) {
            entityGroup.g(entitySprite);
        }
        for (EntitySprite entitySprite : this.usB) {
            entityGroup.g(entitySprite);
        }
        if (this.usz != null) {
            entityGroup.g(this.usz);
        }
        if (this.ndM) {
            entityGroup.g(this.usy);
        }
    }

    public EntitySprite a(acc_1 acc_12, acc_1 acc_13, awk_1 awk_12, axb_2 axb_22) {
        return this.a(acc_12, acc_13, this.ust, awk_12, axb_22, this.usA);
    }

    public EntitySprite b(acc_1 acc_12, acc_1 acc_13, awk_1 awk_12, axb_2 axb_22) {
        return this.a(acc_12, acc_13, this.usu, awk_12, axb_22, this.usB);
    }

    private EntitySprite a(acc_1 acc_12, acc_1 acc_13, float f2, awk_1 awk_12, axb_2 axb_22, ArrayList<EntitySprite> arrayList) {
        EntitySprite entitySprite = (EntitySprite)EntitySprite.cXk.bSK();
        entitySprite.a(ast_1.bJG().bJH(), asa_1.cYC, asa_1.cZh);
        entitySprite.cWN = acc_12.bWx();
        entitySprite.cWO = acc_12.bWy();
        entitySprite.cWM = acc_12.bWx() + acc_12.bWy();
        int n = acc_12.bWx() + acc_13.bWx();
        int n2 = acc_12.bWy() + acc_13.bWy();
        int n3 = GC.B((float)((n - n2) * 86) * 0.5f);
        int n4 = GC.B((float)(-(n + n2) * 43) * 0.5f);
        axj_2 axj_22 = awk_12.ve(0);
        short s = axj_22.bQG();
        short s2 = axj_22.bQH();
        fff_1.a(n3 + s, n4 + s2, awk_12, axb_22, entitySprite);
        GeometrySprite geometrySprite = entitySprite.bJm();
        geometrySprite.cb(GC.B((float)geometrySprite.bKr() / f2), GC.B((float)geometrySprite.bKs() / f2));
        geometrySprite.c(auw_2.dfI, auw_2.dfM);
        arrayList.add(entitySprite);
        return entitySprite;
    }

    public Entity3D a(acc_1 acc_12, axb_2 axb_22) {
        this.gxr();
        this.usz = (Entity3D)Entity3D.cXb.bSK();
        GLGeometryMesh gLGeometryMesh = (GLGeometryMesh)GLGeometryMesh.dbh.bSK();
        VertexBufferPCT vertexBufferPCT = VertexBufferPCT.cWa.uf(4);
        vertexBufferPCT.bIH();
        int n = GC.B((float)acc_12.bWx() / 2.0f) * 2;
        int n2 = GC.B((float)acc_12.bWy() / 2.0f) * 2;
        fge_1.a(vertexBufferPCT, n, n + 2, n2, n2, axb_22);
        fge_1.a(vertexBufferPCT, n + 2, n, n2 + 2, n2 + 2, axb_22);
        vertexBufferPCT.bIi();
        gLGeometryMesh.a(aso_1.cZT, vertexBufferPCT, arq_2.cVu);
        this.usz.b(gLGeometryMesh);
        gLGeometryMesh.bsI();
        return this.usz;
    }

    public void gxr() {
        if (this.usz != null) {
            this.usz.bsI();
            this.usz = null;
        }
    }

    public EntitySprite gT(int n, int n2) {
        return fge_1.e(n, n2, this.usA);
    }

    public EntitySprite gU(int n, int n2) {
        return fge_1.e(n, n2, this.usB);
    }

    public void j(Entity entity) {
        if (this.usB.remove(entity)) {
            entity.bsI();
            return;
        }
        if (this.usA.remove(entity)) {
            entity.bsI();
            return;
        }
    }

    private static EntitySprite e(int n, int n2, ArrayList<EntitySprite> arrayList) {
        EntitySprite entitySprite = fge_1.f(n, n2, arrayList);
        if (entitySprite != null) {
            arrayList.remove(entitySprite);
            entitySprite.bsI();
        }
        return entitySprite;
    }

    public EntitySprite gV(int n, int n2) {
        return fge_1.f(n, n2, this.usA);
    }

    public EntitySprite gW(int n, int n2) {
        return fge_1.f(n, n2, this.usB);
    }

    private static EntitySprite f(int n, int n2, ArrayList<EntitySprite> arrayList) {
        for (int i = 0; i < arrayList.size(); ++i) {
            EntitySprite entitySprite = arrayList.get(i);
            if (entitySprite.cWN != (float)n || entitySprite.cWO != (float)n2) continue;
            return entitySprite;
        }
        return null;
    }

    public EntitySprite gX(int n, int n2) {
        float f2 = (float)n - this.usw.bPz().aPY;
        float f3 = (float)n2 - this.usw.bPz().aPZ;
        f2 /= this.getZoomFactor();
        f3 /= this.getZoomFactor();
        f2 -= this.usv.bPz().aPY;
        f3 -= this.usv.bPz().aPZ;
        for (int i = this.usB.size() - 1; i >= 0; --i) {
            EntitySprite entitySprite = (EntitySprite)this.usB.get(i);
            GeometrySprite geometrySprite = entitySprite.bJm();
            if (f2 <= geometrySprite.bKl() || f2 >= geometrySprite.bKm() || geometrySprite.bKn() <= f3 || geometrySprite.bKo() >= f3) continue;
            awu_2 awu_22 = entitySprite.bHg().ve(0).bQL();
            float f4 = (f2 - geometrySprite.bKl()) * this.usu;
            float f5 = (float)entitySprite.bHg().ve(0).getHeight() - (geometrySprite.bKn() - f3) * this.usu;
            if (awu_22 != null && !awu_22.ci((int)f4, (int)f5)) continue;
            return entitySprite;
        }
        return null;
    }

    public void clear() {
        this.usA.clear();
        this.usB.clear();
        this.gxr();
        this.usx.bJk();
    }

    public void bpI() {
        this.clear();
        if (this.usy != null) {
            this.usy.bsI();
            this.usy = null;
        }
        this.ndM = false;
        this.usx.bsI();
    }

    public float bw(float f2, float f3) {
        float f4 = f2 - f3;
        return f4 * 86.0f * 2.0f;
    }

    public float bx(float f2, float f3) {
        float f4 = -(f2 + f3);
        return f4 * 43.0f * 2.0f;
    }

    public float getZoomFactor() {
        return this.usw.bPD().aPY;
    }

    public void cz(float f2) {
        float f3 = GC.b(f2, 0.06f, 1.0f);
        this.usw.B(f3, f3, 1.0f);
    }

    public void oN(boolean bl) {
        this.ndM = bl;
        if (this.usy == null) {
            int n;
            this.usy = (Entity3D)Entity3D.cXb.bSK();
            GLGeometryMesh gLGeometryMesh = (GLGeometryMesh)GLGeometryMesh.dbh.bSK();
            VertexBufferPCT vertexBufferPCT = VertexBufferPCT.cWa.uf(2 * (this.usC.bWJ() + this.usC.bWK()));
            vertexBufferPCT.bIH();
            for (n = this.usC.cuQ; n <= this.usC.cuR; ++n) {
                fge_1.a(vertexBufferPCT, n, n, this.usC.cuS, this.usC.cuT, usk);
            }
            for (n = this.usC.cuS; n <= this.usC.cuT; ++n) {
                fge_1.a(vertexBufferPCT, this.usC.cuQ, this.usC.cuR, n, n, usk);
            }
            vertexBufferPCT.bIi();
            gLGeometryMesh.a(aso_1.cZO, vertexBufferPCT, arq_2.cVv);
            this.usy.b(gLGeometryMesh);
            gLGeometryMesh.bsI();
        }
    }

    private static void a(VertexBufferPCT vertexBufferPCT, int n, int n2, int n3, int n4, axb_2 axb_22) {
        float f2 = n - n3;
        float f3 = n2 - n4;
        float f4 = -(n + n3);
        float f5 = -(n2 + n4);
        vertexBufferPCT.a(387.0f * f2, 193.5f * f4, 0.0f, 0.0f, axb_22.aIU(), axb_22.aIV(), axb_22.aIW(), axb_22.aIX());
        vertexBufferPCT.a(387.0f * f3, 193.5f * f5, 0.0f, 0.0f, axb_22.aIU(), axb_22.aIV(), axb_22.aIW(), axb_22.aIX());
    }

    public acc_1 getCellCoordFromMouse(int n, int n2) {
        float f2 = (float)n - this.usw.bPz().aPY;
        float f3 = (float)n2 - this.usw.bPz().aPZ;
        f2 /= this.getZoomFactor();
        f3 /= this.getZoomFactor();
        f2 -= this.usv.bPz().aPY;
        f3 -= this.usv.bPz().aPZ;
        f2 /= 86.0f;
        f3 /= 43.0f;
        return new acc_1(GC.B((f2 += 0.5f) - (f3 += 0.5f)), -GC.B(f2 + f3));
    }

    public aco_1 bN(float f2, float f3) {
        float f4 = f2 / 86.0f;
        float f5 = f3 / 43.0f;
        return new aco_1(-f4 + f5, f4 + f5);
    }

    public aco_1 gxs() {
        acr_1 acr_12 = this.usv.bPz();
        return this.bN(acr_12.aPY, acr_12.aPZ);
    }

    public aco_1 bO(float f2, float f3) {
        float f4 = f2 - f3;
        float f5 = -(f2 + f3);
        return new aco_1(-f4 * 86.0f * 0.5f, -f5 * 43.0f * 0.5f);
    }

    public void bP(float f2, float f3) {
        aco_1 aco_12 = this.bO(f2, f3);
        this.usv.A(aco_12.aSc(), aco_12.aSd(), 0.0f);
    }
}

