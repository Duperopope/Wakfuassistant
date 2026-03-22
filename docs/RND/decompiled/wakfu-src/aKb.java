/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.set.hash.THashSet
 *  gnu.trove.set.hash.TLongHashSet
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.set.hash.THashSet;
import gnu.trove.set.hash.TLongHashSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.log4j.Logger;

public class aKb {
    private static final float ecL = -0.09f;
    private static final float ecM = -0.18f;
    private static final float ecN = 0.3f;
    private static final Logger ecO = Logger.getLogger(aKb.class);
    private final aKp ecP;
    private final aKc ecQ;
    private final TLongObjectHashMap<Entity> ecR = new TLongObjectHashMap();
    private final Set<Long> ecS = new HashSet<Long>();
    private final THashSet<Entity> ecT = new THashSet();
    private final TLongHashSet ecU = new TLongHashSet();
    private final float[] ecV = new float[4];
    private static boolean ecW = false;

    public static void ex(boolean bl) {
        ecW = bl;
    }

    public aKb(rh_0 rh_02, aKc aKc2) {
        this.ecP = new aKp(rh_02);
        this.ecQ = aKc2;
    }

    public void clear() {
        this.ecT.clear();
        this.ecR.forEachValue(entity -> {
            if (entity != null) {
                entity.bsI();
            }
            return true;
        });
    }

    public void w(List<DisplayedScreenElement> list) {
        this.ecT.clear();
        this.ecU.clear();
        for (DisplayedScreenElement displayedScreenElement : list) {
            long l = aKb.c(displayedScreenElement);
            if (this.ecU.contains(l)) continue;
            Entity entity = (Entity)this.ecR.get(l);
            if (entity == null) {
                entity = this.g(displayedScreenElement);
                this.ecR.put(l, (Object)entity);
            }
            if (entity == null) continue;
            this.ecU.add(l);
            if (this.ecT.contains((Object)entity)) continue;
            this.ecT.add((Object)entity);
        }
    }

    public boolean a(acx_0 acx_02) {
        long l = aKb.c(acx_02);
        return this.ecU.contains(l) && this.ecS.contains(l);
    }

    public boolean b(acx_0 acx_02) {
        return this.ecU.contains(aKb.c(acx_02));
    }

    private static long c(acx_0 acx_02) {
        long l = acx_02.bcC();
        long l2 = acx_02.bcD();
        short s = acx_02.bcE();
        return (l2 & 0x3FFFFL) << 32 | (l & 0x3FFFFL) << 14 | (long)(s & 0x3FFF);
    }

    public Collection<Entity> ciq() {
        return this.ecT;
    }

    public Collection<Entity> cir() {
        HashSet<Entity> hashSet = new HashSet<Entity>();
        this.ecS.forEach(l -> hashSet.add((Entity)this.ecR.get(l.longValue())));
        return hashSet;
    }

    private Entity g(DisplayedScreenElement displayedScreenElement) {
        if (displayedScreenElement.brq()) {
            return null;
        }
        aKn aKn2 = this.ecP.W(displayedScreenElement.bcC(), displayedScreenElement.bcD(), displayedScreenElement.bcE());
        if (aKn2 == null) {
            return null;
        }
        if (aKn2.ciG()) {
            this.ecS.add(aKb.c(displayedScreenElement));
        }
        Entity3D entity3D = this.i(displayedScreenElement);
        this.a(entity3D, aso_1.cZT, this.a(aKn2));
        this.a(displayedScreenElement, entity3D, aKn2);
        return entity3D;
    }

    public Entity3D h(DisplayedScreenElement displayedScreenElement) {
        if (displayedScreenElement.brq()) {
            return null;
        }
        aKn aKn2 = this.ecP.W(displayedScreenElement.bcC(), displayedScreenElement.bcD(), displayedScreenElement.bcE());
        if (aKn2 == null) {
            return null;
        }
        if (aKn2.ciG()) {
            this.ecS.add(aKb.c(displayedScreenElement));
        }
        Entity3D entity3D = this.i(displayedScreenElement);
        this.a(displayedScreenElement, entity3D, aKn2);
        return entity3D;
    }

