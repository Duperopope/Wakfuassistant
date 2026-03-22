/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bIj
 */
public class bij_1
implements aeh_2,
ffc_2 {
    public static final String keU = "name";
    public static final String keV = "patternStyles";
    public static final String keW = "itemIcon";
    private final int keX;
    @Nullable
    private final fhp_0 keY;
    @Nullable
    private final fgj keZ;
    private final String[] kfa;
    @NotNull
    private final String kfb;

    public bij_1(int n, @NotNull fhp_0 fhp_02) {
        this.keX = n;
        this.keY = fhp_02;
        this.keZ = null;
        rd_0[] rd_0Array = this.keY.fZe();
        this.kfa = new String[rd_0Array.length];
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < rd_0Array.length; ++i) {
            this.kfa[i] = bES.a(rd_0Array[i], false);
            stringBuilder.append(bij_1.e(rd_0Array[i]));
        }
        this.kfb = stringBuilder.toString();
    }

    public bij_1(int n, @NotNull fgj fgj2) {
        this.keX = n;
        this.keY = null;
        this.keZ = fgj2;
        this.kfa = null;
        this.kfb = "";
    }

    private static char e(rd_0 rd_02) {
        if (rd_02 == rd_0.bjB) {
            return 'R';
        }
        if (rd_02 == rd_0.bjD) {
            return 'B';
        }
        Mv mv = aum_0.cWf().aUXX();
        return mv == Mv.aVk ? (char)'V' : 'G';
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "name": {
                return this.getName();
            }
            case "patternStyles": {
                return this.kfa;
            }
            case "itemIcon": {
                Object r = fgD.fXh().Vd(this.keX);
                if (r == null) {
                    return null;
                }
                return auc_0.cVq().zx(((fhc_0)r).aVt());
            }
        }
        return null;
    }

    public String getName() {
        return aum_0.cWf().a(15, (long)this.keX, new Object[0]);
    }

    public String dah() {
        return aum_0.cWf().b(15, (long)this.keX, new Object[0]);
    }

    @Override
    public String[] bxk() {
        return new String[]{keU, keV, keW};
    }

    @Override
    public String cUG() {
        return this.kfb + " " + this.dah();
    }

    public String toString() {
        return this.getName();
    }

    @Generated
    public int AK() {
        return this.keX;
    }

    @Nullable
    @Generated
    public fhp_0 dCC() {
        return this.keY;
    }

    @Nullable
    @Generated
    public fgj dCB() {
        return this.keZ;
    }

    @Generated
    public String[] dXB() {
        return this.kfa;
    }

    @NotNull
    @Generated
    public String dXC() {
        return this.kfb;
    }
}

