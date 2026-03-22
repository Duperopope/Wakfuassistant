/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.util.Random;

/*
 * Renamed from HQ
 */
public class hq_0
implements id_1 {
    private final kr_1 aJG;

    public hq_0(kr_1 kr_12) {
        this.aJG = kr_12;
    }

    @Override
    public void b(DataOutput dataOutput) {
        dataOutput.writeByte(5);
        Random random = new Random();
        dataOutput.writeFloat(this.aJG.aQl()[0] + (random.nextFloat() - 0.5f) * this.aJG.aQo()[0]);
        dataOutput.writeFloat(this.aJG.aQl()[1] + (random.nextFloat() - 0.5f) * this.aJG.aQo()[1]);
        dataOutput.writeFloat(this.aJG.aQm()[0] + (random.nextFloat() - 0.5f) * this.aJG.aQp()[0]);
        dataOutput.writeFloat(this.aJG.aQm()[1] + (random.nextFloat() - 0.5f) * this.aJG.aQp()[1]);
        dataOutput.writeFloat(this.aJG.aQn()[0] * ((float)Math.PI / 180) + (random.nextFloat() - 0.5f) * this.aJG.aQq()[0] * ((float)Math.PI / 180));
        dataOutput.writeFloat(this.aJG.aQn()[1] * ((float)Math.PI / 180) + (random.nextFloat() - 0.5f) * this.aJG.aQq()[1] * ((float)Math.PI / 180));
        dataOutput.writeFloat(this.aJG.aQo()[0]);
        dataOutput.writeFloat(this.aJG.aQo()[1]);
        dataOutput.writeFloat(this.aJG.aQp()[0]);
        dataOutput.writeFloat(this.aJG.aQp()[1]);
        dataOutput.writeFloat(this.aJG.aQq()[0] * ((float)Math.PI / 180));
        dataOutput.writeFloat(this.aJG.aQq()[1] * ((float)Math.PI / 180));
    }
}