    private void a(DisplayedScreenElement displayedScreenElement, Entity3D entity3D, aKn aKn2) {
        wt_0 wt_02;
        this.a(entity3D, aso_1.cZP, this.b(aKn2), 1.0f, false);
        if (aKn2.edU != 0.0f || aKn2.edV != 0.0f) {
            this.a(entity3D, aso_1.cZO, this.c(aKn2), 1.0f, false);
        }
        if (ecW && (int)entity3D.cWP != this.ecP.ciK()) {
            ava_2.bMH().aD((short)-3856);
            this.a(entity3D, 0, 0);
            this.a(entity3D, 1, 0);
            this.a(entity3D, 0, 1);
        }
        if ((wt_02 = this.ecP.i(displayedScreenElement.bcC(), displayedScreenElement.bcD(), displayedScreenElement.bcE())) != null && wt_02.bma() == 16) {
            int n = wt_02.bap;
            int n2 = wt_02.baq;
            short s = wt_02.ban;
            this.a(n, n2, s, this.ecP.i(n - 1, n2, s), entity3D);
            this.a(n, n2, s, this.ecP.i(n, n2 - 1, s), entity3D);
            this.a(n, n2, s, this.ecP.i(n + 1, n2, s), entity3D);
            this.a(n, n2, s, this.ecP.i(n, n2 + 1, s), entity3D);
        }
    }

    private Entity3D i(DisplayedScreenElement displayedScreenElement) {
        Entity3D entity3D = (Entity3D)Entity3D.cXb.bSK();
        Entity entity = displayedScreenElement.brl();
        entity3D.cWN = entity.cWN;
        entity3D.cWO = entity.cWO;
        entity3D.cWP = entity.cWP;
        entity3D.azR = entity.azR;
        entity3D.cWM = entity.cWM;
        entity3D.cej = entity.cej;
        entity3D.cWQ = entity.cWQ;
        return entity3D;
    }

    private void a(Entity3D entity3D, int n, int n2) {
        int n3;
        int n4;
        aKm aKm2;
        float f2 = 4.3f;
        int n5 = (int)entity3D.cWN;
        int n6 = (int)entity3D.cWO;
        int n7 = (int)entity3D.cWP;
        int n8 = 1;
        while ((aKm2 = this.ecP.db(n4 = n5 - n8 + n, n3 = n6 - n8 + n2)) != null) {
            aKl aKl2 = aKm2.yR(GC.C((float)n7 - (float)(n8 - 1) * 4.3f) - 1);
            if (aKl2 != null && aKl2.ciF() != n7) {
                aKn aKn2 = new aKn(true, aKl2.ciF(), 0, 0, n4, n3, aKl2.edM);
                this.a(entity3D, aso_1.cZO, this.d(aKn2), 1.0f, true);
            }
            ++n8;
        }
    }

    private void a(int n, int n2, int n3, wt_0 wt_02, Entity3D entity3D) {
        if (wt_02 == null) {
            return;
        }
        if (wt_02.bma() == 16 || wt_02.bma() == 48) {
            return;
        }
        boolean bl = n == wt_02.bap;
        boolean bl2 = n < wt_02.bap;
        boolean bl3 = n2 < wt_02.baq;
        float f2 = aau_0.bk(n, n2);
        float f3 = aau_0.p(n, n2, n3);
        float f4 = 86.0f * (bl ? (bl3 ? -0.5f : 0.5f) : (bl2 ? 0.5f : -0.5f));
        float f5 = 43.0f * (bl ? (bl3 ? -0.5f : 0.5f) : (bl2 ? 0.05f : -0.05f));
        float f6 = 86.0f * (bl ? (bl3 ? 0.05f : -0.05f) : (bl2 ? -0.05f : 0.05f));
        float f7 = 43.0f * (bl ? (bl3 ? -0.45f : 0.45f) : (bl2 ? -0.45f : 0.45f));
        float f8 = 86.0f * (bl ? (bl3 ? -0.45f : 0.45f) : 0.0f);
        float f9 = 43.0f * (bl ? (bl3 ? 0.05f : -0.05f) : (bl2 ? -0.5f : 0.5f));
        float f10 = 86.0f * (bl ? 0.0f : (bl2 ? 0.45f : -0.45f));
        VertexBufferPCT vertexBufferPCT = VertexBufferPCT.cWa.uf(5);
        vertexBufferPCT.bIH();
        float[] fArray = this.ecQ.cis().bQj();
        vertexBufferPCT.a(f2 + f4, f3, 0.0f, 0.0f, fArray);
        vertexBufferPCT.a(f2 + f10, f3 + f5, 0.0f, 0.0f, fArray);
        vertexBufferPCT.a(f2 + f6, f3 + f7, 0.0f, 0.0f, fArray);
        vertexBufferPCT.a(f2 + f8, f3 + f9, 0.0f, 0.0f, fArray);
        vertexBufferPCT.a(f2 + f4, f3, 0.0f, 0.0f, fArray);
        vertexBufferPCT.bIi();
        this.a(entity3D, aso_1.cZT, vertexBufferPCT);
    }

