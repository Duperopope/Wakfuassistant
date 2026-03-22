/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TByteHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.set.hash.TByteHashSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.log4j.Logger;

public final class eVa
implements eVb {
    private static final Logger ryZ = Logger.getLogger(eVa.class);

    @Override
    public boolean d(ety_0<? extends exP> ety_02) {
        boolean bl = false;
        boolean bl2 = false;
        TByteHashSet tByteHashSet = new TByteHashSet();
        Collection<? extends exP> collection = ety_02.fKi();
        for (exP exP2 : collection) {
            if (exP2.bcP() == -1) {
                ryZ.error((Object)ety_02.sq("[FIGHT_REFACTOR] On a un fighter inPlay avec un teamId \u00e0 -1 " + String.valueOf(exP2) + " - " + adu_1.xg(8)));
                continue;
            }
            tByteHashSet.add(exP2.bcP());
            if (!(bl2 |= exP2.aFW() == 0 || exP2.aFW() == 5) || !(bl |= tByteHashSet.size() >= ety_02.fJY())) continue;
            break;
        }
        return bl && bl2;
    }

    @Override
    public byte e(ety_0<? extends exP> ety_02) {
        HashSet<Byte> hashSet = new HashSet<Byte>();
        HashSet<Byte> hashSet2 = new HashSet<Byte>();
        HashSet<Byte> hashSet3 = new HashSet<Byte>();
        for (exP exP2 : ety_02.dGs()) {
            boolean bl;
            boolean bl2;
            if (exP2.i(exe_1.rEv)) continue;
            if (exP2.bcP() == -1) {
                ryZ.error((Object)ety_02.sq("Fighter " + String.valueOf(exP2) + " has team id -1"));
                continue;
            }
            boolean bl3 = bl2 = exP2.baH() || exP2.i(exe_1.rEG);
            if (bl2) {
                hashSet2.add(exP2.bcP());
            }
            boolean bl4 = bl = exP2.aFW() == 0 || exP2.aFW() == 5;
            if (bl) {
                hashSet.add(exP2.bcP());
            }
            if (!bl2 || !bl) continue;
            hashSet3.add(exP2.bcP());
        }
        if (hashSet2.isEmpty()) {
            ryZ.error((Object)ety_02.sr("No teams still have in play fighters at the end of the fight, so this fight has no winner"));
            return -1;
        }
        if (hashSet2.size() == 1) {
            return (Byte)hashSet2.iterator().next();
        }
        if (hashSet.isEmpty()) {
            ryZ.error((Object)ety_02.sr("Impossible case : this fight does not contain any players"));
            return -1;
        }
        Iterator<exP> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            byte by = (Byte)((Object)iterator.next());
            if (hashSet3.contains(by)) continue;
            hashSet2.remove(by);
        }
        if (hashSet2.size() == 1) {
            return (Byte)hashSet2.iterator().next();
        }
        ryZ.error((Object)ety_02.sr("The fight is over but has either no alive player teams or more than 1 (teamWithInPlayerFighters=" + Arrays.toString(hashSet2.toArray()) + ")"));
        return -1;
    }
}

