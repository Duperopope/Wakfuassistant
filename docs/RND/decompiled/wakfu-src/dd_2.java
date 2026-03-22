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
 * Renamed from dD
 */
class dd_2
extends AbstractParser<dc_1> {
    dd_2() {
    }

    public dc_1 cb(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new dc_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cb(codedInputStream, extensionRegistryLite);
    }
}

