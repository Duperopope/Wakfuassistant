/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractParser
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.ExtensionRegistryLite
 */
import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;

/*
 * Renamed from bm
 */
class bm_2
extends AbstractParser<bl_1> {
    bm_2() {
    }

    public bl_1 av(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new bl_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.av(codedInputStream, extensionRegistryLite);
    }
}

