/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import com.ankamagames.framework.graphics.engine.geometry.Geometry;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import com.ankamagames.framework.graphics.engine.particleSystem.Emitter;
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;

/*
 * Renamed from atx
 */
public class atx_1 {
    protected final TIntObjectHashMap<aws_2> dcY = new TIntObjectHashMap();
    protected final TIntObjectHashMap<awk_1> dcZ = new TIntObjectHashMap();
    static final /* synthetic */ boolean dda;
    final /* synthetic */ ParticleSystem ddb;

    public atx_1(ParticleSystem particleSystem) {
        this.ddb = particleSystem;
    }

    public final aws_2 uC(int n) {
        return (aws_2)this.dcY.get(n);
    }

    public final void a(int n, aws_2 aws_22, boolean bl) {
        this.dcY.put(n, (Object)aws_22);
        this.b(n, aws_22, bl);
    }

    public final void uD(int n) {
        this.dcY.remove(n);
    }

    private void b(int n, aws_2 aws_22, boolean bl) {
        long l = this.ddb.uB(n);
        awk_1 awk_12 = awm_1.bPn().gB(l);
        if (awk_12 != null) {
            awk_12.bGY();
            this.dcZ.put(n, (Object)awk_12);
            return;
        }
        axj_2 axj_22 = axc_2.a(aws_22.aKU(), aws_22.getWidth(), aws_22.getHeight(), 32);
        axc_2 axc_22 = new axc_2(ayl_2.dtT, axj_22);
        awk_12 = awm_1.bPn().a((art_1)aru_2.cVG.bIv(), l, axc_22, bl);
        awk_12.bGY();
        this.dcZ.put(n, (Object)awk_12);
        axj_22.bsI();
        axc_22.bsI();
    }

    public void a(Emitter emitter) {
        awk_1 awk_12;
        Geometry geometry;
        int n;
        if (!dda && !this.ddb.isEditable()) {
            throw new AssertionError();
        }
        int n2 = emitter.dbW.deD.aSq() * 4;
        ArrayList<atw_2> arrayList = emitter.dbW.deE;
        int n3 = arrayList.size();
        if (emitter.dbT == null) {
            emitter.dbT = new ArrayList(n3);
        }
        for (n = 0; n < n3; ++n) {
            atw_2 atw_22 = arrayList.get(n);
            geometry = (GLGeometryMesh)GLGeometryMesh.dbh.bSK();
            ((GeometryMesh)geometry).a(aso_1.cZT, n2, arq_2.cVv);
            geometry.c(auw_2.dfI, auw_2.dfM);
            awk_12 = (awk_1)this.ddb.dcu.dcZ.get(atw_22.aPA());
            this.ddb.a(geometry, awk_12, ParticleSystem.dcx);
            ((GLGeometryMesh)geometry).bsI();
            geometry.c(this.ddb.bVo, this.ddb.dcz);
            emitter.dbT.add((GeometryMesh)geometry);
        }
        int n4 = this.ddb.bJf();
        for (n = 0; n < n4; ++n) {
            geometry = this.ddb.uh(n);
            geometry.bGY();
            awk_12 = this.ddb.ui(n);
            awk_12.bGY();
        }
        ParticleSystem.e(this.ddb);
        if (this.ddb.dcB.dcp != null) {
            Emitter[] emitterArray = this.ddb.dcB.dcp;
            int n5 = emitterArray.length;
            for (n4 = 0; n4 < n5; ++n4) {
                this.b(emitterArray[n4]);
            }
        }
        n4 = this.ddb.bJf();
        for (int i = 0; i < n4; ++i) {
            this.ddb.ui(i).bsI();
        }
    }

    private void b(Emitter emitter) {
        Emitter[] emitterArray;
        ayy_2 ayy_22;
        int n;
        if (emitter == null) {
            return;
        }
        ArrayList<atw_2> arrayList = emitter.dbW.deE;
        int n2 = arrayList.size();
        for (n = 0; n < n2; ++n) {
            atw_2 atw_22 = arrayList.get(n);
            ayy_22 = (awk_1)this.ddb.dcu.dcZ.get(atw_22.aPA());
            emitterArray = emitter.dbT.get(n);
            this.ddb.a((Geometry)emitterArray, (awk_1)ayy_22, ParticleSystem.dcx);
            emitterArray.bsI();
        }
        if (emitter.dbU != null) {
            n = emitter.dbU.bLz();
            for (int i = 0; i < n; ++i) {
                ayy_22 = emitter.dbU.uy(i);
                if (!((Particle)ayy_22).bLu()) continue;
                emitterArray = ((Particle)ayy_22).dcp;
                int n3 = emitterArray.length;
                for (int j = 0; j < n3; ++j) {
                    this.b(emitterArray[j]);
                }
            }
        }
    }

    static {
        dda = !ParticleSystem.class.desiredAssertionStatus();
    }
}

