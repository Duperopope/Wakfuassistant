/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class bsd
implements aeh_2 {
    public static final String jeN = "calendar";
    public static final String jeO = "selectedMonth";
    public static final String jeP = "monthesList";
    public static final String jeQ = "selectedYear";
    public static final String jeR = "yearsList";
    public static final String jeS = "hour";
    public static final String jeT = "minute";
    private static final int jeU;
    private static final ArrayList<Integer> jeV;
    private static final ArrayList<bsh> jeW;
    private final Calendar jeX = new GregorianCalendar(aum_0.cWf().aUXX().aUJ());
    private bsh jeY;
    private Integer jeZ;

    public bsd() {
        this.dEI();
    }

    public Calendar getCalendar() {
        return this.jeX;
    }

    public void dEI() {
        this.jeX.setTime(new Date());
        this.dEO();
        this.jeY = jeW.get(this.jeX.get(2) + jeW.size() - 12);
        int n = jeV.indexOf(this.jeX.get(1));
        this.jeZ = jeV.get(n);
    }

    public void F(ux_0 ux_02) {
        this.Fn(ux_02.bjI());
        this.Fm(ux_02.bjG() - 1);
        this.Fl(ux_02.bjD());
        this.Fo(ux_02.bjE());
        this.Fp(ux_02.bjF());
    }

    public void Fl(int n) {
        this.jeX.set(5, n);
    }

    public int dEJ() {
        return this.jeX.get(5);
    }

    public void Fm(int n) {
        this.jeX.set(2, n);
        this.jeY = jeW.get(Math.max(n + jeW.size() - 12, 0));
        fse_1.gFu().a((aef_2)this, jeP, jeO, jeN);
    }

    public int dEK() {
        return this.jeY.dFb();
    }

    public void Fn(int n) {
        this.jeX.set(1, n);
        int n2 = jeV.indexOf(n);
        this.jeZ = jeV.get(n2);
        this.dEO();
        fse_1.gFu().a((aef_2)this, jeP, jeO, jeQ, jeN);
    }

    public int dEL() {
        return this.jeZ;
    }

    public void Fo(int n) {
        this.jeX.set(11, n);
        fse_1.gFu().a((aef_2)this, jeS);
    }

    public int dEM() {
        return this.jeX.get(11);
    }

    public void Fp(int n) {
        this.jeX.set(12, n);
        fse_1.gFu().a((aef_2)this, jeT);
    }

    public int dEN() {
        return this.jeX.get(12);
    }

    private void dEO() {
        int n;
        int n2 = 0;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(new Date());
        if (gregorianCalendar.get(1) == this.jeX.get(1)) {
            n2 = gregorianCalendar.get(2);
        }
        int n3 = this.jeY != null ? this.jeY.dFb() : -1;
        jeW.clear();
        for (n = n2; n < 12; ++n) {
            jeW.add(new bsh(n));
        }
        this.jeY = null;
        if (n3 != -1) {
            for (n = jeW.size() - 1; n >= 0; --n) {
                bsh bsh2 = jeW.get(n);
                if (bsh2.dFb() != n3) continue;
                this.jeY = bsh2;
                break;
            }
        }
        if (this.jeY == null) {
            this.jeY = jeW.get(0);
        }
        this.Fm(this.jeY.dFb());
    }

    @Override
    public Object eu(String string) {
        if (string.equals(jeN)) {
            return this.jeX;
        }
        if (string.equals(jeP)) {
            return jeW;
        }
        if (string.equals(jeO)) {
            return this.jeY;
        }
        if (string.equals(jeR)) {
            return jeV;
        }
        if (string.equals(jeQ)) {
            return this.jeZ;
        }
        if (string.equals(jeS)) {
            return this.jeX.get(11);
        }
        if (string.equals(jeT)) {
            return this.jeX.get(12);
        }
        return null;
    }

    @Override
    public String[] bxk() {
        return null;
    }

    static {
        jeV = new ArrayList(3);
        jeW = new ArrayList(12);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(new Date());
        jeU = gregorianCalendar.get(1);
        for (int i = 0; i < 2; ++i) {
            jeV.add(jeU + i);
        }
    }
}

