/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Unmodifiable
 *  org.jetbrains.annotations.VisibleForTesting
 */
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;
import org.jetbrains.annotations.VisibleForTesting;

/*
 * Renamed from eXU
 */
public class exu_1 {
    public static final exu_1 rJd = new exu_1();
    private final Map<exp_1, Object> rJe = new EnumMap<exp_1, Object>(exp_1.class);
    private final Set<exr_1> rJf = new HashSet<exr_1>();

    private exu_1() {
    }

    public void a(@NotNull exp_1 exp_12, @NotNull Object object) {
        ext_1 ext_12 = exp_12.fOX();
        if (!ext_12.isValid(object)) {
            throw new IllegalArgumentException(String.format("Supplied variable value : %s(%s) is not valid with the declared type (%s-%s) of this variable (%s)", new Object[]{object, object.getClass(), ext_12, ext_12.fPc(), exp_12}));
        }
        Object object2 = this.rJe.put(exp_12, object);
        if (object2 != object) {
            for (exr_1 exr_12 : this.rJf) {
                exr_12.a(exp_12, object2, object);
            }
        }
    }

    public @Unmodifiable @NotNull Map<exp_1, Object> fPe() {
        return Collections.unmodifiableMap(this.rJe);
    }

    public Boolean a(exp_1 exp_12) {
        return switch (exp_12.fOX()) {
            default -> throw new MatchException(null, null);
            case ext_1.rIS -> (Boolean)this.rJe.getOrDefault((Object)exp_12, false);
            case ext_1.rIT -> this.b(exp_12) > 0;
            case ext_1.rIU -> this.c(exp_12) > 0;
            case ext_1.rIV -> this.d(exp_12) > 0;
            case ext_1.rIW -> this.e(exp_12) > 0L;
        };
    }

    public Byte b(exp_1 exp_12) {
        return switch (exp_12.fOX()) {
            default -> throw new MatchException(null, null);
            case ext_1.rIS -> this.a(exp_12) != false ? (byte)1 : 0;
            case ext_1.rIT -> (Byte)this.rJe.getOrDefault((Object)exp_12, (byte)0);
            case ext_1.rIU -> this.c(exp_12).byteValue();
            case ext_1.rIV -> this.d(exp_12).byteValue();
            case ext_1.rIW -> this.e(exp_12).byteValue();
        };
    }

    public Short c(exp_1 exp_12) {
        return switch (exp_12.fOX()) {
            default -> throw new MatchException(null, null);
            case ext_1.rIS -> this.a(exp_12) != false ? (short)1 : 0;
            case ext_1.rIT -> this.b(exp_12).shortValue();
            case ext_1.rIU -> (Short)this.rJe.getOrDefault((Object)exp_12, (short)0);
            case ext_1.rIV -> this.d(exp_12).shortValue();
            case ext_1.rIW -> this.e(exp_12).shortValue();
        };
    }

    public Integer d(exp_1 exp_12) {
        return switch (exp_12.fOX()) {
            default -> throw new MatchException(null, null);
            case ext_1.rIS -> this.a(exp_12) != false ? 1 : 0;
            case ext_1.rIT -> this.b(exp_12).intValue();
            case ext_1.rIU -> this.c(exp_12).intValue();
            case ext_1.rIV -> (Integer)this.rJe.getOrDefault((Object)exp_12, 0);
            case ext_1.rIW -> this.e(exp_12).intValue();
        };
    }

    public Long e(exp_1 exp_12) {
        return switch (exp_12.fOX()) {
            default -> throw new MatchException(null, null);
            case ext_1.rIS -> this.a(exp_12) != false ? 1L : 0L;
            case ext_1.rIT -> this.b(exp_12).longValue();
            case ext_1.rIU -> this.c(exp_12).longValue();
            case ext_1.rIV -> this.d(exp_12).longValue();
            case ext_1.rIW -> (Long)this.rJe.getOrDefault((Object)exp_12, 0L);
        };
    }

    public void a(exr_1 exr_12) {
        this.rJf.add(exr_12);
    }

    public void b(exr_1 exr_12) {
        this.rJf.remove(exr_12);
    }

    public void fPf() {
        this.rJe.clear();
    }

    @NotNull
    @VisibleForTesting
    @Unmodifiable Set<exr_1> fPg() {
        return Collections.unmodifiableSet(this.rJf);
    }

    @VisibleForTesting
    void clear() {
        this.rJe.clear();
        this.rJf.clear();
    }

    @VisibleForTesting
    void b(@NotNull exp_1 exp_12, @NotNull Object object) {
        this.rJe.put(exp_12, object);
    }
}

