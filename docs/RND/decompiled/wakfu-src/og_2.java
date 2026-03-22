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
 * Renamed from og
 */
public final class og_2
extends GeneratedMessageV3
implements oj_2 {
    private static final long Qo = 0L;
    int an;
    public static final int Qp = 1;
    Internal.IntList Qq;
    public static final int Qr = 2;
    int Qs;
    private byte Y = (byte)-1;
    private static final og_2 Qt = new og_2();
    @Deprecated
    public static final Parser<og_2> Qu = new oh_2();

    og_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private og_2() {
        this.Qq = og_2.emptyIntList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new og_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    og_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block13: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block13;
                    }
                    case 8: {
                        if (!(bl & true)) {
                            this.Qq = og_2.newIntList();
                            bl |= true;
                        }
                        this.Qq.addInt(codedInputStream.readInt32());
                        continue block13;
                    }
                    case 10: {
                        int n2 = codedInputStream.readRawVarint32();
                        int n3 = codedInputStream.pushLimit(n2);
                        if (!(bl & true) && codedInputStream.getBytesUntilLimit() > 0) {
                            this.Qq = og_2.newIntList();
                            bl |= true;
                        }
                        while (codedInputStream.getBytesUntilLimit() > 0) {
                            this.Qq.addInt(codedInputStream.readInt32());
                        }
                        codedInputStream.popLimit(n3);
                        continue block13;
                    }
                    case 16: {
                        this.an |= 1;
                        this.Qs = codedInputStream.readInt32();
                        continue block13;
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
                this.Qq.makeImmutable();
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor auD() {
        return nx_2.PC;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return nx_2.PD.ensureFieldAccessorsInitialized(og_2.class, oi_2.class);
    }

    @Override
    public List<Integer> auE() {
        return this.Qq;
    }

    @Override
    public int auF() {
        return this.Qq.size();
    }

    @Override
    public int jM(int n) {
        return this.Qq.getInt(n);
    }

    @Override
    public boolean auG() {
        return (this.an & 1) != 0;
    }

    @Override
    public int auH() {
        return this.Qs;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.auG()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.Qq.size(); ++i) {
            codedOutputStream.writeInt32(1, this.Qq.getInt(i));
        }
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(2, this.Qs);
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
        for (int i = 0; i < this.Qq.size(); ++i) {
            n2 += CodedOutputStream.computeInt32SizeNoTag((int)this.Qq.getInt(i));
        }
        n += n2;
        n += 1 * this.auE().size();
        if ((this.an & 1) != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.Qs);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof og_2)) {
            return super.equals(object);
        }
        og_2 og_22 = (og_2)object;
        if (!this.auE().equals(og_22.auE())) {
            return false;
        }
        if (this.auG() != og_22.auG()) {
            return false;
        }
        if (this.auG() && this.auH() != og_22.auH()) {
            return false;
        }
        return this.unknownFields.equals((Object)og_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + og_2.auD().hashCode();
        if (this.auF() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.auE().hashCode();
        }
        if (this.auG()) {
            n = 37 * n + 2;
            n = 53 * n + this.auH();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static og_2 cs(ByteBuffer byteBuffer) {
        return (og_2)Qu.parseFrom(byteBuffer);
    }

    public static og_2 co(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (og_2)Qu.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static og_2 dP(ByteString byteString) {
        return (og_2)Qu.parseFrom(byteString);
    }

    public static og_2 co(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (og_2)Qu.parseFrom(byteString, extensionRegistryLite);
    }

    public static og_2 cq(byte[] byArray) {
        return (og_2)Qu.parseFrom(byArray);
    }

    public static og_2 co(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (og_2)Qu.parseFrom(byArray, extensionRegistryLite);
    }

    public static og_2 fC(InputStream inputStream) {
        return (og_2)GeneratedMessageV3.parseWithIOException(Qu, (InputStream)inputStream);
    }

    public static og_2 fC(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (og_2)GeneratedMessageV3.parseWithIOException(Qu, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static og_2 fD(InputStream inputStream) {
        return (og_2)GeneratedMessageV3.parseDelimitedWithIOException(Qu, (InputStream)inputStream);
    }

    public static og_2 fD(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (og_2)GeneratedMessageV3.parseDelimitedWithIOException(Qu, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static og_2 co(CodedInputStream codedInputStream) {
        return (og_2)GeneratedMessageV3.parseWithIOException(Qu, (CodedInputStream)codedInputStream);
    }

    public static og_2 iQ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (og_2)GeneratedMessageV3.parseWithIOException(Qu, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public oi_2 auI() {
        return og_2.auJ();
    }

    public static oi_2 auJ() {
        return Qt.auK();
    }

    public static oi_2 e(og_2 og_22) {
        return Qt.auK().g(og_22);
    }

    public oi_2 auK() {
        return this == Qt ? new oi_2() : new oi_2().g(this);
    }

    protected oi_2 co(GeneratedMessageV3.BuilderParent builderParent) {
        oi_2 oi_22 = new oi_2(builderParent);
        return oi_22;
    }

    public static og_2 auL() {
        return Qt;
    }

    public static Parser<og_2> z() {
        return Qu;
    }

    public Parser<og_2> getParserForType() {
        return Qu;
    }

    public og_2 auM() {
        return Qt;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.co(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.auK();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.auI();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.auK();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.auI();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.auM();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.auM();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ Internal.IntList auN() {
        return og_2.emptyIntList();
    }

    static /* synthetic */ UnknownFieldSet f(og_2 og_22) {
        return og_22.unknownFields;
    }

    static /* synthetic */ Internal.IntList Ab() {
        return og_2.emptyIntList();
    }

    static /* synthetic */ Internal.IntList d(Internal.IntList intList) {
        return og_2.mutableCopy((Internal.IntList)intList);
    }

    static /* synthetic */ Internal.IntList vL() {
        return og_2.emptyIntList();
    }
}

