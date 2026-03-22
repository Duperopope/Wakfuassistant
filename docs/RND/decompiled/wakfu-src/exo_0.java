/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eXO
 */
public class exo_0
implements exs_1 {
    @Override
    public void a(@NotNull azg_1 azg_12, @NotNull Object object) {
        azg_12.aG((Short)object);
    }

    @Override
    public Object fI(@NotNull ByteBuffer byteBuffer) {
        return byteBuffer.getShort();
    }
}

