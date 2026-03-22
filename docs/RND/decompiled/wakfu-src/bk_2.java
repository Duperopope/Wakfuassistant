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
 *  com.google.protobuf.Internal
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

/*
 * Renamed from bK
 */
public final class bk_2
extends GeneratedMessageV3
implements bn_1 {
    private static final long hd = 0L;
    public static final int he = 1;
    long fG;
    public static final int hf = 2;
    az_2 hg;
    private byte Y = (byte)-1;
    private static final bk_2 hh = new bk_2();
    static final Parser<bk_2> hi = new bl_2();

    bk_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private bk_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new bk_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    bk_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block12: while (!bl) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl = true;
                        continue block12;
                    }
                    case 8: {
                        this.fG = codedInputStream.readInt64();
                        continue block12;
                    }
                    case 18: {
                        bb_1 bb_12 = null;
                        if (this.hg != null) {
                            bb_12 = this.hg.hl();
                        }
                        this.hg = (az_2)codedInputStream.readMessage(az_2.z(), extensionRegistryLite);
                        if (bb_12 == null) continue block12;
                        bb_12.c(this.hg);
                        this.hg = bb_12.ht();
                        continue block12;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue;
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
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor jN() {
        return ae_1.ey;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.ez.ensureFieldAccessorsInitialized(bk_2.class, bm_1.class);
    }

    @Override
    public long fD() {
        return this.fG;
    }

    @Override
    public boolean jO() {
        return this.hg != null;
    }

    @Override
    public az_2 jP() {
        return this.hg == null ? az_2.hm() : this.hg;
    }

    @Override
    public bd_1 jQ() {
        return this.jP();
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
        if (this.fG != 0L) {
            codedOutputStream.writeInt64(1, this.fG);
        }
        if (this.hg != null) {
            codedOutputStream.writeMessage(2, (MessageLite)this.jP());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.fG != 0L) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.fG);
        }
        if (this.hg != null) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.jP());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bk_2)) {
            return super.equals(object);
        }
        bk_2 bk_22 = (bk_2)object;
        if (this.fD() != bk_22.fD()) {
            return false;
        }
        if (this.jO() != bk_22.jO()) {
            return false;
        }
        if (this.jO() && !this.jP().equals(bk_22.jP())) {
            return false;
        }
        return this.unknownFields.equals((Object)bk_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + bk_2.jN().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.fD());
        if (this.jO()) {
            n = 37 * n + 2;
            n = 53 * n + this.jP().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static bk_2 E(ByteBuffer byteBuffer) {
        return (bk_2)hi.parseFrom(byteBuffer);
    }

    public static bk_2 E(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (bk_2)hi.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static bk_2 ag(ByteString byteString) {
        return (bk_2)hi.parseFrom(byteString);
    }

    public static bk_2 E(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (bk_2)hi.parseFrom(byteString, extensionRegistryLite);
    }

    public static bk_2 E(byte[] byArray) {
        return (bk_2)hi.parseFrom(byArray);
    }

    public static bk_2 E(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (bk_2)hi.parseFrom(byArray, extensionRegistryLite);
    }

    public static bk_2 ai(InputStream inputStream) {
        return (bk_2)GeneratedMessageV3.parseWithIOException(hi, (InputStream)inputStream);
    }

    public static bk_2 ai(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bk_2)GeneratedMessageV3.parseWithIOException(hi, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bk_2 aj(InputStream inputStream) {
        return (bk_2)GeneratedMessageV3.parseDelimitedWithIOException(hi, (InputStream)inputStream);
    }

    public static bk_2 aj(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bk_2)GeneratedMessageV3.parseDelimitedWithIOException(hi, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bk_2 E(CodedInputStream codedInputStream) {
        return (bk_2)GeneratedMessageV3.parseWithIOException(hi, (CodedInputStream)codedInputStream);
    }

    public static bk_2 aM(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bk_2)GeneratedMessageV3.parseWithIOException(hi, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public bm_1 jR() {
        return bk_2.jS();
    }

    public static bm_1 jS() {
        return hh.jT();
    }

    public static bm_1 a(bk_2 bk_22) {
        return hh.jT().c(bk_22);
    }

    public bm_1 jT() {
        return this == hh ? new bm_1() : new bm_1().c(this);
    }

    protected bm_1 E(GeneratedMessageV3.BuilderParent builderParent) {
        bm_1 bm_12 = new bm_1(builderParent);
        return bm_12;
    }

    public static bk_2 jU() {
        return hh;
    }

    public static Parser<bk_2> z() {
        return hi;
    }

    public Parser<bk_2> getParserForType() {
        return hi;
    }

    public bk_2 jV() {
        return hh;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.E(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.jT();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.jR();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.jT();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.jR();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.jV();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.jV();
    }

    static /* synthetic */ boolean fa() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(bk_2 bk_22) {
        return bk_22.unknownFields;
    }
}

