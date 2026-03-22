/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bmR
 */
public final class bmr_1 {
    public static final bmr_1 iEC = new bmr_1();
    private static final bms_2 iED = new bms_2();
    private final Map<Integer, List<eKR>> iEE = new HashMap<Integer, List<eKR>>();

    private bmr_1() {
    }

    public void g(eKW eKW2) {
        ArrayList<eKR> arrayList = new ArrayList<eKR>(eKW2.dxi());
        arrayList.sort(iED);
        this.iEE.put(eKW2.d(), Collections.unmodifiableList(arrayList));
    }

    public List<eKR> Eo(int n) {
        return this.iEE.get(n);
    }

    public @Unmodifiable List<eKR> dxu() {
        return this.iEE.values().stream().flatMap(Collection::stream).toList();
    }

    public Optional<eKR> Ep(int n) {
        return this.dxu().stream().filter(eKR2 -> eKR2.d() == n).findFirst();
    }
}

