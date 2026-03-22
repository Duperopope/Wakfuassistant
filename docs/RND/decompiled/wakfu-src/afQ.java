/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

public class afQ {
    private static final float crv = 0.01f;
    private static final float crw = 2.1f;
    private final int crx;
    private final int cry;
    private final int crz;
    private int crA = Integer.MIN_VALUE;
    private int crB = Integer.MIN_VALUE;
    private int crC = Integer.MIN_VALUE;
    private boolean crD = false;
    private Object aGT;
    private afW cfP;
    private int bap;
    private int baq;
    private int crE;
    private String crF;
    private final int crG;
    private FreeParticleSystem crH = null;
    private int bVF;
    private int bVG;
    private boolean crI = false;
    private final agg_0 crJ;
    private final agg_0 crK;
    private final agg_0 crL;
    private final agg_0 crM;
    private final agg_0 crN;
    private final afS crO;
    private afR crP;
    private final boolean crQ;

    public afQ(afS afS2, Object object, int n, int n2, int n3, int n4, boolean bl) {
        this.crO = afS2;
        this.aGT = object;
        this.crQ = bl;
        this.crL = new agg_0();
        this.crL.setSpeed(2.1f);
        this.crL.cF(0.01f);
        this.crM = new agg_0();
        this.crM.setSpeed(2.1f);
        this.crM.cF(0.01f);
        this.crN = new agg_0();
        this.crN.setSpeed(2.1f);
        this.crN.cF(0.01f);
        this.crJ = new agg_0();
        this.crJ.setSpeed(2.1f);
        this.crJ.cF(0.01f);
        this.crK = new agg_0();
        this.crK.setSpeed(2.1f);
        this.crK.cF(0.01f);
        this.crG = n;
        this.crx = n2;
        this.cry = n3;
        this.crz = n4;
    }

    public void byd() {
        this.crO.a(this);
    }

    public void setScreenPosition(int n, int n2) {
        this.crJ.cG(n);
        this.crK.cG(n2);
    }

    public void bA(int n, int n2) {
        this.crJ.aS(n);
        this.crK.aS(n2);
    }

    public int getScreenX() {
        return this.bVF;
    }

    public int getScreenY() {
        return this.bVG;
    }

    public int bye() {
        return this.crG;
    }

    public String byf() {
        return this.crF;
    }

    public void setIconUrl(String string) {
        this.crF = string;
    }

    public void setValue(Object object) {
        this.aGT = object;
    }

    public Object getValue() {
        return this.aGT;
    }

    public void d(boolean bl, boolean bl2) {
        if (this.crD && !bl2 && this.crI == bl) {
            return;
        }
        this.crD = true;
        this.crI = bl;
        if (this.crI) {
            this.bym();
        } else {
            this.byn();
        }
    }

    public void setPosition(int n, int n2, int n3) {
        this.crL.cG(n);
        this.crM.cG(n2);
        this.crN.cG(n3);
    }

    public void B(int n, int n2, int n3) {
        this.crL.aS(n);
        this.crM.aS(n2);
        this.crN.aS(n3);
    }

    public boolean byg() {
        return this.crQ;
    }

    public int getX() {
        return (int)this.crL.aSK();
    }

    public int getY() {
        return (int)this.crM.aSK();
    }

    public int NN() {
        return (int)this.crN.aSK();
    }

    public int getStartX() {
        return this.crx;
    }

    public int getStartY() {
        return this.cry;
    }

    public int byh() {
        return this.crz;
    }

    public int byi() {
        return this.crA;
    }

    public int byj() {
        return this.crB;
    }

    public int byk() {
        return this.crC;
    }

    public boolean byl() {
        return this.crA != Integer.MIN_VALUE;
    }

    public void C(int n, int n2, int n3) {
        this.crA = n;
        this.crB = n2;
        this.crC = n3;
    }

    public afW btr() {
        return this.cfP;
    }

    public void a(afW afW2) {
        if (this.cfP == afW2) {
            return;
        }
        this.cfP = afW2;
        if (this.crH != null) {
            this.crH.a(afW2);
        }
    }

    public void qy(int n) {
        this.bVF = (int)this.crJ.sj(n);
        this.bVG = (int)this.crK.sj(n);
        this.bap = (int)this.crL.sj(n);
        this.baq = (int)this.crM.sj(n);
        this.crE = (int)this.crN.sj(n);
        if (this.crH != null) {
            this.crH.e(this.bap, this.baq, this.crE);
        }
    }

    private void bym() {
        if (this.crH != null) {
            return;
        }
        this.crH = agY.bzw().bF(this.crG, 0);
        if (this.crH != null) {
            if (this.cfP != null) {
                this.crH.a(this.cfP);
            } else {
                this.crH.e(this.bap, this.baq, this.crE);
            }
            agZ.bzy().b(this.crH);
        }
    }

    private void byn() {
        if (this.crH == null) {
            return;
        }
        agZ.bzy().so(this.crH.bLJ());
        this.crH = null;
    }

    private void byo() {
        if (this.crP != null) {
            afR afR2 = this.crP;
            this.crP = null;
            afR2.byq();
        }
    }

    public afR byp() {
        return this.crP;
    }

    public void a(afR afR2) {
        this.crP = afR2;
    }

    public void clear() {
        this.byo();
        this.crO.b(this);
        this.cfP = null;
        this.byn();
    }
}

