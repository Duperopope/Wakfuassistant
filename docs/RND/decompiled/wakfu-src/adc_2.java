/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.nio.ByteBuffer;

/*
 * Renamed from aDc
 */
public abstract sealed class adc_2
extends Enum<adc_2>
permits add_2, ade_2, adf_2 {
    public static final /* enum */ adc_2 dCN = new add_2();
    public static final /* enum */ adc_2 dCO = new ade_2();
    public static final /* enum */ adc_2 dCP = new adf_2();
    private static final /* synthetic */ adc_2[] dCQ;

    public static adc_2[] values() {
        return (adc_2[])dCQ.clone();
    }

    public static adc_2 valueOf(String string) {
        return Enum.valueOf(adc_2.class, string);
    }

    public abstract ByteBuffer a(ByteBuf var1);

    private static /* synthetic */ adc_2[] bXX() {
        return new adc_2[]{dCN, dCO, dCP};
    }

    static {
        dCQ = adc_2.bXX();
    }
}

