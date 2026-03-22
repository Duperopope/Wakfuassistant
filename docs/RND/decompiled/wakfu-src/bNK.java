/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class bNK
implements aeh_2 {
    public static final String kIu = "island";
    public static final String kIv = "links";
    private final int kIw;
    private final ArrayList<bNJ> kIx = new ArrayList();

    public bNK(int n) {
        this.kIw = n;
    }

    public void a(bNJ bNJ2) {
        this.kIx.add(bNJ2);
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kIu)) {
            return this.ego();
        }
        if (string.equals(kIv)) {
            return this.egq();
        }
        return null;
    }

    public String ego() {
        return aum_0.cWf().a(77, (long)this.kIw, new Object[0]);
    }

    public ArrayList<bNJ> egp() {
        return this.kIx;
    }

    public ArrayList<bNJ> egq() {
        if (bNL.kIG == null || bNL.kIG.isEmpty()) {
            return this.kIx;
        }
        ArrayList<bNJ> arrayList = new ArrayList<bNJ>();
        String string = aum_0.cWf().b(77, (long)this.kIw, new Object[0]);
        String string2 = BH.aT(bNL.kIG);
        for (bNJ bNJ2 : this.kIx) {
            if (!bNJ2.dah().contains(string2) && !string.contains(string2)) continue;
            arrayList.add(bNJ2);
        }
        return arrayList;
    }
}

