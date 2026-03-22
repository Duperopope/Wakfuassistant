/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public final class fht {
    private fht() {
    }

    public static Optional<ffV> b(exP exP2, ffS ffS2) {
        return fht.a(exP2, exP2.dmL(), ffS2);
    }

    public static Optional<ffV> a(exP exP2, fhk fhk2, ffS ffS2) {
        fhe fhe2 = exP2.dnP();
        return fht.a(fhk2, ffS2, fhe2);
    }

    public static Optional<ffV> a(fhk fhk2, ffS ffS2, fhe fhe2) {
        Long l = fhk2.t(ffS2);
        if (fhe2 == null) {
            return Optional.empty();
        }
        return fhe2.B(l);
    }
}

