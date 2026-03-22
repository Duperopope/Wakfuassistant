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
 * Renamed from bz
 */
class bz_1
extends AbstractParser<by_2> {
    bz_1() {
    }

    public by_2 aE(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new by_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aE(codedInputStream, extensionRegistryLite);
    }
}

