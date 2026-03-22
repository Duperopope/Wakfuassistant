/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from aoh
 */
public abstract class aoh_1
implements aoy_1 {
    private aoc_2 cLf;
    private short cLg = 0;

    public abstract void p(int[] var1);

    public <T extends anu_1> Iterable<T> a(int n, int n2, short s, int n3, int n4, short s2, Iterator<T> iterator) {
        return this.a(n, n2, s, n3, n4, s2, abi_1.dzq, iterator);
    }

    public <T extends anu_1> Iterable<T> a(int n, int n2, short s, int n3, int n4, short s2, abi_1 abi_12, Iterator<T> iterator) {
        ArrayList<anu_1> arrayList = new ArrayList<anu_1>();
        while (iterator.hasNext()) {
            anu_1 anu_12 = (anu_1)iterator.next();
            if (!this.a(n, n2, s, n3, n4, s2, abi_12, anu_12.bcC(), anu_12.bcD(), anu_12.bcE())) continue;
            arrayList.add(anu_12);
        }
        return arrayList;
    }

    public short bEi() {
        return this.cLg;
    }

    public void aA(short s) {
        this.cLg = s;
    }

    public boolean a(int n, int n2, short s, int n3, int n4, short s2, abi_1 abi_12, int n5, int n6, short s3) {
        return this.bEj().a(n, n2, s, n3, n4, s2, abi_12, n5, n6, s3);
    }

    public boolean b(int n, int n2, short s, int n3, int n4, short s2, abi_1 abi_12, int n5, int n6, short s3, byte by) {
        return this.bEj().a(n, n2, s, n3, n4, s2, abi_12, n5, n6, s3, by);
    }

    public boolean a(int n, int n2, short s, int n3, int n4, short s2, int n5, int n6, short s3) {
        return this.a(n, n2, s, n3, n4, s2, abi_1.dzq, n5, n6, s3);
    }

    protected aoc_2 bEj() {
        if (this.cLf == null) {
            this.cLf = new aoc_2(this.bEm(), this.bEk());
        }
        return this.cLf;
    }

    public Iterable<int[]> b(int n, int n2, short s, int n3, int n4, short s2, abi_1 abi_12) {
        return this.bEj().a(n, n2, s, n3, n4, s2, abi_12);
    }

    public Iterable<int[]> b(int n, int n2, short s, int n3, int n4, short s2) {
        return this.b(n, n2, s, n3, n4, s2, abi_1.dzq);
    }

    protected abstract boolean bEk();

    public abstract aoi_1 bEl();

    public abstract List<int[]> bEm();

    public abstract String bEn();

    public abstract String bEo();

    public abstract ArrayList<aoh_1> bEp();

    public abstract aoy_2 bEq();
}

