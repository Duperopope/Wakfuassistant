/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from bnD
 */
public class bnd_0
implements bnF {
    private static final int[] iJn = new int[]{0};
    public static final int iJo = 1;
    public static final int iJp = 2;
    public static final int iJq = 4;
    private final int iJr;
    private final int iJs;
    private final int iJt;
    private final int iJu;
    private final int iJv;
    private final int iJw;

    public bnd_0(int n, int n2, int n3, int n4, int n5, int n6) {
        this.iJr = n;
        this.iJs = n2;
        this.iJt = n3;
        this.iJu = n4;
        this.iJv = n5;
        this.iJw = n6;
    }

    public int EA(int n) {
        switch (n) {
            case 0: {
                return 0;
            }
            case 2: {
                return this.iJs;
            }
            case 1: {
                return this.iJr;
            }
            case 7: {
                return this.iJt;
            }
            case 5: {
                return this.iJu;
            }
            case 6: {
                return this.iJv;
            }
            case 4: {
                return this.iJw;
            }
        }
        return -1;
    }

    @Override
    public void a(TIntHashSet tIntHashSet) {
        tIntHashSet.add(this.iJr);
        tIntHashSet.add(this.iJs);
        tIntHashSet.add(this.iJt);
        tIntHashSet.add(this.iJu);
        tIntHashSet.add(this.iJv);
        tIntHashSet.add(this.iJw);
    }
}

