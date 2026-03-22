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
 * Renamed from dJ
 */
class dj_1
extends AbstractParser<di_2> {
    dj_1() {
    }

    public di_2 ce(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new di_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ce(codedInputStream, extensionRegistryLite);
    }
}

