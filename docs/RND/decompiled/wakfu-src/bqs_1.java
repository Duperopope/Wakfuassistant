/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bqs
 */
class bqs_1
implements aeh_2 {
    public static final String iZL = "territoryId";
    public static final String iZM = "territoryName";
    public static final String iZN = "canOpenOnMap";
    public static final String iZO = "challengeNames";
    private final int iZP;
    @NotNull
    final String iZQ;
    @NotNull
    private final List<String> iZR;

    bqs_1(int n2, List<Integer> list) {
        this.iZP = n2;
        this.iZQ = bql_1.Dm(n2);
        this.iZR = new ArrayList<String>(list.size());
        list.forEach(n -> this.iZR.add(aum_0.cWf().a(26, (long)n.intValue(), new Object[0])));
        this.iZR.sort(Comparator.comparing(BH::aT));
    }

    @Override
    @Nullable
    public Object eu(String string) {
        String string2 = string;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{iZL, iZM, iZN, iZO}, (Object)string2, n)) {
            case 0 -> this.iZP;
            case 1 -> this.iZQ;
            case 2 -> cey_2.getMapZone(this.iZP).isPresent();
            case 3 -> this.iZR;
            default -> null;
        };
    }

    @Override
    public String[] bxk() {
        return new String[]{iZL, iZM, iZN, iZO};
    }
}

