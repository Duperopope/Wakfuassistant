/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bnV
 */
public class bnv_0
implements aeh_2 {
    private static final String iKz = "name";
    private static final String iKA = "value";
    private static final List<bnv_0> iKB = Arrays.stream(eIc.values()).map(bnv_0::new).collect(Collectors.toList());
    private final eIc iKC;

    private bnv_0(eIc eIc2) {
        this.iKC = eIc2;
    }

    @Override
    public String[] bxk() {
        return new String[]{iKz, iKA};
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (iKz.equals(string)) {
            if (this.iKC == null) {
                return aum_0.cWf().c("dungeon.filter.0", new Object[0]);
            }
            return aum_0.cWf().c("dungeon.gameplay." + this.iKC.aIi(), new Object[0]);
        }
        if (iKA.equals(string)) {
            return Optional.ofNullable(this.iKC).map(eIc::aIi).orElse((short)-1);
        }
        return null;
    }

    @NotNull
    static List<bnv_0> dzG() {
        return Collections.unmodifiableList(iKB);
    }

    public eIc dzH() {
        return this.iKC;
    }

    static {
        iKB.add(0, new bnv_0(null));
    }
}

