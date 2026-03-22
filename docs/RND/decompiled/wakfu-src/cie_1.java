/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.material.Material;
import gnu.trove.procedure.TObjectProcedure;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cIe
 */
public class cie_1
extends fes_2 {
    private static final Logger ncZ = Logger.getLogger(cie_1.class);
    public static final String TAG = "WorldEditor";
    public static final int nda = 3;
    private static final awx_2 ndb = new awx_2(255, 255, 255, 64);
    private static final int ndc = arn_2.fW("HavenWorldBuildingRemoved");
    static final axb_2 ndd = awx_2.dnF;
    private static final axb_2 nde = new awx_2(255, 0, 0, 255);
    private static final Material ndf = (Material)Material.daL.bSJ();
    private final aah_1<cii_1> ndg = new aah_1();
    private cpc_1 ndh;
    private fst ndi;
    private fge_1 ndj;
    private cpg_1 ndk;
    @NotNull
    private fsc_0 ndl = fsc_0.tdW;
    private int ndm = Integer.MAX_VALUE;
    private int ndn = Integer.MAX_VALUE;
    private EntitySprite ndo;

    public cie_1() {
        for (fsc_0 fsc_02 : fsc_0.values()) {
            this.ndg.b(fsc_02.ordinal(), new cii_1());
        }
    }

    public cpg_1 getTool() {
        if (this.ndk != null) {
            return this.ndk;
        }
        this.ndk = (cpg_1)FG.aLe().f(cpd_1.class).get();
        this.ndk.b(this);
        return this.ndk;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public cpc_1 getHavenWorldImages() {
        return this.ndh;
    }

    public fst getWorkingHavenWorld() {
        return this.ndi;
    }

    public fsc_0 getCurrentLayer() {
        return this.ndl;
    }

    public void a(fst fst2, cpc_1 cpc_12) {
        this.ndi = fst2.ers();
        this.ndh = cpc_12;
        this.a(fst2);
        this.ndj.bP(0.0f, 9 * (fst2.bwT() + fst2.bgp()) / 2);
    }

    public void ev(int n, int n2) {
        this.ndj.bP(n, n2);
        this.deS();
    }

    public float getZoomFactor() {
        return this.ndj.getZoomFactor();
    }

    public void dXW() {
        this.ndj.cz(this.ndj.getZoomFactor() * 2.0f);
        this.deS();
    }

    public void deS() {
        this.setNeedsToResetMeshes();
    }

    public void dXX() {
        this.ndj.cz(this.ndj.getZoomFactor() * 0.5f);
        this.deS();
    }

    public void bB(float f2, float f3) {
        float f4;
        float f5;
        fst fst2 = this.getWorkingHavenWorld();
        aci_1 aci_12 = fst2.gld();
        aco_1 aco_12 = this.ndj.gxs();
        aco_1 aco_13 = this.ndj.bN(f2, f3);
        if (aco_13.aSc() > 0.0f) {
            var8_7 = (aci_12.cuR + 1) * 9;
            f5 = Math.min((float)var8_7 - aco_12.aSc(), aco_13.aSc());
        } else {
            var8_7 = aci_12.cuQ * 9;
            f5 = Math.max((float)var8_7 - aco_12.aSc(), aco_13.aSc());
        }
        if (aco_13.aSd() > 0.0f) {
            int n = (aci_12.cuT + 1) * 9;
            f4 = Math.min((float)n - aco_12.aSd(), aco_13.aSd());
        } else {
            int n = aci_12.cuS * 9;
            f4 = Math.max((float)n - aco_12.aSd(), aco_13.aSd());
        }
        this.ndj.bP(aco_12.aSc() + f5, aco_12.aSd() + f4);
        this.deS();
    }

    public aco_1 getScreenCenter() {
        float f2 = (float)(this.ndi.bwS() + this.ndi.bgo()) / 2.0f;
        float f3 = (float)(this.ndi.bwT() + this.ndi.bgp()) / 2.0f - 3.0f;
        return this.ndj.bO((f2 += 0.5f) * 9.0f, (f3 += 0.5f) * 9.0f);
    }

    @Override
    public void setSize(int n, int n2, boolean bl) {
        super.setSize(n, n2, bl);
        this.ndj.setSize(n, n2);
    }

    public acc_1 getPatchCoordFromMouse(int n, int n2) {
        acc_1 acc_12 = this.getCellCoordFromMouse(n, n2);
        acc_12.cG(fsu.aae(acc_12.bWx()), fsu.aaf(acc_12.bWy()));
        return acc_12;
    }

    public acc_1 getCellCoordFromMouse(int n, int n2) {
        return this.ndj.getCellCoordFromMouse(n, n2);
    }

    public void setCurrentLayer(fsc_0 fsc_02) {
        if (this.ndl == fsc_02) {
            return;
        }
        this.a(fsc_02);
        this.setSelectTool();
    }

    private void a(fsc_0 fsc_02) {
        this.ndl = fsc_02;
    }

    public void a(cis_1 cis_12) {
        if (this.ndj == null) {
            return;
        }
        this.ndj.fS(cis_12.ndN ? 0.4f : 1.0f);
        this.ndj.oN(cis_12.ndM);
    }

    public void setTool(cpg_1 cpg_12) {
        this.ndm = Integer.MAX_VALUE;
        this.ndn = Integer.MAX_VALUE;
        this.getTool().clear();
        this.ndk = cpg_12;
        this.getTool().b(this);
        this.a(this.getTool().eLc());
        this.deS();
    }

    public void ew(int n, int n2) {
        acc_1 acc_12 = this.getCellCoordFromMouse(n, n2);
        if (this.ndm != acc_12.bWx() || this.ndn != acc_12.bWy()) {
            this.getTool().clear();
            this.getTool().eB(n, n2);
            this.deS();
            this.ndm = acc_12.bWx();
            this.ndn = acc_12.bWy();
        }
    }

    public void ex(int n, int n2) {
        this.getTool().clear();
        this.getTool().eC(n, n2);
        this.deS();
    }

    private void a(fst fst2) {
        this.ndj.clear();
        this.ndj.bM(this.ndh.ere(), this.ndh.erf());
        if (fst2 == null) {
            ncZ.error((Object)"Le havre monde ne doit pas \u00eatre null");
            return;
        }
        for (int i = fst2.bwT(); i <= fst2.bgp(); ++i) {
            for (int j = fst2.bwS(); j <= fst2.bgo(); ++j) {
                this.ag(fst2.gt(j, i), j, i);
            }
        }
        fst2.y(new cif_1(this));
        this.ndj.g(this.ndi.gld());
        this.ndj.oN(true);
    }

    public fsf_0 a(int n, acc_1 acc_12) {
        Entity3D entity3D = this.ndj.a(acc_12, ndb);
        fsf_0 fsf_02 = new fsf_0(new fca_0(n), acc_12.bWx(), acc_12.bWy());
        this.a(fsf_02, entity3D);
        return fsf_02;
    }

    private fsG ag(int n, int n2, int n3) {
        fcb_0 fcb_02 = fbw_0.rSQ.eH((short)n);
        if (fcb_02 == null) {
            ncZ.error((Object)("Pas de patch d'id " + n));
            return null;
        }
        return this.a(fcb_02, n2, n3);
    }

    private fsG a(fcb_0 fcb_02, int n, int n2) {
        short s = fcb_02.fRN();
        awk_1 awk_12 = this.ndh.JY(s);
        if (awk_12 == null) {
            ncZ.error((Object)("Pas de texture pour le patch " + s));
            return null;
        }
        fsG fsG2 = new fsG(fcb_02, n, n2);
        acc_1 acc_12 = this.ndh.JW(s);
        EntitySprite entitySprite = this.ndj.a(fsG2.gli(), acc_12, awk_12, awx_2.dnF);
        this.a(fsG2, entitySprite);
        return fsG2;
    }

    public fsG b(fcb_0 fcb_02, int n, int n2) {
        fsG fsG2 = this.a(fcb_02, n, n2);
        if (fsG2 != null) {
            this.ndi.aq(n, n2, fcb_02.fRN());
        }
        return fsG2;
    }

    fsb_0 g(fam_0 fam_02) {
        fbk_0 fbk_02 = fam_02.erN();
        fbk_0 fbk_03 = fbo_0.e(fbk_02);
        if (fbk_03 == null) {
            return null;
        }
        int n = fbk_03.Kp(fam_02.azv());
        awk_1 awk_12 = this.ndh.JZ(n);
        if (awk_12 == null) {
            ncZ.error((Object)("Pas de texture pour le groupe " + n));
            return null;
        }
        acc_1 acc_12 = new acc_1(fam_02.fRc(), fam_02.fRd());
        acc_1 acc_13 = this.ndh.JX(n);
        EntitySprite entitySprite = this.ndj.b(acc_12, acc_13, awk_12, awx_2.dnF);
        fsb_0 fsb_02 = new fsb_0(fam_02);
        this.a(fsb_02, entitySprite);
        return fsb_02;
    }

    public fsb_0 h(fam_0 fam_02) {
        fsb_0 fsb_02 = this.g(fam_02);
        if (fsb_02 != null) {
            fbk_0 fbk_02 = fbo_0.e(fam_02.erN());
            cpb_1 cpb_12 = FG.aLe().e(cpb_1.class);
            fam_0 fam_03 = cpb_12.i(fam_02.ZC(), fbk_02.aIi(), fam_02.azv(), fam_02.fRc(), fam_02.fRd());
            this.ndi.j(fam_03);
        }
        return fsb_02;
    }

    public fsb_0 i(fam_0 fam_02) {
        fsb_0 fsb_02 = this.g(fam_02);
        this.ndi.j(fam_02);
        return fsb_02;
    }

    private void a(fsd_0 fsd_02, Entity entity) {
        Entity entity2 = this.a(entity, fsd_02);
        this.j(entity2);
    }

    private void j(Entity entity) {
        this.ndj.j(entity);
        if (this.ndo == entity) {
            this.ndo = null;
        }
    }

    public void b(fsd_0 fsd_02) {
        if (fsd_02 != null) {
            switch (fsd_02.ekj()) {
                case tdW: {
                    this.ndi.uK(fsd_02.Lx());
                    break;
                }
                case tdX: {
                    this.ndj.gxr();
                }
            }
        }
        Entity entity = this.i(fsd_02);
        this.j(entity);
        this.deS();
    }

    @Override
    protected void eKZ() {
        super.eKZ();
        this.bVe.g(this.ndj.getEntity());
    }

    public EntityGroup getMapEntity() {
        return this.ndj.getEntity();
    }

    @Override
    public boolean isAppearanceCompatible(fys_0 fys_02) {
        return true;
    }

    @Override
    public void aVH() {
        super.aVH();
        if (this.ndj != null) {
            this.ndj.bpI();
            this.ndj = null;
        }
        this.ndo = null;
        for (int i = 0; i < this.ndg.bTR(); ++i) {
            this.ndg.vU(i).clear();
        }
        this.ndg.clear();
        this.ndk = (cpg_1)FG.aLe().f(cpd_1.class).get();
    }

    @Override
    public void aVI() {
        super.aVI();
        this.ndj = new fge_1();
        this.ndj.cz(0.25f);
        fys_0 fys_02 = fys_0.checkOut();
        fys_02.setWidget(this);
        this.d(fys_02);
        this.setNeedsToPreProcess();
        this.setFocusable(true);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        return super.setXMLAttribute(n, string, fic_12);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        return super.setPropertyAttribute(n, object);
    }

    public fsG getGroundUnderMouse(int n, int n2) {
        acc_1 acc_12 = this.getPatchCoordFromMouse(n, n2);
        int n3 = acc_12.bWx() * 9;
        int n4 = acc_12.bWy() * 9;
        EntitySprite entitySprite = this.ndj.gV(n3, n4);
        return (fsG)this.getItem(fsc_0.tdV, entitySprite);
    }

    public fsG getGround(int n, int n2) {
        int n3 = n * 9;
        int n4 = n2 * 9;
        EntitySprite entitySprite = this.ndj.gV(n3, n4);
        return (fsG)this.getItem(fsc_0.tdV, entitySprite);
    }

    public fsb_0 getBuildingUnderMouse(int n, int n2) {
        EntitySprite entitySprite = this.ndj.gX(n, n2);
        return (fsb_0)this.getItem(fsc_0.tdW, entitySprite);
    }

    public fsb_0 getBuilding(int n, int n2) {
        EntitySprite entitySprite = this.ndj.gW(n, n2);
        return (fsb_0)this.getItem(fsc_0.tdW, entitySprite);
    }

    public void c(fsd_0 fsd_02) {
        if (fsd_02 instanceof fsf_0) {
            this.a(0, fsd_02.gli());
            return;
        }
        this.eLa();
        Entity entity = this.h(fsd_02);
        if (entity instanceof EntitySprite || entity == null) {
            this.b((EntitySprite)entity);
        }
        this.deS();
    }

    public void eLa() {
        if (this.ndj != null) {
            this.ndj.gxr();
        }
    }

    private void b(EntitySprite entitySprite) {
        if (this.ndo == entitySprite) {
            return;
        }
        if (this.ndo != null && this.ndo.bSV()) {
            this.ndo.a(Material.daH);
        }
        if (entitySprite != null) {
            entitySprite.a(ndf);
        }
        this.ndo = entitySprite;
    }

    public void d(fsd_0 fsd_02) {
        Entity entity = this.h(fsd_02);
        if (entity == null) {
            return;
        }
        asr_1 asr_12 = ast_1.bJG().bJI();
        if (asr_12.un(ndc)) {
            entity.a(asr_12, ndc, null);
        }
    }

    public void e(fsd_0 fsd_02) {
        Entity entity = this.h(fsd_02);
        if (entity == null) {
            return;
        }
        entity.bJa();
    }

    public void f(fsd_0 fsd_02) {
        Entity entity = this.h(fsd_02);
        if (entity == null) {
            return;
        }
        entity.b(nde);
    }

    public void g(fsd_0 fsd_02) {
        Entity entity = this.h(fsd_02);
        if (entity == null) {
            return;
        }
        entity.b(ndd);
    }

    public void eLb() {
        for (int i = 0; i < this.ndg.bTR(); ++i) {
            this.ndg.vU((int)i).nds.forEachValue((TObjectProcedure)new cig_1(this));
        }
    }

    public void setSelectTool() {
        if (this.ndl == fsc_0.tdV) {
            this.setTool((cpg_1)FG.aLe().f(cpf_1.class).get());
            return;
        }
        if (this.ndl == fsc_0.tdW) {
            this.setTool((cpg_1)FG.aLe().f(cpe_1.class).get());
            return;
        }
        this.setTool((cpg_1)FG.aLe().f(cpd_1.class).get());
    }

    private Entity h(fsd_0 fsd_02) {
        if (fsd_02 == null) {
            return null;
        }
        return this.getSpriteMap(fsd_02).j(fsd_02);
    }

    private Entity a(Entity entity, fsd_0 fsd_02) {
        return this.getSpriteMap(fsd_02).b(entity, fsd_02);
    }

    private Entity i(fsd_0 fsd_02) {
        return this.getSpriteMap(fsd_02).k(fsd_02);
    }

    private fsd_0 getItem(fsc_0 fsc_02, EntitySprite entitySprite) {
        return this.getSpriteMap(fsc_02).c(entitySprite);
    }

    private cii_1 getSpriteMap(fsd_0 fsd_02) {
        return this.getSpriteMap(fsd_02.ekj());
    }

    private cii_1 getSpriteMap(fsc_0 fsc_02) {
        return this.ndg.vK(fsc_02.ordinal());
    }

    public void getEntities(EntityGroup entityGroup) {
        this.ndj.getEntities(entityGroup);
    }

    static {
        ndf.x(0.2f, 0.2f, 0.2f);
    }
}

