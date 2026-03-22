/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eXK
 */
public class exk_1
implements exs_1 {
    @Override
    public void a(@NotNull azg_1 azg_12, @NotNull Object object) {
        azg_12.aF((Boolean)object != false ? (byte)1 : 0);
    }

    @Override
    public Object fI(@NotNull ByteBuffer byteBuffer) {
        return byteBuffer.get() == 1;
    }
}

