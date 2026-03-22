/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public class eLU
extends eLT<Qk<enk_0>> {
    public eLU(List<enk_0> list, int n, short s) {
        this(list, n, s, true, eLN.qJo, 0);
    }

    public eLU(List<enk_0> list, int n, short s, boolean bl, eLN eLN2, int n2) {
        this(list, n, s, bl, (ArrayList<String>)null, (ArrayList<String>)null, eLN2, n2);
    }

    public eLU(List<enk_0> list, int n, short s, boolean bl, @Nullable ArrayList<String> arrayList, @Nullable ArrayList<String> arrayList2, eLN eLN2, int n2) {
        super(new eLV(list), n, s, bl, arrayList, arrayList2, eLN2, n2);
    }
}

