/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.IntStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from boX
 */
public class box_0
extends bul_0<ffV> {
    public static final String iTA = ":";

    private box_0(rd_0 @Nullable [] rd_0Array, @NotNull String string) {
        super(rd_0Array, string);
    }

    public static box_0 ml(@NotNull String string) {
        return new box_0(box_0.mp(string), string);
    }

    @Nullable
    protected List<rd_0> O(ffV ffV2) {
        if (!ffV2.dXg()) {
            return null;
        }
        Map<Byte, fhn_0> map = ffV2.eAZ().dTS();
        Optional optional = map.keySet().stream().max(Byte::compareTo);
        if (optional.isEmpty()) {
            return null;
        }
        return IntStream.range(0, (Byte)optional.get() + 1).mapToObj(n -> {
            fhn_0 fhn_02 = (fhn_0)map.get((byte)n);
            return fhn_02 != null ? fhn_02.dBe() : rd_0.bjA;
        }).toList();
    }

    @Override
    protected boolean dCl() {
        return true;
    }

    @Override
    public buh_0 dcz() {
        return buh_0.jot;
    }

    @Override
    @Nullable
    public String dCm() {
        return iTA + this.jpa;
    }

    @Override
    @Nullable
    protected /* synthetic */ List al(Object object) {
        return this.O((ffV)object);
    }
}

