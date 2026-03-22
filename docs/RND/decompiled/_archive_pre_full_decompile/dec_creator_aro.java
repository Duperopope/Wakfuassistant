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

public final class aro {
    private static final Logger cSc = Logger.getLogger(aro.class);
    private static final Logger cSd = Logger.getLogger((String)"animation");
    private static final auW cSe = auW.dfI;
    private static final Material cSf;
    private static final float[] cSg;
    private static final float[] cSh;
    private static final float[] cSi;
    private static int cSj;
    private static int cSk;
    private static int cSl;
    private static int cSm;
    private static long aAU;
    private static awK bXx;
    private static final arQ cSn;
    private static final EF[] cSo;
    private static final int cSp = 1003439990;
    private static final int cSq = 1272524161;
    static final int cSr = 2048;
    private static final Set<String> cSs;
    String cSt;
    private final Anm cSu;
    private final String cSv;
    private final String cSw;
    @NotNull
    private arF cSx = arF.cUO;
    private arF cSy = null;
    @NotNull
    private arA cSz = arA.cUz;
    private float[][] cSA;
    private String bdC;
    private Fk cSB;
    private Anm cSC;
    private int awP = -1;
    private boolean cSD;
    private Material bVn;
    private auW bVo;
    private auW bVp;
    private final aCi cSE = new aCi();
    private byte cSF = (byte)-1;
    private final aCi cSG = new aCi();
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
    private final EF cSN = new EF();
    private byte cSO;
    private byte cSP;
    private GLGeometryMesh cSQ;

