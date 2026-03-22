/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from fBc
 */
public class fbc_1
extends faw_2 {
    public static final String TAG = "DisplayContainer";
    private int bMn = 30;
    private int tRx = 10;
    private final HashMap<fes_2, fep_2> tRy = new HashMap();
    public static final int tRz = -389176294;
    public static final int tRA = -1992012396;

    @Override
    public boolean b(fes_2 fes_22, int n) {
        boolean bl = super.b(fes_22, n);
        if (bl) {
            if (this.tRe.size() > this.tRx) {
                ((fes_2)this.tRe.get(0)).gAD();
            }
            this.tRy.put(fes_22, new fep_2(fes_22, this.bMn * 1000));
            flt_2 flt_22 = new flt_2(this, this.tRe.size() == this.tRx);
            flt_22.aVI();
            this.h(flt_22);
        }
        return bl;
    }

    @Override
    public void n(fes_2 fes_22) {
        fep_2 fep_22 = this.tRy.remove(fes_22);
        if (fep_22 != null) {
            fep_22.bhk();
        }
        super.n(fes_22);
        flt_2 flt_22 = new flt_2(this, this.tRe.size() == this.tRx);
        flt_22.aVI();
        this.h(flt_22);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public int getDuration() {
        return this.bMn;
    }

    public void setDuration(int n) {
        this.bMn = n;
    }

    public int getContentSize() {
        return this.tRx;
    }

    public void setContentSize(int n) {
        this.tRx = n;
    }

    public boolean isFull() {
        return this.tRx == this.tRe.size();
    }

    @Override
    public void a(fhi_2 fhi_22) {
        super.a(fhi_22);
        fbc_1 fbc_12 = (fbc_1)fhi_22;
        fbc_12.setDuration(this.bMn);
        fbc_12.setContentSize(this.tRx);
    }

    @Override
    public void aVH() {
        super.aVH();
        for (fep_2 fep_22 : this.tRy.values()) {
            fep_22.bhk();
        }
        this.tRy.clear();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == -389176294) {
            this.setContentSize(Bw.m(string));
        } else if (n == -1992012396) {
            this.setDuration(Bw.m(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -389176294) {
            this.setContentSize(Bw.m(object));
        } else if (n == -1992012396) {
            this.setDuration(Bw.m(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

