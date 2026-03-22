/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Comparator;

public class buW
implements aeh_2 {
    public static final String jrk = "currentList";
    public static final String jrl = "currentPage";
    public static final String jrm = "totalPage";
    public static final String[] jrn = new String[]{"currentList"};
    private final ArrayList<bvh> jro = new ArrayList();
    private short jrp = 0;
    private int jrq;

    public void bO(short s) {
        this.jrp = s;
    }

    public short dJN() {
        return this.jrp;
    }

    public void H(ArrayList<buV> arrayList) {
        eyb_2 eyb_22 = cvd_1.eTy().eTA();
        this.jro.clear();
        if (eyb_22 == null) {
            eyb_22 = eyb_2.rJZ;
        }
        Comparator<buV> comparator = null;
        switch (eyb_22) {
            case rJY: {
                comparator = new buX(this);
                break;
            }
            case rJZ: {
                comparator = new buY(this);
                break;
            }
            case rKa: {
                comparator = new buZ(this);
                break;
            }
            case rKb: {
                comparator = new bva_0(this);
                break;
            }
            case rJW: {
                comparator = new bvb(this);
                break;
            }
            case rJX: {
                comparator = new bvc_0(this);
            }
        }
        arrayList.sort(comparator);
        for (int i = 0; i < arrayList.size(); ++i) {
            int n = !eyb_22.fPO() ? this.jrp * 9 + i + 1 : this.jrq - (this.jrp * 9 + i);
            this.jro.add(new bvh(arrayList.get(i), n));
        }
        fse_1.gFu().a((aef_2)this, jrk);
    }

    @Override
    public String[] bxk() {
        return jrn;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(jrk)) {
            return this.jro;
        }
        if (string.equals(jrl)) {
            return this.jrp + 1;
        }
        if (string.equals(jrm)) {
            return this.dJO();
        }
        return null;
    }

    private int dJO() {
        return GC.C((float)this.jrq / 9.0f);
    }

    public void FC(int n) {
        this.jrq = n;
        fse_1.gFu().a((aef_2)this, jrl, jrm);
    }
}

