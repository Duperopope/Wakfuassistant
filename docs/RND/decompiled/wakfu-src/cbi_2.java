/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from cbI
 */
public class cbi_2
implements aeh_2 {
    private static final String lKt = "textWidgetStyles";
    private static final String lKu = "containerStyles";
    private static final String lKv = "imageStyles";
    private static final String lKw = "buttonStyles";
    private static final String lKx = "textEditorStyles";
    private static final String lKy = "textEditorPlusStyles";
    private static final String lKz = "radioButtonStyles";
    private static final String lKA = "checkBoxStyles";
    private static final String lKB = "progressBarStyles";
    public static final String lKC = "cursorTypes";
    private static final String lKD = "colors";
    private static final String lKE = "fonts";
    private static final String lKF = "events";
    public static final String[] lKG = new String[]{"textWidgetStyles", "containerStyles", "imageStyles", "buttonStyles", "textEditorStyles", "textEditorPlusStyles", "checkBoxStyles", "progressBarStyles", "colors", "fonts", "events"};
    private final Function<String, Stream<String>> lKH;
    @NotNull
    private final cbj_2 lKI = new cbj_2();

    public cbi_2(Function<String, Stream<String>> function) {
        this.lKH = function;
    }

    @Override
    public String[] bxk() {
        return lKG;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (lKt.equals(string)) {
            return this.nX("textWidget");
        }
        if (lKu.equals(string)) {
            return this.nX("container");
        }
        if (lKv.equals(string)) {
            return this.nX("image");
        }
        if (lKw.equals(string)) {
            return this.nX("button");
        }
        if (lKx.equals(string)) {
            return this.nX("textEditor");
        }
        if (lKy.equals(string)) {
            return this.nX("textEditorPlus");
        }
        if (lKz.equals(string)) {
            return this.nX("radioButton");
        }
        if (lKA.equals(string)) {
            return this.nX("checkBox");
        }
        if (lKB.equals(string)) {
            return this.nX("progressBar");
        }
        if (lKC.equals(string)) {
            return Arrays.stream(fzo_0.values()).map(Enum::name).toList();
        }
        if (lKD.equals(string)) {
            return fhm_2.uwB.gzR().stream().sorted(String::compareTo).toList();
        }
        if (lKE.equals(string)) {
            return fyw_0.gqw().gqB().gAn().entrySet().stream().map(entry -> new cbk_2(this, (String)entry.getKey(), (List)entry.getValue())).sorted(Comparator.comparing(cbk_2::ess)).collect(Collectors.toUnmodifiableList());
        }
        if (lKF.equals(string)) {
            return this.lKI;
        }
        return null;
    }

    private @Unmodifiable @NotNull List<String> nX(String string2) {
        return this.lKH.apply(string2).sorted().distinct().map(string -> string.isEmpty() ? "[Default]" : string).toList();
    }
}

