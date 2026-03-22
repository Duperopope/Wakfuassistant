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
 * Renamed from fLI
 */
public class fli_2
extends flf_2 {
    private static final Logger uIR = Logger.getLogger(fli_2.class);
    private static final ObjectPool uIS = new ayv_2(new flj_2());
    private int cHd;
    private char uIT;

    public char gDW() {
        return this.uIT;
    }

    public void q(char c2) {
        this.uIT = c2;
    }

    public int bCC() {
        return this.cHd;
    }

    public void ta(int n) {
        this.cHd = n;
    }

    public boolean r(char c2) {
        return this.gDQ() && this.uIT == '\u0001' + c2 - 65;
    }

    public static fli_2 gDX() {
        fli_2 fli_22;
        try {
            fli_22 = (fli_2)uIS.borrowObject();
            fli_22.uth = uIS;
        }
        catch (Exception exception) {
            uIR.error((Object)"Probl\u00e8me au borrowObject.");
            fli_22 = new fli_2();
            fli_22.aVI();
        }
        return fli_22;
    }

    @Override
    public void aVH() {
        this.uIT = (char)65535;
        this.cHd = -1;
    }

    @Override
    public String toString() {
        return String.format("%s{type=%s,target=%s,keyChar=%s,keyCode=%s,keyModifiers=%s}", new Object[]{this.getClass(), this.gBy(), this.gBE(), Character.valueOf(this.gDW()), this.bCC(), this.fcn()});
    }
}

