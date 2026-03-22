/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.Optional;

public class cqy
extends cqf {
    private acd_1 lYg;
    private Long mey;
    private eVi jmD;
    private boolean mfh;

    @Override
    public boolean dn(byte[] byArray) {
        if (byArray == null || byArray.length != 24) {
            dwV.error((Object)"Incorrect message size");
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fg(byteBuffer);
        this.lYg = new acd_1();
        this.lYg.setX(byteBuffer.getInt());
        this.lYg.setY(byteBuffer.getInt());
        this.lYg.aM(byteBuffer.getShort());
        this.mey = byteBuffer.getLong();
        byte by = byteBuffer.get();
        Optional<eVi> optional = eVi.eL(by);
        if (optional.isEmpty()) {
            dwV.error((Object)("Invalid id for FightMarkerType = " + by));
            return false;
        }
        this.jmD = optional.get();
        this.mfh = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int d() {
        return 12022;
    }

    public acd_1 eyD() {
        return this.lYg;
    }

    public Long exW() {
        return this.mey;
    }

    public eVi dIk() {
        return this.jmD;
    }

    public boolean eyE() {
        return this.mfh;
    }
}

