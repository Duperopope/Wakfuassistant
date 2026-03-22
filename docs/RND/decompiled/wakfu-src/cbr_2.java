/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from cbR
 */
public class cbr_2
implements aeh_2 {
    public static final String lLb = "id";
    public static final String lLc = "name";
    public static final String lLd = "description";
    public static final String lLe = "message";
    public static final String lLf = "level";
    public static final String lLg = "blazon";
    public static final String lLh = "members";
    public static final String lLi = "ranks";
    private final nr lLj;
    private final List<cbs_2> lLk = new ArrayList<cbs_2>();
    private final Map<Long, cbt_2> lLl = new HashMap<Long, cbt_2>();

    public cbr_2(nr nr2) {
        this.lLj = nr2;
        for (nz generatedMessageV3 : this.lLj.Yq()) {
            this.lLl.put(generatedMessageV3.Sn(), new cbt_2(generatedMessageV3));
        }
        for (nv nv2 : this.lLj.Yt()) {
            this.lLk.add(new cbs_2(nv2, this.lLl.get(nv2.Xm())));
        }
    }

    public static cbr_2 ed(byte[] byArray) {
        return new cbr_2(nr.ch(byArray));
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "id": {
                return this.Sn();
            }
            case "name": {
                return this.lLj.getName();
            }
            case "description": {
                return this.lLj.getDescription();
            }
            case "message": {
                return this.lLj.getMessage();
            }
            case "level": {
                return this.lLj.tL();
            }
            case "blazon": {
                ezb ezb2 = new ezb(this.lLj.Yc());
                buJ buJ2 = new buJ(ezb2.fmd(), ezb2.fmf(), buH.dJn().Fz(ezb2.fmg()), buH.dJn().Fz(ezb2.fme()));
                return buK.dJw().a(buJ2);
            }
            case "members": {
                return this.esz();
            }
            case "ranks": {
                return this.esA();
            }
        }
        return null;
    }

    private @Unmodifiable List<cbs_2> esz() {
        return this.lLk.stream().sorted(Comparator.comparingInt(object -> ((cbs_2)object).esG().Lz()).thenComparing(object -> ((cbs_2)object).getName())).toList();
    }

    private @Unmodifiable List<cbt_2> esA() {
        return this.lLl.values().stream().sorted(Comparator.comparingInt(cbt_2::Lz).thenComparing(cbt_2::getName)).toList();
    }

    public long Sn() {
        return this.lLj.Sn();
    }

    public String esB() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("===== Guild '").append(this.lLj.getName()).append("' (ID ").append(this.lLj.Sn()).append(")\n");
        stringBuilder.append("- Level: ").append(this.lLj.tL()).append('\n');
        stringBuilder.append("- Description: \"").append(this.lLj.getDescription()).append("\"\n");
        stringBuilder.append("- Message: \"").append(this.lLj.getMessage()).append("\"\n\n");
        stringBuilder.append("- Ranks:\n");
        this.esA().forEach(cbt_22 -> stringBuilder.append("  ").append(cbt_22.esH()).append('\n'));
        stringBuilder.append('\n');
        stringBuilder.append("- Members:\n");
        List<cbs_2> list = this.esz();
        list.forEach(cbs_22 -> stringBuilder.append("  - ").append(cbs_22.getName()).append(" (Account ID=").append(cbs_22.xl()).append(", Character ID=").append(cbs_22.KU()).append(", Rank=").append(cbs_22.esG().getName()).append(")\n"));
        stringBuilder.append('\n');
        stringBuilder.append("- All account IDs:\n");
        this.esC().forEach(l -> stringBuilder.append(l).append('\n'));
        stringBuilder.append('\n');
        stringBuilder.append("- All character IDs:\n");
        list.forEach(cbs_22 -> stringBuilder.append(cbs_22.KU()).append('\n'));
        return stringBuilder.toString();
    }

    public @Unmodifiable List<Long> esC() {
        return this.esz().stream().map(cbs_2::xl).distinct().toList();
    }

    @Override
    public String[] bxk() {
        return new String[]{lLb, lLc, lLd, lLe, lLf, lLg, lLh, lLi};
    }

    @Generated
    public nr esD() {
        return this.lLj;
    }

    @Generated
    public List<cbs_2> esE() {
        return this.lLk;
    }

    @Generated
    public Map<Long, cbt_2> esF() {
        return this.lLl;
    }

    @Generated
    public String toString() {
        return "ModeratedGuildView(m_guild=" + String.valueOf(this.esD()) + ", m_members=" + String.valueOf(this.esE()) + ", m_ranks=" + String.valueOf(this.esF()) + ")";
    }
}

