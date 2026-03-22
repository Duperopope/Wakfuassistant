/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public class bNP
implements aeh_2 {
    public static final int kIR = 10001;
    public static final String kIS = "island";
    public static final String kIT = "links";
    private final frm_0 kIU;
    protected final List<bNS> kIV = new ArrayList<bNS>();

    public bNP(frm_0 frm_02) {
        this.kIU = frm_02;
    }

    public void a(bNS bNS2) {
        this.kIV.add(bNS2);
        this.kIV.sort(bNR.kIW);
    }

    public int cjd() {
        return this.kIU.d();
    }

    public int wp() {
        return this.kIU.wp();
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Nullable
    public bNS lX(long l) {
        for (bNS bNS2 : this.kIV) {
            if (bNS2.Sn() != l) continue;
            return bNS2;
        }
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kIS)) {
            return aum_0.cWf().a(151, (long)this.cjd(), new Object[0]);
        }
        if (string.equals(kIT)) {
            return this.egv();
        }
        return null;
    }

    public List<bNS> egv() {
        if (bNT.kIG == null || bNT.kIG.isEmpty()) {
            return this.kIV;
        }
        ArrayList<bNS> arrayList = new ArrayList<bNS>();
        String string = aum_0.cWf().b(151, (long)this.cjd(), new Object[0]);
        String string2 = BH.aT(bNT.kIG);
        for (bNS bNS2 : this.kIV) {
            if (!bNS2.dah().contains(string2) && !string.contains(string2)) continue;
            arrayList.add(bNS2);
        }
        return arrayList;
    }
}

