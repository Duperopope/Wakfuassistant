/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Renamed from EC
 */
public class ec_1
extends eb_1 {
    private final byte[] ayE;

    public ec_1(byte ... byArray) {
        this.ayE = (byte[])byArray.clone();
    }

    @Override
    public final int read() {
        return this.ayE[this.ayD++] & 0xFF;
    }

    @Override
    public List<Integer> aII() {
        return Arrays.stream(Bn.da(this.ayE)).map(Integer::valueOf).collect(Collectors.toList());
    }
}

