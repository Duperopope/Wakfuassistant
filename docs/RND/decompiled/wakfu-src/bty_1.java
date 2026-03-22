/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bTy
 */
public class bty_1
implements aeh_2,
bdz_0 {
    public static final String loS = "name";
    public static final String loT = "charactersCountText";
    public static final String loU = "displayCharactersCount";
    public static final String loV = "isCollapsed";
    public static final String loW = "servers";
    public static final String loX = "communityStyle";
    public static final String loY = "communityText";
    public static final String loZ = "radioButtonStyle";
    public static final String lpa = "radioButtonSize";
    public static final String lpb = "displaySeparator";
    public static final String lpc = "isSelected";
    public static final String lpd = "groupSize";
    public static final String[] lpe = new String[]{"name", "charactersCountText", "displayCharactersCount", "isCollapsed", "servers", "groupSize", "communityStyle", "communityText"};
    private static final int lpf = 140;
    private static final int lpg = 44;
    private static final String lph = "server.group.collapsed.";
    private static final int lpi = 9;
    @NotNull
    private final btu_1 lpj;
    private final int lpk;
    private final List<bta_2> lpl = new ArrayList<bta_2>();
    private Collection<bty_1> lpm = new ArrayList<bty_1>();
    private int lpn;
    private boolean jwY;

    public void JB(int n) {
        this.lpn = n;
    }

    public bty_1(@NotNull btu_1 btu_12, int n, int n2) {
        this.lpj = btu_12;
        this.lpk = n;
        this.jwY = this.enV();
        this.lpm = this.lpj.enD();
    }

    @NotNull
    public btu_1 enR() {
        return this.lpj;
    }

    public List<bta_2> enS() {
        return Collections.unmodifiableList(this.lpl);
    }

    public int vD() {
        return this.lpk;
    }

    bta_2 c(@NotNull ezt_0 ezt_02, @Nullable ezy_0 ezy_02) {
        bta_2 bta_23 = new bta_2(this, ezt_02, ezy_02);
        this.lpl.add(bta_23);
        this.lpl.sort(Comparator.comparingInt(bta_22 -> bta_22.enY().aYs()));
        return bta_23;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case loS -> this.getName();
            case loT -> this.enU().map(n -> n + "/9").orElse(null);
            case loU -> this.lpj.enC() == ezx_0.pvi;
            case loV -> this.jwY;
            case loW -> this.enT();
            case lpd -> this.enT().size();
            case loZ -> this.enW().lps;
            case lpa -> new fsm_1(this.enW().lpt, 44);
            case lpb -> this.lpn < this.lpm.size() - 1;
            case lpc -> {
                bty_1 var4_4 = this.lpj.enB().enK();
                if (var4_4 == null) {
                    yield this.lpn == 0;
                }
                yield this.lpk == var4_4.lpk;
            }
            case loX -> "flag" + this.lpl.getFirst().enY().cWk().getName();
            case loY -> aum_0.cWf().c("worldCommunity." + this.lpl.getFirst().enY().cWk().getName(), new Object[0]);
            default -> null;
        };
    }

    @NotNull
    public @Unmodifiable List<bta_2> enT() {
        return Collections.unmodifiableList(this.lpl);
    }

    private String getName() {
        return aum_0.cWf().c("server.group." + this.lpk, new Object[0]);
    }

    private Optional<Integer> enU() {
        int n = 0;
        for (bta_2 bta_22 : this.lpl) {
            Optional<Short> optional = btc_2.eoi().JC(bta_22.enY().d());
            if (optional.isEmpty()) {
                return Optional.empty();
            }
            n += optional.get().shortValue();
        }
        return Optional.of(n);
    }

    @Override
    public boolean dbK() {
        return this.jwY;
    }

    @Override
    public void fm(boolean bl) {
        this.jwY = bl;
        fse_1.gFu().a((aef_2)this, loV);
        this.iC(bl);
    }

    private boolean enV() {
        aeb_1 aeb_12 = ((bsg_1)aie_0.cfn().bmH()).b(afh.cpT);
        if (aeb_12 == null) {
            return false;
        }
        return aeb_12.aK(this.dbL());
    }

    private void iC(boolean bl) {
        aeb_1 aeb_12 = ((bsg_1)aie_0.cfn().bmH()).b(afh.cpT);
        if (aeb_12 == null) {
            return;
        }
        aeb_12.d(this.dbL(), bl);
    }

    private btz_1 enW() {
        if (this.lpm.size() == 1) {
            return btz_1.lpo;
        }
        if (this.lpn == 0) {
            return btz_1.lpp;
        }
        if (this.lpn == this.lpm.size() - 1) {
            return btz_1.lpr;
        }
        return btz_1.lpq;
    }

    @NotNull
    private String dbL() {
        return lph + this.lpk;
    }

    @Override
    public String[] bxk() {
        return new String[0];
    }
}

