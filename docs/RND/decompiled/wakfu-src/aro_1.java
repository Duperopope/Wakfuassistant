/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import gnu.trove.set.hash.TIntHashSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aro
 */
public final class aro_1 {
    private static final Logger cSc = Logger.getLogger(aro_1.class);
    private static final Logger cSd = Logger.getLogger((String)"animation");
    private static final auw_2 cSe = auw_2.dfI;
    private static final Material cSf;
    private static final float[] cSg;
    private static final float[] cSh;
    private static final float[] cSi;
    private static int cSj;
    private static int cSk;
    private static int cSl;
    private static int cSm;
    private static long aAU;
    private static awk_1 bXx;
    private static final arq_2 cSn;
    private static final ef_2[] cSo;
    private static final int cSp = 1003439990;
    private static final int cSq = 1272524161;
    static final int cSr = 2048;
    private static final Set<String> cSs;
    String cSt;
    private final Anm cSu;
    private final String cSv;
    private final String cSw;
    @NotNull
    private arf_2 cSx = arf_2.cUO;
    private arf_2 cSy = null;
    @NotNull
    private ara_1 cSz = ara_1.cUz;
    private float[][] cSA;
    private String bdC;
    private fk_0 cSB;
    private Anm cSC;
    private int awP = -1;
    private boolean cSD;
    private Material bVn;
    private auw_2 bVo;
    private auw_2 bVp;
    private final aci_1 cSE = new aci_1();
    private byte cSF = (byte)-1;
    private final aci_1 cSG = new aci_1();
    float aQU;
    float aQX;
    float aQV;
    float aQY;
    private final Matrix44 cSH;
    private final Matrix44 cSI;
    private int cSJ;
    private int cSK;
    private boolean cSL = false;
    private boolean cSM = false;
    private final ef_2 cSN = new ef_2();
    private byte cSO;
    private byte cSP;
    private GLGeometryMesh cSQ;

