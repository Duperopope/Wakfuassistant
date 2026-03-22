/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bHv
 */
public final class bhv_1 {
    private final bii_1[] jZY = new bii_1[4];
    private final List<bij_1> jZZ = new ArrayList<bij_1>();
    private final List<bij_1> kaa = new ArrayList<bij_1>();
    private final List<bij_1> kab = new ArrayList<bij_1>();
    private final List<bij_1> kac = new ArrayList<bij_1>();
    private final List<bih_1> kad;
    private final bih_1 kae = new bih_1(fjd.swH);
    private final bih_1 kaf = new bih_1(fjd.swB);
    private String kag = null;
    private String kah = null;
    private bij_1 kai = null;
    private bij_1 kaj = null;

    public bhv_1() {
        this.kad = new ArrayList<bih_1>();
        this.kad.add(this.kae);
        this.kad.add(this.kaf);
        for (fjd fjd2 : fjd.values()) {
            if (fjd2 == this.kae.dXy() || fjd2 == this.kaf.dXy()) continue;
            bih_1 bih_13 = new bih_1(fjd2);
            this.kad.add(bih_13);
        }
        this.kad.sort(Comparator.comparingInt(bih_12 -> bih_12.dXy().dju()));
        this.dVI();
    }

    public void dVI() {
        for (int i = 0; i < this.jZY.length; ++i) {
            this.jZY[i] = new bii_1(this.kae);
        }
    }

    public void dUQ() {
        boolean bl = false;
        for (bii_1 bii_12 : this.jZY) {
            if (bl) {
                bii_12.b(this.kaf);
            }
            bii_12.setEnabled(!bl);
            if (bii_12.dXy() != fjd.swB) continue;
            bl = true;
        }
    }

    public void hK(boolean bl) {
        this.jZZ.clear();
        fjd[] fjdArray = new fjd[this.jZY.length];
        for (int i = 0; i < fjdArray.length; ++i) {
            fjdArray[i] = this.jZY[i].dXy();
        }
        bev_0.dSZ().a(fjdArray, bl, entry -> this.jZZ.add(new bij_1((int)((Integer)entry.getKey()), (fhp_0)entry.getValue())));
        if (this.kaa.isEmpty()) {
            this.kab.addAll(bev_0.dSZ().dTa().stream().map(n -> new bij_1((int)n, fgj.siF)).toList());
            this.kac.addAll(bev_0.dSZ().dTb().stream().map(n -> new bij_1((int)n, fgj.siH)).toList());
            this.kaa.addAll(this.kab);
            this.kaa.addAll(this.kac);
        }
    }

    public void a(bij_1 bij_12) {
        this.kai = bij_12;
    }

    public void b(bij_1 bij_12) {
        this.kaj = bij_12;
    }

    public @Unmodifiable List<fjd> dVJ() {
        return Arrays.stream(this.jZY).map(bii_1::dXy).toList();
    }

    @Nullable
    public bij_1 C(String string, boolean bl) {
        String string2 = BH.aT(string);
        List<bij_1> list = bl ? this.kaa : this.jZZ;
        for (bij_1 bij_12 : list) {
            if (!bij_12.dah().equals(string2)) continue;
            return bij_12;
        }
        return null;
    }

    public Object dVK() {
        return this.kai == null ? this.kag : this.kai;
    }

    public Object dVL() {
        return this.kaj == null ? this.kah : this.kaj;
    }

    @Generated
    public bii_1[] dVM() {
        return this.jZY;
    }

    @Generated
    public List<bij_1> dVN() {
        return this.jZZ;
    }

    @Generated
    public List<bij_1> dVO() {
        return this.kaa;
    }

    @Generated
    public List<bij_1> dVP() {
        return this.kab;
    }

    @Generated
    public List<bij_1> dVQ() {
        return this.kac;
    }

    @Generated
    public List<bih_1> dVR() {
        return this.kad;
    }

    @Generated
    public bih_1 dVS() {
        return this.kae;
    }

    @Generated
    public bih_1 dVT() {
        return this.kaf;
    }

    @Generated
    public String dVU() {
        return this.kag;
    }

    @Generated
    public String dVV() {
        return this.kah;
    }

    @Generated
    public bij_1 dVW() {
        return this.kai;
    }

    @Generated
    public bij_1 dVX() {
        return this.kaj;
    }

    @Generated
    public void mL(String string) {
        this.kag = string;
    }

    @Generated
    public void mM(String string) {
        this.kah = string;
    }
}