    public aro(Anm anm, String string, String string2) {
        assert (anm != null);
        this.cSu = anm;
        this.cSu.bGY();
        this.setScale(anm.aID().getScale());
        this.cSv = string;
        this.cSw = string2;
        this.cSC = null;
        this.cSB = null;
        this.cSx = arF.cUO;
        this.cSz = arA.cUz;
        this.bVo = cSe;
        this.bVp = auW.dfM;
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

    public aro(aro aro2) {
        this(aro2.cSu, aro2.cSv, aro2.cSw);
        assert (this.cSv.equals(aro2.cSv));
        assert (this.cSw.equals(aro2.cSw));
        if (aro2.bdC != null) {
            this.setAnimation(aro2.bdC);
        }
        this.cSx = aro2.cSx.bHY();
        this.cSz = aro2.cSz.bHO();
        this.d(aro2);
        this.bVo = aro2.bVo;
        this.bVp = aro2.bVp;
        this.bVn = aro2.bVn;
        if (this.bVn != null) {
            this.bVn.bGY();
        }
        this.cSE.y(aro2.cSE.bWF(), aro2.cSE.bWG(), aro2.cSE.bWH(), aro2.cSE.bWI());
        this.cSH.c(aro2.cSH);
        this.cSI.c(aro2.cSI);
        this.cSL = aro2.cSL;
        this.cSJ = aro2.cSJ;
        this.setScale(aro2.getScale());
    }

    public Anm bHd() {
        return this.cSu;
    }

    public auW bHe() {
        return this.bVo;
    }

    public auW bHf() {
        return this.bVp;
    }

    public static awK bHg() {
        return bXx;
    }

    public void reset() {
        this.cSu.bsI();
        this.cSx.clear();
        this.cSx = arF.cUO;
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
        this.bVp = auW.dfM;
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
        if (this.cSx == arF.cUO) {
            this.cSx = new arF();
        }
        this.cSx.a(anm, aro.r(nArray), tIntHashSet);
        if (anm.bGV().aIF().aIn() > 1) {
            this.awP = -1;
        }
        this.bHh();
    }

    public void c(@NotNull Anm anm, int ... nArray) {
        if (this.cSx == arF.cUO) {
            return;
        }
        TIntHashSet tIntHashSet = aro.r(nArray);
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
        Fa[] faArray = this.cSu.aID().aJL();
        if (faArray == null) {
            return;
        }
        ArrayList<EZ> arrayList = this.cSx.bHV();
        int n = arrayList.size();
        if (n == 0) {
            return;
        }
        int n2 = faArray.length;
        for (int i = 0; i < n; ++i) {
            EZ eZ = arrayList.get(i);
            for (int j = 0; j < n2; ++j) {
                Fa fa = faArray[j];
                if (eZ.aAf != fa.aAg) continue;
                if (this.cSz == arA.cUz) {
                    this.cSz = new arA();
                }
                this.cSz.tQ(fa.aAh);
            }
        }
    }

    public void tI(int n) {
        if (this.cSz == arA.cUz) {
            this.cSz = new arA();
        }
        this.cSz.tR(n);
    }

    public void tJ(int n) {
        assert (this.cSz != arA.cUz);
        this.cSz.tS(n);
    }

    public void tK(int n) {
        if (this.cSz == arA.cUz) {
            this.cSz = new arA();
        }
        this.cSz.tV(n);
    }

    public void tL(int n) {
        assert (this.cSz != arA.cUz);
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
        EX eX = this.cSu.aID();
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
        EW eW = this.a(eX, string2, true);
        if (eW == null) {
            String string3 = String.format("[Animation] Not found (%s) %s", this.cSw + this.cSv, string2);
            cSd.error((Object)string3);
            cSc.warn((Object)string3);
            return;
        }
        assert (eW.getName().equals(string2));
        if (eW.aJH() == -1) {
            assert (this.cSu.aLB());
            this.a(this.cSu, this.cSu.bGV().aIF().mJ(eW.aJE()), bl);
        } else {
            String string4 = eX.mE(eW.aJH());
            arq.bHF().a(string4, eW, this, bl);
        }
        this.cSF = (byte)-1;
    }

    public EW a(EX eX, String string2, boolean bl) {
        if (this.dZ(string2)) {
            return eX.bt(string2);
        }
        if (bl) {
            char c = string2.charAt(0);
            return cSs.stream().filter(string -> this.dZ(c + string)).findFirst().map(string -> eX.bt(c + string)).orElse(null);
        }
        return null;
    }

    public Fk bHj() {
        return this.cSB;
    }

    public boolean bHk() {
        return this.cSt != null;
    }

    public boolean bHl() {
        return this.cSM;
    }

    public void o(ArrayList<String> arrayList) {
        EW[] eWArray = this.cSu.aID().aJJ();
        for (int i = 0; i < eWArray.length; ++i) {
            arrayList.add(eWArray[i].getName());
        }
    }

    public void a(auW auW2, auW auW3) {
        this.bVo = auW2;
        this.bVp = auW3;
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

    public void cM(float f) {
        aCi aCi2 = this.cSE;
        if (this.cSF == 0) {
            return;
        }
        if (aCi2.cuQ == Integer.MAX_VALUE || aCi2.cuS == Integer.MAX_VALUE || aCi2.cuR == Integer.MIN_VALUE || aCi2.cuT == Integer.MIN_VALUE) {
            this.cSG.y(aCi2.cuQ, aCi2.cuR, aCi2.cuS, aCi2.cuT);
            this.cSF = (byte)-1;
            return;
        }
        if (this.cSF == -1) {
            this.cSG.y(aCi2.cuQ, aCi2.cuR, aCi2.cuS, aCi2.cuT);
            this.cSF = 0;
            return;
        }
        float f2 = f / 300.0f;
        this.cSF = 0;
        int n = this.a(this.cSG.cuQ, aCi2.cuQ, f2);
        int n2 = this.a(this.cSG.cuR, aCi2.cuR, f2);
        int n3 = this.a(this.cSG.cuS, aCi2.cuS, f2);
        int n4 = this.a(this.cSG.cuT, aCi2.cuT, f2);
        this.cSG.y(n, n2, n3, n4);
    }

    private int a(int n, int n2, float f) {
        float f2 = n2 - n;
        if (Math.abs(f2) <= 1.0f) {
            return n;
        }
        this.cSF = 1;
        return GC.C((float)n + f2 * f);
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

    public aCi bHp() {
        return this.cSE;
    }

    public int tM(int n) {
        Fk fk = this.cSB.aKD() ? this.cSC.bGV().aIF().v(this.cSB.aKE()) : this.cSB;
        if (fk == null) {
            return 0;
        }
        int n2 = this.tO(n);
        return aro.a(n2, fk);
    }

    private static int a(int n, Fk fk) {
        int n2 = fk.aIs();
        if (n >= n2) {
            if (fk.mK(128)) {
                return n % n2;
            }
            return n2 - 1;
        }
        return n;
    }

    public float getScale() {
        return this.cSu.aID().getScale();
    }

    public void setScale(float f) {
        if (this.cSD) {
            this.cSN.a(-f, 0.0f, 0.0f, f);
        } else {
            this.cSN.a(f, 0.0f, 0.0f, f);
        }
    }

    public boolean aJz() {
        return this.cSC != null && this.cSC.aJz();
    }

    public int bHq() {
        Fk fk;
        assert (this.cSB != null);
        if (this.cSB.aKD()) {
            fk = this.cSC.bGV().aIF().v(this.cSB.aKE());
            if (fk == null) {
                return 1;
            }
        } else {
            fk = this.cSB;
        }
        return fk.aIs();
    }

    public float[] qU(int n) {
        if (this.cSA == null) {
            return null;
        }
        return this.cSA[n];
    }

    public void b(arx arx2, float[] fArray) {
        this.c(arx2.bHJ(), fArray);
    }

    public void c(int n, float[] fArray) {
        if (this.cSA == null) {
            this.cSA = new float[arx.values().length][];
        }
        this.cSA[n] = fArray;
    }

    public void d(aro aro2) {
        float[][] fArray = aro2.cSA;
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

    public void a(ArrayList<EH> arrayList, int n, int n2) {
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
        Fk fk;
        if (!this.cSu.aLB()) {
            cSc.warn((Object)("Impossible de r\u00e9cup\u00e9rer la duree de l'animation " + string + " dans " + this.cSw + this.cSv + " : la definition n'est pas chargee"));
            return 0;
        }
        EX eX = this.cSu.aID();
        EW eW = eX.bt(string = this.fP(string));
        if (eW == null) {
            String string2 = String.format("[Animation] Not found (%s) %s", this.cSw + this.cSv, string);
            cSd.error((Object)string2);
            cSc.warn((Object)string2);
            return 0;
        }
        assert (eW.getName().equals(string));
        if (eW.aJH() == -1) {
            fk = this.cSu.bGV().aIF().mJ(eW.aJE());
            anm = this.cSC;
        } else {
            String string3 = this.cSw + eX.mE(eW.aJH());
            try {
                anm = arq.bHF().u(string3, true);
                fk = anm != null ? anm.bGV().aIF().mJ(eW.aJE()) : null;
            }
            catch (IOException iOException) {
                cSc.error((Object)"", (Throwable)iOException);
                return 0;
            }
        }
        return aro.a(fk, anm);
    }

    private String fP(String object) {
        if (this.cSu.aID().aJR()) {
            char c = ((String)object).charAt(0);
            switch (c) {
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

    private static int a(Fk fk, Anm anm) {
        if (fk == null || anm == null) {
            return 0;
        }
        if (fk.aKD() && (fk = anm.bGV().aIF().v(fk.aKE())) == null) {
            return 0;
        }
        if (fk.mK(128)) {
            return Integer.MAX_VALUE;
        }
        int n = fk.aIs();
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

    void a(Anm anm, Fk fk) {
        if (anm != null && anm != this.cSu) {
            anm.bGY();
        }
        if (this.cSC != null && this.cSC != this.cSu) {
            this.cSC.bsI();
        }
        this.cSC = anm;
        this.awP = anm != null ? anm.bGV().aIF().aIn() : 0;
        this.cSB = fk;
        this.cSF = 1;
        this.cSK = 0;
    }

    void a(Anm anm, Fk fk, boolean bl) {
        this.a(anm, fk);
        if (bl && fk.mK(128)) {
            this.cSJ = this.cSK = GC.mR(fk.aIs());
        }
    }

    private void a(int n, Fk fk, Entity3D entity3D, EF eF, Anm anm, int n2) {
        int n3 = aro.a(n, fk);
        this.cSz.aPc();
        int n4 = fk.mI(n3);
        boolean bl = !anm.bGV().aIh().aJG();
        boolean bl2 = anm.aJz();
        for (int i = 0; i < n4; ++i) {
            Object object;
            fk.aKF();
            EF eF2 = cSo[n2];
            eF2.h(eF.aIY());
            short s = fk.d(eF, eF2);
            if (eF2.aIX() == 0.0f && bl2) continue;
            if (bl && (object = anm.bGV().aIh().o(s)) != null) {
                this.a(n, entity3D, anm, n2, eF2, (EU)object);
                continue;
            }
            object = anm.bGV().aIF().v(s);
            if (this.d((Fk)object)) {
                this.a(this.cSx, (Fk)object, n, entity3D, eF2, anm, n2);
                continue;
            }
            Fc fc = anm.bGV().aIe().t(s);
            if (fc == null || eF2.aIX() <= 0.004f && bl2) continue;
            float f = fc.getOffsetX() * eF2.aIM() + fc.getOffsetY() * eF2.aIO() + eF2.aIQ();
            float f2 = fc.getOffsetX() * -eF2.aIN() + fc.getOffsetY() * -eF2.aIP() - eF2.aIR();
            float f3 = eF2.aIO() * (float)fc.aKu();
            float f4 = -eF2.aIP() * (float)fc.aKu();
            float f5 = eF2.aIM() * (float)fc.aKt();
            float f6 = -eF2.aIN() * (float)fc.aKt();
            long l = anm.aKK();
            if (aAU != l) {
                if (cSj != 0) {
                    this.b(entity3D);
                }
                aAU = l;
                bXx = awM.bPn().gB(l);
            }
            float f7 = f3 + f;
            float f8 = f4 + f2;
            float f9 = f5 + f3 + f;
            float f10 = f6 + f4 + f2;
            float f11 = f5 + f;
            float f12 = f6 + f2;
            aro.cSg[aro.cSk++] = f;
            aro.cSg[aro.cSk++] = f2;
            aro.cSg[aro.cSk++] = f7;
            aro.cSg[aro.cSk++] = f8;
            aro.cSg[aro.cSk++] = f9;
            aro.cSg[aro.cSk++] = f10;
            aro.cSg[aro.cSk++] = f11;
            aro.cSg[aro.cSk++] = f12;
            if (f > this.aQX) {
                this.aQX = f;
            } else if (f < this.aQU) {
                this.aQU = f;
            }
            if (f7 > this.aQX) {
                this.aQX = f7;
            } else if (f7 < this.aQU) {
                this.aQU = f7;
            }
            if (f9 > this.aQX) {
                this.aQX = f9;
            } else if (f9 < this.aQU) {
                this.aQU = f9;
            }
            if (f11 > this.aQX) {
                this.aQX = f11;
            } else if (f11 < this.aQU) {
                this.aQU = f11;
            }
            if (f2 > this.aQY) {
                this.aQY = f2;
            } else if (f2 < this.aQV) {
                this.aQV = f2;
            }
            if (f8 > this.aQY) {
                this.aQY = f8;
            } else if (f8 < this.aQV) {
                this.aQV = f8;
            }
            if (f10 > this.aQY) {
                this.aQY = f10;
            } else if (f10 < this.aQV) {
                this.aQV = f10;
            }
            if (f12 > this.aQY) {
                this.aQY = f12;
            } else if (f12 < this.aQV) {
                this.aQV = f12;
            }
            float f13 = eF2.aIU();
            float f14 = eF2.aIV();
            float f15 = eF2.aIW();
            float f16 = eF2.aIX();
            aro.cSh[aro.cSl++] = f13 *= 0.5f;
            aro.cSh[aro.cSl++] = f14 *= 0.5f;
            aro.cSh[aro.cSl++] = f15 *= 0.5f;
            aro.cSh[aro.cSl++] = f16;
            aro.cSh[aro.cSl++] = f13;
            aro.cSh[aro.cSl++] = f14;
            aro.cSh[aro.cSl++] = f15;
            aro.cSh[aro.cSl++] = f16;
            aro.cSh[aro.cSl++] = f13;
            aro.cSh[aro.cSl++] = f14;
            aro.cSh[aro.cSl++] = f15;
            aro.cSh[aro.cSl++] = f16;
            aro.cSh[aro.cSl++] = f13;
            aro.cSh[aro.cSl++] = f14;
            aro.cSh[aro.cSl++] = f15;
            aro.cSh[aro.cSl++] = f16;
            aro.cSi[aro.cSm++] = fc.aKq();
            aro.cSi[aro.cSm++] = fc.aKr();
            aro.cSi[aro.cSm++] = fc.aKq();
            aro.cSi[aro.cSm++] = fc.aKp();
            aro.cSi[aro.cSm++] = fc.aKs();
            aro.cSi[aro.cSm++] = fc.aKp();
            aro.cSi[aro.cSm++] = fc.aKs();
            aro.cSi[aro.cSm++] = fc.aKr();
            ++cSj;
        }
    }

    private void a(int n, Entity3D entity3D, Anm anm, int n2, EF eF, EU eU) {
        Object object;
        if (this.cSy != null && (object = this.cSy.tY(eU.aJE())) != null) {
            if (this.d(((arz)object).cUu)) {
                this.a(this.cSy, ((arz)object).cUu, n, entity3D, eF, anm, n2);
            }
            return;
        }
        object = this.cSu.bGV().aIF().mJ(eU.aJE());
        if (this.d((Fk)object)) {
            this.a(this.cSx, (Fk)object, n, entity3D, eF, this.cSu, n2);
        }
    }

    private boolean d(Fk fk) {
        return fk != null && !this.cSz.tX(fk.aIk());
    }

    private void a(Entity3D entity3D) {
        int n = cSj * 4;
        VertexBufferPCT vertexBufferPCT = VertexBufferPCT.cWa.uf(n);
        this.a(vertexBufferPCT, n);
        GLGeometryMesh gLGeometryMesh = (GLGeometryMesh)GLGeometryMesh.dbh.bSK();
        gLGeometryMesh.c(this.bVo, this.bVp);
        gLGeometryMesh.a(asO.cZT, vertexBufferPCT, cSn, Arrays.copyOf(cSh, n * 4));
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
            this.cSQ.a(asO.cZT, vertexBufferPCT, cSn, cSh);
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

    private void a(arF arF2, Fk fk, int n, Entity3D entity3D, EF eF, Anm anm, int n2) {
        int n3 = fk.aIl() & 0x3F;
        if (arF2.bHS() && !this.a(arF2, fk, n, entity3D, eF, n2, n3)) {
            return;
        }
        if (this.cSA != null && n3 != arx.cTr.bHJ()) {
            this.a(eF, n3);
        }
        if (fk.getName() != null) {
            switch (fk.aIk()) {
                case 1272524161: {
                    this.a(eF, this.cSH.bQE());
                    break;
                }
                case 1003439990: {
                    this.a(eF, this.cSI.bQE());
                }
            }
        }
        this.a(n, fk, entity3D, eF, anm, n2 + 1);
    }

    private boolean a(arF arF2, Fk fk, int n, Entity3D entity3D, EF eF, int n2, int n3) {
        arz arz2 = arF2.tY(fk.aIj());
        if (arz2 == null) {
            return true;
        }
        if (fk.getName() != null && n3 != arx.cTr.bHJ() && n3 != arx.cTA.bHJ() && n3 != arx.cTx.bHJ() && n3 != arx.cTy.bHJ() && this.cSA != null) {
            this.a(eF, n3);
        }
        Fk fk2 = arz2.cUu;
        assert (fk2 != null);
        this.a(n, fk2, entity3D, eF, arz2.cUt, n2 + 1);
        return false;
    }

    private void a(EF eF, int n) {
        if (n != eF.aIY()) {
            float[] fArray = this.cSA[eF.aIY()];
            if (fArray != null) {
                eF.i(eF.aIU() / fArray[0]);
                eF.j(eF.aIV() / fArray[1]);
                eF.k(eF.aIW() / fArray[2]);
                eF.setAlpha(eF.aIX() / fArray[3]);
            }
            if ((fArray = this.cSA[n]) != null) {
                eF.i(eF.aIU() * fArray[0]);
                eF.j(eF.aIV() * fArray[1]);
                eF.k(eF.aIW() * fArray[2]);
                eF.setAlpha(eF.aIX() * fArray[3]);
                eF.h((byte)n);
            }
        }
    }

    private void a(EF eF, float[] fArray) {
        fArray[0] = this.cSD ? -eF.aIM() : eF.aIM();
        fArray[1] = eF.aIN();
        fArray[4] = eF.aIO();
        fArray[5] = eF.aIP();
        fArray[12] = eF.aIQ();
        fArray[13] = -eF.aIR();
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

    public aCi bHv() {
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

    public arF bHy() {
        return this.cSx.bHY();
    }

    public arF bHz() {
        return this.cSy == null ? null : this.cSy.bHY();
    }

    public void a(arF arF2, arF arF3) {
        assert (this.cSx != null);
        this.cSx.clear();
        this.cSx = arF2.bHY();
        this.cSy = arF3 == null ? null : arF3.bHY();
        this.bHh();
    }

    public arA bHA() {
        return this.cSz.bHO();
    }

    public void a(arA arA2) {
        this.cSz.clear();
        this.cSz = arA2.bHO();
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
            this.cSy = new arF();
        }
        this.cSy.a(anm, null);
    }

    public void c(Anm anm) {
        if (this.cSy != null) {
            this.cSy.b(anm, null);
        }
    }

    static {
        cSn = arQ.cVv;
        cSs = Stream.of("_Cadre", "_AnimStatiqueCadre", "_AnimStatique").collect(Collectors.toCollection(HashSet::new));
        cSf = Material.daH;
        cSg = new float[4096];
        cSh = new float[8192];
        cSi = new float[4096];
        int n = 32;
        cSo = new EF[32];
        for (int i = 0; i < cSo.length; ++i) {
            aro.cSo[i] = new EF();
        }
    }
}
