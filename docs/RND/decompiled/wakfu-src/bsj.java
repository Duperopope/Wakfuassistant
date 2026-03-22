/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class bsj
implements aeh_2 {
    public static final String jfV = "description";
    public static final String jfW = "value";
    private byte asf;
    private static bsj[] jfX;

    public static bsj[] dFp() {
        return jfX;
    }

    public static bsj bF(byte by) {
        for (bsj bsj2 : jfX) {
            if (bsj2.asf != by) continue;
            return bsj2;
        }
        return null;
    }

    public bsj(byte by) {
        this.asf = by;
    }

    public byte aFW() {
        return this.asf;
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(jfV)) {
            return aum_0.cWf().c("calendar.event.type." + this.asf, new Object[0]);
        }
        if (string.equals(jfW)) {
            return String.valueOf(this.asf);
        }
        return null;
    }

    static {
        ArrayList<bsj> arrayList = new ArrayList<bsj>();
        arrayList.add(new bsj(1));
        arrayList.add(new bsj(2));
        arrayList.add(new bsj(3));
        jfX = new bsj[arrayList.size()];
        jfX = arrayList.toArray(jfX);
    }
}

