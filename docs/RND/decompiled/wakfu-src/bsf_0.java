/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/*
 * Renamed from bsF
 */
public class bsf_0 {
    private static final bsf_0 jhX = new bsf_0();
    private static final long jhY = -1L;
    private final Map<Long, Float> jhZ = new HashMap<Long, Float>();

    public static bsf_0 dGi() {
        return jhX;
    }

    private bsf_0() {
    }

    public void w(Map<Long, Float> map) {
        this.jhZ.clear();
        this.jhZ.putAll(map);
    }

    public void clear() {
        this.jhZ.clear();
    }

    public float dGj() {
        return Optional.ofNullable(aue_0.cVJ().cVK()).map(bgt_02 -> this.jhZ.get(bgt_02.aqZ())).orElse(Float.valueOf(this.dGk())).floatValue();
    }

    public float dGk() {
        return Optional.ofNullable(this.jhZ.get(-1L)).orElse(Float.valueOf(1.0f)).floatValue();
    }
}

