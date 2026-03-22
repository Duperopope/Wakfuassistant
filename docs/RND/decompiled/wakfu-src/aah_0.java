/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  gnu.trove.procedure.TLongObjectProcedure
 *  gnu.trove.procedure.TShortObjectProcedure
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.map.hash.TShortObjectHashMap;
import gnu.trove.procedure.TLongObjectProcedure;
import gnu.trove.procedure.TShortObjectProcedure;

/*
 * Renamed from aaH
 */
public class aah_0 {
    private float caE = 1000.0f;
    private boolean caF = false;
    private int bUi;
    private float axp = 1.0f;
    private float axq = 1.0f;
    private float axr = 1.0f;
    private float ayP = 1.0f;
    private float caG = 1.0f;
    private float caH = 1.0f;
    private float caI = 1.0f;
    private float caJ = 1.0f;
    private float caK = 1.0f;
    private float caL = 1.0f;
    private float caM = 1.0f;
    private float caN = 1.0f;
    final TLongObjectHashMap<aai_0> caO = new TLongObjectHashMap();
    final TShortObjectHashMap<aai_0> caP = new TShortObjectHashMap();
    private final aaJ caQ = new aaJ(this);
    private final aaK caR = new aaK(this);
    private static final aah_0 caS = new aah_0();

    private aah_0() {
    }

    public static aah_0 brY() {
        return caS;
    }

    public final aai_0 fH(long l) {
        return this.caO.isEmpty() ? null : (aai_0)this.caO.get(l);
    }

    public final aai_0 as(short s) {
        return this.caP.isEmpty() ? null : (aai_0)this.caP.get(s);
    }

    public void a(long l, float f2, float f3, float f4, float f5) {
        this.a(l, f2, f3, f4, f5, 1000.0f);
    }

    public void a(long l, float f2, float f3, float f4, float f5, float f6) {
        aai_0 aai_02 = (aai_0)this.caO.get(l);
        if (aai_02 == null) {
            aai_02 = new aai_0();
            this.caO.put(l, (Object)aai_02);
        }
        aai_02.a(f2, f3, f4, f5, f6);
    }

    public void eX(long l) {
        this.caO.remove(l);
    }

    public void a(short s, float f2, float f3, float f4, float f5) {
        this.a(s, f2, f3, f4, f5, 1000.0f);
    }

    public void a(short s, float f2, float f3, float f4, float f5, float f6) {
        aai_0 aai_02 = (aai_0)this.caP.get(s);
        if (aai_02 == null) {
            aai_02 = new aai_0();
            this.caP.put(s, (Object)aai_02);
        }
        aai_02.a(f2, f3, f4, f5, f6);
    }

    public final void brZ() {
        this.caO.clear();
        this.caP.clear();
    }

    public void a(boolean bl, int n) {
        this.caE = n;
        if (this.caF != bl) {
            this.caK = this.axp;
            this.caL = this.axq;
            this.caM = this.axr;
            this.caN = this.ayP;
        }
        if (!bl) {
            this.caG = 1.0f;
            this.caH = 1.0f;
            this.caI = 1.0f;
            this.caJ = 1.0f;
        }
        this.caF = bl;
        this.bUi = 0;
    }

    public boolean bsa() {
        return (float)this.bUi < this.caE;
    }

    public void qF(int n) {
        if (!this.caO.isEmpty()) {
            this.caQ.caW = n;
            this.caO.forEachEntry((TLongObjectProcedure)this.caQ);
            this.caQ.clean();
        }
        if (!this.caP.isEmpty()) {
            this.caR.caW = n;
            this.caP.forEachEntry((TShortObjectProcedure)this.caR);
            this.caR.clean();
        }
        if (this.bUi == Integer.MAX_VALUE) {
            return;
        }
        this.bUi += n;
        if ((float)this.bUi > this.caE) {
            this.bUi = Integer.MAX_VALUE;
            this.axp = this.caK = this.caG;
            this.axq = this.caL = this.caH;
            this.axr = this.caM = this.caI;
            this.ayP = this.caN = this.caJ;
            return;
        }
        float f2 = (float)this.bUi / this.caE;
        this.axp = this.caK + (this.caG - this.caK) * f2;
        this.axq = this.caL + (this.caH - this.caL) * f2;
        this.axr = this.caM + (this.caI - this.caM) * f2;
        this.ayP = this.caN + (this.caJ - this.caN) * f2;
    }

    public void v(float[] fArray) {
        assert (fArray.length == 4);
        fArray[0] = fArray[0] * this.axp;
        fArray[1] = fArray[1] * this.axq;
        fArray[2] = fArray[2] * this.axr;
        fArray[3] = fArray[3] * this.ayP;
    }

    public void bV(float f2) {
        this.caG = 0.3f * f2;
        this.caH = 0.3f * f2;
        this.caI = 0.3f * f2;
        this.caJ = f2;
    }
}

