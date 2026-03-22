/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

public final class fgl
extends Enum<fgl>
implements aoq_1 {
    public static final /* enum */ fgl siV = new fgl(0, 0, "NOT_RECYCLABLE");
    public static final /* enum */ fgl siW = new fgl(1, 27083, "SHARD");
    public static final /* enum */ fgl siX = new fgl(2, 27093, "POWDER");
    private static final fgl[] siY;
    public static final @Unmodifiable Set<Integer> siZ;
    private final byte sja;
    private final int sjb;
    private final String sjc;
    private static final /* synthetic */ fgl[] sjd;

    public static fgl[] values() {
        return (fgl[])sjd.clone();
    }

    public static fgl valueOf(String string) {
        return Enum.valueOf(fgl.class, string);
    }

    private fgl(byte by, int n2, String string2) {
        this.sja = by;
        this.sjb = n2;
        this.sjc = string2;
    }

    public int AK() {
        return this.sjb;
    }

    @Override
    public String aXA() {
        return Integer.toString(this.sja);
    }

    @Override
    public String aXB() {
        return this.sjc;
    }

    @Override
    public String aXC() {
        return this.sjc;
    }

    @NotNull
    public static fgl gn(byte by) {
        for (fgl fgl2 : siY) {
            if (fgl2.sja != by) continue;
            return fgl2;
        }
        return siV;
    }

    private static /* synthetic */ fgl[] fWX() {
        return new fgl[]{siV, siW, siX};
    }

    static {
        sjd = fgl.fWX();
        siY = fgl.values();
        siZ = Arrays.stream(siY).filter(fgl2 -> fgl2 != siV).map(fgl::AK).collect(Collectors.toUnmodifiableSet());
    }
}

