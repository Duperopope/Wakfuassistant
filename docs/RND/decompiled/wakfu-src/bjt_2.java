/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bjt
 */
public class bjt_2
extends fiK {
    @NotNull
    private final List<bjs_2> ion;
    private final boolean ioo;

    bjt_2(bju_2 bju_22) {
        super(bju_22);
        this.ion = bju_22.drq().stream().sorted().toList();
        this.ioo = bju_22.css();
    }

    public @Unmodifiable @NotNull List<bjs_2> drq() {
        return this.ion;
    }

    public boolean css() {
        return this.ioo;
    }

    @Override
    public String toString() {
        return "ClientLootDefinition{m_itemRefId=" + this.avr() + ", m_dropQty=" + this.fXR() + ", m_rollMax=" + this.csp() + ", m_dropQuantityMin=" + this.fXS() + ", m_dropQuantityMax=" + this.fXT() + ", m_minProspection=" + this.fXU() + ", m_dropRate=" + this.cmK() + ", m_isLootList=" + this.cqk() + ", m_clientCriteria=" + String.valueOf(this.ion) + ", m_hasComplexCriteria=" + this.ioo + "}";
    }
}

