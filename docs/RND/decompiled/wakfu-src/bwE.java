/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

public final class bwE {
    final bwF jzr;
    final ffV jzs;
    final ffV jzt;
    final ffS jzu;

    @Generated
    public bwF dMN() {
        return this.jzr;
    }

    @Generated
    public ffV dMO() {
        return this.jzs;
    }

    @Generated
    public ffV dMP() {
        return this.jzt;
    }

    @Generated
    public ffS dMQ() {
        return this.jzu;
    }

    @Generated
    public bwE(bwF bwF2, ffV ffV2, ffV ffV3, ffS ffS2) {
        this.jzr = bwF2;
        this.jzs = ffV2;
        this.jzt = ffV3;
        this.jzu = ffS2;
    }

    @Generated
    public String toString() {
        return "EquipmentModifications.Modification(m_type=" + String.valueOf((Object)this.dMN()) + ", m_removedItem=" + String.valueOf(this.dMO()) + ", m_addedItem=" + String.valueOf(this.dMP()) + ", m_position=" + String.valueOf(this.dMQ()) + ")";
    }
}

