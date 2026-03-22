/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Set;

public class bsf
implements aeh_2 {
    public static final String jfh = "calendar";
    public static final String jfi = "eventsForMonth";
    private bse jfj;
    private fak_2 jfk;
    private final bsd jfl = new bsd();
    private ArrayList<bsg> jfm;
    private static final bsf jfn = new bsf();

    private bsf() {
    }

    public static bsf dEU() {
        return jfn;
    }

    public void a(bse bse2) {
        this.jfj = bse2;
    }

    public fak_2 dEV() {
        return this.jfk;
    }

    private Calendar dEW() {
        return this.jfl.getCalendar();
    }

    public void a(fak_2 fak_22) {
        this.jfk = fak_22;
        this.jfl.dEI();
        this.jfk.setCalendar(this.dEW());
        this.dEX();
    }

    @Override
    public Object eu(String string) {
        if (string.equals(jfh)) {
            return this.jfl;
        }
        if (string.equals(jfi)) {
            return this.jfm;
        }
        return null;
    }

    public void Fm(int n) {
        this.jfl.Fm(n);
        this.jfk.setCalendar(this.dEW());
        this.dEX();
    }

    public void Fn(int n) {
        this.jfl.Fn(n);
        this.jfk.setCalendar(this.dEW());
        this.dEX();
    }

    public int dEJ() {
        if (this.jfk != null) {
            return this.jfk.getDayOver();
        }
        return 1;
    }

    public int dEK() {
        if (this.jfk != null) {
            return this.jfl.dEK();
        }
        return 1;
    }

    public int dEL() {
        if (this.jfk != null) {
            return this.jfl.dEL();
        }
        return 1;
    }

    public void dEX() {
        if (this.jfk != null) {
            this.jfm = this.dEY();
            this.jfk.setContent(this.jfm);
        }
    }

    private ArrayList<bsg> dEY() {
        ArrayList<bsg> arrayList = new ArrayList<bsg>();
        uw_0 uw_02 = new uw_0(0, 0, 0, 1, this.jfl.dEK() + 1, this.jfl.dEL());
        int n = this.dEW().getActualMaximum(5);
        for (int i = 1; i <= n; ++i) {
            Set<eTw> set = this.jfj.G(uw_02);
            if (set != null && !set.isEmpty()) {
                bsg bsg2 = new bsg(i, set);
                arrayList.add(bsg2);
            }
            uw_02.a(ua_0.bvW);
        }
        return arrayList;
    }

    @Override
    public String[] bxk() {
        return new String[0];
    }
}

