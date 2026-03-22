/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Nullable
 */
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cbS
 */
public class cbs_2
implements aeh_2 {
    public static final String lLm = "nameWithIdAndConnectionStatus";
    public static final String lLn = "accountId";
    public static final String lLo = "rank";
    private final nv lLp;
    private final cbt_2 lLq;

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "accountId": {
                return "Account: " + this.lLp.xl();
            }
            case "nameWithIdAndConnectionStatus": {
                return this.lLp.getName() + " (" + this.lLp.Sn() + ") " + cwj_1.kJ(this.lLp.aqh());
            }
            case "rank": {
                return "Rank: " + this.lLq.getName();
            }
        }
        return null;
    }

    public String getName() {
        return this.lLp.getName();
    }

    public cbt_2 esG() {
        return this.lLq;
    }

    public long KU() {
        return this.lLp.Sn();
    }

    public long xl() {
        return this.lLp.xl();
    }

    @Override
    public String[] bxk() {
        return new String[]{lLn, lLm, lLo};
    }

    @Generated
    public cbs_2(nv nv2, cbt_2 cbt_22) {
        this.lLp = nv2;
        this.lLq = cbt_22;
    }
}

