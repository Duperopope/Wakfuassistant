/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.EnumMap;
import java.util.Optional;

/*
 * Renamed from cqx
 */
public class cqx_0
extends cqf {
    private final EnumMap<eVi, acd_1> mfg = new EnumMap(eVi.class);

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fg(byteBuffer);
        int n = byteBuffer.get();
        for (int i = 0; i < n; ++i) {
            byte by = byteBuffer.get();
            Optional<eVi> optional = eVi.eL(by);
            if (optional.isEmpty()) {
                dwV.error((Object)("Invalid id for FightMarkerType = " + by));
                return false;
            }
            acd_1 acd_12 = new acd_1();
            acd_12.setX(byteBuffer.getInt());
            acd_12.setY(byteBuffer.getInt());
            acd_12.aM(byteBuffer.getShort());
            this.mfg.put(optional.get(), acd_12);
        }
        return true;
    }

    public EnumMap<eVi, acd_1> eyC() {
        return this.mfg;
    }

    @Override
    public int d() {
        return 13192;
    }
}

