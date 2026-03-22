/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.Threading
 *  com.jogamp.opengl.util.texture.TextureCoords
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.geometry.Geometry;
import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import com.jogamp.opengl.Threading;
import com.jogamp.opengl.util.texture.TextureCoords;
import gnu.trove.set.hash.TIntHashSet;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ZC
implements WQ,
agn_1,
aaG,
act_0,
acx_0,
afW,
agV,
ahb,
amg_1,
arj_2 {
    private static final Logger bUJ = Logger.getLogger(ZC.class);
    private static boolean bUK = true;
    private String bUL = "AnimStatique";
    private String bUM = "AnimCourse";
    private String bUN = "AnimHit";
    private final acr_1 bUO;
    protected boolean bUP;
    protected String bKc = "AnimStatique";
    protected boolean bUQ = false;
    protected float bUR = 1.0f;
    protected boolean bUS = true;
    protected String bUT = "AnimStatique";
    protected boolean bUU = true;
    protected boolean bUV = false;
    protected boolean bUW = false;
    protected static final float bUX = 500.0f;
    protected float bUY = 1.0f;
    protected boolean bUZ = false;
    protected boolean bVa = false;
    protected final aap_1 bVb = new aap_1(5);
    protected agg_1 bVc = agh_1.dLJ;
    private String bVd = null;
    protected float azR = 1.0f;
    protected EntityGroup bVe;
    protected String bds;
    protected String awN;
    protected int bVf = -1;
    protected int bVg = -1;
    protected int bVh = 0;
    protected int bUi = 0;
    protected boolean bVi = false;
    private boolean bVj = true;
    aro_1 bVk;
    private final aci_1 bVl = new aci_1();
    private static final aci_1 bVm = new aci_1(-256, 256, -256, 256);
    protected Material bVn;
    private auw_2 bVo = auw_2.dfI;
    private auw_2 bVp = auw_2.dfM;
    private static final ArrayList<eh_2> bVq = new ArrayList(5);
    private byte bVr = afX.csq.byy();
    private final ArrayList<ZJ> bVs = new ArrayList(1);
    private final ArrayList<ZJ> bVt = new ArrayList(1);
    private boolean bVu = false;
    private boolean bVv = false;
    private final ZL bVw = acL.btU().btT();
    public static boolean bVx = false;
    private boolean bVy = false;
    protected long aXv;
    protected float bVz;
    protected float bVA;
    protected float bVB = 0.0f;
    protected final acd_1 bVC = new acd_1();
    protected int bVD;
    protected short bVE;
    protected int bVF = Integer.MIN_VALUE;
    protected int bVG = Integer.MIN_VALUE;
    protected int bVH;
    protected ArrayList<WR> bVI = null;
    protected boolean bVJ = true;
    protected boolean bVK = true;
    protected ArrayList<WT> bVL = null;
    private boolean bmg = true;
    protected boolean bVM = true;
    private boolean bVN = true;
    protected final float[] bVO = new float[]{1.0f, 1.0f, 1.0f, 1.0f};
    private boolean bVP = false;
    protected float bVQ = 1.0f;
    protected float bVR = 1.0f;
    private byte bVS = (byte)3;
    private static final float[] bVT = new float[4];
    protected float azQ = 1.0f;
    protected float bVU = 0.0f;
    protected short bVV = (short)6;
    private boolean bVW = false;
    private ArrayList<FreeParticleSystem> bVX;
    private ArrayList<acf> bVY;
    private boolean bVZ;
    private boolean bWa = true;
    aro_1 bWb;
    final ArrayList<ard_2> bWc = new ArrayList();
    private static final aci_1 bWd = new aci_1();

    protected void reset() {
        int n = this.bWc.size();
        for (int i = 0; i < n; ++i) {
            this.bWc.get(i).bHP();
        }
        this.bWc.clear();
        this.azR = 1.0f;
        this.bUY = 1.0f;
        this.bVO[3] = 1.0f;
        this.bVO[2] = 1.0f;
        this.bVO[1] = 1.0f;
        this.bVO[0] = 1.0f;
        this.bVQ = 1.0f;
        this.bVR = 1.0f;
        this.bVW = false;
        this.bUZ = false;
        this.bVa = false;
        this.bVf = -1;
        this.bVg = -1;
        this.bVh = 0;
        this.bUQ = true;
        this.bUU = true;
        this.bVS = (byte)3;
        this.bqa();
        if (this.bVk != null) {
            this.bVk.reset();
            this.bVk = null;
        }
        if (this.bWb != null) {
            this.bWb.reset();
            this.bWb = null;
        }
        if (this.bVe != null) {
            this.bVe.bsI();
            this.bVe = null;
            this.bVw.reset();
            assert (this.bVn != null);
            this.bVn.bsI();
            this.bVn = null;
        }
        this.bqq();
    }

    Entity3D bpj() {
        Entity3D entity3D = (Entity3D)Entity3D.cXb.bSK();
        this.a(entity3D);
        return entity3D;
    }

    public void by(boolean bl) {
        this.bWa = bl;
    }

    public boolean bpk() {
        return this.bWa;
    }

    private void a(Entity entity) {
        awp_1 awp_12 = new awp_1();
        awp_12.bPx();
        awp_12.B(this.getScale(), this.getScale(), 1.0f);
        entity.bIS().a(awp_12);
        entity.a(ast_1.bJG().bJH(), asa_1.cYC, asa_1.cZg);
        entity.cWQ = this.bVy ? (entity.cWQ |= 2) : (entity.cWQ &= 0xFFFFFFFD);
        entity.cWR = this;
    }

    @Override
    public byte bcO() {
        return 0;
    }

    @Override
    public boolean bnh() {
        return this.bVF != Integer.MIN_VALUE && this.bVG != Integer.MIN_VALUE;
    }

    @Override
    public float bpl() {
        return this.bVz - this.bVA;
    }

    @Override
    public float bpm() {
        return -(this.bVz + this.bVA);
    }

    @Override
    public float bpn() {
        return this.bVB / 4.8f;
    }

    @Override
    public boolean bpo() {
        return false;
    }

    @Override
    public int bpp() {
        return this.bqh();
    }

    public final Entity bpq() {
        return this.bVe;
    }

    public final Entity3D bpr() {
        return this.bVw.bpr();
    }

    public boolean bps() {
        return bVx;
    }

    public final Material bpt() {
        return this.bVn;
    }

    public final void a(Material material) {
        this.bVn.f(material);
    }

    public String bpu() {
        return this.awN;
    }

    public final byte bpv() {
        return this.bVr;
    }

    public final void qR(int n) {
        if (n < 0 || n >= afX.csv) {
            bUJ.error((Object)("DeltaZ incorrect " + n));
            return;
        }
        this.bVr = (byte)n;
    }

    public void bP(float f2) {
        this.bVU = Math.max(0.0f, f2);
    }

    public void setScale(float f2) {
        this.azQ = f2;
    }

    public void dP(String string) {
        String string2 = this.bds;
        this.bds = string;
        if (string2 != this.bds) {
            this.bpC();
        }
    }

    public String aXE() {
        return this.bds;
    }

    protected String dQ(String string) {
        String string2 = this.bpE();
        if (string2 != null) {
            return string + string2;
        }
        return string;
    }

    public void a(agg_1 agg_12) {
        this.bVc = agg_12;
    }

    @Override
    public agg_1 bpw() {
        return this.bVc;
    }

    public final void bpx() {
        this.bVn.f(aro_1.bHo());
    }

    public void a(ZC zC) {
        if (zC == null) {
            return;
        }
        this.bVi = true;
        this.bUS = true;
        this.bVP = true;
        if (zC.bpr() == null) {
            zC.bpB();
        }
        Entity entity = zC.bpq();
        asl_1 asl_12 = asl_1.b(entity.bIX());
        this.bVe.a(entity.bIW(), entity.bIY(), asl_12);
        this.bVn.f(zC.bVn);
        this.bVo = zC.bVo;
        this.bVp = zC.bVp;
        this.bVZ = zC.bVZ;
        this.awN = zC.awN;
        this.bds = zC.bds;
        this.azR = zC.azR;
        this.bUR = zC.bUR;
        if (zC.bVk != null) {
            if (this.bVk != null) {
                this.bVk.reset();
            }
            this.bVk = new aro_1(zC.bVk);
        }
        if (zC.bWb != null) {
            if (this.bWb != null) {
                this.bWb.reset();
            }
            this.bWb = new aro_1(zC.bWb);
            this.bpz();
        }
    }

    public final void a(auw_2 auw_22, auw_2 auw_23) {
        this.bVo = auw_22;
        this.bVp = auw_23;
    }

    public static Anm i(String string, boolean bl) {
        Object object;
        Object object2;
        try {
            object2 = fo_0.bA(string);
            String string2 = ((URL)object2).getPath();
            object = ((URL)object2).getProtocol() + ":" + string2;
        }
        catch (MalformedURLException malformedURLException) {
            if (bl) {
                bUJ.error((Object)"Exception during loadEquipment", (Throwable)malformedURLException);
                return null;
            }
            object = string;
        }
        try {
            object2 = arq_1.bHF().u((String)object, bl);
        }
        catch (IOException iOException) {
            bUJ.error((Object)"Unable to load equipment", (Throwable)iOException);
            return null;
        }
        return object2;
    }

    public static Anm dR(String string) {
        return ZC.i(string, true);
    }

    public void b(String string, String ... stringArray) {
        if (string == null) {
            bUJ.warn((Object)"on veut appliquer un equipemnt depuis un path null");
            return;
        }
        Anm anm = ZC.dR(string);
        if (anm == null) {
            return;
        }
        this.a(anm, arn_2.o(stringArray));
    }

    public Anm dS(String string) {
        if (string == null) {
            bUJ.warn((Object)"on veut appliquer un equipemnt depuis un path null");
            return null;
        }
        Anm anm = ZC.dR(string);
        if (anm == null) {
            return anm;
        }
        this.a(anm, new int[0]);
        return anm;
    }

    public Anm qS(int n) {
        String string = this.qT(n);
        if (string == null) {
            bUJ.warn((Object)"on veut appliquer un equipemnt depuis un path null");
            return null;
        }
        return this.dS(string);
    }

    protected String qT(int n) {
        return null;
    }

    public void a(Anm anm) {
        if (anm == null) {
            return;
        }
        this.b(anm, new int[0]);
    }

    public void a(@NotNull Anm anm, int ... nArray) {
        if (this.bqd() == null) {
            return;
        }
        this.bqd().a(anm, nArray);
        this.bpy();
    }

    public void a(@NotNull Anm anm, int[] nArray, TIntHashSet tIntHashSet) {
        if (this.bqd() == null) {
            return;
        }
        this.bqd().a(anm, tIntHashSet, nArray);
        this.bpy();
    }

    public void a(@NotNull Anm anm, String[] stringArray, TIntHashSet tIntHashSet) {
        if (tIntHashSet == null || tIntHashSet.size() == 0) {
            this.a(anm, arn_2.o(stringArray));
        } else {
            this.a(anm, arn_2.o(stringArray), tIntHashSet);
        }
    }

    public void bpy() {
        this.bVi = true;
    }

    public void b(@NotNull Anm anm, int ... nArray) {
        if (this.bqd() != null) {
            this.bqd().c(anm, nArray);
        }
        this.bpy();
    }

    private void j(String string, boolean bl) {
        this.awN = string;
        if (this.bWb != null) {
            this.bWb.reset();
        }
        this.bWb = arq_1.bHF().t(string, bl);
        this.bpz();
    }

    private void bpz() {
        this.a(this.bWb, (Runnable)new ZD(this));
        if (this.bVk == null) {
            this.bVk = this.bWb;
            this.bWb = null;
        } else {
            this.a(this.bWb, (Runnable)new ZE(this));
        }
    }

    public final void d(Runnable runnable) {
        aro_1 aro_12 = this.bqd();
        if (aro_12 == null) {
            return;
        }
        this.a(aro_12, runnable);
    }

    private void a(aro_1 aro_12, Runnable runnable) {
        this.a(aro_12.bHd(), runnable);
    }

    public final void a(Anm anm, Runnable runnable) {
        if (anm.aLB()) {
            runnable.run();
        } else {
            ZF zF = new ZF(this, anm, runnable);
            this.bWc.add(zF);
        }
    }

    protected void bpA() {
        if (this.bqd() == null) {
            return;
        }
        this.l(this.bqd().aJM());
    }

    public void k(String string, boolean bl) {
        assert (string.endsWith("anm") || string.endsWith("ANM"));
        this.j(string, bl);
    }

    public ZC() {
        this(0L);
    }

    public ZC(long l) {
        this(l, 0.0f, 0.0f);
    }

    public ZC(long l, float f2, float f3) {
        this(l, f2, f3, 0.0f);
    }

    public ZC(long l, float f2, float f3, float f4) {
        this.dC(l);
        this.bVz = f2;
        this.bVA = f3;
        this.bVB = f4;
        this.bUO = new acr_1();
        this.bUP = true;
        this.bpP();
        if (Threading.isOpenGLThread()) {
            this.bpB();
        }
        agX.c(this);
        this.bpH();
    }

    private void bpB() {
        assert (this.bVe == null);
        assert (this.bVn == null);
        this.bVn = (Material)Material.daL.bSK();
        this.bVn.f(aro_1.bHo());
        this.bVe = this.bVw.b(this);
        this.a(this.bVe);
    }

    public void bpC() {
        this.bUQ = true;
    }

    public String bkI() {
        return this.bKc;
    }

    @Override
    public boolean dT(String string) {
        if (this.bKc.equals(string)) {
            return false;
        }
        this.bpA();
        this.bH(false);
        this.bUT = this.bKc;
        this.bKc = string;
        this.bpC();
        return true;
    }

    public void setCanPlaySound(boolean bl) {
        this.bUU = bl;
        if (!this.bUU) {
            this.bpW();
        }
    }

    @Override
    public boolean bpD() {
        return this.bUU && this.isVisible();
    }

    public String bpE() {
        return this.bVd;
    }

    @Override
    public String bpF() {
        return this.bUT;
    }

    public void dU(String string) {
        boolean bl;
        boolean bl2 = bl = string != this.bVd || string != null && !string.equals(this.bVd);
        if (bl) {
            this.bVd = string;
            this.bpC();
        }
    }

    public void bQ(float f2) {
        this.bUR = f2;
    }

    public String bpG() {
        Object object = this.bKc;
        String string = this.bpE();
        if (string != null) {
            object = (String)object + string;
        }
        return object;
    }

    public final void bpH() {
        this.bUZ = true;
    }

    protected final boolean d(float f2, float f3, float f4) {
        boolean bl;
        boolean bl2 = bl = this.bVk != null && this.bVl.cL((int)f2, (int)f3);
        if (bl) {
            float f5 = f2 - (float)this.bVl.bWF();
            float f6 = f3 - (float)this.bVl.bWH();
            bl = this.a(this.bVe, f5, f6, f4);
        }
        return bl;
    }

    public boolean aA(float f2, float f3) {
        return this.d(f2, f3, 1.0f);
    }

    private boolean a(Entity entity, float f2, float f3, float f4) {
        if (entity == null) {
            return false;
        }
        ArrayList<Entity> arrayList = entity.bJd();
        if (arrayList == null) {
            return false;
        }
        acr_1 acr_12 = new acr_1();
        acr_1 acr_13 = new acr_1();
        acr_1 acr_14 = new acr_1();
        aco_1 aco_12 = new aco_1();
        aco_1 aco_13 = new aco_1();
        acr_1 acr_15 = new acr_1(f2, f3, 0.0f, 0.0f);
        boolean bl = this.bVk.aJz() && f4 == 1.0f;
        float f5 = this.bVk.aSO();
        float f6 = this.bVk.aSP();
        for (Entity entity2 : arrayList) {
            int n = ((Entity3D)entity2).bJf();
            for (int i = 0; i < n; ++i) {
                Geometry geometry = ((Entity3D)entity2).uh(i);
                if (!(geometry instanceof GLGeometryMesh)) continue;
                GLGeometryMesh gLGeometryMesh = (GLGeometryMesh)geometry;
                VertexBufferPCT vertexBufferPCT = gLGeometryMesh.bKd();
                int n2 = vertexBufferPCT.bIF();
                FloatBuffer floatBuffer = vertexBufferPCT.bIy();
                for (int j = 0; j < n2; j += 4) {
                    float f7;
                    float f8;
                    float f9;
                    int n3 = j * 2;
                    acr_12.y(floatBuffer.get(n3 + 0), floatBuffer.get(n3 + 1), 0.0f, 1.0f);
                    acr_13.y(floatBuffer.get(n3 + 2), floatBuffer.get(n3 + 3), 0.0f, 1.0f);
                    acr_14.y(floatBuffer.get(n3 + 4), floatBuffer.get(n3 + 5), 0.0f, 1.0f);
                    aco_12.aS(acr_14.bVA() - acr_13.bVA(), acr_14.bVB() - acr_13.bVB());
                    aco_13.aS(acr_12.bVA() - acr_13.bVA(), acr_12.bVB() - acr_13.bVB());
                    float f10 = f5 - acr_13.bVA();
                    float f11 = f6 - acr_13.bVB();
                    acr_15.y(f2 + f10, f3 + f11, 0.0f, 0.0f);
                    if (f4 != 1.0f) {
                        f9 = (f4 - 1.0f) * 0.5f;
                        acr_13.y(acr_13.aPY - f9 * (aco_12.aPY + aco_13.aPY), acr_13.aPZ - f9 * (aco_12.aPZ + aco_13.aPZ), acr_13.aQa, acr_13.dyY);
                        aco_12.dy(f4);
                        aco_13.dy(f4);
                    }
                    if ((f9 = aco_13.aSd() * aco_12.aSc() - aco_13.aSc() * aco_12.aSd()) == 0.0f) continue;
                    if (aco_12.aSc() == 0.0f) {
                        assert (aco_13.aSc() != 0.0f);
                        f8 = aco_13.aSd() * acr_15.bVA() - aco_13.aSc() * acr_15.bVB();
                        if ((f8 /= f9) < 0.0f || f8 > 1.0f || (f7 = (acr_15.bVA() - f8 * aco_12.aSc()) / aco_13.aSc()) < 0.0f || f7 > 1.0f) {
                            continue;
                        }
                    } else {
                        f7 = acr_15.bVB() * aco_12.aSc() - acr_15.bVA() * aco_12.aSd();
                        if ((f7 /= f9) < 0.0f || f7 > 1.0f || (f8 = (acr_15.bVA() - f7 * aco_13.aSc()) / aco_12.aSc()) < 0.0f || f8 > 1.0f) continue;
                    }
                    assert (f8 >= 0.0f && f8 <= 1.0f && f7 >= 0.0f && f7 <= 1.0f) : "et hop, du code tout bugg\u00e9";
                    FloatBuffer floatBuffer2 = vertexBufferPCT.bIA();
                    TextureCoords textureCoords = new TextureCoords(floatBuffer2.get(n3), floatBuffer2.get(n3 + 1), floatBuffer2.get(n3 + 4), floatBuffer2.get(n3 + 5));
                    if (bl && !this.a(f8, f7, textureCoords, ((Entity3D)entity2).ui(i))) continue;
                    return true;
                }
            }
            if (!this.a(entity2, f2, f3, f4)) continue;
            return true;
        }
        return false;
    }

    private void a(acr_1 acr_12, aco_1 aco_12, aco_1 aco_13, acr_1 acr_13, Entity entity, TextureCoords textureCoords) {
        zy_0.bXr.a(acr_12.bVA(), acr_12.bVB(), aco_12, aco_13, acr_13);
        zy_0.bXr.a(((Entity3D)entity).ui(0), textureCoords);
        zy_0.bXr.e(-1, -1, false);
        zy_0.bXr.aPc();
    }

    private void a(acr_1 acr_12, aco_1 aco_12, aco_1 aco_13, acr_1 acr_13) {
        zy_0.bXr.a(acr_12.bVA(), acr_12.bVB(), aco_12, aco_13, acr_13);
        zy_0.bXr.aPc();
    }

    private void a(int n, FloatBuffer floatBuffer, float f2) {
        acr_1 acr_12 = new acr_1();
        acr_1 acr_13 = new acr_1();
        acr_1 acr_14 = new acr_1();
        aco_1 aco_12 = new aco_1();
        aco_1 aco_13 = new aco_1();
        zy_0.bXr.clear();
        for (int i = 0; i < n; i += 4) {
            int n2 = i * 2;
            acr_12.y(floatBuffer.get(n2 + 0), floatBuffer.get(n2 + 1), 0.0f, 1.0f);
            acr_13.y(floatBuffer.get(n2 + 2), floatBuffer.get(n2 + 3), 0.0f, 1.0f);
            acr_14.y(floatBuffer.get(n2 + 4), floatBuffer.get(n2 + 5), 0.0f, 1.0f);
            aco_12.aS(acr_14.bVA() - acr_13.bVA(), acr_14.bVB() - acr_13.bVB());
            aco_13.aS(acr_12.bVA() - acr_13.bVA(), acr_12.bVB() - acr_13.bVB());
            if (f2 != 1.0f) {
                float f3 = (f2 - 1.0f) * 0.5f;
                acr_13.y(acr_13.aPY - f3 * (aco_12.aPY + aco_13.aPY), acr_13.aPZ - f3 * (aco_12.aPZ + aco_13.aPZ), acr_13.aQa, acr_13.dyY);
                aco_12.dy(f2);
                aco_13.dy(f2);
            }
            zy_0.bXr.a(new acr_1[]{new acr_1(acr_13.bVA(), acr_13.bVB(), 0.0f, 0.0f), new acr_1(acr_13.bVA() + aco_12.aSc(), acr_13.bVB() + aco_12.aSd(), 0.0f, 0.0f), new acr_1(acr_13.bVA() + aco_12.aSc() + aco_13.aSc(), acr_13.bVB() + aco_12.aSd() + aco_13.aSd(), 0.0f, 0.0f), new acr_1(acr_13.bVA() + aco_13.aSc(), acr_13.bVB() + aco_13.aSd(), 0.0f, 0.0f)});
        }
    }

    private void a(awu_2 awu_22, int n, int n2) {
        zy_0.bXr.e(n, n2, awu_22.ci(n, n2));
        zy_0.bXr.aPc();
    }

    private boolean a(float f2, float f3, TextureCoords textureCoords, awk_1 awk_12) {
        if (awk_12 == null) {
            return false;
        }
        try {
            axj_2 axj_22 = awk_12.ve(0);
            awu_2 awu_22 = axj_22.bQL();
            int n = axj_22.getWidth();
            int n2 = axj_22.getHeight();
            float f4 = GC.a(textureCoords.left(), textureCoords.right(), f2);
            float f5 = GC.a(textureCoords.top(), textureCoords.bottom(), f3);
            int n3 = Math.round(f4 * (float)n);
            int n4 = n2 - Math.round(f5 * (float)n2);
            return awu_22.ci(n3, n4);
        }
        catch (Throwable throwable) {
            bUJ.error((Object)"", throwable);
            return false;
        }
    }

    public void bpI() {
        xd_0.bnv().c(this);
        this.reset();
    }

    protected boolean bpJ() {
        return this.bUQ || this.bUS || this.bVM || this.bVP || this.bVi;
    }

    protected void bpK() {
        this.bUQ = false;
        this.bUS = false;
        this.bVP = false;
        this.bVi = false;
    }

    private void bpL() {
        String string = this.bpT();
        this.bqd().s(this.dQ(string), this.bUW);
    }

    public boolean b(afV afV2, int n) {
        return this.a(afV2, n, 0);
    }

    private boolean a(afV afV2, int n, int n2) {
        int n3;
        fk_0 fk_02;
        boolean bl;
        if (n2 > 5) {
            bUJ.info((Object)("Boucle infinie dans le process de l'anm " + this.bVk.bHw() + " animation courante=" + this.bKc + " (probl\u00e9me dans l'enchainement des goto ?)"));
            return false;
        }
        boolean bl2 = afV2 == null || this.b(afV2);
        boolean bl3 = bl = this.bVj && bl2;
        if (this.bVu) {
            this.bVs.removeAll(this.bVt);
            this.bVt.clear();
            this.bVu = false;
        }
        if (this.bWb != null) {
            return true;
        }
        if (this.bVk == null) {
            return false;
        }
        boolean bl4 = this.bVk.aLB();
        if (this.bUZ) {
            this.bUZ = false;
            if (bl2) {
                if (!bl4) {
                    this.bVa = true;
                } else {
                    this.bUY = 0.0f;
                }
            }
        }
        if (this.bVa && bl4) {
            this.bUY = 0.0f;
            this.bVa = false;
        }
        if (this.bpr() == null) {
            this.bpB();
            this.bB(this.bVv);
            this.bVP = true;
        }
        assert (n < 1000000) : "DeltaTime is very high (" + n + "), did you use realTime instead ?";
        if (this.bds == null) {
            return false;
        }
        this.bUi = (int)((float)this.bUi + (float)n * this.bUR * ZK.bqv());
        assert (this.bVk != null);
        if (!bl4) {
            return false;
        }
        this.bVk.bHu();
        if (this.bUY < this.bVR) {
            this.bUY += (float)n / 500.0f;
            if (this.bUY > this.bVR) {
                this.bUY = this.bVR;
            }
            if (this.bVO[3] != this.bUY) {
                this.bVO[3] = this.bUY;
                this.bVP = true;
            }
        }
        boolean bl5 = false;
        this.bVi |= this.bVk.bHx();
        if (this.bpJ() && bl) {
            bl5 = true;
            this.bVM = false;
            fk_02 = this.bVk.bHj();
            this.bVk.s(this.dQ(this.bKc), this.bUV);
            n3 = this.bVk.bHk();
            if (this.bVk.bHj() == null) {
                if (n3 != 0 && fk_02 != null) {
                    this.bVk.s(fk_02.getName(), this.bUV);
                } else {
                    this.bVk.s(this.dQ("AnimStatique"), this.bUV);
                }
            }
            if (this.bVk.bHj() != null || n3 != 0) {
                if (this.bUQ && this.bVk.bHl()) {
                    this.bUi = 0;
                    if (this.bVb.aVo() > 0) {
                        this.bpW();
                    }
                }
                this.bVh = this.bUi;
                this.bUQ = false;
                this.bVf = -1;
                this.bVg = -1;
            } else {
                this.bpL();
                if (this.bVk.bHj() != fk_02) {
                    this.bUi = 0;
                    this.bVf = -1;
                    this.bVg = -1;
                    this.bVh = 0;
                }
            }
            this.bpK();
            if (n3 != 0) {
                this.bUQ = true;
                return true;
            }
        }
        if ((fk_02 = this.bVk.bHj()) != null && fk_02.aIm()) {
            this.bpN();
            this.a(afV2, n, n2 + 1);
            return true;
        }
        if (this.bVk.bHi()) {
            bl5 = true;
        }
        if (this.bVk.bHm()) {
            bl5 = true;
        }
        if (this.bVk.bHj() == null) {
            return false;
        }
        n3 = this.bVk.tM(this.bUi);
        if (n3 != this.bVg || n3 != this.bVf) {
            bl5 = true;
        }
        boolean bl6 = false;
        if (this.bVk.bHn()) {
            bl6 = true;
        }
        if ((!this.bVZ || this.bVk.bzm()) && (bl6 || bl5 || this.bVk.bzm())) {
            boolean bl7;
            boolean bl8 = this.bVg != n3 || bl6;
            boolean bl9 = bl7 = afV2 == null || this.isVisible() && bl2;
            if (bl && bl8 && bl7) {
                this.bVk.a(this.bVn);
                this.bVk.a(this.bVo, this.bVp);
                this.bVk.a(this.bUi, this.bpr(), n);
                this.bVg = n3;
            }
            if (this.bVf != n3) {
                this.bVf = n3;
                this.bpN();
                if (n3 == this.bVk.bHq() - 1) {
                    this.bqf();
                    if (this.bVk == null) {
                        return false;
                    }
                }
            }
            this.bVh = this.bUi;
        }
        this.bVk.cM(n);
        return true;
    }

    protected boolean bpM() {
        return this.bVj || this.bUQ;
    }

    private void bpN() {
        this.bVk.a(bVq, this.bUi, this.bVh);
        this.g(bVq);
        bVq.clear();
    }

    public acr_1 a(afV afV2) {
        if (this.bUP) {
            float f2 = afV2.aM(this.bVz, this.bVA);
            float f3 = afV2.j(this.bVz, this.bVA, this.bVB);
            this.bUO.m(f2, f3, -1.0f);
            this.bUP = false;
        }
        return this.bUO;
    }

    public void setVisible(boolean bl) {
        if (bl != this.bmg) {
            this.bz(bl);
            this.bmg = bl;
            this.bVM = true;
            this.a(bl, WU.bQg);
            this.bE(bl);
        }
        if (this.bVM && bl) {
            this.bUP = true;
        }
    }

    private void bz(boolean bl) {
        if (this.bVj == bl) {
            return;
        }
        this.bVj = bl;
        this.bUS = true;
    }

    public boolean bpO() {
        return this.bVZ;
    }

    public void setStopped(boolean bl) {
        this.bVZ = bl;
        this.bpM();
    }

    public void bpP() {
        this.bUP = true;
    }

    public boolean b(afV afV2) {
        acr_1 acr_12 = this.a(afV2);
        agf agf2 = afV2.brf();
        int n = (int)acr_12.bVA();
        int n2 = (int)acr_12.bVB();
        bWd.y(n + bVm.bWF(), n + bVm.bWG(), n2 + bVm.bWH(), n2 + bVm.bWI());
        return agf2.m(ZC.bWd.cuT, ZC.bWd.cuQ, ZC.bWd.cuS, ZC.bWd.cuR);
    }

    public boolean c(aaj_0 aaj_02) {
        float[] fArray;
        boolean bl;
        if (!this.isVisible() || !this.b(aaj_02) || this.bVk == null) {
            return false;
        }
        if (this.bVk.bHj() == null) {
            this.bVl.y(Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
            this.d(aaj_02);
            return false;
        }
        acr_1 acr_12 = this.a(aaj_02);
        aag_0 aag_02 = aaj_02.bqL();
        aci_1 aci_12 = this.bVk.bHp();
        int n = GC.A(acr_12.bVA());
        int n2 = GC.A(acr_12.bVB());
        this.bVe.bro = n + aci_12.cuQ;
        this.bVe.brq = n + aci_12.cuR;
        this.bVe.brp = n2 + aci_12.cuS;
        this.bVe.brr = n2 + aci_12.cuT;
        int n3 = n - aag_02.byK();
        int n4 = n2 - aag_02.byL();
        this.bVl.y(n3 + aci_12.cuQ, n3 + aci_12.cuR, n4 + aci_12.cuS, n4 + aci_12.cuT);
        if (!aag_02.m(this.bVe.brr, this.bVe.bro, this.bVe.brp, this.bVe.brq)) {
            return false;
        }
        float f2 = this.getWorldX();
        float f3 = this.getWorldY();
        float f4 = this.getAltitude();
        float f5 = f2;
        float f6 = f3;
        int n5 = GC.A(f5);
        int n6 = GC.A(f6);
        int n7 = GC.A(f4);
        if (agX.d(this)) {
            aaj_02.a(this, this.bVe, n5, n6, n7, this.bVr, false);
        }
        boolean bl2 = bl = (fArray = ((agf)aag_02).a(this))[3] != 0.0f;
        if (this.bVN != bl) {
            this.a(bl, WU.bQf);
            this.bVN = bl;
        }
        if (!bl) {
            return false;
        }
        System.arraycopy(fArray, 0, bVT, 0, fArray.length);
        byte by = aal_0.a(this.bVS, bVT);
        if (by != this.bVS) {
            this.bVS = by;
        }
        this.o(bVT);
        this.bpr().c(this.bVn);
        this.bVe.bIS().e(0, this.getScale(), this.getScale());
        this.bVe.bIS().d(0, acr_12.bVA(), acr_12.bVB());
        this.bVe.azR = this.azR;
        if (bUK && this.azR >= 1.0f && this.bVj && (f2 != (float)n5 || (float)n6 != f3)) {
            this.bVe.azR = this.azR + 1.0f;
        }
        this.bVe.cWN = f5;
        this.bVe.cWO = f6;
        this.bVe.cWP = f4;
        this.bVe.cej = this.bpX();
        if (!aaj_02.e(this)) {
            return false;
        }
        aaj_02.a(this.bVe, this.azR > 0.0f);
        return true;
    }

    private void d(aaj_0 aaj_02) {
        if (this.bVe == null) {
            return;
        }
        if (!agX.d(this)) {
            return;
        }
        float f2 = this.getWorldX();
        float f3 = this.getWorldY();
        float f4 = this.getAltitude();
        float f5 = f2;
        float f6 = f3;
        int n = GC.A(f5);
        int n2 = GC.A(f6);
        int n3 = GC.A(f4);
        aaj_02.a(this, this.bVe, n, n2, n3, this.bVr, false);
    }

    protected float bpQ() {
        return 0.0f;
    }

    protected float bpR() {
        return 0.0f;
    }

    public void a(aaj_0 aaj_02, int n) {
        this.bVM = false;
        this.bUP = true;
    }

    public long bpS() {
        return this.bVe.cWM;
    }

    public boolean m(eh_2 eh_22) {
        return false;
    }

    @Override
    public String bpT() {
        return this.bUL;
    }

    public void dV(String string) {
        assert (string != null);
        this.bUL = string;
    }

    @Override
    public String bpU() {
        return this.bUM;
    }

    public void dW(String string) {
        assert (string != null);
        this.bUM = string;
    }

    public void g(ArrayList<eh_2> arrayList) {
        boolean bl = false;
        int n = -1;
        int n2 = arrayList.size();
        for (int i = 0; i < n2; ++i) {
            eh_2 eh_22 = arrayList.get(i);
            int n3 = eh_22.aJc();
            if (bl && n != n3) break;
            Object r = zw_0.l(eh_22.getClass());
            bl |= r.a(this, (eh_2)eh_22);
            n = n3;
        }
    }

    public final void b(Material material) {
        if (this.bVn == null) {
            return;
        }
        this.bVn.f(material);
    }

    public void bpV() {
        if (this.bVn == null) {
            return;
        }
        this.bVn.x(0.0f, 0.0f, 0.0f);
        ArrayList<Entity> arrayList = this.bVe.bJd();
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            arrayList.get(i).bIZ();
        }
    }

    public void e(long l, long l2) {
        this.bVb.i(l, l2);
    }

    protected void bpW() {
        for (int i = this.bVb.aVo() - 1; i >= 0; --i) {
            ahk_1 ahk_12 = ahn_1.ccT().hL(this.bVb.wo(i));
            if (ahk_12 == null) continue;
            ahk_12.dZ(true);
            ahk_12.br(0.0f, 0.7f);
        }
        this.bVb.clear();
    }

    public short aKu() {
        return this.bVV;
    }

    public short bpX() {
        Anm anm = this.bqc();
        if (anm == null) {
            return this.aKu();
        }
        String string = this.bpE();
        Object object = string == null ? this.bKc : this.bKc + string;
        int n = anm.fM((String)object);
        if (n == -1) {
            return this.aKu();
        }
        return (short)n;
    }

    public void aq(short s) {
        this.bVV = s;
    }

    public void setSelected(boolean bl) {
    }

    public String bpY() {
        return this.bUN;
    }

    public void dX(String string) {
        this.bUN = string;
    }

    public void o(float[] fArray) {
        assert (fArray.length == 4);
        float f2 = this.bVO[3];
        float f3 = f2 * this.bVO[0] * fArray[0];
        float f4 = f2 * this.bVO[1] * fArray[1];
        float f5 = f2 * this.bVO[2] * fArray[2];
        float f6 = f2 * fArray[3];
        this.bVn.p(f3, f4, f5, f6);
    }

    @Override
    public void l(float f2) {
        this.azR = f2;
    }

    public float aJM() {
        return this.azR;
    }

    @Override
    public float bpZ() {
        return this.bVe.azR;
    }

    public boolean a(ZJ zJ) {
        if (!this.bVs.contains(zJ)) {
            return this.bVs.add(zJ);
        }
        return false;
    }

    public void bqa() {
        this.bVs.clear();
    }

    public void b(ZJ zJ) {
        this.bVt.add(zJ);
        this.bVu = true;
    }

    public void bqb() {
        this.bqf();
        this.bVt.addAll(this.bVs);
        this.bVu = true;
    }

    @Nullable
    public Anm bqc() {
        aro_1 aro_12 = this.bqd();
        return aro_12 == null ? null : aro_12.bHd();
    }

    public aro_1 bqd() {
        return this.bWb == null ? this.bVk : this.bWb;
    }

    public int dY(String string) {
        if (this.bqd() == null || string == null) {
            return 0;
        }
        return this.bqd().dY(string);
    }

    public final void bA(boolean bl) {
        if (this.bVv == bl) {
            return;
        }
        this.bB(bl);
    }

    public final void bB(boolean bl) {
        this.bVv = bl;
        if (this.bpr() == null) {
            return;
        }
        this.bVe.cWQ = this.bVv ? (this.bVe.cWQ |= 1) : (this.bVe.cWQ &= 0xFFFFFFFE);
        this.bVw.bK(this.bVv);
    }

    public final boolean bqe() {
        return this.bVv;
    }

    public final void bC(boolean bl) {
        this.bVy = bl;
        if (this.bVe != null) {
            this.bVe.cWQ = this.bVy ? (this.bVe.cWQ |= 2) : (this.bVe.cWQ &= 0xFFFFFFFD);
        }
    }

    public void bqf() {
        ArrayList<ZJ> arrayList = new ArrayList<ZJ>(this.bVs);
        arrayList.forEach(zJ -> zJ.animationEnded(this));
    }

    public void bD(boolean bl) {
        this.bVP = bl;
    }

    @Override
    public void p(float[] fArray) {
        if (fArray[0] == 1.0f && fArray[1] == 1.0f && fArray[2] == 1.0f) {
            return;
        }
        this.bVn.w(fArray[0], fArray[1], fArray[2]);
    }

    public void a(String[] stringArray, boolean bl) {
        for (String string : stringArray) {
            this.l(string, bl);
        }
    }

    public void l(String string, boolean bl) {
        int n = string.hashCode();
        if (bl) {
            this.bqd().tJ(n);
        } else {
            this.bqd().tI(n);
        }
    }

    protected void dC(long l) {
        this.aXv = l;
    }

    public long Sn() {
        return this.aXv;
    }

    @Override
    public float getAltitude() {
        return this.bVB;
    }

    @Override
    public float getWorldX() {
        return this.bVz;
    }

    @Override
    public float getWorldY() {
        return this.bVA;
    }

    @Override
    public int bcC() {
        return GC.A(this.bVz);
    }

    @Override
    public int bcD() {
        return GC.A(this.bVA);
    }

    @Override
    public short bcE() {
        return (short)GC.A(this.bVB);
    }

    @Override
    public void aB(float f2, float f3) {
        this.bVz = f2;
        this.bVA = f3;
        this.bpP();
        agX.c(this);
    }

    @Override
    public void e(float f2, float f3, float f4) {
        this.bVz = f2;
        this.bVA = f3;
        if (f4 == -32768.0f) {
            ZH.bWl.error((Object)"", (Throwable)new Exception("on vient de setter une altitude anormale"));
        }
        this.bVB = f4;
        this.bpP();
        agX.c(this);
    }

    public acd_1 bqg() {
        this.bVC.Q(this.bcC(), this.bcD(), (short)this.bVB);
        return this.bVC;
    }

    @Override
    public final int bqh() {
        return this.bVD;
    }

    @Override
    public final short bqi() {
        return this.bVE;
    }

    @Override
    public void a(int n, short s) {
        this.bVD = n;
        this.bVE = s;
    }

    @Override
    public int getScreenX() {
        return this.bVF;
    }

    @Override
    public int getScreenY() {
        return this.bVG;
    }

    @Override
    public void qu(int n) {
        this.bVF = n;
    }

    @Override
    public void qv(int n) {
        this.bVG = n;
    }

    @Override
    public void qw(int n) {
        this.bVH = n;
    }

    @Override
    public int bng() {
        return this.bVH;
    }

    public float getScale() {
        if (this.bVU != 0.0f) {
            return this.bVU;
        }
        return this.azQ;
    }

    @Override
    public boolean isVisible() {
        return this.bmg;
    }

    public float aIX() {
        return this.bVO[3];
    }

    public void setAlpha(float f2) {
        this.bVO[3] = f2;
    }

    public void bR(float f2) {
        this.bVO[3] = this.bVR = f2;
    }

    public void bqj() {
        this.bVO[3] = this.bVR;
    }

    public float bqk() {
        return this.bVQ;
    }

    public boolean bql() {
        return this.bVI != null;
    }

    @Override
    public void a(WR wR) {
        if (this.bVI == null) {
            this.bVI = new ArrayList();
        }
        this.bVI.add(wR);
        wR.setTargetIsVisible(this.bVJ);
    }

    @Override
    public void b(WR wR) {
        if (this.bVI == null) {
            return;
        }
        this.bVI.remove(wR);
        if (this.bVI.size() == 0) {
            this.bVI = null;
            this.bVF = Integer.MIN_VALUE;
            this.bVG = Integer.MIN_VALUE;
        }
    }

    public void bqm() {
        if (this.bVI != null) {
            for (int i = 0; i < this.bVI.size(); ++i) {
                this.bVI.get(i).a(this, this.bVF, this.bVG, this.bVH);
            }
        }
    }

    public void bE(boolean bl) {
        if (bl == this.bVJ) {
            return;
        }
        this.bVJ = bl;
        this.bqn();
    }

    public void bF(boolean bl) {
        if (bl == this.bVK) {
            return;
        }
        this.bVK = bl;
        this.bqn();
    }

    private void bqn() {
        if (this.bVI == null) {
            return;
        }
        for (int i = 0; i < this.bVI.size(); ++i) {
            this.bVI.get(i).setTargetIsVisible(!this.bVK && this.bVJ);
        }
    }

    public void a(boolean bl, WU wU) {
        if (this.bVL != null) {
            for (int i = 0; i < this.bVL.size(); ++i) {
                this.bVL.get(i).b(bl, wU);
            }
        }
    }

    public void a(WT wT) {
        if (this.bVL == null) {
            this.bVL = new ArrayList();
        }
        this.bVL.add(wT);
    }

    public void b(WT wT) {
        if (this.bVL != null) {
            this.bVL.remove(wT);
        }
    }

    @Override
    public int bqo() {
        return -1;
    }

    public boolean bqp() {
        return this.bVS == 1 || this.bVS == 0;
    }

    @Override
    public final void bG(boolean bl) {
        this.bVS = (byte)(bl ? 0 : 2);
    }

    public void bH(boolean bl) {
        this.bVW = bl;
        this.bVW = false;
    }

    public static void bI(boolean bl) {
        bUK = bl;
    }

    @Override
    public void a(FreeParticleSystem freeParticleSystem) {
        if (this.bVX == null) {
            this.bVX = new ArrayList();
        }
        this.bVX.add(freeParticleSystem);
    }

    @Override
    public void b(FreeParticleSystem freeParticleSystem) {
        if (this.bVX != null) {
            this.bVX.remove(freeParticleSystem);
        }
    }

    @Override
    public void a(acf acf2) {
        if (this.bVY == null) {
            this.bVY = new ArrayList();
        }
        this.bVY.add(acf2);
    }

    @Override
    public void b(acf acf2) {
        if (this.bVY != null) {
            this.bVY.remove(acf2);
        }
    }

    @Override
    public void bqq() {
        int n;
        if (this.bVX != null) {
            for (n = 0; n < this.bVX.size(); ++n) {
                this.bVX.get(n).bLI();
            }
        }
        if (this.bVY != null) {
            for (n = 0; n < this.bVY.size(); ++n) {
                this.bVY.get(n).ut(100);
            }
        }
    }

    public float[] qU(int n) {
        if (this.bqd() == null) {
            return null;
        }
        return this.bqd().qU(n);
    }

    public void a(arx_1 arx_12, float[] fArray) {
        this.a(arx_12.bHJ(), fArray);
    }

    public void a(int n, float[] fArray) {
        this.a(n, fArray, true);
    }

    public void a(int n, float[] fArray, boolean bl) {
        assert (fArray == null || fArray.length == 4);
        aro_1 aro_12 = this.bqd();
        if (aro_12 == null) {
            return;
        }
        if (fArray == null) {
            aro_12.tN(n);
        }
        if (!bl && aro_12.qU(n) != null) {
            return;
        }
        aro_12.c(n, fArray);
    }
}

