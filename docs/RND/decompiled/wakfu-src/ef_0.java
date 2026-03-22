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
 * Renamed from ef
 */
class ef_0
extends AbstractParser<ee_0> {
    ef_0() {
    }

    public ee_0 ct(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new ee_0(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ct(codedInputStream, extensionRegistryLite);
    }
}

