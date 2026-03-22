/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bNg
 */
public class bng_2
implements aeh_2 {
    private final int kAz;
    private final List<bnh_2> kAA;
    private final List<bnh_2> kAB;
    private final int kAC;
    private boolean cHn;
    private final int kAD;
    public static final String kAE = "staticRewards";
    public static final String kAF = "dynamicRewards";
    public static final String kAG = "requiredWeight";
    public static final String kAH = "enabled";
    public static final String kAI = "hasEnoughRewardSelected";

    public bng_2(int n, boolean bl, int n2, List<bnh_2> list, List<bnh_2> list2, int n3) {
        this.kAz = n;
        this.kAC = n2;
        this.kAA = list;
        this.kAB = list2;
        this.cHn = bl;
        this.kAD = n3;
    }

    @Override
    public String[] bxk() {
        return new String[]{kAF, kAE, kAG};
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "dynamicRewards": {
                return this.kAB;
            }
            case "staticRewards": {
                return this.kAA;
            }
            case "requiredWeight": {
                return this.kAC;
            }
            case "enabled": {
                return this.cHn;
            }
            case "hasEnoughRewardSelected": {
                return this.efv();
            }
        }
        return null;
    }

    public int ayr() {
        return this.kAC;
    }

    public List<Integer> efu() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (bnh_2 bnh_22 : this.kAB) {
            if (!bnh_22.bqr()) continue;
            arrayList.add(bnh_22.azt());
        }
        return arrayList;
    }

    public boolean efv() {
        return this.efu().size() >= this.kAD;
    }

    public boolean a(bnh_2 bnh_22) {
        return this.kAB.contains(bnh_22);
    }

    public int ayj() {
        return this.kAz;
    }

    public void Ij(int n) {
        for (bnh_2 bnh_22 : this.kAB) {
            if (bnh_22.azt() != n) continue;
            bnh_22.efw();
            fse_1.gFu().a((aef_2)this, kAF, kAI);
            return;
        }
    }

    public void setEnabled(boolean bl) {
        if (this.cHn == bl) {
            return;
        }
        this.cHn = bl;
        if (this.cHn) {
            for (bnh_2 bnh_22 : this.kAA) {
                bnh_22.setSelected(true);
            }
            for (bnh_2 bnh_22 : this.kAB) {
                bnh_22.setSelected(false);
                bnh_22.ig(true);
            }
        } else {
            for (bnh_2 bnh_23 : this.kAA) {
                bnh_23.setSelected(false);
            }
            for (bnh_2 bnh_23 : this.kAB) {
                bnh_23.setSelected(false);
                bnh_23.ig(false);
            }
        }
        fse_1.gFu().a((aef_2)this, kAH, kAI);
    }
}

