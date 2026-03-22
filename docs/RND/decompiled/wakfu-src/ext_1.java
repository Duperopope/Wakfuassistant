/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.nio.ByteBuffer;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eXT
 */
public final class ext_1
extends Enum<ext_1> {
    public static final /* enum */ ext_1 rIS = new ext_1(1, Boolean.class, 1, new exk_1());
    public static final /* enum */ ext_1 rIT = new ext_1(2, Byte.class, 1, new exl_1());
    public static final /* enum */ ext_1 rIU = new ext_1(3, Short.class, 2, new exo_0());
    public static final /* enum */ ext_1 rIV = new ext_1(4, Integer.class, 4, new exm_1());
    public static final /* enum */ ext_1 rIW = new ext_1(5, Long.class, 8, new exn_0());
    @NotNull
    private static final ext_1[] rIX;
    private final byte rIY;
    @NotNull
    private final Class<?> rIZ;
    private final int rJa;
    @NotNull
    private final exs_1 rJb;
    private static final /* synthetic */ ext_1[] rJc;

    public static ext_1[] values() {
        return (ext_1[])rJc.clone();
    }

    public static ext_1 valueOf(String string) {
        return Enum.valueOf(ext_1.class, string);
    }

    private ext_1(int n2, @NotNull Class<?> clazz, int n3, exs_1 exs_12) {
        this.rIY = (byte)n2;
        this.rIZ = clazz;
        this.rJa = n3;
        this.rJb = exs_12;
    }

    public byte aJr() {
        return this.rIY;
    }

    @NotNull
    public Class<?> fPc() {
        return this.rIZ;
    }

    public int getSerializedSize() {
        return this.rJa;
    }

    public boolean isValid(@NotNull Object object) {
        return this.fPc().isInstance(object);
    }

    public byte[] aT(@NotNull Object object) {
        azg_1 azg_12 = new azg_1(this.getSerializedSize());
        this.rJb.a(azg_12, object);
        return azg_12.bTe();
    }

    public void a(@NotNull azg_1 azg_12, @NotNull Object object) {
        this.rJb.a(azg_12, object);
    }

    public Object eI(byte @NotNull [] byArray) {
        return this.rJb.fI(ByteBuffer.wrap(byArray));
    }

    public Object fI(@NotNull ByteBuffer byteBuffer) {
        return this.rJb.fI(byteBuffer);
    }

    @NotNull
    public static Optional<ext_1> fQ(byte by) {
        for (ext_1 ext_12 : rIX) {
            if (ext_12.aJr() != by) continue;
            return Optional.of(ext_12);
        }
        return Optional.empty();
    }

    private static /* synthetic */ ext_1[] fPd() {
        return new ext_1[]{rIS, rIT, rIU, rIV, rIW};
    }

    static {
        rJc = ext_1.fPd();
        rIX = ext_1.values();
    }
}

