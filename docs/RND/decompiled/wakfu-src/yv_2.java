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
 * Renamed from yV
 */
class yv_2
extends AbstractParser<yu_2> {
    yv_2() {
    }

    public yu_2 jg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new yu_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jg(codedInputStream, extensionRegistryLite);
    }
}

