/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bkX
 */
public class bkx_1
implements aeh_2 {
    public static final String iso = "compartments";
    public static final String isp = "selectedCompartment";
    public static final String isq = "hasAdminRights";
    public static final String isr = "lastMovableCompartment";
    public static final String[] iss = new String[]{"compartments", "selectedCompartment", "hasAdminRights"};
    private final List<bkz_1> ist;
    private @Unmodifiable List<bkz_1> isu;
    private String isv;
    private final boolean isw;

    public bkx_1(List<bkz_1> list, boolean bl) {
        this.ist = new ArrayList<bkz_1>(list);
        this.isw = bl;
        this.isv = null;
        this.dtf();
    }

    @Override
    public String[] bxk() {
        return iss;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (iso.equals(string)) {
            return this.isu;
        }
        if (isp.equals(string)) {
            return this.dtd().orElse(null);
        }
        if (isq.equals(string)) {
            return this.isw;
        }
        if (isr.equals(string)) {
            return this.ist.size() - 2;
        }
        return null;
    }

    public Optional<bkz_1> lR(@NotNull String string) {
        return this.ist.stream().filter(bkz_12 -> string.equalsIgnoreCase(bkz_12.getId())).findFirst();
    }

    public Optional<bkz_1> dtd() {
        return this.ist.stream().filter(bkz_1::bqr).findFirst();
    }

    public String dte() {
        return this.isv;
    }

    public void lS(String string) {
        this.isv = string;
    }

    public final void dtf() {
        Stream<Object> stream = this.ist.stream();
        if (!BH.aU(this.isv)) {
            String string = BH.bd(this.isv);
            stream = stream.filter(bkz_12 -> BH.bd(bkz_12.getName()).contains(string));
        }
        this.isu = stream.toList();
        fse_1.gFu().a((aef_2)this, iso, isp);
    }

    public void lT(@NotNull String string) {
        bkz_1 bkz_12;
        Optional<bkz_1> optional = this.lR(string);
        if (optional.isEmpty()) {
            return;
        }
        Optional<bkz_1> optional2 = this.dtd();
        if (optional2.isPresent()) {
            bkz_12 = optional2.get();
            bkz_12.setSelected(false);
            fse_1.gFu().a((aef_2)bkz_12, "selected");
        }
        bkz_12 = optional.get();
        bkz_12.setSelected(true);
        fse_1.gFu().a((aef_2)bkz_12, "selected");
        fse_1.gFu().a((aef_2)this, isp);
    }

    public Optional<bkz_1> a(bkz_1 bkz_12) {
        if (this.ist.indexOf(bkz_12) == 0) {
            return Optional.empty();
        }
        bkz_1 bkz_13 = null;
        for (bkz_1 bkz_14 : this.ist) {
            if (bkz_14 == bkz_12) {
                return Optional.ofNullable(bkz_13);
            }
            bkz_13 = bkz_14;
        }
        return Optional.empty();
    }

    public Optional<bkz_1> b(bkz_1 bkz_12) {
        boolean bl = false;
        for (bkz_1 bkz_13 : this.ist) {
            if (bkz_13 == bkz_12) {
                bl = true;
                continue;
            }
            if (!bl) continue;
            return Optional.ofNullable(bkz_13);
        }
        return Optional.empty();
    }

    public boolean c(bkz_1 bkz_12) {
        boolean bl = this.ist.remove(bkz_12);
        if (bl) {
            this.dtf();
        }
        return bl;
    }

    public void af(String string, String string2) {
        Optional<bkz_1> optional = this.lR(string);
        Optional<bkz_1> optional2 = this.lR(string2);
        if (optional.isEmpty() || optional2.isEmpty()) {
            return;
        }
        int n = this.ist.indexOf(optional.get());
        int n2 = this.ist.indexOf(optional2.get());
        this.ist.set(n, optional2.get());
        this.ist.set(n2, optional.get());
        this.dtf();
    }

    public void t(String string, int n) {
        Optional<bkz_1> optional = this.lR(string);
        if (optional.isEmpty()) {
            return;
        }
        bkz_1 bkz_12 = optional.get();
        bkz_12.DB(bkz_12.ajt() - n);
        fse_1.gFu().a((aef_2)bkz_12, "remainingCapacity");
    }
}

