/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bHf
 */
public class bhf_2
implements aeh_2 {
    private static final String jXj = "ambienceZoneName";
    private static final String jXk = "dayMusics";
    private static final String jXl = "nightMusics";
    private static final String jXm = "fightMusics";
    private static final String jXn = "bossMusics";
    private final adD jXo;
    private final String jXp;

    bhf_2(adD adD2) {
        this.jXo = adD2;
        this.jXp = aum_0.cWf().a(54, (long)adD2.buN(), new Object[0]);
    }

    @Override
    public String[] bxk() {
        return new String[]{jXj, jXk, jXl, jXm, jXn};
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(jXj)) {
            return this.jXp;
        }
        if (string.equals(jXk)) {
            return this.Z(this.jXo.buG());
        }
        if (string.equals(jXl)) {
            return this.Z(this.jXo.buH());
        }
        if (string.equals(jXm)) {
            return this.Z(this.jXo.buI());
        }
        if (string.equals(jXn)) {
            return this.Z(this.jXo.buJ());
        }
        return null;
    }

    private @Unmodifiable List<Long> Z(List<ahc_2> list) {
        return list == null ? null : list.stream().map(ahc_2::ccf).toList();
    }

    Optional<ahc_2> w(Long l) {
        if (l == null) {
            return Optional.empty();
        }
        return this.jXo.w(l);
    }

    adD dUN() {
        return this.jXo;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        bhf_2 bhf_22 = (bhf_2)object;
        return this.jXo.buM() == bhf_22.jXo.buM();
    }
}

