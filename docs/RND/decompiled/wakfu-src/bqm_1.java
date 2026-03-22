/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bqm
 */
public class bqm_1
extends bql_1 {
    public static final int iZs = -1;

    public bqm_1() {
        super(-1);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if ("isNone".equals(string)) {
            return true;
        }
        return super.eu(string);
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("territory.none", new Object[0]);
    }
}

