/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongIterator
 *  gnu.trove.set.hash.TLongHashSet
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TLongIterator;
import gnu.trove.set.hash.TLongHashSet;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bkP
 */
public class bkp_2
implements aeh_2 {
    public static final String irX = "haveResurrectItem";
    public static final String irY = "canBeResurrected";
    public static final String[] irZ = new String[]{"haveResurrectItem", "canBeResurrected"};

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case irX -> bkp_2.dsV();
            case irY -> {
                bkb_0 var4_4 = aue_0.cVJ().cVK().dps();
                yield var4_4 instanceof bkk_2 && ((bkk_2)var4_4).dsR();
            }
            default -> null;
        };
    }

    private static boolean dsV() {
        TLongHashSet tLongHashSet = fcL.rUh.sx(aue_0.cVJ().cVK().Xi());
        if (tLongHashSet == null) {
            return false;
        }
        TLongIterator tLongIterator = tLongHashSet.iterator();
        while (tLongIterator.hasNext()) {
            ffV ffV2;
            bhJ bhJ2 = (bhJ)fcL.rUh.sw(tLongIterator.next());
            if (bhJ2 == null || (ffV2 = bhJ2.dod().UK(9247)) == null) continue;
            return true;
        }
        return false;
    }

    @Override
    public String[] bxk() {
        return irZ;
    }
}

