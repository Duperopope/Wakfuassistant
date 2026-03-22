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
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from fF
 */
public final class ff_2
extends GeneratedMessageV3
implements fi_2 {
    private static final long qI = 0L;
    public static final int qJ = 1;
    Internal.IntList qK;
    private byte Y = (byte)-1;
    private static final ff_2 qL = new ff_2();
    @Deprecated
    public static final Parser<ff_2> qM = new fg_2();

    ff_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ff_2() {
        this.qK = ff_2.emptyIntList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ff_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ff_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block12: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block12;
                    }
                    case 8: {
                        if (!(bl & true)) {
                            this.qK = ff_2.newIntList();
                            bl |= true;
                        }
                        this.qK.addInt(codedInputStream.readInt32());
                        continue block12;
                    }
                    case 10: {
                        int n2 = codedInputStream.readRawVarint32();
                        int n3 = codedInputStream.pushLimit(n2);
                        if (!(bl & true) && codedInputStream.getBytesUntilLimit() > 0) {
                            this.qK = ff_2.newIntList();
                            bl |= true;
                        }
                        while (codedInputStream.getBytesUntilLimit() > 0) {
                            this.qK.addInt(codedInputStream.readInt32());
                        }
                        codedInputStream.popLimit(n3);
                        continue block12;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue;
                bl2 = true;
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
            if (bl & true) {
                this.qK.makeImmutable();
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor Bc() {
        return fl_1.po;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return fl_1.pp.ensureFieldAccessorsInitialized(ff_2.class, fh_2.class);
    }

    @Override
    public List<Integer> Bd() {
        return this.qK;
    }

    @Override
    public int Be() {
        return this.qK.size();
    }

    @Override
    public int cy(int n) {
        return this.qK.getInt(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.qK.size(); ++i) {
            codedOutputStream.writeInt32(1, this.qK.getInt(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        int n2 = 0;
        for (int i = 0; i < this.qK.size(); ++i) {
            n2 += CodedOutputStream.computeInt32SizeNoTag((int)this.qK.getInt(i));
        }
        n += n2;
        n += 1 * this.Bd().size();
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ff_2)) {
            return super.equals(object);
        }
        ff_2 ff_22 = (ff_2)object;
        if (!this.Bd().equals(ff_22.Bd())) {
            return false;
        }
        return this.unknownFields.equals((Object)ff_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ff_2.Bc().hashCode();
        if (this.Be() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.Bd().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ff_2 ay(ByteBuffer byteBuffer) {
        return (ff_2)qM.parseFrom(byteBuffer);
    }

    public static ff_2 aw(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ff_2)qM.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ff_2 bo(ByteString byteString) {
        return (ff_2)qM.parseFrom(byteString);
    }

    public static ff_2 aw(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ff_2)qM.parseFrom(byteString, extensionRegistryLite);
    }

    public static ff_2 ax(byte[] byArray) {
        return (ff_2)qM.parseFrom(byArray);
    }

    public static ff_2 aw(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ff_2)qM.parseFrom(byArray, extensionRegistryLite);
    }

    public static ff_2 bS(InputStream inputStream) {
        return (ff_2)GeneratedMessageV3.parseWithIOException(qM, (InputStream)inputStream);
    }

    public static ff_2 bS(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ff_2)GeneratedMessageV3.parseWithIOException(qM, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ff_2 bT(InputStream inputStream) {
        return (ff_2)GeneratedMessageV3.parseDelimitedWithIOException(qM, (InputStream)inputStream);
    }

    public static ff_2 bT(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ff_2)GeneratedMessageV3.parseDelimitedWithIOException(qM, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ff_2 aw(CodedInputStream codedInputStream) {
        return (ff_2)GeneratedMessageV3.parseWithIOException(qM, (CodedInputStream)codedInputStream);
    }

    public static ff_2 do(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ff_2)GeneratedMessageV3.parseWithIOException(qM, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public fh_2 Bf() {
        return ff_2.Bg();
    }

    public static fh_2 Bg() {
        return qL.Bh();
    }

    public static fh_2 a(ff_2 ff_22) {
        return qL.Bh().c(ff_22);
    }

    public fh_2 Bh() {
        return this == qL ? new fh_2() : new fh_2().c(this);
    }

    protected fh_2 aw(GeneratedMessageV3.BuilderParent builderParent) {
        fh_2 fh_22 = new fh_2(builderParent);
        return fh_22;
    }

    public static ff_2 Bi() {
        return qL;
    }

    public static Parser<ff_2> z() {
        return qM;
    }

    public Parser<ff_2> getParserForType() {
        return qM;
    }

    public ff_2 Bj() {
        return qL;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.aw(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.Bh();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.Bf();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.Bh();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.Bf();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Bj();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Bj();
    }

    static /* synthetic */ boolean gb() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ Internal.IntList Bk() {
        return ff_2.emptyIntList();
    }

    static /* synthetic */ UnknownFieldSet b(ff_2 ff_22) {
        return ff_22.unknownFields;
    }

    static /* synthetic */ Internal.IntList Bl() {
        return ff_2.emptyIntList();
    }

    static /* synthetic */ Internal.IntList c(Internal.IntList intList) {
        return ff_2.mutableCopy((Internal.IntList)intList);
    }

    static /* synthetic */ Internal.IntList Bm() {
        return ff_2.emptyIntList();
    }
}

