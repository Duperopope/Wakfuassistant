/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TLongProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.set.hash.TLongHashSet
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.highlight.HighLightEntity;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TLongProcedure;
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.set.hash.TLongHashSet;
import org.apache.log4j.Logger;

/*
 * Renamed from agu
 */
public class agu_0 {
    private static final Logger ctU = Logger.getLogger(agu_0.class);
    String p;
    public int ctV;
    private Material bVn;
    private final TLongObjectHashMap<HighLightEntity> ctW = new TLongObjectHashMap();
    final TLongHashSet ctX = new TLongHashSet();
    private boolean bmg = true;
    private awk_1 bXx;
    private agb_0 ctY;
    private static final TObjectProcedure<HighLightEntity> ctZ = new agw_0();

    agu_0(String string, awk_1 awk_12, agb_0 agb_02) {
        assert (awk_12 != null);
        this.p = string;
        this.ctY = agb_02;
        this.bVn = (Material)Material.daL.bSK();
        this.bXx = awk_12;
        this.bXx.bGY();
    }

    public void e(TObjectProcedure<acd_1> tObjectProcedure) {
        this.ctW.forEachKey((TLongProcedure)new agv_0(this, tObjectProcedure));
    }

    public agb_0 bzc() {
        return this.ctY;
    }

    public void a(awk_1 awk_12, agb_0 agb_02) {
        boolean bl = awk_12 != this.bXx;
        awk_12.bGY();
        this.bXx.bsI();
        this.bXx = awk_12;
        this.ctY = agb_02;
        TLongObjectIterator tLongObjectIterator = this.ctW.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            HighLightEntity highLightEntity = (HighLightEntity)tLongObjectIterator.value();
            highLightEntity.a(0, this.bXx);
            if (!bl) continue;
            GeometryMesh geometryMesh = (GeometryMesh)highLightEntity.uh(0);
            this.a(geometryMesh);
            highLightEntity.ctT = false;
        }
    }

    public boolean aJG() {
        return this.ctW.isEmpty();
    }

    public float[] aXT() {
        return this.bVn.bKT();
    }

    public void q(float[] fArray) {
        this.setColor(new awx_2(fArray));
    }

    public void setColor(axb_2 axb_22) {
        this.bVn.N(axb_22.bQj());
        TLongObjectIterator tLongObjectIterator = this.ctW.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            HighLightEntity highLightEntity = (HighLightEntity)tLongObjectIterator.value();
            GeometryMesh geometryMesh = (GeometryMesh)highLightEntity.uh(0);
            geometryMesh.c(axb_22.aIU(), axb_22.aIV(), axb_22.aIW(), axb_22.aIX());
            highLightEntity.ctT = false;
        }
    }

    final acc_1 bzd() {
        return this.bXx.bQs();
    }

    public boolean isVisible() {
        return this.bmg;
    }

    public void setVisible(boolean bl) {
        this.bmg = bl;
    }

    boolean fa(long l) {
        return this.ctW.contains(l);
    }

    public boolean d(int n, int n2, short s) {
        return this.fa(agx_0.E(n, n2, s));
    }

    final HighLightEntity D(int n, int n2, int n3) {
        return this.fV(agx_0.E(n, n2, n3));
    }

    HighLightEntity fV(long l) {
        return (HighLightEntity)this.ctW.get(l);
    }

    public void clear() {
        if (!this.ctW.isEmpty()) {
            this.ctW.forEachValue(ctZ);
        }
        this.ctW.clear();
    }

    public void ap(int n, int n2) {
        this.E(n, n2, (short)0);
    }

    public void E(int n, int n2, short s) {
        long l = agx_0.E(n, n2, s);
        this.fW(l);
    }

    public void G(int n, int n2, short s) {
        long l = agx_0.E(n, n2, s);
        this.eX(l);
    }

    void fW(long l) {
        if (this.ctW.get(l) != null) {
            return;
        }
        try {
            HighLightEntity highLightEntity = (HighLightEntity)HighLightEntity.ctS.bSK();
            GeometryMesh geometryMesh = (GeometryMesh)GLGeometryMesh.dbh.bSK();
            assert (highLightEntity.bSW() == 0);
            assert (geometryMesh.bSW() == 0);
            geometryMesh.a(aso_1.cZT, 4, arq_2.cVu);
            this.a(geometryMesh);
            geometryMesh.c(0.5f, 0.5f, 0.5f, 1.0f);
            awp_1 awp_12 = new awp_1();
            awp_12.bPx();
            highLightEntity.bIS().a(awp_12);
            Material material = Material.daH;
            highLightEntity.a(geometryMesh, this.bXx, material);
            geometryMesh.bsI();
            highLightEntity.a(ast_1.bJG().bJH(), asa_1.cYC, asa_1.cZg);
            this.ctW.put(l, (Object)highLightEntity);
        }
        catch (Exception exception) {
            ctU.error((Object)("probl\u00e8me cr\u00e9ation highlight entity layer=" + this.p), (Throwable)exception);
        }
    }

    private void a(GeometryMesh geometryMesh) {
        VertexBufferPCT vertexBufferPCT = geometryMesh.bKd();
        vertexBufferPCT.ud(4);
        float f2 = (float)this.bXx.bQs().bWx() / (float)this.bXx.bQt().bWx();
        float f3 = (float)this.bXx.bQs().bWy() / (float)this.bXx.bQt().bWy();
        vertexBufferPCT.b(0, 0.0f, 0.0f);
        vertexBufferPCT.b(1, 0.0f, f3);
        vertexBufferPCT.b(2, f2, f3);
        vertexBufferPCT.b(3, f2, 0.0f);
    }

    void eX(long l) {
        if (this.ctW.isEmpty()) {
            return;
        }
        HighLightEntity highLightEntity = (HighLightEntity)this.ctW.remove(l);
        if (highLightEntity != null) {
            highLightEntity.bsI();
            highLightEntity.ctT = false;
        }
    }

    void f(TObjectProcedure<HighLightEntity> tObjectProcedure) {
        if (!this.ctW.isEmpty()) {
            this.ctW.forEachValue(tObjectProcedure);
        }
    }

    void aZp() {
        this.clear();
        this.bVn.bsI();
        this.bXx.bsI();
        this.bVn = null;
        this.bXx = null;
    }

    public String toString() {
        return this.p + " cellCount=" + this.ctW.size();
    }
}

