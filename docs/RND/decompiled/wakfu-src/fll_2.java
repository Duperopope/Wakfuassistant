/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from fLL
 */
public class fll_2
extends flp_2 {
    private static final Logger uIU = Logger.getLogger(fll_2.class);
    private static final ObjectPool uIV = new ayv_2(new flm_2());
    private float uIW;
    private float uIX;
    private Object aGT;

    public static fll_2 gEa() {
        fll_2 fll_22;
        try {
            fll_22 = (fll_2)uIV.borrowObject();
            fll_22.uth = uIV;
        }
        catch (Exception exception) {
            uIU.error((Object)"Probl\u00e8me au borrowObject.");
            fll_22 = new fll_2();
            fll_22.aVI();
        }
        return fll_22;
    }

    public static fll_2 a(flp_2 flp_22, float f2, float f3, Object object) {
        fll_2 fll_22 = fll_2.gEa();
        fll_22.NQ(flp_22.ofv);
        fll_22.aca(flp_22.tPo);
        fll_22.abZ(flp_22.ofK);
        fll_22.qu(flp_22.bVF);
        fll_22.qv(flp_22.bVG);
        fll_22.x((fhv_1)flp_22.gBE());
        fll_22.ga(f2);
        fll_22.gb(f3);
        fll_22.setValue(object);
        return fll_22;
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

    public Object getValue() {
        return this.aGT;
    }

    public void setValue(Object object) {
        this.aGT = object;
    }
}