    private VertexBufferPCT a(aKn aKn2) {
        float[] fArray;
        VertexBufferPCT vertexBufferPCT = VertexBufferPCT.cWa.uf(12);
        vertexBufferPCT.bIH();
        float f2 = 0.3f * this.ecP.eo(aKn2.edT);
        float[] fArray2 = aKb.e(this.a(aKn2, this.ecV), f2);
        vertexBufferPCT.a(aKn2.aKq(), aKn2.bsT(), 0.0f, 0.0f, fArray2);
        vertexBufferPCT.a(aKn2.bsS(), aKn2.ciI(), 0.0f, 0.0f, fArray2);
        vertexBufferPCT.a(aKn2.aKs(), aKn2.bsT(), 0.0f, 0.0f, fArray2);
        vertexBufferPCT.a(aKn2.bsS(), aKn2.ciH(), 0.0f, 0.0f, fArray2);
        if (aKn2.edU != 0.0f) {
            fArray = aKb.e(this.a(aKn2, this.ecV), f2 + -0.09f);
            vertexBufferPCT.a(aKn2.aKq(), aKn2.bsT(), 0.0f, 0.0f, fArray);
            vertexBufferPCT.a(aKn2.aKq(), aKn2.bsT() - aKn2.edU, 0.0f, 0.0f, fArray);
            vertexBufferPCT.a(aKn2.bsS(), aKn2.ciI() - aKn2.edU, 0.0f, 0.0f, fArray);
            vertexBufferPCT.a(aKn2.bsS(), aKn2.ciI(), 0.0f, 0.0f, fArray);
        }
        if (aKn2.edV != 0.0f) {
            fArray = aKb.e(this.a(aKn2, this.ecV), f2 + -0.18f);
            vertexBufferPCT.a(aKn2.bsS(), aKn2.ciI(), 0.0f, 0.0f, fArray);
            vertexBufferPCT.a(aKn2.bsS(), aKn2.ciI() - aKn2.edV, 0.0f, 0.0f, fArray);
            vertexBufferPCT.a(aKn2.aKs(), aKn2.bsT() - aKn2.edV, 0.0f, 0.0f, fArray);
            vertexBufferPCT.a(aKn2.aKs(), aKn2.bsT(), 0.0f, 0.0f, fArray);
        }
        vertexBufferPCT.bIi();
        return vertexBufferPCT;
    }

    private float[] a(aKn aKn2, float[] fArray) {
        axb_2 axb_22 = aKn2.ciG() ? this.ecQ.cis() : (aKn2.edW ? this.ecQ.ciw() : this.ecQ.civ());
        fArray[0] = axb_22.aIU();
        fArray[1] = axb_22.aIV();
        fArray[2] = axb_22.aIW();
        fArray[3] = axb_22.aIX();
        return fArray;
    }

    private static float[] e(float[] fArray, float f2) {
        fArray[0] = fArray[0] + f2;
        fArray[1] = fArray[1] + f2;
        fArray[2] = fArray[2] + f2;
        return fArray;
    }

    private VertexBufferPCT b(aKn aKn2) {
        VertexBufferPCT vertexBufferPCT = VertexBufferPCT.cWa.uf(5);
        vertexBufferPCT.bIH();
        float[] fArray = this.a(aKn2, this.ecV);
        axb_2 axb_22 = this.ecQ.cit();
        fArray[0] = axb_22.aIU();
        fArray[1] = axb_22.aIV();
        fArray[2] = axb_22.aIW();
        fArray[3] = axb_22.aIX();
        vertexBufferPCT.a(aKn2.aKq(), aKn2.bsT(), 0.0f, 0.0f, fArray);
        vertexBufferPCT.a(aKn2.bsS(), aKn2.ciI(), 0.0f, 0.0f, fArray);
        vertexBufferPCT.a(aKn2.aKs(), aKn2.bsT(), 0.0f, 0.0f, fArray);
        vertexBufferPCT.a(aKn2.bsS(), aKn2.ciH(), 0.0f, 0.0f, fArray);
        vertexBufferPCT.a(aKn2.aKq(), aKn2.bsT(), 0.0f, 0.0f, fArray);
        vertexBufferPCT.bIi();
        return vertexBufferPCT;
    }

