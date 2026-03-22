/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fFX
 */
public class ffx_1 {
    private static final Logger urP = Logger.getLogger(ffx_1.class);
    private static final int urQ = 512;
    private Entity3D bRE;
    private VertexBufferPCT cdJ;
    private arq_2 cSn;
    private axb_2 chO;
    private awg_1 tEC;
    private GeometryMesh urR;
    private int bap;
    private int baq;
    private int brs;
    private int brt;
    private ArrayList<aco_1> bXE;
    private ArrayList<aco_1>[] urS;
    private int urT;
    private int urU;
    private ayu_1 urV;

    public void ae(ArrayList<aco_1> arrayList) {
        if (this.bXE == arrayList) {
            return;
        }
        this.bXE = arrayList;
        if (this.bXE == null) {
            return;
        }
        for (int i = this.bXE.size() - 1; i >= 0; --i) {
            aco_1 aco_12 = this.bXE.get(i);
            aco_12.ap(aco_12.aPY / 512.0f);
            aco_12.aq(aco_12.aPZ / 512.0f);
        }
        this.bOY();
    }

    public int c(aco_1 aco_12) {
        int n = (int)Math.floor((aco_12.aPY + 1.0f) * (float)this.urT / 2.0f);
        if (n < 0 || n >= this.urT) {
            return -1;
        }
        return n;
    }

    public int d(aco_1 aco_12) {
        int n = (int)Math.floor((aco_12.aPZ + 1.0f) * (float)this.urU / 2.0f);
        if (n < 0 || n >= this.urU) {
            return -1;
        }
        return n;
    }

    public void setPixmap(awg_1 awg_12) {
        if (this.tEC == awg_12) {
            return;
        }
        this.tEC = awg_12;
        this.bRE.a(0, this.tEC.bHg());
        this.gxk();
    }

    public void N(int n, int n2, int n3, int n4) {
        boolean bl = this.brs != n3 || this.brt != n4;
        this.brs = n3;
        this.brt = n4;
        this.bap = n;
        this.baq = n2;
        if (this.tEC == null) {
            return;
        }
        if (bl) {
            this.bOY();
        }
    }

    private void bOY() {
        int n;
        if (this.brs == 0 || this.brt == 0 || this.bXE == null) {
            return;
        }
        float f2 = 0.8f;
        float f3 = (float)this.tEC.getWidth() * 0.8f / 512.0f;
        this.gxj();
        ArrayList[] arrayListArray = new ArrayList[this.urS.length];
        for (n = 0; n < this.urT; ++n) {
            for (int i = 0; i < this.urU; ++i) {
                int n2 = n * this.urU + i;
                arrayListArray[n2] = new ArrayList(this.urV.bSd().size());
                this.urV.b(this.urS[n2], arrayListArray[n2], f3);
            }
        }
        n = 0;
        for (ArrayList arrayList : arrayListArray) {
            n += arrayList != null ? arrayList.size() : 0;
        }
        this.abg(n);
        float f4 = faa_2.tLO.cf(512 * this.urT, this.brs);
        float f5 = faa_2.tLO.cg(512 * this.urU, this.brt);
        float[] fArray = new float[]{0.8f, 0.9f, 1.0f};
        int n3 = 0;
        for (int i = 0; i < this.urT; ++i) {
            float f6 = 512 * i;
            for (int j = 0; j < this.urU; ++j) {
                float f7 = 512 * j;
                ArrayList arrayList = arrayListArray[i * this.urU + j];
                n = arrayList.size();
                for (int i2 = 0; i2 < n; ++i2) {
                    aco_1 aco_12 = (aco_1)arrayList.get(i2);
                    float f8 = (aco_12.aPY + 1.0f) * 512.0f / 2.0f + (float)this.bap + f6 + f4;
                    float f9 = (aco_12.aPZ + 1.0f) * 512.0f / 2.0f + (float)this.baq + f7 + f5;
                    int n4 = (int)((float)this.tEC.getWidth() * fArray[i2 % fArray.length]);
                    int n5 = (int)((float)this.tEC.getHeight() * fArray[i2 % fArray.length]);
                    this.cdJ.c((i2 + n3) * 4, f8 - (float)n4, f9 - (float)n5);
                    this.cdJ.c((i2 + n3) * 4 + 1, f8 - (float)n4, f9 + (float)n5);
                    this.cdJ.c((i2 + n3) * 4 + 2, f8 + (float)n4, f9 + (float)n5);
                    this.cdJ.c((i2 + n3) * 4 + 3, f8 + (float)n4, f9 - (float)n5);
                }
                n3 += n;
            }
        }
    }

