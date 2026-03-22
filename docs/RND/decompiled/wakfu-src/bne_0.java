/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntIterator
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.iterator.TIntIterator;
import gnu.trove.set.hash.TIntHashSet;
import java.util.EnumMap;
import java.util.stream.Stream;

/*
 * Renamed from bnE
 */
public class bne_0
implements aot_1 {
    private static final bne_0 iJx = new bne_0();
    public static final int iJy = -1;
    public static final int iJz = 0;
    private static final EnumMap<fnB, bng_0> iJA;
    public static final fiH<SI<Integer>> iJB;

    private static void a(fnB fnB2, bnh_0 bnh_02, bnd_0 bnd_02) {
        iJA.put(fnB2, new bng_0(bnd_02, bnh_02));
    }

    public static bng_0 a(fnB fnB2) {
        return iJA.get(fnB2);
    }

    public static bng_0 dzu() {
        return iJA.get(fnB.geF());
    }

    @Override
    public TIntHashSet bEH() {
        TIntHashSet tIntHashSet = new TIntHashSet();
        for (bng_0 bng_02 : iJA.values()) {
            bng_02.a(tIntHashSet);
        }
        iJB.fZX().values().forEach(sI -> tIntHashSet.add(((Integer)sI.getValue()).intValue()));
        return tIntHashSet;
    }

    public static bne_0 dzv() {
        return iJx;
    }

    public static void main(String[] stringArray) {
        TIntHashSet tIntHashSet = bne_0.dzv().bEH();
        TIntIterator tIntIterator = tIntHashSet.iterator();
        while (tIntIterator.hasNext()) {
            System.out.print(" " + tIntIterator.next());
        }
    }

    static {
        iJB = new fiH();
        bnd_0 bnd_02 = new bnd_0(56340, 56339, 56338, 56341, 56342, 56343);
        iJB.a(new SI<Integer>(56348, 150));
        Stream.of(56366, 56367, 56365, 56361, 56364, 56371, 56372, 56370, 56368, 56369, 56353, 56350, 56349, 56176, 56352, 56356, 56357, 56355, 56351, 56354, 56374, 56376, 56375, 56362, 56363, 56373).forEach(n -> iJB.a(new SI<Integer>((Integer)n, 1)));
        iJA = new EnumMap(fnB.class);
        bne_0.a(fnB.sJS, new bnm_2(34350, 34351), bnd_02);
        bne_0.a(fnB.sJT, new bnm_2(34352, 34353, 56432), bnd_02);
        bne_0.a(fnB.sJU, new bnm_2(56313, 56314, 56315, 56316, 56317, 56318), bnd_02);
        bne_0.a(fnB.sJV, new bnm_2(56319), bnd_02);
        bne_0.a(fnB.sJW, new bnm_2(34354, 34355, 56312), bnd_02);
        bne_0.a(fnB.sJX, new bnm_2(56320, 56321, 56322, 56323, 56324, 56325, 56326, 56327), bnd_02);
        bne_0.a(fnB.sJY, new bnm_2(56334, 56335, 56336, 56337), bnd_02);
        bne_0.a(fnB.sJZ, new bnm_2(56328, 56329, 56330, 56331, 56332, 56333), bnd_02);
    }
}

