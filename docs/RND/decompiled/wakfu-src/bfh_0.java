/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bfh
 */
public class bfh_0
implements aeh_2 {
    public static final String hQL = "name";
    public static final String hQM = "desc";
    public static final String hQN = "iconUrl";
    public static final String[] hQO = new String[]{"name", "desc", "iconUrl"};
    private final fpf_0 hQP;

    public bfh_0(fpf_0 fpf_02) {
        this.hQP = fpf_02;
    }

    @Override
    public String[] bxk() {
        return hQO;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(hQL)) {
            return aum_0.cWf().c("battleground.gameplay.name." + this.hQP.d(), new Object[0]);
        }
        if (string.equals(hQM)) {
            return aum_0.cWf().c("battleground.gameplay.description." + this.hQP.d(), new Object[0]);
        }
        if (string.equals(hQN)) {
            return auc_0.cVq().kw(String.valueOf(this.hQP.d()));
        }
        return null;
    }

    public fpf_0 dfF() {
        return this.hQP;
    }
}

