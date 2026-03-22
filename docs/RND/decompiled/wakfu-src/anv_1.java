/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import org.apache.log4j.Logger;

/*
 * Renamed from anV
 */
public class anv_1 {
    public static final anv_1 cKO = new anv_1();
    protected static final Logger cKP = Logger.getLogger(anv_1.class);

    public static anv_1 bEg() {
        return cKO;
    }

    private anv_1() {
    }

    public <T extends anu_1> Iterable<T> a(anu_1 anu_12, ano_2<T> ano_22, aoh_1 aoh_12, int n, int n2, short s) {
        if (aoh_12 == null || ano_22 == null) {
            return new azi_2();
        }
        int n3 = 0;
        int n4 = 0;
        short s2 = 0;
        if (anu_12 != null) {
            n3 = anu_12.bcC();
            n4 = anu_12.bcD();
            s2 = anu_12.bcE();
        }
        abi_1 abi_12 = anu_12 == null ? abi_1.dzt : anu_12.bcB();
        return aoh_12.a(n3, n4, s2, n, n2, s, abi_12, ano_22.ban());
    }

    public <T extends anu_1, TV extends anx_1<T>> Iterable<T> a(anu_1 anu_12, ano_2<T> ano_22, aoh_1 aoh_12, int n, int n2, short s, TV TV) {
        if (TV == null) {
            return this.a(anu_12, ano_22, aoh_12, n, n2, s);
        }
        if (aoh_12 == null || ano_22 == null) {
            return new azi_2();
        }
        LinkedList<anu_1> linkedList = new LinkedList<anu_1>();
        Iterator<T> iterator = ano_22.ban();
        block5: while (iterator.hasNext()) {
            anu_1 anu_13 = (anu_1)iterator.next();
            azx_1<any_1, ArrayList<T>> azx_12 = TV.a(anu_13, anu_12);
            switch (azx_12.getFirst()) {
                case cKR: {
                    linkedList.add(anu_13);
                    break;
                }
                case cKV: {
                    int n3 = 0;
                    int n4 = 0;
                    short s2 = 0;
                    abi_1 abi_12 = abi_1.dzq;
                    if (anu_12 != null) {
                        n3 = anu_12.bcC();
                        n4 = anu_12.bcD();
                        s2 = anu_12.bcE();
                        abi_12 = anu_12.bcB();
                    }
                    if (!aoh_12.b(n, n2, s, n3, n4, s2, abi_12, anu_13.bcC(), anu_13.bcD(), anu_13.bcE(), anu_13.bcO())) break;
                    linkedList.add(anu_13);
                    break;
                }
                case cKS: {
                    for (anu_1 anu_14 : azx_12.aHI()) {
                        linkedList.add(anu_14);
                    }
                    continue block5;
                }
            }
        }
        return linkedList;
    }
}

