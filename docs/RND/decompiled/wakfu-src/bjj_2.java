/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.THashSet
 */
import gnu.trove.set.hash.THashSet;
import java.util.Collections;

/*
 * Renamed from bjJ
 */
public class bjj_2 {
    public final String ipC;
    public String[] beD;

    public bjj_2(String string, String ... stringArray) {
        this.ipC = string;
        this.t(stringArray);
    }

    void t(String[] stringArray) {
        THashSet tHashSet = new THashSet();
        if (this.beD != null) {
            Collections.addAll(tHashSet, this.beD);
        }
        Collections.addAll(tHashSet, stringArray);
        this.beD = new String[tHashSet.size()];
        tHashSet.toArray((Object[])this.beD);
    }
}

