/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eKs
 */
public class eks_0 {
    private static final Logger qBZ = Logger.getLogger(eks_0.class);
    private final int qCa;
    private final int qCb;
    private final String qCc;
    private final Map<fm_1, List<ekp_0>> qCd;
    private final uw_0 qCe;
    private final boolean qCf;

    public eks_0(int n, int n2, String string, Map<fm_1, List<ekp_0>> map, uw_0 uw_02) {
        this(n, n2, string, map, uw_02, false);
    }

    public eks_0(int n, int n2, String string, Map<fm_1, List<ekp_0>> map, uw_0 uw_02, boolean bl) {
        this.qCa = n;
        this.qCb = n2;
        this.qCc = string;
        this.qCd = map;
        this.qCe = uw_02;
        this.qCf = bl;
    }

    public static eks_0 a(eks_0 eks_02, int n, String string, boolean bl) {
        return new eks_0(eks_02.BJ(), n, string, eks_02.fye(), ue_0.bjV().bjm(), bl);
    }

    public eks_0 Qw(int n) {
        return new eks_0(n, this.qCb, this.qCc, this.qCd, this.qCe, this.qCf);
    }

    public eks_0 b(Map<fm_1, List<ekp_0>> map, int n) {
        return new eks_0(this.qCa, n, this.qCc, map, ue_0.bjV().bjm(), this.qCf);
    }

    public String getName() {
        return this.qCc;
    }

    public uw_0 fyd() {
        return this.qCe;
    }

    public Map<fm_1, List<ekp_0>> fye() {
        return this.qCd;
    }

    public int BJ() {
        return this.qCa;
    }

    public int BL() {
        return this.qCb;
    }

    public void b(fm_1 fm_13, ekp_0 ekp_02) {
        if (ekj_0.A(fm_13)) {
            qBZ.warn((Object)("[COSMETICS] Trying to add a cosmetic item to a preset whose type " + String.valueOf((Object)fm_13) + " is for preview only: " + String.valueOf(ekp_02)));
            return;
        }
        this.qCd.computeIfAbsent(fm_13, fm_12 -> new ArrayList()).add(ekp_02);
    }

    public void d(fm_1 fm_13, List<ekp_0> list) {
        if (ekj_0.A(fm_13)) {
            qBZ.warn((Object)("[COSMETICS] Trying to add cosmetic items to a preset whose type " + String.valueOf((Object)fm_13) + " is for preview only: " + String.valueOf(list)));
            return;
        }
        this.qCd.computeIfAbsent(fm_13, fm_12 -> new ArrayList()).addAll(list);
    }

    @Nullable
    public ekp_0 j(fm_1 fm_12, int n) {
        if (!this.qCd.containsKey((Object)fm_12)) {
            return null;
        }
        List<ekp_0> list = this.qCd.get((Object)fm_12);
        ekp_0 ekp_02 = null;
        for (ekp_0 ekp_03 : list) {
            if (ekp_03.AK() != n) continue;
            ekp_02 = ekp_03;
        }
        list.remove(ekp_02);
        return ekp_02;
    }

    public boolean F(fm_1 fm_12) {
        return this.qCd.containsKey((Object)fm_12) && !this.qCd.get((Object)fm_12).isEmpty();
    }

    public void G(fm_1 fm_12) {
        this.qCd.remove((Object)fm_12);
    }

    public boolean dva() {
        return this.qCf;
    }

    public boolean k(fm_1 fm_12, int n) {
        if (!this.F(fm_12)) {
            return false;
        }
        return this.qCd.get((Object)fm_12).stream().anyMatch(ekp_02 -> ekp_02.AK() == n);
    }

    public String toString() {
        return "CosmeticPresetData{m_presetId=" + this.qCa + ", m_presetIconId=" + this.qCb + ", m_name='" + this.qCc + "', m_cosmeticByType=" + String.valueOf(this.qCd) + ", m_lastModificationDate=" + String.valueOf(this.qCe) + ", m_hideHat=" + this.qCf + "}";
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        eks_0 eks_02 = (eks_0)object;
        return this.qCa == eks_02.qCa && this.qCb == eks_02.qCb && this.qCf == eks_02.qCf && Objects.equals(this.qCc, eks_02.qCc) && Objects.equals(this.qCd, eks_02.qCd) && Objects.equals(this.qCe, eks_02.qCe);
    }

    public int hashCode() {
        return Objects.hash(this.qCa, this.qCb, this.qCc, this.qCd, this.qCe, this.qCf);
    }
}

