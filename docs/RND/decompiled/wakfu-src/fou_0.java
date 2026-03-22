/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/*
 * Renamed from fou
 */
public class fou_0 {
    public static final fou_0 sLB = new fou_0();
    private final Map<Integer, fos_0> sLC = new HashMap<Integer, fos_0>();
    private final Map<Integer, fos_0> sLD = new HashMap<Integer, fos_0>();

    private fou_0() {
    }

    public fos_0 a(Integer n, fos_0 fos_02) {
        int n2 = fos_02.AK();
        if (this.sLC.containsKey(fos_02.d())) {
            fos_0 fos_03 = this.sLC.get(fos_02.d());
            throw new IllegalArgumentException("We can't have two skins with the same id : " + String.valueOf(fos_03) + ", " + String.valueOf(fos_02));
        }
        if (n2 > 0 && this.sLD.containsKey(n2)) {
            fos_0 fos_04 = this.sLD.get(n2);
            throw new IllegalArgumentException("We can't have two skins with the same refId : " + String.valueOf(fos_04) + ", " + String.valueOf(fos_02));
        }
        fos_0 fos_05 = this.sLC.put(n, fos_02);
        if (n2 > 0) {
            this.sLD.put(n2, fos_02);
        }
        return fos_05;
    }

    public fos_0 az(Integer n) {
        return this.sLC.get(n);
    }

    public fos_0 aA(Integer n) {
        return this.sLD.get(n);
    }

    public void h(BiConsumer<? super Integer, ? super fos_0> biConsumer) {
        this.sLC.forEach(biConsumer);
    }

    public boolean XI(int n) {
        return this.sLD.containsKey(n);
    }
}

