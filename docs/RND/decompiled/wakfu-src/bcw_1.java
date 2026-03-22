/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bcw
 */
public abstract class bcw_1
implements aeh_2 {
    public static final String hER = "description";
    public static final String hES = "progressionText";
    public static final String hET = "isCompleted";
    public static final String hEU = "isFailed";
    public static final String hEV = "isCompassed";
    public static final String hEW = "canBeCompassed";
    public static final String hEX = "canBeCompassedNow";
    public static final String hEY = "objectiveInstanceName";
    public static final String[] hEZ = new String[]{"description", "progressionText", "isCompleted", "isCompassed", "canBeCompassedNow"};

    @Override
    public String[] bxk() {
        return hEZ;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(hER)) {
            return this.getDescription();
        }
        if (string.equals(hES)) {
            long l = this.dbv();
            return l == -1L ? null : Long.valueOf(l);
        }
        if (string.equals(hET)) {
            return this.daJ();
        }
        if (string.equals(hEU)) {
            return this.daI();
        }
        if (string.equals(hEV)) {
            return this.dbw();
        }
        if (string.equals(hEW)) {
            return this.dbx();
        }
        if (string.equals(hEX)) {
            return this.dby();
        }
        if (string.equals(hEY)) {
            return this.dbz();
        }
        return null;
    }

    public abstract String getDescription();

    public abstract String dak();

    protected abstract long dbv();

    protected abstract boolean daJ();

    protected abstract boolean dbw();

    protected abstract boolean daI();

    protected abstract boolean dbx();

    protected abstract boolean dby();

    @NotNull
    protected Object dbz() {
        return aum_0.cWf().c("compass", new Object[0]);
    }
}

