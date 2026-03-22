/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import org.apache.log4j.Logger;

/*
 * Renamed from aoc
 */
public class aoc_2 {
    private final Set<acd_1> cKX = new LinkedHashSet<acd_1>();
    private final boolean cKY;
    private static final Logger cKZ = Logger.getLogger(aoc_2.class);
    private final acd_1 cLa = new acd_1();
    private final acd_1 cLb = new acd_1();

    public aoc_2(Iterable<int[]> iterable, boolean bl) {
        for (int[] nArray : iterable) {
            this.cKX.add(new acd_1(nArray[0], nArray[1]));
        }
        this.cKY = bl;
    }

    public Iterable<int[]> a(int n, int n2, short s, int n3, int n4, short s2, abi_1 abi_12) {
        aoe_1 aoe_12 = this.a(n, n2, n3, n4, abi_12);
        ArrayList<int[]> arrayList = new ArrayList<int[]>(this.cKX.size());
        for (acd_1 acd_12 : this.cKX) {
            arrayList.add(aoe_12.n(acd_12.getX(), acd_12.getY()));
        }
        return arrayList;
    }

    public boolean a(int n, int n2, short s, int n3, int n4, short s2, abi_1 abi_12, int n5, int n6, short s3) {
        aoe_1 aoe_12 = this.a(n, n2, n3, n4, abi_12);
        this.cLa.u(aoe_12.o(n5, n6));
        return this.cKX.contains(this.cLa);
    }

    public boolean a(int n, int n2, short s, int n3, int n4, short s2, abi_1 abi_12, int n5, int n6, short s3, byte n7) {
        aoe_1 aoe_12 = this.a(n, n2, n3, n4, abi_12);
        this.cLa.u(aoe_12.o(n5, n6));
        if (n7 <= 0) {
            return this.cKX.contains(this.cLa);
        }
        for (int i = -n7; i <= n7; ++i) {
            for (int j = -n7; j <= n7; ++j) {
                this.cLb.Q(this.cLa.getX() + i, this.cLa.getY() + j, (short)0);
                if (!this.cKX.contains(this.cLb)) continue;
                return true;
            }
        }
        return false;
    }

    private aoe_1 a(int n, int n2, int n3, int n4, abi_1 abi_12) {
        abi_1 abi_13 = new acq_1(n - n3, n2 - n4, 0).g(abi_12);
        return aoe_1.a(n, n2, abi_13, this.cKY);
    }
}

