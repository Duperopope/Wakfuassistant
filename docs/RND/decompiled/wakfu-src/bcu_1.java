/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bcU
 */
public class bcu_1
extends buo_0<bci_1> {
    public bcu_1(@NotNull String string) {
        super(string);
    }

    protected @NotNull List<@Nullable String> h(bci_1 bci_12) {
        ArrayList<bcw_1> arrayList = bci_12.dbs();
        ArrayList<String> arrayList2 = new ArrayList<String>(2 + arrayList.size());
        arrayList2.add(bci_12.dah());
        arrayList2.add(bch_2.c(bci_12.daS().dat()));
        for (bcw_1 bcw_12 : arrayList) {
            arrayList2.add(bcw_12.dak());
        }
        return arrayList2;
    }

    @Override
    protected /* synthetic */ /*
     * Issues handling annotations - annotations may be inaccurate
     */
    @Nullable @NotNull List aj(Object object) {
        return this.h((bci_1)object);
    }
}

