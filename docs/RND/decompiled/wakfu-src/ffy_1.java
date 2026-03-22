/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fFY
 */
public class ffy_1 {
    private Entity3D bRE;
    @NotNull
    private final List<fga_1> urX = new ArrayList<fga_1>();
    private static final int urY = 3;
    private int urZ = 3;
    @Nullable
    private axb_2 ncL;
    private List<ftf_1> usa;

    public Entity3D bnL() {
        return this.bRE;
    }

    public int getVertices() {
        return this.urZ;
    }

    public void setVertices(int n) {
        if (n >= 3 && this.urZ != n) {
            this.urZ = n;
            this.bJs();
        }
    }

    @Nullable
    public axb_2 getModulationColor() {
        return this.ncL;
    }

    public void setModulationColor(@Nullable axb_2 axb_22) {
        this.ncL = axb_22;
    }

    public List<ftf_1> getSeries() {
        return this.usa;
    }

    public void S(Collection<ftf_1> collection) {
        this.usa = new ArrayList<ftf_1>(collection);
        this.bJs();
    }

    public void O(int n, int n2, int n3, int n4) {
        if (n3 == 0 && n4 == 0) {
            return;
        }
        if (this.urX.isEmpty() || this.usa == null || this.usa.isEmpty()) {
            return;
        }
        float f2 = this.urZ % 2 == 0 ? 2.0f / (float)this.urZ : 0.5f;
        float[] fArray = this.gxo();
        float f3 = fArray[0];
        float f4 = fArray[1];
        for (int i = 0; i < this.usa.size(); ++i) {
            fga_1 fga_12;
            ftf_1 ftf_12 = this.usa.get(i);
            if (ftf_12 == null) continue;
            fga_1 fga_13 = fga_12 = i < this.urX.size() ? this.urX.get(i) : null;
            if (fga_12 == null) continue;
            this.a(ftf_12, fga_12, n, n2, n3, n4, f2, f3, f4);
        }
    }

    private void a(@NotNull ftf_1 ftf_12, @NotNull fga_1 fga_12, int n, int n2, int n3, int n4, float f2, float f3, float f4) {
        fga_12.bIH();
        float[] fArray = new float[this.urZ];
        float[] fArray2 = new float[this.urZ];
        for (int i = 0; i < this.urZ; ++i) {
            double d2 = Math.PI * (-2.0 * (double)i / (double)this.urZ + (double)f2);
            float f5 = GC.b(ftf_12.acg(i), 0.0f, 1.0f);
            fArray[i] = (float)((double)n3 / 2.0 * ((StrictMath.cos(d2) - (double)f3) * (double)f5 + 1.0) + (double)n);
            fArray2[i] = (float)((double)n4 / 2.0 * ((StrictMath.sin(d2) - (double)f4) * (double)f5 + 1.0) + (double)n2);
        }
        float f6 = (float)n + (float)n3 / 2.0f;
        float f7 = (float)n2 + (float)n4 / 2.0f;
        float[] fArray3 = this.af(ftf_12.gGB());
        float[] fArray4 = this.af(ftf_12.gGC());
        for (int i = 0; i < this.urZ; ++i) {
            int n5 = i;
            int n6 = i < this.urZ - 1 ? i + 1 : 0;
            fga_12.usc.a(fArray[n5], fArray2[n5], 0.0f, 0.0f, fArray3);
            fga_12.usc.a(fArray[n6], fArray2[n6], 0.0f, 0.0f, fArray3);
            fga_12.usb.a(f6, f7, 0.0f, 0.0f, fArray4);
            fga_12.usb.a(f6, f7, 0.0f, 0.0f, fArray4);
            fga_12.usb.a(fArray[n5], fArray2[n5], 0.0f, 0.0f, fArray4);
            fga_12.usb.a(fArray[n6], fArray2[n6], 0.0f, 0.0f, fArray4);
        }
        fga_12.bIi();
    }

    private float[] af(float[] fArray) {
        if (this.ncL == null) {
            return fArray;
        }
        return new float[]{fArray[0] * this.ncL.aIU(), fArray[1] * this.ncL.aIV(), fArray[2] * this.ncL.aIW(), fArray[3] * this.ncL.aIX()};
    }

    private float[] gxo() {
        boolean bl = this.urZ % 2 == 0;
        double d2 = bl ? 2.0 / (double)this.urZ : 0.5;
        float f2 = Float.MAX_VALUE;
        float f3 = Float.MIN_VALUE;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MIN_VALUE;
        for (int i = 0; i < this.urZ; ++i) {
            float f6;
            double d3 = Math.PI * (-2.0 * (double)i / (double)this.urZ + d2);
            float f7 = (float)StrictMath.cos(d3);
            if (f7 < f2) {
                f2 = f7;
            }
            if (f7 > f3) {
                f3 = f7;
            }
            if ((f6 = (float)StrictMath.sin(d3)) < f4) {
                f4 = f6;
            }
            if (!(f6 > f5)) continue;
            f5 = f6;
        }
        return new float[]{(f3 + f2) / 2.0f, (f5 + f4) / 2.0f};
    }

    public void aVH() {
        this.urX.forEach(fga_12 -> {
            fga_12.usb.bsI();
            fga_12.usc.bsI();
        });
        this.urX.clear();
        this.bRE.clear();
        this.bRE.bsI();
        this.bRE = null;
        this.usa = null;
    }

    public void aVI() {
        this.bJs();
    }

    private void bJs() {
        int n;
        if (this.bRE == null) {
            this.bRE = (Entity3D)Entity3D.cXb.bSK();
            this.bRE.a(new ffz_2(this));
        }
        this.urX.forEach(fga_12 -> fga_12.ub(this.urZ));
        int n2 = this.urX.size();
        int n3 = n = this.usa != null ? this.usa.size() : 0;
        if (n2 < n) {
            for (int i = 0; i < n - n2; ++i) {
                fga_1 fga_13 = new fga_1(this.a(fga_1.abi(this.urZ), aso_1.cZT), this.a(fga_1.abh(this.urZ), aso_1.cZO));
                this.urX.add(fga_13);
            }
        }
    }

    private VertexBufferPCT a(int n, aso_1 aso_12) {
        GeometryMesh geometryMesh = (GeometryMesh)GLGeometryMesh.dbh.bSK();
        VertexBufferPCT vertexBufferPCT = VertexBufferPCT.cWa.uf(n);
        geometryMesh.a(aso_12, vertexBufferPCT, arq_2.cVv);
        this.bRE.b(geometryMesh);
        geometryMesh.bsI();
        return vertexBufferPCT;
    }
}

