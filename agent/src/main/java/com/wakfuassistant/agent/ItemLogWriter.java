package com.wakfuassistant.agent;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ItemLogWriter {

    public static final String ITEMS_LOG = WakfuSpyAgent.LOG_DIR + "\\wakfu_items_decoded.jsonl";
    public static final String ITEMS_SUMMARY_LOG = WakfuSpyAgent.LOG_DIR + "\\wakfu_items_summary.log";

    private static final Object LOCK = new Object();
    private static int itemCount = 0;

    public static void writeItem(String jsonLine) {
        synchronized (LOCK) {
            try (FileWriter fw = new FileWriter(ITEMS_LOG, true)) {
                fw.write(jsonLine + "\n");
                itemCount++;
            } catch (IOException e) {
                WakfuSpyAgent.log("ITEM_LOG_ERROR|write|" + e.getMessage());
            }
        }
    }

    public static void writeSummary(String summaryLine) {
        synchronized (LOCK) {
            try (FileWriter fw = new FileWriter(ITEMS_SUMMARY_LOG, true)) {
                fw.write(summaryLine + "\n");
            } catch (IOException e) {
                // silent
            }
        }
    }

    public static int getItemCount() {
        return itemCount;
    }

    public static String escapeJson(String s) {
        if (s == null) return "null";
        StringBuilder sb = new StringBuilder(s.length() + 16);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '"':  sb.append("\\\""); break;
                case '\\': sb.append("\\\\"); break;
                case '\n': sb.append("\\n"); break;
                case '\r': sb.append("\\r"); break;
                case '\t': sb.append("\\t"); break;
                default:
                    if (c < 0x20) {
                        sb.append(String.format("\\u%04x", (int) c));
                    } else {
                        sb.append(c);
                    }
            }
        }
        return sb.toString();
    }

    public static String bytesToHex(byte[] bytes) {
        if (bytes == null) return "";
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        for (byte b : bytes) {
            int v = b & 0xFF;
            sb.append("0123456789ABCDEF".charAt(v >> 4));
            sb.append("0123456789ABCDEF".charAt(v & 0xF));
        }
        return sb.toString();
    }
}
