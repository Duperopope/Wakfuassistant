/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/*
 * Renamed from EY
 */
public class ey_1 {
    public static final float[] azX = new float[]{0.1f, 0.1f, 0.1f};
    private static final int azY = 1;
    private static final int azZ = 2;
    private int aAa;
    private final HashMap<Integer, Byte> aAb = new HashMap(1, 1.0f);
    private float[] aAc = azX;

    public boolean aJY() {
        return (this.aAa & 1) != 0;
    }

    public boolean aJZ() {
        return (this.aAa & 2) == 2;
    }

    public int bu(String string) {
        Byte by = Optional.ofNullable(this.aAb.get(string.hashCode())).orElse((byte)0);
        return by + -1;
    }

    public void q(Map<String, Byte> map) {
        this.aAa |= 1;
        for (Map.Entry<String, Byte> entry : map.entrySet()) {
            this.aAb.put(entry.getKey().hashCode(), entry.getValue());
        }
    }

    public float[] aJI() {
        return this.aAc;
    }

    public void m(float[] fArray) {
        assert (this.aAc == azX);
        if (!Arrays.equals(fArray, azX)) {
            this.aAa |= 2;
            this.aAc = fArray;
        }
    }

    public int xr() {
        return this.aAa;
    }

    public void mF(int n) {
        this.aAa = n;
    }

    public HashMap<Integer, Byte> aKa() {
        return this.aAb;
    }

    public float[] aKb() {
        return this.aAc;
    }

    public void n(float[] fArray) {
        this.aAc = fArray;
    }
}

