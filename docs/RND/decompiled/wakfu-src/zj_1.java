/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.GeneratedMessageV3$UnusedPrivateParameter
 *  com.google.protobuf.Internal$IntList
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UninitializedMessageException
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/*
 * Renamed from zJ
 */
public final class zj_1
extends GeneratedMessageV3
implements zm_1 {
    private static final long aoQ = 0L;
    int an;
    public static final int aoR = 1;
    int HC;
    public static final int aoS = 2;
    Internal.IntList aoT;
    private byte Y = (byte)-1;
    private static final zj_1 aoU = new zj_1();
    @Deprecated
    public static final Parser<zj_1> aoV = new zk_1();

    zj_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private zj_1() {
        this.HC = 1;
        this.aoT = zj_1.emptyIntList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new zj_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    zj_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block13: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block13;
                    }
                    case 8: {
                        int n3 = codedInputStream.readEnum();
                        zd_2 zd_22 = zd_2.kR(n3);
                        if (zd_22 == null) {
                            builder.mergeVarintField(1, n3);
                            continue block13;
                        }
                        this.an |= 1;
                        this.HC = n3;
                        continue block13;
                    }
                    case 16: {
                        if ((n & 2) == 0) {
                            this.aoT = zj_1.newIntList();
                            n |= 2;
                        }
                        this.aoT.addInt(codedInputStream.readInt32());
                        continue block13;
                    }
                    case 18: {
                        int n3 = codedInputStream.readRawVarint32();
                        int n4 = codedInputStream.pushLimit(n3);
                        if ((n & 2) == 0 && codedInputStream.getBytesUntilLimit() > 0) {
                            this.aoT = zj_1.newIntList();
                            n |= 2;
                        }
                        while (codedInputStream.getBytesUntilLimit() > 0) {
                            this.aoT.addInt(codedInputStream.readInt32());
                        }
                        codedInputStream.popLimit(n4);
                        continue block13;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue;
                bl = true;
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (UninitializedMessageException uninitializedMessageException) {
            throw uninitializedMessageException.asInvalidProtocolBufferException().setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if ((n & 2) != 0) {
                this.aoT.makeImmutable();
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor aAf() {
        return zc_2.aoA;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zc_2.aoB.ensureFieldAccessorsInitialized(zj_1.class, zl_1.class);
    }

    @Override
    public boolean aeU() {
        return (this.an & 1) != 0;
    }

    @Override
    public zd_2 aAg() {
        zd_2 zd_22 = zd_2.kR(this.HC);
        return zd_22 == null ? zd_2.aoC : zd_22;
    }

    @Override
    public List<Integer> aAh() {
        return this.aoT;
    }

    @Override
    public int aAi() {
        return this.aoT.size();
    }

    @Override
    public int kZ(int n) {
        return this.aoT.getInt(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.aeU()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeEnum(1, this.HC);
        }
        for (int i = 0; i < this.aoT.size(); ++i) {
            codedOutputStream.writeInt32(2, this.aoT.getInt(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.an & 1) != 0) {
            n += CodedOutputStream.computeEnumSize((int)1, (int)this.HC);
        }
        int n2 = 0;
        for (int i = 0; i < this.aoT.size(); ++i) {
            n2 += CodedOutputStream.computeInt32SizeNoTag((int)this.aoT.getInt(i));
        }
        n += n2;
        n += 1 * this.aAh().size();
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof zj_1)) {
            return super.equals(object);
        }
        zj_1 zj_12 = (zj_1)object;
        if (this.aeU() != zj_12.aeU()) {
            return false;
        }
        if (this.aeU() && this.HC != zj_12.HC) {
            return false;
        }
        if (!this.aAh().equals(zj_12.aAh())) {
            return false;
        }
        return this.unknownFields.equals((Object)zj_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + zj_1.aAf().hashCode();
        if (this.aeU()) {
            n = 37 * n + 1;
            n = 53 * n + this.HC;
        }
        if (this.aAi() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.aAh().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static zj_1 eo(ByteBuffer byteBuffer) {
        return (zj_1)aoV.parseFrom(byteBuffer);
    }

    public static zj_1 cC(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (zj_1)aoV.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static zj_1 ed(ByteString byteString) {
        return (zj_1)aoV.parseFrom(byteString);
    }

    public static zj_1 cC(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (zj_1)aoV.parseFrom(byteString, extensionRegistryLite);
    }

    public static zj_1 cE(byte[] byArray) {
        return (zj_1)aoV.parseFrom(byArray);
    }

    public static zj_1 cC(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (zj_1)aoV.parseFrom(byArray, extensionRegistryLite);
    }

    public static zj_1 ge(InputStream inputStream) {
        return (zj_1)GeneratedMessageV3.parseWithIOException(aoV, (InputStream)inputStream);
    }

    public static zj_1 ge(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zj_1)GeneratedMessageV3.parseWithIOException(aoV, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static zj_1 gf(InputStream inputStream) {
        return (zj_1)GeneratedMessageV3.parseDelimitedWithIOException(aoV, (InputStream)inputStream);
    }

    public static zj_1 gf(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zj_1)GeneratedMessageV3.parseDelimitedWithIOException(aoV, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static zj_1 cC(CodedInputStream codedInputStream) {
        return (zj_1)GeneratedMessageV3.parseWithIOException(aoV, (CodedInputStream)codedInputStream);
    }

    public static zj_1 jG(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zj_1)GeneratedMessageV3.parseWithIOException(aoV, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public zl_1 aAj() {
        return zj_1.aAk();
    }

    public static zl_1 aAk() {
        return aoU.aAl();
    }

    public static zl_1 b(zj_1 zj_12) {
        return aoU.aAl().d(zj_12);
    }

    public zl_1 aAl() {
        return this == aoU ? new zl_1() : new zl_1().d(this);
    }

    protected zl_1 cC(GeneratedMessageV3.BuilderParent builderParent) {
        zl_1 zl_12 = new zl_1(builderParent);
        return zl_12;
    }

    public static zj_1 aAm() {
        return aoU;
    }

    public static Parser<zj_1> z() {
        return aoV;
    }

    public Parser<zj_1> getParserForType() {
        return aoV;
    }

    public zj_1 aAn() {
        return aoU;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cC(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.aAl();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.aAj();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.aAl();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.aAj();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aAn();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aAn();
    }

    static /* synthetic */ boolean oV() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ Internal.IntList amY() {
        return zj_1.emptyIntList();
    }

    static /* synthetic */ UnknownFieldSet c(zj_1 zj_12) {
        return zj_12.unknownFields;
    }

    static /* synthetic */ Internal.IntList Ac() {
        return zj_1.emptyIntList();
    }

    static /* synthetic */ Internal.IntList b(Internal.IntList intList) {
        return zj_1.mutableCopy((Internal.IntList)intList);
    }

    static /* synthetic */ Internal.IntList Ad() {
        return zj_1.emptyIntList();
    }
}