    public aro_1(Anm anm, String string, String string2) {
        assert (anm != null);
        this.cSu = anm;
        this.cSu.bGY();
        this.setScale(anm.aID().getScale());
        this.cSv = string;
        this.cSw = string2;
        this.cSC = null;
        this.cSB = null;
        this.cSx = arf_2.cUO;
        this.cSz = ara_1.cUz;
        this.bVo = cSe;
        this.bVp = auw_2.dfM;
        this.bVn = null;
        this.setScale(1.0f);
        this.cSE.y(Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        this.cSG.y(0, 0, 0, 0);
        this.cSH = (Matrix44)Matrix44.dAb.bSK();
        this.cSH.bPx();
        this.cSI = (Matrix44)Matrix44.dAb.bSK();
        this.cSI.bPx();
        this.cSD = false;
        this.cSL = false;
    }

    public aro_1(aro_1 aro_12) {
        this(aro_12.cSu, aro_12.cSv, aro_12.cSw);
        assert (this.cSv.equals(aro_12.cSv));
        assert (this.cSw.equals(aro_12.cSw));
        if (aro_12.bdC != null) {
            this.setAnimation(aro_12.bdC);
        }
        this.cSx = aro_12.cSx.bHY();
        this.cSz = aro_12.cSz.bHO();
        this.d(aro_12);
        this.bVo = aro_12.bVo;
        this.bVp = aro_12.bVp;
        this.bVn = aro_12.bVn;
        if (this.bVn != null) {
            this.bVn.bGY();
        }
        this.cSE.y(aro_12.cSE.bWF(), aro_12.cSE.bWG(), aro_12.cSE.bWH(), aro_12.cSE.bWI());
        this.cSH.c(aro_12.cSH);
        this.cSI.c(aro_12.cSI);
        this.cSL = aro_12.cSL;
        this.cSJ = aro_12.cSJ;
        this.setScale(aro_12.getScale());
    }

    public Anm bHd() {
        return this.cSu;
    }

    public auw_2 bHe() {
        return this.bVo;
    }

    public auw_2 bHf() {
        return this.bVp;
    }

    public static awk_1 bHg() {
        return bXx;
    }

    public void reset() {
        this.cSu.bsI();
        this.cSx.clear();
        this.cSx = arf_2.cUO;
        this.cSz.clear();
        if (this.cSy != null) {
            this.cSy.clear();
            this.cSy = null;
        }
        this.bdC = null;
        if (this.cSC != null && this.cSC != this.cSu) {
            this.cSC.bsI();
            this.cSC = null;
            this.awP = -1;
        }
        this.cSB = null;
        this.bVo = cSe;
        this.bVp = auw_2.dfM;
        if (this.bVn != null) {
            this.bVn.bsI();
            this.bVn = null;
        }
        this.cSA = null;
        this.cSD = false;
        this.cSJ = 0;
        this.cSL = false;
        this.cSH.bsI();
        this.cSI.bsI();
        this.setScale(1.0f);
        if (this.cSQ != null) {
            this.cSQ.bsI();
            this.cSQ = null;
        }
    }

    public String bpu() {
        return this.cSw;
    }

    public void a(@NotNull Anm anm, int[] nArray) {
        this.a(anm, null, nArray);
    }

    public void a(@NotNull Anm anm, TIntHashSet tIntHashSet, int[] nArray) {
        if (this.cSx == arf_2.cUO) {
            this.cSx = new arf_2();
        }
        this.cSx.a(anm, aro_1.r(nArray), tIntHashSet);
        if (anm.bGV().aIF().aIn() > 1) {
            this.awP = -1;
        }
        this.bHh();
    }

    public void c(@NotNull Anm anm, int ... nArray) {
        if (this.cSx == arf_2.cUO) {
            return;
        }
        TIntHashSet tIntHashSet = aro_1.r(nArray);
        this.cSL |= this.cSx.b(anm, tIntHashSet);
        this.bHh();
    }

    private static TIntHashSet r(int[] nArray) {
        if (nArray == null || nArray.length == 0) {
            return null;
        }
        return new TIntHashSet(nArray);
    }

    public void bHh() {
        this.cSz.bHN();
        fa_1[] fa_1Array = this.cSu.aID().aJL();
        if (fa_1Array == null) {
            return;
        }
        ArrayList<ez_1> arrayList = this.cSx.bHV();
        int n = arrayList.size();
        if (n == 0) {
            return;
        }
        int n2 = fa_1Array.length;
        for (int i = 0; i < n; ++i) {
            ez_1 ez_12 = arrayList.get(i);
            for (int j = 0; j < n2; ++j) {
                fa_1 fa_12 = fa_1Array[j];
                if (ez_12.aAf != fa_12.aAg) continue;
                if (this.cSz == ara_1.cUz) {
                    this.cSz = new ara_1();
                }
                this.cSz.tQ(fa_12.aAh);
            }
        }
    }

    public void tI(int n) {
        if (this.cSz == ara_1.cUz) {
            this.cSz = new ara_1();
        }
        this.cSz.tR(n);
    }

    public void tJ(int n) {
        assert (this.cSz != ara_1.cUz);
        this.cSz.tS(n);
    }

    public void tK(int n) {
        if (this.cSz == ara_1.cUz) {
            this.cSz = new ara_1();
        }
        this.cSz.tV(n);
    }

    public void tL(int n) {
        assert (this.cSz != ara_1.cUz);
        this.cSz.tW(n);
    }

    public boolean bHi() {
        boolean bl = false;
        if (this.cSt != null) {
            this.setAnimation(this.cSt);
            if (this.cSt == null) {
                bl = true;
                this.cSL = true;
            }
        }
        return bl;
    }

    public void setAnimation(String string) {
        this.s(string, false);
    }

    public void s(String string, boolean bl) {
        ex_1 ex_12 = this.cSu.aID();
        String string2 = this.fP(string);
        if (string2 != string) {
            this.cSD = true;
            this.cSN.a(-1.0f, 0.0f, 0.0f, 1.0f);
        } else {
            this.cSD = false;
            this.cSN.aIJ();
        }
        this.bdC = string2;
        this.cSB = null;
        this.cSt = null;
        this.cSM = true;
        this.cSL = true;
        ew_1 ew_12 = this.a(ex_12, string2, true);
        if (ew_12 == null) {
            String string3 = String.format("[Animation] Not found (%s) %s", this.cSw + this.cSv, string2);
            cSd.error((Object)string3);
            cSc.warn((Object)string3);
            return;
        }
        assert (ew_12.getName().equals(string2));
        if (ew_12.aJH() == -1) {
            assert (this.cSu.aLB());
            this.a(this.cSu, this.cSu.bGV().aIF().mJ(ew_12.aJE()), bl);
        } else {
            String string4 = ex_12.mE(ew_12.aJH());
            arq_1.bHF().a(string4, ew_12, this, bl);
        }
        this.cSF = (byte)-1;
    }

    public ew_1 a(ex_1 ex_12, String string2, boolean bl) {
        if (this.dZ(string2)) {
            return ex_12.bt(string2);
        }
        if (bl) {
            char c2 = string2.charAt(0);
            return cSs.stream().filter(string -> this.dZ(c2 + string)).findFirst().map(string -> ex_12.bt(c2 + string)).orElse(null);
        }
        return null;
    }

    public fk_0 bHj() {
        return this.cSB;
    }

    public boolean bHk() {
        return this.cSt != null;
    }

    public boolean bHl() {
        return this.cSM;
    }

    public void o(ArrayList<String> arrayList) {
        ew_1[] ew_1Array = this.cSu.aID().aJJ();
        for (int i = 0; i < ew_1Array.length; ++i) {
            arrayList.add(ew_1Array[i].getName());
        }
    }

    public void a(auw_2 auw_22, auw_2 auw_23) {
        this.bVo = auw_22;
        this.bVp = auw_23;
    }

    public boolean bHm() {
        boolean bl = this.cSx.bHW();
        if (this.cSy != null) {
            bl |= this.cSy.bHW();
        }
        if (bl) {
            this.bHh();
        }
        return bl;
    }

    public boolean bHn() {
        return this.cSx.bHU();
    }

    public void a(int n, Entity3D entity3D, int n2) {
        int n3;
        entity3D.clear();
        if (this.cSQ != null && this.awP == -1) {
            this.cSQ.bsI();
            this.cSQ = null;
        }
        if (this.cSB == null) {
            cSc.error((Object)"On ne peut pas mettre a jour une animation nulle");
            return;
        }
        this.setScale(this.cSu.aID().getScale());
        this.cSJ = n3 = this.tO(n);
        this.cSL = true;
        this.cSM = false;
        this.cSO = 0;
        this.cSP = 0;
        cSj = 0;
        aAU = 0L;
        cSk = 0;
        cSl = 0;
        cSm = 0;
        bXx = null;
        this.aQU = Float.MAX_VALUE;
        this.aQX = -3.4028235E38f;
        this.aQV = Float.MAX_VALUE;
        this.aQY = -3.4028235E38f;
        this.cSN.h((byte)0);
        this.a(n3, this.cSB, entity3D, this.cSN, this.cSC, 0);
        if (cSj != 0) {
            this.b(entity3D);
        }
        this.cSE.y((int)this.aQU, (int)this.aQX, (int)this.aQV, (int)this.aQY);
    }

    public void cM(float f2) {
        aci_1 aci_12 = this.cSE;
        if (this.cSF == 0) {
            return;
        }
        if (aci_12.cuQ == Integer.MAX_VALUE || aci_12.cuS == Integer.MAX_VALUE || aci_12.cuR == Integer.MIN_VALUE || aci_12.cuT == Integer.MIN_VALUE) {
            this.cSG.y(aci_12.cuQ, aci_12.cuR, aci_12.cuS, aci_12.cuT);
            this.cSF = (byte)-1;
            return;
        }
        if (this.cSF == -1) {
            this.cSG.y(aci_12.cuQ, aci_12.cuR, aci_12.cuS, aci_12.cuT);
            this.cSF = 0;
            return;
        }
        float f3 = f2 / 300.0f;
        this.cSF = 0;
        int n = this.a(this.cSG.cuQ, aci_12.cuQ, f3);
        int n2 = this.a(this.cSG.cuR, aci_12.cuR, f3);
        int n3 = this.a(this.cSG.cuS, aci_12.cuS, f3);
        int n4 = this.a(this.cSG.cuT, aci_12.cuT, f3);
        this.cSG.y(n, n2, n3, n4);
    }

    private int a(int n, int n2, float f2) {
        float f3 = n2 - n;
        if (Math.abs(f3) <= 1.0f) {
            return n;
        }
        this.cSF = 1;
        return GC.C((float)n + f3 * f2);
    }

    public static Material bHo() {
        return cSf;
    }

    public void a(Material material) {
        if (material != null) {
            material.bGY();
        }
        if (this.bVn != null) {
            this.bVn.bsI();
        }
        this.bVn = material;
    }

    public aci_1 bHp() {
        return this.cSE;
    }

    public int tM(int n) {
        fk_0 fk_02 = this.cSB.aKD() ? this.cSC.bGV().aIF().v(this.cSB.aKE()) : this.cSB;
        if (fk_02 == null) {
            return 0;
        }
        int n2 = this.tO(n);
        return aro_1.a(n2, fk_02);
    }

    private static int a(int n, fk_0 fk_02) {
        int n2 = fk_02.aIs();
        if (n >= n2) {
            if (fk_02.mK(128)) {
                return n % n2;
            }
            return n2 - 1;
        }
        return n;
    }

    public float getScale() {
        return this.cSu.aID().getScale();
    }

    public void setScale(float f2) {
        if (this.cSD) {
            this.cSN.a(-f2, 0.0f, 0.0f, f2);
        } else {
            this.cSN.a(f2, 0.0f, 0.0f, f2);
        }
    }

    public boolean aJz() {
        return this.cSC != null && this.cSC.aJz();
    }

    public int bHq() {
        fk_0 fk_02;
        assert (this.cSB != null);
        if (this.cSB.aKD()) {
            fk_02 = this.cSC.bGV().aIF().v(this.cSB.aKE());
            if (fk_02 == null) {
                return 1;
            }
        } else {
            fk_02 = this.cSB;
        }
        return fk_02.aIs();
    }

    public float[] qU(int n) {
        if (this.cSA == null) {
            return null;
        }
        return this.cSA[n];
    }

    public void b(arx_1 arx_12, float[] fArray) {
        this.c(arx_12.bHJ(), fArray);
    }

    public void c(int n, float[] fArray) {
        if (this.cSA == null) {
            this.cSA = new float[arx_1.values().length][];
        }
        this.cSA[n] = fArray;
    }

    public void d(aro_1 aro_12) {
        float[][] fArray = aro_12.cSA;
        if (fArray == null) {
            this.cSA = null;
        } else {
            this.cSA = new float[fArray.length][];
            for (int i = 0; i < fArray.length; ++i) {
                this.cSA[i] = (float[])(fArray[i] == null ? null : (float[])fArray[i].clone());
            }
        }
    }

    public void tN(int n) {
        if (this.cSA == null) {
            return;
        }
        this.cSA[n] = null;
    }

    public void bHr() {
        this.cSA = null;
    }

    public void a(ArrayList<eh_2> arrayList, int n, int n2) {
        int n3;
        assert (this.cSB != null);
        if (n == n2 && n != 0) {
            return;
        }
        int n4 = this.bHq();
        int n5 = n == 0 ? -1 : this.tM(n2);
        int n6 = n3 = n == 0 ? 0 : this.tM(n);
        if (n5 + 1 > n3) {
            int n7;
            for (n7 = n5 + 1; n7 <= n4 - 1; ++n7) {
                this.cSB.a(n7, arrayList);
            }
            for (n7 = 0; n7 <= n3; ++n7) {
                this.cSB.a(n7, arrayList);
            }
        } else {
            for (int i = n5 + 1; i <= n3; ++i) {
                this.cSB.a(i, arrayList);
            }
        }
    }

    private int tO(int n) {
        return (int)((float)this.cSK + (float)(this.cSC.aId().aJv() * n) / 1000.0f);
    }

    public Matrix44 bHs() {
        return this.cSH;
    }

    public Matrix44 bHt() {
        return this.cSI;
    }

    public boolean aLB() {
        return this.cSu.aLB();
    }

    public int dY(String string) {
        Anm anm;
        fk_0 fk_02;
        if (!this.cSu.aLB()) {
            cSc.warn((Object)("Impossible de r\u00e9cup\u00e9rer la duree de l'animation " + string + " dans " + this.cSw + this.cSv + " : la definition n'est pas chargee"));
            return 0;
        }
        ex_1 ex_12 = this.cSu.aID();
        ew_1 ew_12 = ex_12.bt(string = this.fP(string));
        if (ew_12 == null) {
            String string2 = String.format("[Animation] Not found (%s) %s", this.cSw + this.cSv, string);
            cSd.error((Object)string2);
            cSc.warn((Object)string2);
            return 0;
        }
        assert (ew_12.getName().equals(string));
        if (ew_12.aJH() == -1) {
            fk_02 = this.cSu.bGV().aIF().mJ(ew_12.aJE());
            anm = this.cSC;
        } else {
            String string3 = this.cSw + ex_12.mE(ew_12.aJH());
            try {
                anm = arq_1.bHF().u(string3, true);
                fk_02 = anm != null ? anm.bGV().aIF().mJ(ew_12.aJE()) : null;
            }
            catch (IOException iOException) {
                cSc.error((Object)"", (Throwable)iOException);
                return 0;
            }
        }
        return aro_1.a(fk_02, anm);
    }

    private String fP(String object) {
        if (this.cSu.aID().aJR()) {
            char c2 = ((String)object).charAt(0);
            switch (c2) {
                case '4': {
                    object = "0" + ((String)object).substring(1);
                    break;
                }
                case '3': {
                    object = "1" + ((String)object).substring(1);
                    break;
                }
                case '7': {
                    object = "5" + ((String)object).substring(1);
                }
            }
        }
        return object;
    }

    private static int a(fk_0 fk_02, Anm anm) {
        if (fk_02 == null || anm == null) {
            return 0;
        }
        if (fk_02.aKD() && (fk_02 = anm.bGV().aIF().v(fk_02.aKE())) == null) {
            return 0;
        }
        if (fk_02.mK(128)) {
            return Integer.MAX_VALUE;
        }
        int n = fk_02.aIs();
        return (int)(1000.0f * (float)n / (float)anm.aId().aJv());
    }

    public boolean bzm() {
        return this.cSL;
    }

    public void bHu() {
        this.cSL = false;
    }

    public void btE() {
        this.cSL = true;
    }

    void a(Anm anm, fk_0 fk_02) {
        if (anm != null && anm != this.cSu) {
            anm.bGY();
        }
        if (this.cSC != null && this.cSC != this.cSu) {
            this.cSC.bsI();
        }
        this.cSC = anm;
        this.awP = anm != null ? anm.bGV().aIF().aIn() : 0;
        this.cSB = fk_02;
        this.cSF = 1;
        this.cSK = 0;
    }

    void a(Anm anm, fk_0 fk_02, boolean bl) {
        this.a(anm, fk_02);
        if (bl && fk_02.mK(128)) {
            this.cSJ = this.cSK = GC.mR(fk_02.aIs());
        }
    }

    private void a(int n, fk_0 fk_02, Entity3D entity3D, ef_2 ef_22, Anm anm, int n2) {
        int n3 = aro_1.a(n, fk_02);
        this.cSz.aPc();
        int n4 = fk_02.mI(n3);
        boolean bl = !anm.bGV().aIh().aJG();
        boolean bl2 = anm.aJz();
        for (int i = 0; i < n4; ++i) {
            Object object;
            fk_02.aKF();
            ef_2 ef_23 = cSo[n2];
            ef_23.h(ef_22.aIY());
            short s = fk_02.d(ef_22, ef_23);
            if (ef_23.aIX() == 0.0f && bl2) continue;
            if (bl && (object = anm.bGV().aIh().o(s)) != null) {
                this.a(n, entity3D, anm, n2, ef_23, (eu_1)object);
                continue;
            }
            object = anm.bGV().aIF().v(s);
            if (this.d((fk_0)object)) {
                this.a(this.cSx, (fk_0)object, n, entity3D, ef_23, anm, n2);
                continue;
            }
            fc_1 fc_12 = anm.bGV().aIe().t(s);
            if (fc_12 == null || ef_23.aIX() <= 0.004f && bl2) continue;
            float f2 = fc_12.getOffsetX() * ef_23.aIM() + fc_12.getOffsetY() * ef_23.aIO() + ef_23.aIQ();
            float f3 = fc_12.getOffsetX() * -ef_23.aIN() + fc_12.getOffsetY() * -ef_23.aIP() - ef_23.aIR();
            float f4 = ef_23.aIO() * (float)fc_12.aKu();
            float f5 = -ef_23.aIP() * (float)fc_12.aKu();
            float f6 = ef_23.aIM() * (float)fc_12.aKt();
            float f7 = -ef_23.aIN() * (float)fc_12.aKt();
            long l = anm.aKK();
            if (aAU != l) {
                if (cSj != 0) {
                    this.b(entity3D);
                }
                aAU = l;
                bXx = awm_1.bPn().gB(l);
            }
            float f8 = f4 + f2;
            float f9 = f5 + f3;
            float f10 = f6 + f4 + f2;
            float f11 = f7 + f5 + f3;
            float f12 = f6 + f2;
            float f13 = f7 + f3;
            aro_1.cSg[aro_1.cSk++] = f2;
            aro_1.cSg[aro_1.cSk++] = f3;
            aro_1.cSg[aro_1.cSk++] = f8;
            aro_1.cSg[aro_1.cSk++] = f9;
            aro_1.cSg[aro_1.cSk++] = f10;
            aro_1.cSg[aro_1.cSk++] = f11;
            aro_1.cSg[aro_1.cSk++] = f12;
            aro_1.cSg[aro_1.cSk++] = f13;
            if (f2 > this.aQX) {
                this.aQX = f2;
            } else if (f2 < this.aQU) {
                this.aQU = f2;
            }
            if (f8 > this.aQX) {
                this.aQX = f8;
            } else if (f8 < this.aQU) {
                this.aQU = f8;
            }
            if (f10 > this.aQX) {
                this.aQX = f10;
            } else if (f10 < this.aQU) {
                this.aQU = f10;
            }
            if (f12 > this.aQX) {
                this.aQX = f12;
            } else if (f12 < this.aQU) {
                this.aQU = f12;
            }
            if (f3 > this.aQY) {
                this.aQY = f3;
            } else if (f3 < this.aQV) {
                this.aQV = f3;
            }
            if (f9 > this.aQY) {
                this.aQY = f9;
            } else if (f9 < this.aQV) {
                this.aQV = f9;
            }
            if (f11 > this.aQY) {
                this.aQY = f11;
            } else if (f11 < this.aQV) {
                this.aQV = f11;
            }
            if (f13 > this.aQY) {
                this.aQY = f13;
            } else if (f13 < this.aQV) {
                this.aQV = f13;
            }
            float f14 = ef_23.aIU();
            float f15 = ef_23.aIV();
            float f16 = ef_23.aIW();
            float f17 = ef_23.aIX();
            aro_1.cSh[aro_1.cSl++] = f14 *= 0.5f;
            aro_1.cSh[aro_1.cSl++] = f15 *= 0.5f;
            aro_1.cSh[aro_1.cSl++] = f16 *= 0.5f;
            aro_1.cSh[aro_1.cSl++] = f17;
            aro_1.cSh[aro_1.cSl++] = f14;
            aro_1.cSh[aro_1.cSl++] = f15;
            aro_1.cSh[aro_1.cSl++] = f16;
            aro_1.cSh[aro_1.cSl++] = f17;
            aro_1.cSh[aro_1.cSl++] = f14;
            aro_1.cSh[aro_1.cSl++] = f15;
            aro_1.cSh[aro_1.cSl++] = f16;
            aro_1.cSh[aro_1.cSl++] = f17;
            aro_1.cSh[aro_1.cSl++] = f14;
            aro_1.cSh[aro_1.cSl++] = f15;
            aro_1.cSh[aro_1.cSl++] = f16;
            aro_1.cSh[aro_1.cSl++] = f17;
            aro_1.cSi[aro_1.cSm++] = fc_12.aKq();
            aro_1.cSi[aro_1.cSm++] = fc_12.aKr();
            aro_1.cSi[aro_1.cSm++] = fc_12.aKq();
            aro_1.cSi[aro_1.cSm++] = fc_12.aKp();
            aro_1.cSi[aro_1.cSm++] = fc_12.aKs();
            aro_1.cSi[aro_1.cSm++] = fc_12.aKp();
            aro_1.cSi[aro_1.cSm++] = fc_12.aKs();
            aro_1.cSi[aro_1.cSm++] = fc_12.aKr();
            ++cSj;
        }
    }

    private void a(int n, Entity3D entity3D, Anm anm, int n2, ef_2 ef_22, eu_1 eu_12) {
        Object object;
        if (this.cSy != null && (object = this.cSy.tY(eu_12.aJE())) != null) {
            if (this.d(((arz_1)object).cUu)) {
                this.a(this.cSy, ((arz_1)object).cUu, n, entity3D, ef_22, anm, n2);
            }
            return;
        }
        object = this.cSu.bGV().aIF().mJ(eu_12.aJE());
        if (this.d((fk_0)object)) {
            this.a(this.cSx, (fk_0)object, n, entity3D, ef_22, this.cSu, n2);
        }
    }

    private boolean d(fk_0 fk_02) {
        return fk_02 != null && !this.cSz.tX(fk_02.aIk());
    }

    private void a(Entity3D entity3D) {
        int n = cSj * 4;
        VertexBufferPCT vertexBufferPCT = VertexBufferPCT.cWa.uf(n);
        this.a(vertexBufferPCT, n);
        GLGeometryMesh gLGeometryMesh = (GLGeometryMesh)GLGeometryMesh.dbh.bSK();
        gLGeometryMesh.c(this.bVo, this.bVp);
        gLGeometryMesh.a(aso_1.cZT, vertexBufferPCT, cSn, Arrays.copyOf(cSh, n * 4));
        entity3D.a(gLGeometryMesh, bXx, this.bVn);
        gLGeometryMesh.bsI();
        cSj = 0;
        cSk = 0;
        cSl = 0;
        cSm = 0;
        vertexBufferPCT.bsI();
    }

    private void a(VertexBufferPCT vertexBufferPCT, int n) {
        vertexBufferPCT.b(cSg, cSk);
        vertexBufferPCT.d(cSh, cSl);
        vertexBufferPCT.f(cSi, cSm);
        vertexBufferPCT.ud(n);
    }

    private void b(Entity3D entity3D) {
        this.cSP = (byte)(this.cSP + 1);
        this.cSO = (byte)(this.cSO + cSj);
        if (this.awP == -1 || entity3D.bJf() != 0) {
            this.a(entity3D);
            return;
        }
        int n = cSj * 4;
        if (this.cSQ != null && this.cSQ.bKd().bIG() < n) {
            this.cSQ.bsI();
            this.cSQ = null;
        }
        if (this.cSQ == null) {
            VertexBufferPCT vertexBufferPCT = VertexBufferPCT.cWa.uf(Math.max(this.awP * 4, n));
            this.cSQ = (GLGeometryMesh)GLGeometryMesh.dbh.bSK();
            this.cSQ.a(aso_1.cZT, vertexBufferPCT, cSn, cSh);
            vertexBufferPCT.bsI();
        }
        this.cSQ.g(cSh, n);
        this.cSQ.c(this.bVo, this.bVp);
        this.a(this.cSQ.bKd(), n);
        entity3D.a(this.cSQ, bXx, this.bVn);
        cSj = 0;
        cSk = 0;
        cSl = 0;
        cSm = 0;
    }

    private void a(arf_2 arf_22, fk_0 fk_02, int n, Entity3D entity3D, ef_2 ef_22, Anm anm, int n2) {
        int n3 = fk_02.aIl() & 0x3F;
        if (arf_22.bHS() && !this.a(arf_22, fk_02, n, entity3D, ef_22, n2, n3)) {
            return;
        }
        if (this.cSA != null && n3 != arx_1.cTr.bHJ()) {
            this.a(ef_22, n3);
        }
        if (fk_02.getName() != null) {
            switch (fk_02.aIk()) {
                case 1272524161: {
                    this.a(ef_22, this.cSH.bQE());
                    break;
                }
                case 1003439990: {
                    this.a(ef_22, this.cSI.bQE());
                }
            }
        }
        this.a(n, fk_02, entity3D, ef_22, anm, n2 + 1);
    }

    private boolean a(arf_2 arf_22, fk_0 fk_02, int n, Entity3D entity3D, ef_2 ef_22, int n2, int n3) {
        arz_1 arz_12 = arf_22.tY(fk_02.aIj());
        if (arz_12 == null) {
            return true;
        }
        if (fk_02.getName() != null && n3 != arx_1.cTr.bHJ() && n3 != arx_1.cTA.bHJ() && n3 != arx_1.cTx.bHJ() && n3 != arx_1.cTy.bHJ() && this.cSA != null) {
            this.a(ef_22, n3);
        }
        fk_0 fk_03 = arz_12.cUu;
        assert (fk_03 != null);
        this.a(n, fk_03, entity3D, ef_22, arz_12.cUt, n2 + 1);
        return false;
    }

    private void a(ef_2 ef_22, int n) {
        if (n != ef_22.aIY()) {
            float[] fArray = this.cSA[ef_22.aIY()];
            if (fArray != null) {
                ef_22.i(ef_22.aIU() / fArray[0]);
                ef_22.j(ef_22.aIV() / fArray[1]);
                ef_22.k(ef_22.aIW() / fArray[2]);
                ef_22.setAlpha(ef_22.aIX() / fArray[3]);
            }
            if ((fArray = this.cSA[n]) != null) {
                ef_22.i(ef_22.aIU() * fArray[0]);
                ef_22.j(ef_22.aIV() * fArray[1]);
                ef_22.k(ef_22.aIW() * fArray[2]);
                ef_22.setAlpha(ef_22.aIX() * fArray[3]);
                ef_22.h((byte)n);
            }
        }
    }

    private void a(ef_2 ef_22, float[] fArray) {
        fArray[0] = this.cSD ? -ef_22.aIM() : ef_22.aIM();
        fArray[1] = ef_22.aIN();
        fArray[4] = ef_22.aIO();
        fArray[5] = ef_22.aIP();
        fArray[12] = ef_22.aIQ();
        fArray[13] = -ef_22.aIR();
    }

    public boolean dZ(String string) {
        string = this.fP(string);
        return this.cSu.aID().bt(string) != null;
    }

    public float aJM() {
        if (this.cSu.aID().aJP()) {
            return this.cSu.aID().aJM();
        }
        return 1.0f;
    }

    public aci_1 bHv() {
        return this.cSG;
    }

    public float aSO() {
        return this.aQU;
    }

    public float aSP() {
        return this.aQV;
    }

    public String bHw() {
        return this.cSw + this.cSv + ".anm";
    }

    public boolean bHx() {
        return this.cSx.bHT();
    }

    public arf_2 bHy() {
        return this.cSx.bHY();
    }

    public arf_2 bHz() {
        return this.cSy == null ? null : this.cSy.bHY();
    }

    public void a(arf_2 arf_22, arf_2 arf_23) {
        assert (this.cSx != null);
        this.cSx.clear();
        this.cSx = arf_22.bHY();
        this.cSy = arf_23 == null ? null : arf_23.bHY();
        this.bHh();
    }

    public ara_1 bHA() {
        return this.cSz.bHO();
    }

    public void a(ara_1 ara_12) {
        this.cSz.clear();
        this.cSz = ara_12.bHO();
    }

    public void bHB() {
        this.cSx.clear();
        this.bHh();
    }

    public String toString() {
        return "AnmInstance - " + this.cSv + " [" + this.bdC + "]";
    }

    public byte bHC() {
        return this.cSO;
    }

    public byte bHD() {
        return this.cSP;
    }

    public void b(Anm anm) {
        if (this.cSy == null) {
            this.cSy = new arf_2();
        }
        this.cSy.a(anm, null);
    }

    public void c(Anm anm) {
        if (this.cSy != null) {
            this.cSy.b(anm, null);
        }
    }

    static {
        cSn = arq_2.cVv;
        cSs = Stream.of("_Cadre", "_AnimStatiqueCadre", "_AnimStatique").collect(Collectors.toCollection(HashSet::new));
        cSf = Material.daH;
        cSg = new float[4096];
        cSh = new float[8192];
        cSi = new float[4096];
        int n = 32;
        cSo = new ef_2[32];
        for (int i = 0; i < cSo.length; ++i) {
            aro_1.cSo[i] = new ef_2();
        }
    }
}

