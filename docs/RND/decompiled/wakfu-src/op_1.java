/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Map;

/*
 * Renamed from OP
 */
public class op_1
extends ou_1 {
    final Map<Short, Integer> baf;
    private final fi_1 bag = new or_1(this);

    @Override
    protected fi_1 aXr() {
        return new oq_1(this);
    }

    public op_1(short s, int n, int n2, short s2, short s3, boolean bl, boolean bl2, boolean bl3, boolean bl4, byte by, short s4, ArrayList<acd_1> arrayList, String string, Map<Short, Integer> map, int[] nArray, int n3) {
        super(s, n, n2, s2, s3, bl, bl2, bl3, bl4, by, s4, arrayList, string, nArray, n3);
        this.baf = map;
    }

    public byte[] aXs() {
        return this.a(new fi_1[]{this.bag});
    }
}

