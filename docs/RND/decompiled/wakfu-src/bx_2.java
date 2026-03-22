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
 * Renamed from bX
 */
class bx_2
extends AbstractParser<bw_2> {
    bx_2() {
    }

    public bw_2 aW(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new bw_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aW(codedInputStream, extensionRegistryLite);
    }
}