    private VertexBufferPCT c(aKn aKn2) {
        float f2;
        VertexBufferPCT vertexBufferPCT = VertexBufferPCT.cWa.uf(6);
        vertexBufferPCT.bIH();
        float[] fArray = this.a(aKn2, this.ecV);
        axb_2 axb_22 = this.ecQ.cit();
        fArray[0] = axb_22.aIU();
        fArray[1] = axb_22.aIV();
        fArray[2] = axb_22.aIW();
        fArray[3] = axb_22.aIX();
        if (aKn2.edU != 0.0f) {
            vertexBufferPCT.a(aKn2.aKq(), aKn2.bsT(), 0.0f, 0.0f, fArray);
            vertexBufferPCT.a(aKn2.aKq(), aKn2.bsT() - aKn2.edU, 0.0f, 0.0f, fArray);
        }
        if (aKn2.edV != 0.0f) {
            vertexBufferPCT.a(aKn2.aKs(), aKn2.bsT() - aKn2.edV, 0.0f, 0.0f, fArray);
            vertexBufferPCT.a(aKn2.aKs(), aKn2.bsT(), 0.0f, 0.0f, fArray);
        }
        if ((f2 = Math.max(aKn2.edU, aKn2.edV)) != 0.0f) {
            vertexBufferPCT.a(aKn2.bsS(), aKn2.ciI(), 0.0f, 0.0f, fArray);
            vertexBufferPCT.a(aKn2.bsS(), aKn2.ciI() - f2, 0.0f, 0.0f, fArray);
        }
        vertexBufferPCT.bIi();
        return vertexBufferPCT;
    }

    private VertexBufferPCT d(aKn aKn2) {
        VertexBufferPCT vertexBufferPCT = VertexBufferPCT.cWa.uf(8);
        vertexBufferPCT.bIH();
        float[] fArray = this.a(aKn2, this.ecV);
        axb_2 axb_22 = this.ecQ.ciu();
        fArray[0] = axb_22.aIU();
        fArray[1] = axb_22.aIV();
        fArray[2] = axb_22.aIW();
        fArray[3] = axb_22.aIX();
        vertexBufferPCT.a(aKn2.aKq(), aKn2.bsT(), 0.0f, 0.0f, fArray);
        vertexBufferPCT.a(aKn2.bsS(), aKn2.ciI(), 0.0f, 0.0f, fArray);
        vertexBufferPCT.a(aKn2.bsS(), aKn2.ciI(), 0.0f, 0.0f, fArray);
        vertexBufferPCT.a(aKn2.aKs(), aKn2.bsT(), 0.0f, 0.0f, fArray);
        vertexBufferPCT.a(aKn2.aKs(), aKn2.bsT(), 0.0f, 0.0f, fArray);
        vertexBufferPCT.a(aKn2.bsS(), aKn2.ciH(), 0.0f, 0.0f, fArray);
        vertexBufferPCT.a(aKn2.bsS(), aKn2.ciH(), 0.0f, 0.0f, fArray);
        vertexBufferPCT.a(aKn2.aKq(), aKn2.bsT(), 0.0f, 0.0f, fArray);
        vertexBufferPCT.bIi();
        return vertexBufferPCT;
    }

    private void a(Entity3D entity3D, aso_1 aso_12, VertexBufferPCT vertexBufferPCT) {
        this.a(entity3D, aso_12, vertexBufferPCT, 0.0f, false);
    }

    private void a(Entity3D entity3D, aso_1 aso_12, VertexBufferPCT vertexBufferPCT, float f2, boolean bl) {
        GLGeometryMesh gLGeometryMesh = (GLGeometryMesh)GLGeometryMesh.dbh.bSK();
        gLGeometryMesh.a(aso_12, vertexBufferPCT, arq_2.cVv);
        gLGeometryMesh.cN(f2);
        gLGeometryMesh.cR(bl);
        entity3D.b(gLGeometryMesh);
        gLGeometryMesh.bsI();
    }

    boolean S(int n, int n2) {
        aKm aKm2 = this.ecP.db(n, n2);
        return aKm2 != null && aKm2 != aKm.edQ;
    }
}

