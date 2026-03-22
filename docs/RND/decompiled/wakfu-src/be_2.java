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
 * Renamed from be
 */
public final class be_2
extends GeneratedMessageV3
implements bt_2 {
    private static final long gs = 0L;
    public static final int gt = 1;
    bw_2 gu;
    public static final int gv = 2;
    bh_1 fO;
    public static final int gw = 3;
    volatile Object gx;
    private byte Y = (byte)-1;
    private static final be_2 gy = new be_2();
    static final Parser<be_2> gz = new bf_1();

    be_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private be_2() {
        this.gx = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new be_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    be_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block13: while (!bl) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl = true;
                        continue block13;
                    }
                    case 10: {
                        Object object = null;
                        if (this.gu != null) {
                            object = this.gu.kO();
                        }
                        this.gu = (bw_2)codedInputStream.readMessage(bw_2.z(), extensionRegistryLite);
                        if (object == null) continue block13;
                        ((by_1)object).k(this.gu);
                        this.gu = ((by_1)object).kV();
                        continue block13;
                    }
                    case 18: {
                        Object object = null;
                        if (this.fO != null) {
                            object = this.fO.ia();
                        }
                        this.fO = (bh_1)codedInputStream.readMessage(bh_1.z(), extensionRegistryLite);
                        if (object == null) continue block13;
                        ((bj_2)object).g(this.fO);
                        this.fO = ((bj_2)object).ih();
                        continue block13;
                    }
                    case 26: {
                        Object object;
                        this.gx = object = codedInputStream.readStringRequireUtf8();
                        continue block13;
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

    public static final Descriptors.Descriptor hB() {
        return ae_1.fu;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.fv.ensureFieldAccessorsInitialized(be_2.class, bg_2.class);
    }

    @Override
    public boolean hC() {
        return this.gu != null;
    }

    @Override
    public bw_2 hD() {
        return this.gu == null ? bw_2.kP() : this.gu;
    }

    @Override
    public cj_2 hE() {
        return this.hD();
    }

    @Override
    public boolean fT() {
        return this.fO != null;
    }

    @Override
    public bh_1 fU() {
        return this.fO == null ? bh_1.ib() : this.fO;
    }

    @Override
    public bk_1 fV() {
        return this.fU();
    }

    @Override
    public String hF() {
        Object object = this.gx;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        this.gx = string;
        return string;
    }

    @Override
    public ByteString hG() {
        Object object = this.gx;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.gx = byteString;
            return byteString;
        }
        return (ByteString)object;
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
        if (this.gu != null) {
            codedOutputStream.writeMessage(1, (MessageLite)this.hD());
        }
        if (this.fO != null) {
            codedOutputStream.writeMessage(2, (MessageLite)this.fU());
        }
        if (!GeneratedMessageV3.isStringEmpty((Object)this.gx)) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)3, (Object)this.gx);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.gu != null) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.hD());
        }
        if (this.fO != null) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.fU());
        }
        if (!GeneratedMessageV3.isStringEmpty((Object)this.gx)) {
            n += GeneratedMessageV3.computeStringSize((int)3, (Object)this.gx);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof be_2)) {
            return super.equals(object);
        }
        be_2 be_22 = (be_2)object;
        if (this.hC() != be_22.hC()) {
            return false;
        }
        if (this.hC() && !this.hD().equals(be_22.hD())) {
            return false;
        }
        if (this.fT() != be_22.fT()) {
            return false;
        }
        if (this.fT() && !this.fU().equals(be_22.fU())) {
            return false;
        }
        if (!this.hF().equals(be_22.hF())) {
            return false;
        }
        return this.unknownFields.equals((Object)be_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + be_2.hB().hashCode();
        if (this.hC()) {
            n = 37 * n + 1;
            n = 53 * n + this.hD().hashCode();
        }
        if (this.fT()) {
            n = 37 * n + 2;
            n = 53 * n + this.fU().hashCode();
        }
        n = 37 * n + 3;
        n = 53 * n + this.hF().hashCode();
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static be_2 w(ByteBuffer byteBuffer) {
        return (be_2)gz.parseFrom(byteBuffer);
    }

    public static be_2 w(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (be_2)gz.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static be_2 U(ByteString byteString) {
        return (be_2)gz.parseFrom(byteString);
    }

    public static be_2 w(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (be_2)gz.parseFrom(byteString, extensionRegistryLite);
    }

    public static be_2 w(byte[] byArray) {
        return (be_2)gz.parseFrom(byArray);
    }

    public static be_2 w(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (be_2)gz.parseFrom(byArray, extensionRegistryLite);
    }

    public static be_2 S(InputStream inputStream) {
        return (be_2)GeneratedMessageV3.parseWithIOException(gz, (InputStream)inputStream);
    }

    public static be_2 S(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (be_2)GeneratedMessageV3.parseWithIOException(gz, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static be_2 T(InputStream inputStream) {
        return (be_2)GeneratedMessageV3.parseDelimitedWithIOException(gz, (InputStream)inputStream);
    }

    public static be_2 T(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (be_2)GeneratedMessageV3.parseDelimitedWithIOException(gz, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static be_2 w(CodedInputStream codedInputStream) {
        return (be_2)GeneratedMessageV3.parseWithIOException(gz, (CodedInputStream)codedInputStream);
    }

    public static be_2 ao(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (be_2)GeneratedMessageV3.parseWithIOException(gz, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public bg_2 hH() {
        return be_2.hI();
    }

    public static bg_2 hI() {
        return gy.hJ();
    }

    public static bg_2 a(be_2 be_22) {
        return gy.hJ().c(be_22);
    }

    public bg_2 hJ() {
        return this == gy ? new bg_2() : new bg_2().c(this);
    }

    protected bg_2 w(GeneratedMessageV3.BuilderParent builderParent) {
        bg_2 bg_22 = new bg_2(builderParent);
        return bg_22;
    }

    public static be_2 hK() {
        return gy;
    }

    public static Parser<be_2> z() {
        return gz;
    }

    public Parser<be_2> getParserForType() {
        return gz;
    }

    public be_2 hL() {
        return gy;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.w(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.hJ();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.hH();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.hJ();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.hH();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.hL();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.hL();
    }

    static /* synthetic */ boolean hM() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(be_2 be_22) {
        return be_22.unknownFields;
    }

    static /* synthetic */ void V(ByteString byteString) {
        be_2.checkByteStringIsUtf8((ByteString)byteString);
    }
}

