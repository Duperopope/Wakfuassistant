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
 * Renamed from bL
 */
class bl_2
extends AbstractParser<bk_2> {
    bl_2() {
    }

    public bk_2 aN(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new bk_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aN(codedInputStream, extensionRegistryLite);
    }
}

