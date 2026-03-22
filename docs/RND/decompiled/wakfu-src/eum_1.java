/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.time.Duration;
import java.time.Instant;

/*
 * Renamed from eUm
 */
public class eum_1
implements evv_2 {
    private long rug;
    private long ruh;
    private int rui;

    @Override
    public byte[] fej() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.rug);
        azg_12.gK(this.ruh);
        azg_12.vC(this.rui);
        return azg_12.bTe();
    }

    @Override
    public void a(long l, ByteBuffer byteBuffer) {
        this.rug = byteBuffer.getLong();
        this.ruh = byteBuffer.getLong();
        this.rui = byteBuffer.getInt();
    }

    public boolean fKJ() {
        return this.rui > ewo_0.oBF.i(ewr_0.oEN);
    }

    public void fKK() {
        if (Instant.now().isAfter(Instant.ofEpochMilli(this.rug).plus(Duration.ofDays(1L)))) {
            this.rui = 0;
            this.rug = Instant.now().toEpochMilli();
        }
        ++this.rui;
        this.ruh = Instant.now().toEpochMilli();
    }

    @Override
    public boolean fel() {
        return Instant.now().isAfter(Instant.ofEpochMilli(this.ruh).plus(Duration.ofDays(1L)));
    }

    @Override
    public eva_1 fek() {
        return eva_1.owv;
    }
}