    public final Entity gxi() {
        return this.bRE;
    }

    private void gxj() {
        this.urT = (int)Math.ceil((float)this.brs / 512.0f);
        this.urU = (int)Math.ceil((float)this.brt / 512.0f);
        this.urS = new ArrayList[this.urT * this.urU];
        for (int i = this.bXE.size() - 1; i >= 0; --i) {
            aco_1 aco_12 = this.bXE.get(i);
            int n = this.c(aco_12);
            int n2 = this.d(aco_12);
            if (n == -1 || n2 == -1) continue;
            int n3 = n * this.urU + n2;
            ArrayList<aco_1> arrayList = this.urS[n3];
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.urS[n3] = arrayList;
            }
            float f2 = (aco_12.aPY + 1.0f) * (float)this.urT - (float)(2 * n) - 1.0f;
            float f3 = (aco_12.aPZ + 1.0f) * (float)this.urU - (float)(2 * n2) - 1.0f;
            arrayList.add(new aco_1(f2, f3));
        }
    }

    private void gxk() {
        if (this.cdJ == null) {
            return;
        }
        int n = this.cdJ.bIF();
        if (this.tEC != null) {
            float f2 = this.tEC.aKq();
            float f3 = this.tEC.aKr();
            float f4 = this.tEC.aKs();
            float f5 = this.tEC.aKp();
            int n2 = n / 4;
            for (int i = 0; i < n2; ++i) {
                this.cdJ.b(i * 4, f2, f3);
                this.cdJ.b(i * 4 + 1, f2, f5);
                this.cdJ.b(i * 4 + 2, f4, f5);
                this.cdJ.b(i * 4 + 3, f4, f3);
            }
        }
    }

    private void gxl() {
        int n = this.cdJ.bIF();
        int n2 = n / 4;
        for (int i = 0; i < n2; ++i) {
            float f2 = 1.0f;
            float f3 = GC.b(0.95f, 0.99f);
            float f4 = f3 * f3;
            this.cdJ.a(i * 4, f4, f4, f4, 1.0f);
            this.cdJ.a(i * 4 + 1, f3, f3, f3, 1.0f);
            this.cdJ.a(i * 4 + 2, 1.0f, 1.0f, 1.0f, 1.0f);
            this.cdJ.a(i * 4 + 3, f3, f3, f3, 1.0f);
        }
    }

    private void abg(int n) {
        int n2 = n * 4;
        if (this.cdJ != null) {
            this.cdJ.bsI();
        }
        this.cdJ = VertexBufferPCT.cWa.uf(n2);
        this.cSn = arq_2.cVv;
        this.cdJ.ud(n2);
        this.gxl();
        this.gxk();
        this.urR.a(aso_1.cZT, this.cdJ, this.cSn);
    }

    public final void gxm() {
        assert (this.bRE == null);
        assert (this.urR == null);
        this.bRE = (Entity3D)Entity3D.cXb.bSK();
        this.urR = (GeometryMesh)GLGeometryMesh.dbh.bSK();
        this.bRE.b(this.urR);
        this.urV = new ayb_1(0.055f, true, 1000, 1);
        this.urV.bSg();
    }

    public final void gxn() {
        this.bRE.bsI();
        this.bRE = null;
        this.urR.bsI();
        this.urR = null;
        this.cdJ.bsI();
        this.cdJ = null;
        this.cSn = null;
        this.chO = null;
        this.tEC = null;
    }
}

