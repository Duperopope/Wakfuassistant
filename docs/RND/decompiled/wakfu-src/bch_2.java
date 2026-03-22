/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bcH
 */
public class bch_2
extends bcy_1
implements bcz_1,
ffc_2 {
    public static final String hGD = "iconUrl";
    public static final String hGE = "backgroundImageStyle";
    public static final String hGF = "progressionText";
    public static final String hGG = "progressionValue";
    public static final String hGH = "isFollowed";
    public static final String hGI = "isCompleted";
    public static final String hGJ = "hasBulletPoint";
    public static final String[] hGK = new String[]{"name", "achievements", "iconUrl", "progressionText", "progressionValue", "isHistory", "achievementsQuickList", "hasBulletPoint", "isToken1Complete", "isToken2Complete", "isToken3Complete"};
    private final bcc_1 hGL;
    private final LinkedHashMap<Integer, bch_2> hGM = new LinkedHashMap();
    private @Unmodifiable List<bch_2> hGN;
    private final ArrayList<bci_1> hGO = new ArrayList();
    private final int hGP;
    @NotNull
    private bde_2 hGa = bde_2.hJD;
    private final ArrayList<bci_1> hGQ = new ArrayList();

    public bch_2(long l, bcc_1 bcc_12, int n) {
        super(l);
        this.hGL = bcc_12;
        this.hFF = bcc_12.d();
        this.hGP = n;
        this.dSJ().ifPresent(bl -> {
            this.hFE = bl;
        });
    }

    public void a(bci_1 bci_12) {
        if (!this.hGO.contains(bci_12)) {
            this.hGO.add(bci_12);
        }
        if (!this.hGQ.contains(bci_12)) {
            this.hGQ.add(bci_12);
        }
    }

    public ArrayList<bci_1> aYz() {
        return this.hGO;
    }

    @Override
    public String[] bxk() {
        return hGK;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(hGD)) {
            return auc_0.cVq().zM(this.hGL.d());
        }
        if (string.equals(hGE)) {
            return String.format("%s%s", "achievementCategory", this.hGL.d());
        }
        if (string.equals(hGF)) {
            return this.dbl() + "/" + this.dbk();
        }
        if (string.equals(hGG)) {
            return Float.valueOf((float)this.dbl() / (float)this.dbk());
        }
        if (string.equals(hGH)) {
            return this.dcc();
        }
        if (string.equals(hGI)) {
            for (int i = this.hGO.size() - 1; i >= 0; --i) {
                if (this.hFH.oe(this.hGO.get(i).d())) continue;
                return false;
            }
            return true;
        }
        if (string.equals("categories")) {
            return this.dcb();
        }
        if (string.equals("allFilteredQuests")) {
            Stream<Object> stream = this.dcd().stream().map(bch_22 -> bch_22.hGQ).flatMap(Collection::stream);
            if (this.hGa.dcC() != null) {
                stream = stream.sorted(this.hGa.dcC());
            }
            return stream.toList();
        }
        if (hGJ.equals(string)) {
            return this.hGO.stream().anyMatch(bci_12 -> bci_12.dcq() || bci_12.dcr());
        }
        return super.eu(string);
    }

    public @Unmodifiable @NotNull List<bch_2> dcb() {
        return this.dcd().stream().filter(bch_22 -> !bch_22.hGQ.isEmpty()).toList();
    }

    private boolean dcc() {
        for (int i = this.hGO.size() - 1; i >= 0; --i) {
            if (!this.hGO.get(i).dcc()) continue;
            return true;
        }
        return false;
    }

    @Override
    protected String getName() {
        return bch_2.b(this.hGL);
    }

    public static String b(bcc_1 bcc_12) {
        return bcc_12 == null ? aum_0.cWf().c("achievement.rootName", new Object[0]) : aum_0.cWf().a(61, (long)bcc_12.d(), new Object[0]);
    }

    public static String c(bcc_1 bcc_12) {
        return bcc_12 == null ? aum_0.cWf().d("achievement.rootName", new Object[0]) : aum_0.cWf().b(61, (long)bcc_12.d(), new Object[0]);
    }

    private @Unmodifiable List<bch_2> dcd() {
        if (this.hGN != null) {
            return this.hGN;
        }
        this.hGN = this.hGM.values().stream().filter(bch_22 -> !bch_22.hGO.isEmpty()).sorted(Comparator.comparingInt(bch_2::d).thenComparing(bch_2::getName)).toList();
        return this.hGN;
    }

    @Override
    public boolean dbG() {
        return false;
    }

    @Override
    public void a(bch_2 bch_22) {
        this.hGM.put(bch_22.d(), bch_22);
    }

    @Override
    public LinkedHashMap<Integer, bch_2> dbH() {
        return this.hGM;
    }

    @Override
    protected ArrayList<bci_1> dbI() {
        return this.hGQ;
    }

    @Override
    public void a(Collection<bug_0<bci_1>> collection, bde_2 bde_22) {
        this.hGa = bde_22;
        this.hGQ.clear();
        for (bci_1 bci_12 : this.hGO) {
            if (!bci_12.isVisible() || !bch_2.a(collection, bci_12)) continue;
            this.hGQ.add(bci_12);
        }
        this.dcd().forEach(bch_22 -> bch_22.a(collection, bde_22));
        fse_1.gFu().a((aef_2)this, "achievements", "categories", "allFilteredQuests");
    }

    private static boolean a(Collection<bug_0<bci_1>> collection, bci_1 bci_12) {
        for (bug_0<bci_1> bug_02 : collection) {
            if (bug_02.ah(bci_12)) continue;
            return false;
        }
        return true;
    }

    public int dce() {
        return this.hGP;
    }

    @Override
    public int dbk() {
        int n = 0;
        for (int i = this.hGO.size() - 1; i >= 0; --i) {
            bci_1 bci_12 = this.hGO.get(i);
            if (!bci_12.isVisible()) continue;
            ++n;
        }
        return n;
    }

    @Override
    public int dbl() {
        int n = 0;
        for (bci_1 bci_12 : this.hGO) {
            if (!this.hFH.oe(bci_12.d()) || !bci_12.isVisible()) continue;
            ++n;
        }
        return n;
    }

    @Override
    public boolean d(bci_1 bci_12) {
        return this.hGO.contains(bci_12);
    }

    @Override
    public int d() {
        return this.hGL.d();
    }

    public bci_1 Bo(int n) {
        bci_1 bci_12;
        fse_1.gFu().a((aef_2)this, hGH);
        int n2 = this.hGO.size();
        for (int i = 0; i < n2; ++i) {
            bci_12 = this.hGO.get(i);
            if (bci_12.d() != n) continue;
            bci_12.dcm();
            return bci_12;
        }
        for (bch_2 bch_22 : this.hGM.values()) {
            bci_12 = bch_22.Bo(n);
            if (bci_12 == null) continue;
            return bci_12;
        }
        return null;
    }

    @Override
    public String cUG() {
        return this.dbI().stream().map(bci_1::dah).filter(Objects::nonNull).collect(Collectors.joining(""));
    }
}

