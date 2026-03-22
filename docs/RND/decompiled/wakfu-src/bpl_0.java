/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.util.EnumMap;
import java.util.Map;
import lombok.Generated;

/*
 * Renamed from bpL
 */
public class bpl_0
implements bug_0<bpb_1> {
    private final EnumMap<fja, bpm_0> iXV;

    public bpl_0(EnumMap<fja, bpm_0> enumMap) {
        this.iXV = enumMap;
    }

    public EnumMap<fja, bpm_0> dDE() {
        return this.iXV;
    }

    public boolean a(bpb_1 bpb_12) {
        if (!(bpb_12 instanceof bpe_1)) {
            return false;
        }
        bpe_1 bpe_12 = (bpe_1)bpb_12;
        for (Map.Entry<fja, bpm_0> entry : this.iXV.entrySet()) {
            fja fja2 = entry.getKey();
            bpm_0 bpm_02 = entry.getValue();
            if (bpm_02.Fe(bpe_12.a(fja2))) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid() {
        return !this.iXV.isEmpty() && this.iXV.values().stream().allMatch(bpm_0::isValid);
    }

    @Override
    public buh_0 dcz() {
        return buh_0.joH;
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bpl_0)) {
            return false;
        }
        bpl_0 bpl_02 = (bpl_0)object;
        if (!bpl_02.C(this)) {
            return false;
        }
        EnumMap<fja, bpm_0> enumMap = this.dDE();
        EnumMap<fja, bpm_0> enumMap2 = bpl_02.dDE();
        return !(enumMap == null ? enumMap2 != null : !((Object)enumMap).equals(enumMap2));
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof bpl_0;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        EnumMap<fja, bpm_0> enumMap = this.dDE();
        n2 = n2 * 59 + (enumMap == null ? 43 : ((Object)enumMap).hashCode());
        return n2;
    }

    @Override
    public /* synthetic */ boolean ah(Object object) {
        return this.a((bpb_1)object);
    }
}

