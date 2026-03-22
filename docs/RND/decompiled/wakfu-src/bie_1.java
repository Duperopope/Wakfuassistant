/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Multimap
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bIe
 */
public class bie_1
implements aeh_2,
bdz_0 {
    public static final Comparator<bie_1> kej = Comparator.comparingInt(bie_1::dSO);
    private static final int kek = -1;
    private static final int kel = 2;
    public static final String kem = "name";
    public static final String ken = "icon";
    public static final String keo = "collapsed";
    public static final String kep = "items";
    public static final String keq = "hasItems";
    private static final String[] ker = new String[]{"name", "icon", "collapsed", "items", "hasItems"};
    @Nullable
    private final fhy_0 kes;
    private boolean hFE = false;
    private final Multimap<Integer, bim_1> ket = HashMultimap.create();
    private final List<bim_1> keu = new ArrayList<bim_1>();
    @NotNull
    private bin_1 kev = bin_1.kfm;

    public bie_1(@Nullable fhy_0 fhy_02) {
        this.kes = fhy_02;
    }

    @Override
    public void fm(boolean bl) {
        this.hFE = bl;
        fse_1.gFu().a((aef_2)this, keo);
    }

    public void dXp() {
        this.ket.clear();
        this.keu.clear();
    }

    public void bf(ffV ffV2) {
        for (bim_1 bim_12 : this.ket.get((Object)ffV2.avr())) {
            if (!bim_12.dXE().n(ffV2)) continue;
            bim_12.bf(ffV2);
            return;
        }
        this.ket.put((Object)ffV2.avr(), (Object)new bim_1(ffV2));
    }

    public Optional<bim_1> bi(@NotNull ffV ffV2) {
        for (bim_1 bim_12 : this.ket.get((Object)ffV2.avr())) {
            if (!bim_12.dXE().n(ffV2)) continue;
            return Optional.of(bim_12);
        }
        return Optional.empty();
    }

    public void mF(@NotNull String string) {
        this.keu.clear();
        if (string.isBlank()) {
            this.keu.addAll(this.ket.values());
        } else {
            for (bim_1 bim_12 : this.ket.values()) {
                if (!bim_12.dXE().dah().contains(string)) continue;
                this.keu.add(bim_12);
            }
        }
        this.keu.sort(this.kev.dcC());
    }

    public void b(bin_1 bin_12) {
        this.kev = bin_12;
        this.keu.sort(bin_12.dcC());
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "name": {
                return this.getName();
            }
            case "icon": {
                return this.byf();
            }
            case "collapsed": {
                return this.hFE;
            }
            case "items": {
                return this.keu;
            }
            case "hasItems": {
                return !this.keu.isEmpty();
            }
        }
        return null;
    }

    public String getName() {
        if (this.kes == null) {
            return aum_0.cWf().c("others", new Object[0]);
        }
        return this.kes.gP(true);
    }

    private String byf() {
        return auc_0.cVq().aZ(this.kes == null ? (short)-1 : this.kes.aIi());
    }

    private int dSO() {
        if (this.kes == null) {
            return Integer.MAX_VALUE;
        }
        return this.kes.cqd();
    }

    @Override
    public String[] bxk() {
        return ker;
    }

    public String toString() {
        return "type=" + this.getName();
    }

    @Nullable
    @Generated
    public fhy_0 dGh() {
        return this.kes;
    }

    @Override
    @Generated
    public boolean dbK() {
        return this.hFE;
    }

    @Generated
    public Multimap<Integer, bim_1> dXq() {
        return this.ket;
    }

    @Generated
    public List<bim_1> dXr() {
        return this.keu;
    }

    @NotNull
    @Generated
    public bin_1 dXs() {
        return this.kev;
    }
}

