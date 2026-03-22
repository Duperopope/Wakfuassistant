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
 * Renamed from nP
 */
class np_2
extends AbstractParser<no_2> {
    np_2() {
    }

    public no_2 iF(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new no_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iF(codedInputStream, extensionRegistryLite);
    }
}

