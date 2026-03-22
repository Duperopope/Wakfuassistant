/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.regex.Matcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class eMj
extends eLT<fqE<? extends fqD>> {
    public eMj(fqE<? extends fqD> fqE2) {
        this(fqE2, null, null, eLN.qJo);
    }

    public eMj(fqE<? extends fqD> fqE2, @Nullable ArrayList<String> arrayList, @Nullable ArrayList<String> arrayList2, eLN eLN2) {
        super(fqE2, fqE2.giP().d(), fqE2.cmL(), eLL.qJe.a(fqE2), arrayList, arrayList2, eLN2, eLL.qJj);
    }

    @Override
    public void Z(@NotNull ArrayList<String> arrayList) {
    }

    @Override
    public String k(@NotNull String string, @NotNull enk_0 enk_02) {
        return eMj.a((fqE)this.qLV, this.cmL(), string);
    }

    public static String a(fqE fqE2, short s, String object) {
        qm_0<enk_0> qm_02;
        Matcher matcher = eLL.qHS.matcher(((String)object).trim());
        exP exP2 = eLL.qJe.b(fqE2);
        qm_0<enk_0> qm_03 = qm_02 = exP2 == null ? null : exP2.fgg();
        while (matcher.find()) {
            String string = matcher.group(1);
            char c2 = string.charAt(0);
            block0 : switch (c2) {
                case 'a': {
                    char c3 = string.charAt(1);
                    switch (c3) {
                        case 'p': {
                            object = ((String)object).substring(0, matcher.start()) + ((fqD)fqE2.giP()).h(fqE2, exP2, null, qm_02) + ((String)object).substring(matcher.end());
                            matcher = eLL.qHS.matcher(((String)object).trim());
                        }
                    }
                    break;
                }
                case 'm': {
                    char c3 = string.charAt(1);
                    switch (c3) {
                        case 'p': {
                            object = ((String)object).substring(0, matcher.start()) + ((fqD)fqE2.giP()).g(fqE2, (Object)exP2, null, qm_02) + ((String)object).substring(matcher.end());
                            matcher = eLL.qHS.matcher(((String)object).trim());
                            break block0;
                        }
                        case 'r': {
                            object = ((String)object).substring(0, matcher.start()) + ((fqD)fqE2.giP()).j(fqE2, exP2, null, qm_02) + ((String)object).substring(matcher.end());
                            matcher = eLL.qHS.matcher(((String)object).trim());
                        }
                    }
                    break;
                }
                case 'M': {
                    char c3 = string.charAt(1);
                    switch (c3) {
                        case 'r': {
                            object = ((String)object).substring(0, matcher.start()) + ((fqD)fqE2.giP()).i(fqE2, exP2, null, qm_02) + ((String)object).substring(matcher.end());
                            matcher = eLL.qHS.matcher(((String)object).trim());
                        }
                    }
                    break;
                }
                case 'w': {
                    char c3 = string.charAt(1);
                    switch (c3) {
                        case 'p': {
                            object = ((String)object).substring(0, matcher.start()) + ((fqD)fqE2.giP()).e(fqE2, (Object)exP2, null, qm_02) + ((String)object).substring(matcher.end());
                            matcher = eLL.qHS.matcher(((String)object).trim());
                        }
                    }
                    break;
                }
                case 'e': {
                    char c3 = string.charAt(1);
                    switch (c3) {
                        case 'l': {
                            eNd eNd2 = eNd.ff(((fqD)fqE2.giP()).giG());
                            String string2 = eLL.j(eNd2);
                            object = ((String)object).substring(0, matcher.start()) + string2 + ((String)object).substring(matcher.end());
                            matcher = eLL.qHS.matcher(((String)object).trim());
                            break block0;
                        }
                    }
                    break;
                }
                case 'c': {
                    char c3 = string.charAt(1);
                    switch (c3) {
                        case 'h': {
                            object = ((String)object).substring(0, matcher.start()) + eLL.qJe.cZw() + ((String)object).substring(matcher.end());
                            matcher = eLL.qHS.matcher(((String)object).trim());
                        }
                    }
                    break;
                }
                case 'l': {
                    char c3 = string.charAt(1);
                    switch (c3) {
                        case 'v': {
                            object = ((String)object).substring(0, matcher.start()) + (exP2 == null ? (short)0 : exP2.cmL()) + ((String)object).substring(matcher.end());
                            matcher = eLL.qHS.matcher(((String)object).trim());
                        }
                    }
                    break;
                }
            }
        }
        return object;
    }
}

