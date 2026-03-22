/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  org.jetbrains.annotations.Unmodifiable
 */
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from aPL
 */
public final class apl_0 {
    private final Map<Long, aPJ> eAB = new HashMap<Long, aPJ>();
    public static final apl_0 eAC = new apl_0();

    private apl_0() {
    }

    public void a(long l, String string, String string2, String string3) {
        aPJ aPJ2 = this.eAB.computeIfAbsent(l, aPJ::new);
        aPJ2.setName(string);
        aPJ2.jt(string2);
        aPJ2.jr(string3);
        aPJ2.js(aPV.in(l));
    }

    public void il(long l) {
        this.eAB.remove(l);
    }

    public void a(long l, aPN aPN2) {
        aPJ aPJ2 = this.eAB.computeIfAbsent(l, aPJ::new);
        aPJ2.a(aPN2);
    }

    public void a(long l, apm_0 apm_02) {
        aPJ aPJ2 = this.eAB.computeIfAbsent(l, aPJ::new);
        aPJ2.a(apm_02);
    }

    public void a(long l, apk_0 apk_02) {
        aPJ aPJ2 = this.eAB.computeIfAbsent(l, aPJ::new);
        aPJ2.a(apk_02);
    }

    public Optional<String> ju(String string) {
        if (BH.aU(string)) {
            return Optional.empty();
        }
        return this.eAB.values().stream().filter(aPJ2 -> string.equalsIgnoreCase(aPJ2.n())).map(aPJ2 -> apl_0.T(aPJ2.getName(), aPJ2.getTag())).findFirst();
    }

    public static String T(String string, String string2) {
        return string + (String)(BH.aU(string2) ? "" : "#" + string2);
    }

    public @Unmodifiable List<String> jv(String string) {
        if (BH.aU(string)) {
            return Collections.emptyList();
        }
        return this.eAB.values().stream().filter(aPJ2 -> string.equalsIgnoreCase(aPJ2.getName())).map(aPJ::n).toList();
    }

    public Optional<String> U(String string, String string2) {
        if (BH.aU(string)) {
            return Optional.empty();
        }
        return this.eAB.values().stream().filter(aPJ2 -> string.equalsIgnoreCase(aPJ2.getName())).filter(aPJ2 -> string2.equalsIgnoreCase(aPJ2.getTag())).map(aPJ::n).findFirst();
    }

    public List<aPJ> cBh() {
        return ImmutableList.copyOf(this.eAB.values());
    }

    public void beZ() {
        this.eAB.clear();
    }

    public int im(long l) {
        aPJ aPJ2 = this.eAB.get(l);
        if (aPJ2 != null && aPJ2.cBd() != null) {
            return aPJ2.cBd().cBe();
        }
        return apk_0.eAw.cBe();
    }
}

