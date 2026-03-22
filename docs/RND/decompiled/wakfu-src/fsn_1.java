/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fSN
 */
public class fsn_1 {
    private float uIW;
    private float uIX;
    private float veE;
    private float veF;
    private float veG;
    private float veH;
    private long aHT;
    private String p;
    private boolean utJ;
    private boolean veI;
    private boolean veJ;
    private boolean bmg = true;
    private boolean veK;
    private boolean veL;
    private Object aGT;
    private fso_1 veM;
    private fso_1 veN;
    private fso_1 veO;
    private String tCu;
    private float[] bdU;

    public fsn_1(float f2, float f3, float f4, long l, String string, fso_1 fso_12, float[] fArray) {
        this(f2, f3, f4, l, string, null, fso_12, fArray);
    }

    public fsn_1(float f2, float f3, float f4, long l, String string, Object object, fso_1 fso_12, float[] fArray) {
        this(f2, f3, f4, l, string, object, fso_12, fArray, false, false);
    }

    public fsn_1(float f2, float f3, float f4, long l, String string, Object object, fso_1 fso_12, String string2, float[] fArray) {
        this(f2, f3, f4, l, string, object, fso_12, null, string2, fArray, false, false);
    }

    public fsn_1(float f2, float f3, float f4, long l, String string, Object object, fso_1 fso_12, float[] fArray, boolean bl, boolean bl2) {
        this(f2, f3, f4, l, string, object, fso_12, null, fArray, bl, bl2);
    }

    public fsn_1(float f2, float f3, float f4, long l, String string, Object object, fso_1 fso_12, fso_1 fso_13, float[] fArray, boolean bl, boolean bl2) {
        this(f2, f3, f4, l, string, object, fso_12, fso_13, null, fArray, bl, bl2);
    }

    public fsn_1(float f2, float f3, float f4, long l, String string, Object object, fso_1 fso_12, fso_1 fso_13, String string2, float[] fArray, boolean bl, boolean bl2) {
        this.uIW = f2;
        this.uIX = f3;
        this.veE = f4;
        this.veF = f2;
        this.veG = f3;
        this.veH = f4;
        this.aHT = l;
        this.p = string;
        this.aGT = object;
        this.veM = fso_12;
        this.veN = fso_13;
        this.tCu = string2;
        this.bdU = fArray;
        this.utJ = bl;
        this.veI = bl2;
    }

    public float gEb() {
        return this.uIW;
    }

    public void ga(float f2) {
        this.uIW = f2;
    }

    public float gEc() {
        return this.uIX;
    }

    public void gb(float f2) {
        this.uIX = f2;
    }

    public float gGh() {
        return this.veE;
    }

    public void gf(float f2) {
        this.veE = f2;
    }

    public long aqZ() {
        return this.aHT;
    }

    public void fK(long l) {
        this.aHT = l;
    }

    public String getName() {
        if (this.p != null) {
            return this.p;
        }
        return null;
    }

    public void setName(String string) {
        this.p = string;
    }

    public fso_1 gGi() {
        return this.veM;
    }

    public fso_1 gGj() {
        return this.veN;
    }

    public fso_1 gGk() {
        return this.veO;
    }

    public void a(fso_1 fso_12) {
        this.veM = fso_12;
    }

    public void b(fso_1 fso_12) {
        this.veN = fso_12;
    }

    public void c(fso_1 fso_12) {
        this.veO = fso_12;
    }

    public float[] aXT() {
        return this.bdU;
    }

    public void q(float[] fArray) {
        this.bdU = fArray;
    }

    public Object getValue() {
        return this.aGT;
    }

    public void setValue(Object object) {
        this.aGT = object;
    }

    public float gGl() {
        return this.veG;
    }

    public float gGm() {
        return this.veF;
    }

    public float gGn() {
        return this.veH;
    }

    public void O(float f2, float f3, float f4) {
        this.veF = f2;
        this.veG = f3;
        this.veH = f4;
    }

    public boolean isEditable() {
        return this.utJ;
    }

    public void setEditable(boolean bl) {
        this.utJ = bl;
    }

    public void pq(boolean bl) {
        this.veI = bl;
    }

    public boolean gGo() {
        return this.veI;
    }

    public boolean gGp() {
        return this.veJ;
    }

    public void pr(boolean bl) {
        this.veJ = bl;
    }

    public boolean gGq() {
        return this.veK;
    }

    public void ps(boolean bl) {
        this.veK = bl;
    }

    public boolean gGr() {
        return this.veL;
    }

    public void pt(boolean bl) {
        this.veL = bl;
    }

    public String getParticlePath() {
        return this.tCu;
    }

    public void setParticlePath(String string) {
        this.tCu = string;
    }

    public boolean isVisible() {
        return this.bmg;
    }

    public void setVisible(boolean bl) {
        this.bmg = bl;
    }

    public boolean gg(float f2) {
        return Math.abs(this.veF - this.uIW) >= f2 || Math.abs(this.veG - this.uIX) >= f2;
    }
}

