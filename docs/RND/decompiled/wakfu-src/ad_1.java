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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from ad
 */
public final class ad_1
extends GeneratedMessageV3
implements ag_2 {
    private static final long ck = 0L;
    public static final int cl = 1;
    List<S> ak;
    private byte Y = (byte)-1;
    private static final ad_1 cm = new ad_1();
    static final Parser<ad_1> cn = new ae_2();

    ad_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ad_1() {
        this.ak = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ad_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ad_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    case 10: {
                        if (!(bl & true)) {
                            this.ak = new ArrayList<S>();
                            bl |= true;
                        }
                        this.ak.add((S)codedInputStream.readMessage(S.z(), extensionRegistryLite));
                        continue block11;
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
                this.ak = Collections.unmodifiableList(this.ak);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor dG() {
        return c_0.aX;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return c_0.aY.ensureFieldAccessorsInitialized(ad_1.class, af_1.class);
    }

    @Override
    public List<S> ai() {
        return this.ak;
    }

    @Override
    public List<? extends ah_2> aj() {
        return this.ak;
    }

    @Override
    public int ak() {
        return this.ak.size();
    }

    @Override
    public S p(int n) {
        return this.ak.get(n);
    }

    @Override
    public ah_2 q(int n) {
        return this.ak.get(n);
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
        for (int i = 0; i < this.ak.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.ak.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int i = 0; i < this.ak.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.ak.get(i)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ad_1)) {
            return super.equals(object);
        }
        ad_1 ad_12 = (ad_1)object;
        if (!this.ai().equals(ad_12.ai())) {
            return false;
        }
        return this.unknownFields.equals((Object)ad_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ad_1.dG().hashCode();
        if (this.ak() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.ai().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ad_1 l(ByteBuffer byteBuffer) {
        return (ad_1)cn.parseFrom(byteBuffer);
    }

    public static ad_1 l(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ad_1)cn.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ad_1 E(ByteString byteString) {
        return (ad_1)cn.parseFrom(byteString);
    }

    public static ad_1 l(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ad_1)cn.parseFrom(byteString, extensionRegistryLite);
    }

    public static ad_1 l(byte[] byArray) {
        return (ad_1)cn.parseFrom(byArray);
    }

    public static ad_1 l(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ad_1)cn.parseFrom(byArray, extensionRegistryLite);
    }

    public static ad_1 w(InputStream inputStream) {
        return (ad_1)GeneratedMessageV3.parseWithIOException(cn, (InputStream)inputStream);
    }

    public static ad_1 w(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ad_1)GeneratedMessageV3.parseWithIOException(cn, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ad_1 x(InputStream inputStream) {
        return (ad_1)GeneratedMessageV3.parseDelimitedWithIOException(cn, (InputStream)inputStream);
    }

    public static ad_1 x(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ad_1)GeneratedMessageV3.parseDelimitedWithIOException(cn, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ad_1 l(CodedInputStream codedInputStream) {
        return (ad_1)GeneratedMessageV3.parseWithIOException(cn, (CodedInputStream)codedInputStream);
    }

    public static ad_1 H(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ad_1)GeneratedMessageV3.parseWithIOException(cn, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public af_1 dH() {
        return ad_1.dI();
    }

    public static af_1 dI() {
        return cm.dJ();
    }

    public static af_1 a(ad_1 ad_12) {
        return cm.dJ().c(ad_12);
    }

    public af_1 dJ() {
        return this == cm ? new af_1() : new af_1().c(this);
    }

    protected af_1 l(GeneratedMessageV3.BuilderParent builderParent) {
        af_1 af_12 = new af_1(builderParent);
        return af_12;
    }

    public static ad_1 dK() {
        return cm;
    }

    public static Parser<ad_1> z() {
        return cn;
    }

    public Parser<ad_1> getParserForType() {
        return cn;
    }

    public ad_1 dL() {
        return cm;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.l(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.dJ();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.dH();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.dJ();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.dH();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.dL();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.dL();
    }

    static /* synthetic */ boolean dM() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean aq() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ad_1 ad_12) {
        return ad_12.unknownFields;
    }
}

