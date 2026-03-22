/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Renamed from EE
 */
public class ee_2
extends eb_1 {
    private final short[] ayG;

    public ee_2(short ... sArray) {
        this.ayG = (short[])sArray.clone();
    }

    @Override
    public final int read() {
        return this.ayG[this.ayD++] & 0xFFFF;
    }

    @Override
    public List<Integer> aII() {
        return Arrays.stream(Bn.a(this.ayG)).map(Integer::valueOf).collect(Collectors.toList());
    }
}

