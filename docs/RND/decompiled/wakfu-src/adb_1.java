/*
 * Decompiled with CFR 0.152.
 */
import java.sql.ResultSet;

/*
 * Renamed from aDB
 */
public class adb_1 {
    public static String hi(String string) {
        return string.replace("'", "\\'");
    }

    public static float a(ResultSet resultSet, String string) {
        String string2 = resultSet.getString(string);
        String string3 = string2.replace(',', '.');
        return Bw.o(string3);
    }

    public static float a(ResultSet resultSet, int n) {
        String string = resultSet.getString(n);
        String string2 = string.replace(',', '.');
        return Bw.o(string2);
    }

    public static double b(ResultSet resultSet, String string) {
        String string2 = resultSet.getString(string);
        String string3 = string2.replace(',', '.');
        return Bw.n(string3);
    }

    public static double b(ResultSet resultSet, int n) {
        String string = resultSet.getString(n);
        String string2 = string.replace(',', '.');
        return Bw.n(string2);
    }
}

