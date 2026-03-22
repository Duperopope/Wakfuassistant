/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class eJL {
    private final boolean qAB;
    private final ffS qAC;
    @Nullable
    private final Long qAD;

    private eJL(boolean bl, ffS ffS2, @Nullable Long l) {
        this.qAB = bl;
        this.qAC = ffS2;
        this.qAD = l;
    }

    public static eJL a(ffS ffS2, long l) {
        return new eJL(true, ffS2, l);
    }

    public static eJL q(ffS ffS2) {
        return new eJL(false, ffS2, null);
    }

    public void d(azg_1 azg_12) {
        if (this.qAB) {
            azg_12.dz(true);
            azg_12.aF(this.qAC.shb);
            azg_12.gK(this.qAD);
        } else {
            azg_12.dz(false);
            azg_12.aF(this.qAC.shb);
        }
    }

    public static eJL fq(ByteBuffer byteBuffer) {
        boolean bl = byteBuffer.get() == 1;
        ffS ffS2 = ffS.gj(byteBuffer.get());
        if (bl) {
            return eJL.a(ffS2, byteBuffer.getLong());
        }
        return eJL.q(ffS2);
    }

    public int bVY() {
        return 2 + (this.qAB ? 8 : 0);
    }

    @Generated
    public boolean fxq() {
        return this.qAB;
    }

    @Generated
    public ffS dMQ() {
        return this.qAC;
    }

    @Nullable
    @Generated
    public Long fxr() {
        return this.qAD;
    }

    @Generated
    public String toString() {
        return "CompanionEquipmentModification(m_addingItem=" + this.fxq() + ", m_position=" + String.valueOf(this.dMQ()) + ", m_itemUid=" + this.fxr() + ")";
    }
}

