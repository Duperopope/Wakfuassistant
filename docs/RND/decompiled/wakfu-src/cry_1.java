/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from cRy
 */
@FunctionalInterface
public interface cry_1 {
    public Optional<cpm_1> getValidAction(crd_1 var1);

    default public boolean a(crd_1 crd_12) {
        return this.getValidAction(crd_12).isPresent();
    }
}

