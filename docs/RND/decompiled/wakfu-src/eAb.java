/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Comparator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class eAb {
    private final int pvt;
    private final long pvu;
    @Nullable
    private String aFD;
    @NotNull
    private final ux_0 pvv;
    public static final Comparator<eAb> pvw = Comparator.comparing(eAb::fnv);

    public eAb(int n, long l, @NotNull ux_0 ux_02) {
        this.pvt = n;
        this.pvu = l;
        this.pvv = ux_02;
    }

    public int azt() {
        return this.pvt;
    }

    public long KU() {
        return this.pvu;
    }

    @Nullable
    public String xO() {
        return this.aFD;
    }

    public void dm(@Nullable String string) {
        this.aFD = string;
    }

    @NotNull
    public ux_0 fnv() {
        return this.pvv;
    }

    public void a(azg_1 azg_12, boolean bl) {
        azg_12.vC(this.pvt);
        azg_12.gK(this.pvu);
        azg_12.gK(this.pvv.bjB());
        if (bl) {
            if (this.aFD == null) {
                azg_12.aF((byte)0);
                return;
            }
            azg_12.gW(this.aFD);
        }
    }

    public static eAb a(ByteBuffer byteBuffer, boolean bl) {
        byte by;
        eAb eAb2 = new eAb(byteBuffer.getInt(), byteBuffer.getLong(), uw_0.fn(byteBuffer.getLong()));
        if (bl && (by = byteBuffer.get()) > 0) {
            byte[] byArray = new byte[by];
            byteBuffer.get(byArray);
            eAb2.aFD = BH.dc(byArray);
        }
        return eAb2;
    }

    public int lB(boolean bl) {
        int n = 20;
        if (!bl) {
            return 20;
        }
        return 21 + (this.aFD == null ? 0 : this.aFD.length());
    }

    public static int b(Collection<eAb> collection, boolean bl) {
        int n = 0;
        for (eAb eAb2 : collection) {
            n += eAb2.lB(bl);
        }
        return n;
    }

    public String toString() {
        return "Reward{m_rewardId=" + this.pvt + ", m_characterId=" + this.pvu + ", m_characterName='" + this.aFD + "', m_completionDate=" + String.valueOf(this.pvv) + "}";
    }
}

